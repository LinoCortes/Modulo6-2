<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Page-Risks-Prevention</title>
<meta name="author" content="Grupo 7">



<!-- Bootstrap 5.1.3 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">



<link rel="stylesheet" href="<core:url value="/res/css/estilo.css" />">
</head>
<body class="hero-section-login">
	<div>
		<h1 class="text-center text-black col-md-4 mx-auto p-1">Listar
			usuarios</h1>
	</div>
	<div class="container mt-5">
		<div class="card text-white"
			style="border-radius: 1rem; margin-bottom: 110px;">
			<div class="card-body p-5">
				<h2 class="text-center"></h2>
				<div class="row">
					<div class="col-6 offset-3">
						<select class="form-select" aria-label="Default select example"
							id="tipoUsuario" name="tipoUsuario" onchange="onChange()">
							<option selected>Tipo de usuario</option>
							<option value="1">Administrativo</option>
							<option value="2">Profesional</option>
							<option value="3">Cliente</option>
						</select>
					</div>
					<div class="col-6 offset-3">
						<jsp:include page="tablas/tablaAdministrativo.jsp" />
						<jsp:include page="tablas/tablaProfesional.jsp" />
						<jsp:include page="tablas/tablaCliente.jsp" />
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="<c:url value="/res/js/listarUsuarios.js" />"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>
</html>