<%-- 
    Document   : index
    Created on : 1/10/2018, 08:10:02 AM
    Author     : Alumno
--%>


<!DOCTYPE html>
<%-- <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <button onclick="<jsp:forward page="jsp/Registro.jsp"/>"></button>
        
    </body>
</html>--%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css.css">
<%-- 
<%
    if(request.getParameter("botonRegistro") !=null){
%>
    <jsp:forward page="registrarusuarios.jsp"></jsp:forward>
<%
    return;
    }
else
if(request.getParameter("botonLogin") !=null){
%>
<jsp:forward page="jsp/Login.jsp"></jsp:forward>
<%
    return;
    }
else
if(request.getParameter("botonAdmin") !=null){
%>
<jsp:forward page="Administracion.jsp"></jsp:forward>
<%
    return;
    }
%>--%>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="#news">Empresas</a></li>
            <li><a href="">Productos</a></li>
            <li style="float:right" class="active"><a href="sobreunlimited.jsp"><img src="UNLIMITED.jpg" width="50px" height="50px"></a></li>  
        </ul>
        <br>
        <br>
        <br>
        <table align="center">
            <th>
                <form action="registrarusuarios.jsp" method="get">
                    <input type="submit" name="botonRegistro" value="Crear cuenta" class="noo">
                </form>
            </th>
            <th>
                <form action="jsp/Login.jsp" method="get">
                    <input type="submit" name="botonLogin" value="Iniciar Sesión" class="noo">
                </form>
            </th>
            <th>
                <form action="Administracion.jsp" method="get">
                    <input type="submit" name="botonAdmin" value="Administración" class="noo">
                </form>
            </th>
        </table>
    </body>
</html>