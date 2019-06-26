<%-- 
    Document   : FormularioProducto
    Created on : 25-06-2019, 09:36:25 PM
    Author     : Obustillosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Holi Profe ^-^ </title>
    </head>
    <body>
        <h1>Formulario de datos del producto:</h1>
        
        <form action="Servlet" method="post" name="Formulario">
            <table>
                <tr>
                <td><span>*</span>ID</td>
                <td><input type="text" name = "txtID" required value=""/></td>
                </tr>
                <tr>
                <td><span>*</span>NOMBRE</td>
                <td><input type="text" name = "txtNOMBRE" required value=""/></td>
                </tr>
                <tr>
                <td><span>*</span>PRECIO</td>
                <td><input type="text" name = "txtPRECIO" required value=""/></td>
                </tr>
            </table>
            <input type="hidden" name="txtOPCION" value=""/>
            <input type="button" value="agregar" onclick="validaEnvia('1')"/>
            <input type="button" value="eliminar" onclick="validaEnvia('2')"/>
            <input type="button" value="actualizar" onclick="validaEnvia('3')"/>
            <%--IDENTIFICACION:<br>
            <input type="text" name="textID"><br><br>
            NOMBRE:<br>
            <input type="text" name="textNOMBRE"><br><br>
            PRECIO:<br>
<input type="text" name="textPRECIO"><br><br>--%>
        </form>
    </body>
</html>
