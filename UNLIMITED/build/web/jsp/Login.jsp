<%-- 
    Document   : Login
    Created on : 5/10/2018, 09:36:04 PM
    Author     : chu_c
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css.css">
        <title>Login</title>
    </head>
    <body>
        <ul>
            <li><a href="../index.jsp">Inicio</a></li>
            <li><a href="#news">Empresas</a></li>
            <li><a href="">Productos</a></li>
            <li style="float:right" class="active"><a href="../sobreunlimited.jsp"><img src="../UNLIMITED.jpg" width="100" height="100"></a></li>
            
        </ul>
        <br>
        <br>
        <br>
        <header>
            <h1 align="center">Inicia sesión</h1>
        </header>
        <nav></nav>
        <section>
            <article>
                <div class="row">  
                    <form method="post" action="../LoginServlet">
                        <span>
                            <input type="text" name="usuario" id="usuario" placeholder="Ingresa tu nombre de usuario" class="slide-up">
                            <label for="usuario">Usuario</label>
                        </span>
                        <br>
                        <br>
                        <span>
                        <input type="password" name="password" id="password" placeholder="Ingresa tu contraseña" class="slide-up">
                        <label for="password">Contraseña</label>
                        </span>
                        <br>
                        <br>
                        <input type="submit" value="Ingresar" class="noo">
                    </form>
                </div>
            </article>
        </section>
    </body>
</html>

