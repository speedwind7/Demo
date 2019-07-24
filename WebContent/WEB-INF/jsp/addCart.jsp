<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Custom Theme files -->
<link href="${path }/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="${path }/css/style.css" type="text/css" rel="stylesheet" media="all">
<!-- js -->
<script src="${path }/js/jquery.min.js"></script>
<script type="text/javascript" src="${path }/js/bootstrap-3.1.1.min.js"></script>
<!-- //js -->	
<!-- cart -->
<script src="${path }/js/simpleCart.min.js"> </script>
<title>注册</title>
</head>
<body>
<!--head -->
	<c:import url="head.jsp"></c:import>
	<!--account-->
	<div class="account">
		<div class="container">
			<div class="register">
				<form action="${path }/shoppingCart/save" method="post">
					<div class="register-top-grid">
						<h3>注册</h3>
						<div class="input">
						<font color=red><c:out value="${message }" default=""/></font>
							<span>姓名<label>*</label></span>
							<input type="text" name="userName" value="${shoppingCart.pid }"> 
						</div>
						<div class="input">
							<span>密码<label>*</label></span>
							<input type="text" name="password" value="${shoppingCart.uid }"> 
						</div>
					   <input type="submit" value="提交">
					   <div class="clearfix"></div>
					    </div>
				   </form>
				</div>
			</div>
	    </div>
	<!--//account-->
	<!--footer-->
	<c:import url="foot.jsp"/>
</body>
</html>