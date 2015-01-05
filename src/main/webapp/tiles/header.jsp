<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript" src="scripts/general.js">
</script>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<div id="header">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="1%" height="83">
					<img src="${pageContext.request.contextPath}/images/imgSpace.gif" alt="" width="1" height="1" />
					<img src="${pageContext.request.contextPath}/images/imgSpace.gif" width="15" height="15" />
				</td>
				<td width="170" align="center"><img src="${pageContext.request.contextPath}/images/pic.jpg" width="110" height="60"/></td>
				<td width="1%"><img src="${pageContext.request.contextPath}/images/imgPicControlWebApp.jpg" width="182" height="25" /></td>
				<td width="85%">&nbsp;</td>
				<td width="0%" align="left" valign="bottom"><img src="<%=request.getContextPath()%>/images/imgCorner.jpg" width="32" height="24" /></td>
				<td width="1%" valign="bottom" class="hedaderbar">
	
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td valign="top">&nbsp;</td>
						</tr>
						<tr>
							<td>
								<div class="boxheaderbar">
									<a href="javascript:logout()" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image6','','${pageContext.request.contextPath}/images/btn_logout_on.jpg',1)" style="float: right;"> 
										<img src="${pageContext.request.contextPath}/images/btn_logout_off.jpg" name="Image6" width="74" height="24" border="0" align="absbottom" id="Image6" />
									</a> 
									<span class="txtgris">Version <fmt:message key="version.number" />&nbsp;&nbsp;</span> 
									<span class="txtgris">&nbsp;<fmt:message key="home.welcome" /></span> 									
								</div>
							</td>
						</tr>
					</table>
	
				</td>
			</tr>
		</table>
	</div>
</body>
</html>

