<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table, th, td {
	border: 1px solid black;
}
</style>
<title>Flight search results</title>
</head>
<body>
	<form action="/getsearch">
		<c:if test="${not empty searchresults}">
			<table>
				<tr>

					<th>Flight Number</th>
					<th>carrier</th>
					<th>origin</th>
					<th>departure</th>
					<th>destination</th>
					<th>arrival</th>
					<th>aircraft</th>
					<th>distance</th>
					<th>travelTime</th>
					<th>status</th>
				</tr>
				<c:forEach var="listValue" items="${searchresults}">
					<tr>

						<td>${listValue.flightNumber}</td>
						<td>${listValue.carrier}</td>
						<td>${listValue.origin}</td>
						<td>${listValue.departure}</td>
						<td>${listValue.destination}</td>
						<td>${listValue.arrival}</td>
						<td>${listValue.aircraft}</td>
						<td>${listValue.distance}</td>
						<td>${listValue.travelTime}</td>
						<td>${listValue.status}</td>

					</tr>

				</c:forEach>
			</table>
		</c:if>
		<br/>
		<c:if test="${empty searchresults}">
		<h1>Flights not found for the search criteria</h1>
		</c:if>
		
		<a href="/">search</a>
	</form>
</body>
</html>