package smbms.control;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;

import smbms.pojo.Role;
import smbms.pojo.User;
import smbms.service.RoleService;
import smbms.service.UserService;

@Controller
@RequestMapping("/user") // URL·�������user�����userʵ��ҵ����ʵ��
public class UserControl {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;

	// �û���¼
	@RequestMapping(value="/dologin.html")
	public ModelAndView userLogin(@Valid User loginuser, BindingResult result){
		
		ModelAndView mv = new ModelAndView();
		
		// BindingResult����洢���Ǳ?��֤�Ľ��
		if(result.hasErrors() == true){ // ��֤����
			mv.setViewName("login");    // ��ת���?ҳ��
			return mv;
		}
		
		// ����Service����ʵ�ֵ�¼��֤
		User user = userService.login(loginuser.getUsercode(), 
									  loginuser.getUserpassword());
		//User user = null;
		// ���user��Ϊnull����¼�ɹ�
		if(user != null){
			mv.setViewName("frame");
		}else{
			mv.addObject("error", "用户名或密码错误 ");
			mv.setViewName("login");
		}
		return mv;
	}

	
	// �û�ע��(REST���)
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView userRegist(@Valid User reguser,  BindingResult result,
			MultipartFile idPicPath,
			HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		//if(result.hasErrors()){
		//	mv.setViewName("useradd");
		//}else{
			// ��ȡWebContent����Ŀ¼���·��
			String path = request.getServletContext().getRealPath("/upload");
		
			// �����ϴ���ͼƬ�ļ�
			String fileName = idPicPath.getOriginalFilename(); // ԭʼ�ļ���
			// �ļ��� = "����ַ������" + ".��׺��"
			String ext = FilenameUtils.getExtension(fileName);
			fileName = UUID.randomUUID().toString() + "." + ext;
					//System.currentTimeMillis() 
					//Math.random() * 100000
			
			File file = 
					new File(path + "/" + fileName);
			idPicPath.transferTo(file);  // "���Ϊ"ָ��Ŀ���ļ�
			
			reguser.setIdpicpath("upload/" + fileName); // �ļ����·��(д����ݿ�)
			
			int count = userService.insertUser(reguser);
			if(count > 0) {
				// ע��ɹ�����ת���û��б�ҳ��
				// �ض��� response.sendRedirect("/user");
				mv.setViewName("redirect:/user");
			}else{
				mv.setViewName("useradd");
			}
		//}
		return mv;
	}
	
	// �û��б�(REST���)
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView userList(Integer pageIndex,String queryname,Integer queryUserRole) throws Exception{
		Map<String,Object> param=new HashMap<String, Object>();
		int pageno=1;
		if(pageIndex != null){
			pageno=pageIndex.intValue();
		}
		param.put("start", pageno);
		param.put("size", 5);
		
		param.put("userName", queryname);
		if(queryUserRole != null && queryUserRole != 0){
			param.put("userRole", queryUserRole);
		}
		
		Page<User> userList=(Page<User>)userService.getUserListByMap(param);
		
		HashMap<String, Object> model=new HashMap<String, Object>();
		
		List<Role> roleList=roleService.getRoleListByMap(null);
		model.put("roleList", roleList);
		
		model.put("totalCount", userList.getTotal());
		model.put("totalPageCount", userList.getPages());
		model.put("currentPageNo", pageno);
		model.put("userList", userList);
		model.put("queryUserName", queryname);
		model.put("queryUserRole", queryUserRole);
		
		return new ModelAndView("userlist",model);
	}
	
}
