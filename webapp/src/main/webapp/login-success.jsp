<html>
	<head>
		<%@include file="header.jsp" %>	</head>
	<body>
		<%@include file="navbar.jsp" %>
		<div class="container">
			<div class="row">
				<div class="col-6">
				
					<%--!
						//metodos
						void getUser() {
							System.out.print("hola");
						}
					--%>
					
					<%
						//getUser();
					
						Boolean usuarioLogueado = (Boolean)session.getAttribute("userLogueado");
						if(usuarioLogueado != null ) { 
					%>
				
						<div class="card" style="width: 18rem;">
						  <img src="..." class="card-img-top" alt="...">
						  <div class="card-body">
						    <h5 class="card-title"><%=session.getAttribute("userLogueado") %></h5>
						    <p class="card-text">Bienvenido USUARIO</p>
						    <a href="<%=request.getContextPath()%>/logout" class="btn btn-primary">Logout</a>
						    <a href="<%=request.getContextPath()%>/listado" class="btn btn-info">Listado</a>
						    <a href="<%=request.getContextPath()%>/nuevoProducto.jsp" class="btn btn-info">Nuevo Producto</a>
						  </div>
						</div>	
					<%
						} else {
							response.sendRedirect(request.getContextPath() +"/login-fail.jsp");
						}
					%>				
				</div>
			</div>
		</div>
	</body>
</html>
