<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
    <s:form action="updateUser.action">
    	<s:hidden name="user.id" value="%{#request.user.id}"></s:hidden>
    	<s:textfield label="firstname" name="user.firstName" value="%{#request.user.firstName}"></s:textfield>
    	<s:textfield label="lastname" name="user.lastName" value="%{#request.user.lastName}"></s:textfield>
   	 	<s:textfield label="age" name="user.age" value="%{#request.user.age}"></s:textfield>
   	 	<s:submit value="submit"></s:submit>
    
    
    </s:form>
    
    
  </body>
</html>
