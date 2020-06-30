<html>

	<head>
		<%@include file="header.jsp" %>
	</head>

	<body>
		<%@include file="navbar.jsp" %>
		<div class="container">
			<div class="row">
				<div class="col-6">
					<form action="<%=request.getContextPath()%>/parseArchivoServlet" method="post"
						enctype="application/x-www-form-urlencoded">
					  <div class="form-group">
					    <label for="exampleFormControlFile1">Seleccione archivo de productos</label>
					    <input type="file" name="file" class="form-control-file" id="exampleFormControlFile1">
					  </div>
					  <button type="submit" class="btn btn-primary">Procesar</button>
					</form>
				</div>
			</div>
		</div>
	</body>
	
</html>