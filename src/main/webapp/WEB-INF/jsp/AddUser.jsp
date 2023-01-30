<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD USER</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
body {
	height:100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 10px;
	background: green;
}

#reg { //
	border: 2px solid black;
	background-color: #99ddff, #80aaff;
	height:50%;
	width: 20%;
}
</style>
</head>
<body>
	<div id="reg">

		<form method="post" action="/saveUser">
			<center>
				<h1>ADD USER</h1>
			</center>
			<label for="username">Username</label> <input type="text"
				name="username" placeholder="Enter the username"><br>
			<br> <label for="password">Password</label> &nbsp;<input
				type="text" name="password" placeholder="Enter the password"><br>
			<br> <label>UserType</label> <select name="usertype">
				<option>SELECT</option>
				<option>ADMIN</option>
				<option>USER</option>
			</select>
			<br><br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit">Add User</button>

		</form>

	</div>
	 
</body>