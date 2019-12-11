<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights here</title>
</head>
<body>
	<form action="/getsearchresults">
		<table>
			<tr>
				<td>flight No:</td>
				<td><input name="flightNumber"></td>
			</tr>
			<tr>
				<td>Origin :</td>
				<td><input name="origin"> Destination : <input
					name="destination"></td>
			</tr>
		</table>
		<input type="submit">
	</form>
</body>
</html>