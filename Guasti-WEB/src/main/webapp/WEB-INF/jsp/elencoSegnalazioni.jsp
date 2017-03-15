<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elenco Segnalazioni</title>
</head>
<body>
	<h1>Ho ricevuto ${segnalazioni.size()} segnalazioni.</h1>
	
	
	<table border="1">
		<caption>Elenco di segnalazioni</caption>
		<thead>
			<tr>
				<th>Oggetto</th>
				<th>Data</th>
				<th>Segnalatore</th>
				<th>Manutentore</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${segnalazioni}" var="segn">
			   <tr>
			   	<td>${segn.oggetto}</td>
			   	<td><fmt:formatDate pattern="yyyy-MM-dd" value="${segn.dataOraApertura}" /></td>
			   	<td>${segn.segnalatore.nome} ${segn.segnalatore.cognome}</td>
			   	<td>${segn.manutentore.nome} ${segn.manutentore.cognome}</td>
			   </tr>
			</c:forEach>
	</tbody>
	</table>
</body>
</html>