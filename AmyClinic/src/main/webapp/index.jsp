<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>EEIT85team03</title>
<style>
</style>
<script></script>
<!--[if lt IE 9]>
		<script src="http://htmL5shim.googlecode.com/svn/trunk/html5.js">	
		</script>
		<![endif]-->
</head>
<body>
	<div id="allpage">
		<header>
			
		</header>
		<!--top image-->

		<article>
			<h2 class="title"></h2>
			<!--黒底標題-->
			<section>
				<a href="http://www.w3schools.com/"></a> 
				<br> <a href="http://www.w3schools.com/"> 
				<img src="http://zippy.gfycat.com/MedicalBrownFoxhound.gif" alt="請重新整理"
					title="動子動" class="litimg" width="300px" /></a>

			</section>
<!-- Henry's test login --><hr>
		<a href="login/login.jsp">Login page</a><br>
		<a href="register/register.jsp">Register a new account</a><br>		
		<a href="login/editprofile.jsp">Edit Account Information</a><br>
<!--                    	 namespace/action name                      target registered in struts.xml-->
		<a href="<s:url action="member/member1"/>">login required page 1  -- member/memberonly1.jsp")</a><br>		
		<a href="<s:url action="member/member2"/>">login required page 2  -- member/memberonly2.jsp")</a><br>		
<!-- 		<a href="public/publicpage.jsp">login not required page</a><hr> -->
		<a href="<s:url action="free/public"/>">一般頁面1(free/HelloWorld.action --   free/HelloWorld.jsp")</a><br>
<!-- Henry's test login -->

<!-- 購物系統測試 -->
		<a href="shopping/prod_list.jsp">商品列表(不需登入)</a><br>
		<a href="shopping/OrdersServlet">查詢訂單(需透過以下測試網頁登入)</a><br>
		<a href="CarrieTest/login/login.jsp">登入網頁(for 購物系統)</a><br>
		(測試用帳號：INSERT INTO Members (name, pwd, email, birthday, country, gender, addr, phone, height, mass, act_status) VALUES ('Test','1234','Test@group3.com','1990-12-12','Taiwan','F','台北市大安區復興南路一段390號2樓','0925332156','160','42','1');)
		</article>
		<aside></aside>



		<footer>
			<p>E-amil:xxx@gmail.com &nbsp; Tel:0999-999-999 &nbsp;
				Hello-Word國際碼業集團 &nbsp; &copy; 2016 EEIT85team03<a href="Backstage/b_login.jsp">員工專區</a><br></p>
		</footer>
	</div>
	<!--end all-->
</body>
</html>