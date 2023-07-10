<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Page-Risks-Prevention</title>
<meta name="author" content="Grupo 7">

<!--Google fonts-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<!-- Bootstrap 5.1.3 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body class="hero-section-login">
	<div>
		<h1 class="text-center text-black col-md-4 mx-auto mt-5 p-4">Contacto</h1>
	</div>
	<div class="row container-fluid mx-auto">
		<div class="col-xs-12 col-sm-12 col-md-4 mx-auto">
			<div class="card bg-dark text-white" style="border-radius: 1rem;">
				<div class="card-body p-5">
					<form class="fondo-form" action="${pageContext.request.contextPath}/contacto" modelAttribute="contacto" method="post">
						<div class="mb-3">
							<label for="name" class="form-label">Nombre</label>
							<input type="text" class="form-control" id="name" name="nombre" required />
						</div>
						<div class="mb-3">
							<label for="email" class="form-label">Email</label>
							<input type="email" class="form-control" id="email" name="email" required />
						</div>
						<div class="mb-3">
							<label for="mensaje" class="form-label">Mensaje</label>
							<textarea class="form-control" id="mensaje" name="mensaje" rows="4" required></textarea>
						</div>
						<div class="d-grid gap-2 pb-4 pt-4">
							<button type="submit" class="btn btn-primary">Enviar</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>