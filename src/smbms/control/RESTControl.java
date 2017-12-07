package smbms.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RESTControl {

	// 商品列表
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public ModelAndView getProduct(){
		System.out.println("商品列表功能实现");
		return null;
	}
	
	// 通过Id查询商品
	@RequestMapping(value="/product/{id}",method=RequestMethod.GET)
	public ModelAndView productList(@PathVariable String id){
		System.out.println("查询 " + id +" 号商品信息");
		return null;
	}
	
	// 商品添加
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public ModelAndView addProduct(){
		System.out.println("新商品添加");
		return null;
	}
	
	// 商品删除
	@RequestMapping(value="/product/{id}",method=RequestMethod.DELETE)
	public ModelAndView delProduct(){
		System.out.println("商品删除");
		return null;
	}
		
	// 商品信息更新
	@RequestMapping(value="/product",method=RequestMethod.PUT)
	public ModelAndView updateProduct(){
		System.out.println("商品更新操作");
		return null;
	}
}
