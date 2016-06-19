<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/General/css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>撰寫你的評論</title>

</head>
<body>
	<script src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.raty.js"></script>
<jsp:include page="/General/header.jsp"></jsp:include>
	<div style="background-color: blue; width: auto;">
		<h1 style="color: white">評分並撰寫評論</h1>
	</div>

	<p>您的評論會在網路上公開
	<p>

	<div id="star"></div>

	<form name="f1" action="ScoreServlet" method="post">
		<textarea style="width: 400PX; height: 300PX" name="comment"></textarea>
		<input	type="submit" value="輸入">
	    <input type="reset" value="重置">
	    <input type="hidden" name="score" value="1">
	    <input type="hidden" name="aid" value="${aid }">
	    <input type="hidden" name="eid" value="${eid}">
	    <input type="hidden" name="action" value="addNewComment">  

	</form>
	
<jsp:include page="/General/footer.jsp"></jsp:include>	
	<script>
		$('#star').raty({
			score: 1,
			click : function(score) {
				var x = parseInt(score);
				document.f1.score.value=x;

			}
		

		});
		
	 
		window.history.forward(1);

	</script>




</body>
</html>