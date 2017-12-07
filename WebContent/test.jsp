<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="product">
		<input type="submit" value="测试商品查询列表" />
	</form>
	<hr/>
	<form method="get" action="product/12">
		<input type="submit" value="测试通过id查询商品" />
	</form>
	<hr/>
	<form method="post" action="product">
		<input type="submit" value="测试商品添加" />
	</form>
	<hr/>
	<form method="post" action="product/23">
		<input type="hidden" name="_method" value="DELETE" />
		<input type="submit" value="测试商品删除" />
	</form>
	<hr/>
	<form method="post" action="product">
		<input type="hidden" name="_method" value="PUT" />
		<input type="submit" value="测试商品更新" />
	</form>
</body>
</html>