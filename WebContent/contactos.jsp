<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contactos</title>
</head>
<body>
	<center>
		<table border="1">
			<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Edad</th>
				<th>Tel&eacute;fono</th>
				<th>Ciudad</th>
			</tr>
			<c:forEach items="${contactoList}" var="contacto">
				<tr>
					<td>${contacto.nombre}</td>
					<td>${contacto.telefono}</td>
					<td>${contacto.edad}</td>
					<td>${contacto.telefono}</td>
					<td>${contacto.ciudad}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="index.html">Volver</a>
	</center>
</body>
</html>