<html>

	<head>
		<%@include file="header.jsp" %>
	</head>

	<body>
		<div class="container">
			<div class="row">
				<div class="col-6">
					<form action="<%=request.getContextPath()%>/nuevoProducto" method="post">
					  <div class="form-group">
					    <label for="exampleInputEmail1">Descripcion</label>
					    <input name="descripcion" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
					  </div>
					  <div class="form-group">
					    <label for="exampleInputPassword1">Precio</label>
					    <input name="precio" type="number" class="form-control" id="exampleInputPassword1">
					  </div>
  					  <div class="form-group">
					    <label for="exampleInputPassword1">Codigo</label>
					    <input name="codigo" type="text" class="form-control" id="exampleInputPassword1">
					  </div>
					<div class="form-group">
					    <label for="exampleFormControlSelect2">Example multiple select</label>
					    <select name="tipoProducto" class="form-control" id="exampleFormControlSelect2">
					      <option>1</option>
					      <option>2</option>
					      <option>3</option>
					      <option>4</option>
					      <option>5</option>
					    </select>
					  </div>
					  <button type="submit" class="btn btn-primary">Submit</button>
					</form>
				</div>
			</div>
		</div>
	</body>
	
</html>