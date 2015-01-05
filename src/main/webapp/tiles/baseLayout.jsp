<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<link href="css/styles.css" rel="stylesheet" type="text/css" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<table border="0" cellpadding="0" cellspacing="0" align="left" width="80%" height="100%">
	
		<tr height="72px">
			<td width="100%" valign="middle" align="left" colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>
		
		<tr height="85%">
			<td width="20%" valign="top" align="left"><tiles:insertAttribute name="menu" /></td>
			<td width="80%" valign="top" align="left"><tiles:insertAttribute name="body" /></td>
		</tr>
		
		<tr height="5%">
			<td width="100%" valign="middle" align="left" colspan="2"><tiles:insertAttribute name="footer" /></td>
		</tr>
		
	</table>
</body>
</html>

