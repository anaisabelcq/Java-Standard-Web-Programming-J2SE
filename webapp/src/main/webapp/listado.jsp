<%@page import="java.util.List"%>
<html>

<head>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>

<body>

<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Nombre</th>
			</tr>
		</thead>
		<tbody>
			<%
				List<String> nombres = (List<String>)request.getAttribute("nombres");
			%>
			
			<% for(String nombre : nombres) {%>
				<tr>
					<th scope="row"><%out.print(nombre);%></th>
				</tr>
			<%} %>
			
		</tbody>
	</table>
</div>

</body>
</html>