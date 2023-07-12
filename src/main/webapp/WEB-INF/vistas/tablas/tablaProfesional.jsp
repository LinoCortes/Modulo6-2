<%@page import="cl.awakelab.grupo7.modulo6.modelo.Profesional"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class = "table-responsive-xl">	  
  <table id="tablaProfesional" class="table table-striped">
	<thead>
		<tr>
			<th scope="col">#</th>
			<th scope="col">Nombre</th>
			<th scope="col">RUN</th>
			<th scope="col">Fecha de nacimiento</th>
			<th scope="col">Título</th>
			<th scope="col">Fecha de ingreso</th>
		</tr>
	</thead>
	<tbody class="table-group-divider">
		<c:forEach var = "s" items = "${profesionales}">
	     <tr>
			<td><c:out value="${s.getId()}"></c:out></td>
			<td><c:out value="${s.getNombre()}"></c:out></td>
			<td><c:out value="${s.getRun()}"></c:out></td>
			<td><c:out value="${s.getFechaNacimiento()}"></c:out></td>
			<td><c:out value="${s.getTitulo()}"></c:out></td>
			<td><c:out value="${s.getFechaIngreso()}"></c:out></td>
			
		 </tr>
	   </c:forEach> 
	</tbody>
  </table>
</div>  