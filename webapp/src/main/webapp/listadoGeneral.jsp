<%@page import="ar.com.educacionit.domain.Producto"%>
<%@page import="java.util.List"%>
<html>

<head>
	<%@include file="header.jsp" %>
</head>

<body>
	<%@include file="navbar.jsp" %>
	<div class="container">
		<div class="row">
			<div class="alert alert-success">Productos Dados de alta</div>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">DESCRIPCIÓN</th>
						<th scope="col">PRECIO</th>
						<th scope="col">CODIGO</th>
						<th scope="col"></th>
					</tr>
				</thead>
				<tbody>
					<%
						List<Producto> productos = (List<Producto>)request.getAttribute("listadoOK");
					%>
					
					<% for(Producto producto : productos) {%>
						<tr>
							<th scope="row"><%out.print(producto.getId());%></th>
							<th scope="row"><%out.print(producto.getDescripcion());%></th>
							<th scope="row"><%out.print(producto.getPrecio());%></th>
							<th scope="row"><%out.print(producto.getCodigo());%></th>
							<th>
								<button type="button" class="btn btn-outline-primary">Editar</button>
								<button type="button" class="btn btn-outline-secondary">Eliminar</button>
							</th>
						</tr>
					<%} %>
					<tr>
					</tr>
				</tbody>
			</table>
		</div>
		
		<div class="row">
			<div class="alert alert-danger">Productos Con errores</div>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">DESCRIPCIÓN</th>
						<th scope="col">PRECIO</th>
						<th scope="col">CODIGO</th>
						<th scope="col"></th>
					</tr>
				</thead>
				<tbody>
					<%
						List<Producto> productosFail = (List<Producto>)session.getAttribute("listadoFail");
					%>
					
					<% for(Producto producto : productosFail) {%>
						<tr>
							<th scope="row"><%out.print(producto.getId());%></th>
							<th scope="row"><%out.print(producto.getDescripcion());%></th>
							<th scope="row"><%out.print(producto.getPrecio());%></th>
							<th scope="row"><%out.print(producto.getCodigo());%></th>
							<th>
								<button type="button" class="btn btn-outline-primary">Editar</button>
								<button type="button" class="btn btn-outline-secondary">Eliminar</button>
							</th>
						</tr>
					<%} %>
					<tr>
					</tr>
				</tbody>
			</table>
		</div>
		
		<div class="row">
			<div class="col-6">
				<form action="<%=request.getContextPath()%>/generarArchivoErrorServlet" method="post" target="_new">
				  <button type="submit" class="btn btn-primary">Generar Listado De Error</button>
				</form>
		</div>
	</div>
	</body>
</html>