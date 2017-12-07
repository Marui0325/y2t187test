<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>系统登录 - 超市订单管理系统</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/style.css" />
    <script type="text/javascript">
	/* if(top.location!=self.location){
	      top.location=self.location;
	 } */
    </script>
</head>
<body class="login_bg">
    <section class="loginBox">
        <header class="loginHeader">
            <h1>超市订单管理系统</h1>
        </header>
        <!-- 导入springMVC标签库 -->
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        
        <section class="loginCont">
        	<!-- ${pageContext.request.contextPath }获取项目工程名 -->
	        <form class="loginForm" 
	        	action="${pageContext.request.contextPath }/user/dologin.html"  name="actionForm" id="actionForm"  method="post" >
				<div class="info">${error }</div>
				<div class="inputbox">
                    <label for="user">用户名：</label>
                    <span style="font-size:14px;color:red"><form:errors path="user.usercode" /> </span>
					<input type="text" class="input-text" id="userCode" name="usercode" placeholder="请输入用户名" />
					<!-- path：实体类camcelCalse命名.属性名(验证字段名) -->
					
				</div>	
				<div class="inputbox">
                    <label for="mima">密码：</label>
                    <span style="font-size:14px;color:red"><form:errors path="user.userpassword" /> </span>
                    <input type="password" id="userPassword" name="userpassword" placeholder="请输入密码" />
                	<!-- path：实体类camcelCalse命名.属性名(验证字段名) -->
					
                </div>	
				<div class="subBtn">
                    <input type="submit" value="登录"/>
                    <input type="reset" value="重置"/>
                </div>	
			</form>
        </section>
    </section>
</body>
</html>
