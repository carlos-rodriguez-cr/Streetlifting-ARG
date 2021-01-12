<%@page import="java.sql.SQLException"%>
<%@page import="com.direccion.daos.PersonaDAO"%>
<%@page import="com.direccion.modulos.PersonaVO"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

</head>
<body>
	
	
	<div class="p-2">
		<h1>Enviado con JSP</h1>
		<b>FECHA:</b>  <%=new Date()%>
		<br>
		<br>
		<%
			//obtengo los "name" del formulario html
			String nombre = request.getParameter("nombre");
			String correo = request.getParameter("correo");
			String mensaje = request.getParameter("mensaje");
			out.print("Tus datos fueron enviados correctamente!");
			PersonaVO personas = new PersonaVO(nombre, correo, mensaje);
			PersonaDAO dao = new PersonaDAO();
			dao.registrarDatos(personas); //Mando los datos de personas a la base de datos
		%>
		<br>
		<br>
		<a class="btn btn-primary" href="../index.html" role="button">Volver atras</a>
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
</body>
</html>