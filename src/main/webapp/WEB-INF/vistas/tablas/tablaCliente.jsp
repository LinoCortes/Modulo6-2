<%@page import="cl.awakelab.grupo7.modulo6.modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class = "table-responsive-xl">	  
  <table id="tablaCliente" class="table table-striped">
	<thead>
		<tr>
			<th scope="col">#</th>
			<th scope="col">Nombre</th>
			<th scope="col">RUN</th>
			<th scope="col">Edad</th>
			<th scope="col">RUT</th>
			<th scope="col">Fecha de nacimiento</th>
			<th scope="col">Apellido</th>
			<th scope="col">Teléfono</th>
			<th scope="col">AFP</th>
			<th scope="col">Dirección</th>
			<th scope="col">Comuna</th>
		</tr>
	</thead>
	<tbody class="table-group-divider">
		<c:forEach var ="s" items="${clientes}">
			<tr>
				<td><c:out value="${s.getId()}"></c:out></td>
				<td><c:out value="${s.getNombre()}"></c:out></td>
				<td><c:out value="${s.getRun()}"></c:out></td>
				<td><c:out value="${s.getEdad()}"></c:out></td>
				<td><c:out value="${s.getRut()}"></c:out></td>
				<td><c:out value="${s.getFechaNacimiento()}"></c:out></td>
				<td><c:out value="${s.getApellidos()}"></c:out></td>
				<td><c:out value="${s.getTelefono()}"></c:out></td>
				<td><c:out value="${s.getAfp()}"></c:out></td>
				<td><c:out value="${s.getDireccion()}"></c:out></td>
				<td><c:out value="${s.getComuna()}"></c:out></td>
				 
			</tr>
		</c:forEach>
	</tbody>
  </table>
</div>  