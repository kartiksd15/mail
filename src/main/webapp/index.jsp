<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
.footer-bottom-text {
	text-align: center;
	background: black;
	line-height: 35px;
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#"><strong style="color: orange;">X-workZ
					CM</strong></a>

		</div>
	</div>
	</nav>



	<form action="send.do" method="post">
		<table>

			<tr>
				<td>Tomail:</td>
				<td><input type="email" name="tomailId"></td>
			</tr>
			<tr>
				<td>Subject:</td>
				<td><input type="text" name="subject"></td>
			</tr>

		<tr>
		<td>	<textarea rows="5" name="body"></textarea></td>
		</tr>
		</table>
		
		<input type="submit" value="send mail">
		</form>
	



<!-- 	<label for="w3mission">W3Schools mission:</label>  -->




<br>
<br>
<br>


	<!-- footer -->
	<div class="footer-copyright py-3 text-center">
		<div class="footer-bottom-text">
			@2020 copyright: <a href="#"><strong>X-WORKZ.com</strong></a>
		</div>

	</div>
</body>
</html>