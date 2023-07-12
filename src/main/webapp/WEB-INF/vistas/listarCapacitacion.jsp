<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Page-Risks-Prevention</title>
<meta name="author" content="Grupo 7">


<!--Google fonts-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin="">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;500&amp;display=swap"
	rel="stylesheet">

<!-- Bootstrap 5.1.3 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!--iconos-->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
</head>
<body class="hero-section-login">
	<div>
		<h1 class="text-center text-black col-md-4 mx-auto p-1">Listar
			Capacitaciones</h1>
	</div>

	<div class="container mt-5">
		<div class="card text-white"
			style="border-radius: 1rem; margin-bottom: 110px;">
			<div class="card-body p-5">
				<h2 class="text-center mb-4"></h2>
				<div class="row">
					<div class="col">
						<div class="table-responsive-xl">
							<table class="table">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">Identificador</th>
										<th scope="col">Duracion</th>
										<th scope="col">Asistentes</th>
										<th scope="col">Tematica</th>
										<th scope="col">Rut Cliente</th>
										<th scope="col">Dia</th>
										<th scope="col">Hora</th>
										<th scope="col">Lugar</th>
									</tr>
								</thead>
								<tbody class="table-group-divider">
									<c:forEach var="s" items="${capacitaciones}">
										<tr>
											<td><c:out value="${s.getId()}"></c:out></td>
											<td><c:out value="${s.getIdentificador()}"></c:out></td>
											<td><c:out value="${s.getDuracion()}"></c:out></td>
											<td><c:out value="${s.getCantidadAsistentes()}"></c:out></td>
											<td><c:out value="${s.getRutCliente()}"></c:out></td>
											<td><c:out value="${s.getTematica()}"></c:out></td>
											<td><c:out value="${s.getDia()}"></c:out></td>
											<td><c:out value="${s.getHora()}"></c:out></td>
											<td><c:out value="${s.getLugar()}"></c:out></td>
										</tr>
										<!-- fin del for de java -->
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</body>
</html>