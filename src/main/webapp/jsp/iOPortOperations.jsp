<%@ include file="include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html;charset=UTF-8"%>


<html>
<head>
	<title><fmt:message key="title" /></title>
</head>

<body>

	<br>

	<h1>
		<fmt:message key="iOPortOperations.heading" />
	</h1>

	<form:form method="post" commandName="picPorts">
		<table cellspacing="0" cellpadding="0" class="CSSTablePorts">
			<tr>
				<td width="50%">PUERTO A</td>
				<td width="50%">PUERTO B</td>
			</tr>
			<tr>
				<td><form:checkbox path="portA0" value="true" disabled="true" /> port_A0 (Lectura sensor temp.)</td>
				<td><form:checkbox path="portB7" value="true" /> port_B7</td>
			</tr>
			<tr>
				<td><form:checkbox path="portA1" value="true" /> port_A1 (Control del ventilador)</td>
				<td><form:checkbox path="portB6" value="true" /> port_B6</td>
			</tr>
			<tr>
				<td><form:checkbox path="portA2" value="true" /> port_A2</td>
				<td><form:checkbox path="portB5" value="true" /> port_B5</td>
			</tr>
			<tr>
				<td><form:checkbox path="portA3" value="true" /> port_A3</td>
				<td><form:checkbox path="portB4" value="true" /> port_B4</td>
			</tr>
			<tr>
				<td><form:checkbox path="portA4" value="true" /> port_A4</td>
				<td><form:checkbox path="portB3" value="true" /> port_B3</td>
			</tr>
			<tr>
				<td><form:checkbox path="portA5" value="true" /> port_A5</td>
				<td><form:checkbox path="portB2" value="true" /> port_B2</td>
			</tr>
			<tr>
				<td></td>
				<td><form:checkbox path="portB1" value="true" /> port_B1</td>
			</tr>
			<tr>
				<td>

					<table>
						<tr>
							<td width="50%">Temperatura:</td>
							<td width="50%" id="tempRefreshData">cargando...</td>
						</tr>
					</table>

				</td>
				<td><form:checkbox path="portB0" value="true" /> port_B0</td>
			</tr>
		</table>
		<br>
		<input type="submit" class="blue_button" align="center" value="Ejecutar comando" />
	</form:form>

</body>
</html>

<script language="JavaScript">
	$.ajaxSetup({
		// Disable caching of AJAX responses
		cache : false
	});

	setInterval("updateContent();", 200);

	function updateContent() {
		$('#tempRefreshData').load("TempMonitorServlet");
	}
</script>