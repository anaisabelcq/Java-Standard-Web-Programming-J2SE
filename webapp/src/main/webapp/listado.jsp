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
					List<Producto> productos = (List<Producto>)session.getAttribute("productos");
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
					<th>Total</th>
					<th></th>
					<th scope="row"><%=request.getAttribute("total")%></th>
					<th></th>
				</tr>
				<tr>
				</tr>
			</tbody>
			
			<tbody>
				<%
					//precio >= 25500
					List<Producto> productosFiltrados = (List<Producto>)session.getAttribute("productosFiltrados");
				%>
				
				<% for(Producto producto : productosFiltrados) {%>
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
					<th>Total</th>
					<th></th>
					<th scope="row"><%=session.getAttribute("totalProductosFiltrados")%></th>
					<th></th>
				</tr>
				<tr>
				</tr>
			</tbody>
		</table>
	</div>
</div>

</body>
</html>