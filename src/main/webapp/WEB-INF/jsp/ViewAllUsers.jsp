<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW ALL USER</title>
</head>
	<body>
		<div id="reg">
			<center><h2>USERS LIST</h2></center>
			<center><table border="1">
					<thead>
							<tr>
								<th>Id</th>
								<th>Username</th>
								<th>Password</th>
								<th>Usertype</th>
								<th>Delete</th>
								<th>Update</th>
							</tr>
						</thead>
						<tbody>
								<c:forEach items="${usersList}" var="object">
									<tr>
										<td>${object.getId()}</td>
										<td>${object.getUsername()}</td>
										<td>${object.getPassword()}</td>
										<td>${object.getUsertype()}</td>
										<td><a href="deleteUser/${object.id}">Delete</a></td>
										<td><a href="editUser/${object.id}">Update</a></td>
									</tr>
								</c:forEach>
						</tbody>
			</table>
			</center>
		</div>
	</body>
	</html>
