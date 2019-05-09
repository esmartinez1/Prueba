<%-- 
    Document   : add
    Created on : 04-may-2019, 21:02:20
    Author     : Estibo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="container">
            <div class="col-lg-6">
            <h1>Agregar Paciente</h1>
            <form action="Controlador">
                Nombre completo:<br>
                <input type="text" name="txtNombre"><br>
                Fecha de Nacimiento:<br>
                <input type="date" name="txtFecha_Nacimiento"><br>
                Identificacion:<br>
                <input type="text" name="txtIdentificacion_P"><br>
                Tipo de Identificacion:<br>
                <input type="text" name="txtTipo_Identificacion"><br>
                EPS de afiliacion:<br>
                <input type="text" name="txtEPS_Afiliacion"><br>
                Historia Clinica:<br>
                <input type="text" name="txtHistoria_Clinica"><br>
                <input type="submit" name="accion" value="Agregar_P"><br>
                <a href="Controlador?accion=listar_P">Regresar</a>
            </form>
        </div>
    </body>
</html>
