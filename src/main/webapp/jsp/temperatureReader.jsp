<%@ include file="include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html;charset=UTF-8"%>

<html>
<head>
	<title><fmt:message key="title" /></title>
</head>

<body>

	<br />

	<h1>
		<fmt:message key="TemperatureReader.heading" />
	</h1>


	<table class="foggycountry">
		<tr>
			<td width="50%">Temperatura</td>
			<td width="50%" id="tempRefreshData">cargando...</td>
		</tr>
	</table>

</body>
</html>

<script language="JavaScript">
	$.ajaxSetup({
		// Disable caching of AJAX responses
		cache : false
	});

	setInterval("updateContent();", 250);

	function updateContent() {
		$('#tempRefreshData').load("TempMonitorServlet");
	}
</script>