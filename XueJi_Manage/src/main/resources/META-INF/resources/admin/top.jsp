<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
		<!--
		body {
			margin-left: 0px;
			margin-top: 0px;
			margin-right: 0px;
			margin-bottom: 0px;
		}
		.STYLE1 {font-size: 12px}
		.STYLE2 {
			color: #03515d;
			font-size: 12px;
		}
		-->
		a:link {font-size:12px; text-decoration:none; color:#000000;}
		a:visited {font-size:12px; text-decoration:none; color:#000000;}
		a:hover {font-size:12px; text-decoration:none; color:#FF0000;}
		
		a.v1:link {font-size:12px; text-decoration:none; color:#03515d;}
		a.v1:visited {font-size:12px; text-decoration:none; color:#03515d;}
	</style>
	<script type="text/javascript">
	    function logout()
		{
		   if(confirm("确定要退出本系统吗??"))
		   {
			   window.parent.location="<%=path %>/login.jsp";
		   }
		}
	</script>
  </head>
  
  <body>
       <body>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="26" background="<%=path %>/img/main_03.gif">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="227" height="26" background="<%=path %>/img/main_01.gif">
								&nbsp;
							</td>
							<td>
								&nbsp;
							</td>
							<td width="60">
								<img src="<%=path %>/img/main_05.gif" width="60" height="26" />
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td height="64">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="55%" valign="top" height="64" background="<%=path %>/img/main_06.gif" nowrap="nowrap">
								<table>
								   <tr height="8"><td></td></tr>
								   <tr>
								      <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
								      <td>
								        <font style="font-size: 25px;font-weight: bolder;display: block;text-align: left">
										    学籍管理系统 
							            </font>
								      </td>
								   </tr>
								</table>
							</td>
							<td width="45%" valign="top" height="64" background="<%=path %>/img/main_066.gif" nowrap="nowrap">
								<table>
								   <tr height="8"><td></td></tr>
								   <tr>
								      <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
								      <td>
								        <div style="font-size: 18px;">
								             <c:if test="${sessionScope.userType==0}">
											    欢迎您：系统管理员
											 </c:if>
											 <c:if test="${sessionScope.userType==1}">
											    欢迎您： ${sessionScope.xiehui.name}
											 </c:if>
											 &nbsp;&nbsp;
											 <!-- <SCRIPT>setInterval("clock.innerHTML=new Date().toLocaleString()+'&nbsp;&nbsp;'+''.charAt(new Date().getDay());",1000)</SCRIPT> --><SPAN id=clock></SPAN>&nbsp;&nbsp;&nbsp;
								             <a href="#" style="font-size: 17px;border:1px solid;padding:5px;color:rgb(52,83,145);border-radius:10px" onclick="logout()">注销系统</a>&nbsp;&nbsp;
								        </div>
								      </td>
								   </tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
  </body>
</html>
