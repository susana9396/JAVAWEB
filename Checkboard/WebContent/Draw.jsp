<%@page import="sun.awt.AWTAccessor.SystemColorAccessor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">

<title>Draw</title>
</head>
<body>


<% String req = request.getParameter("height"); %>
    
   
    
     <% String req1 = request.getParameter("width"); %>
    <h1>Checkboard : W<%= req1 %> H<%=req %></h1>
    
	 
	 <%
    int height =Integer.parseInt(req);
    int width = Integer.parseInt(req1);
    
    int lala =1;
 
     %>
    
    <%
  
    for (int i= 0; i<height; i++){%>
			<div class="row">
           <% for(int j=0; j<width; j++){
                if(lala %2 != 0){
                	%><div class="lala rojo"></div><%
                }
                else{
                	%><div class="lala negro"></div><%
                }
             System.out.println("primer for"+ i);
             System.out.println("segundo for"+ j);
   			lala++;
           		
        	}
           if(width %2==0){
        	   lala++;
           }
    %>  </div><%
    }
    
    %>
    
</body>
</html>