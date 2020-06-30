<html>
	<head>
		<%@include file="header.jsp" %>	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-6">
					<div class="alert alert-danger" role="alert">
					 Usuario / Password inválido
					</div>
					<form action="<%=request.getContextPath()%>/login.jsp">
						<button type="submit" class="btn btn-success">Success</button>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
