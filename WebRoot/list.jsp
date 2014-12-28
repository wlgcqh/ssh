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
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	
		function del(){
			
			if(confirm("Really delete?")){
				return true;	
			}
			
				return false;
			
			
		}
	
	
	
	
	
	</script>
	

  </head>
  
  <body>
    
    <table align="center" border="1" width="80%">
    	<tr>
    		<th>id</th>
    		<th>firstname</th>
    		<th>lastname</th>
    		<th>age</th>
    		<th>delete</th>
    		<th>update</th>
    	</tr>
    	
    	<s:iterator value="#request.list" id="l">
    		<tr>
    			<td>
    				<s:property value="#l.id"/>
    			</td>
    			
    			<td>
    				<s:property value="#l.firstName"/>
    			</td>
    			
    			<td>
    				<s:property value="#l.lastName"/>
    			</td>
    			
    			<td>
    				<s:property value="#l.age"/>
    			</td>
    			
    			<td>
    				<s:a href="deleteUser.action?id=%{#l.id}" onclick="return del()">delete</s:a>
    			</td>
    			
    			<td>
    				<s:a href="getUser.action?id=%{#l.id}">update</s:a>
    			</td>
    		</tr>
    	</s:iterator>
    
    
    
    
    
    </table>
    
    
    
  </body>
</html>
