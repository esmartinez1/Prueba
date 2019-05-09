<%-- 
    Document   : add_M
    Created on : 08-may-2019, 9:34:49
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
            <h1>Agregar Medico</h1>
            <form action="Controlador">
                Nombre completo:<br>
                <input type="text" name="txtNombre"><br>
                Identificacion:<br>
                <input type="text" name="txtIdentificacion_M"><br>
                Tipo Identificacion:<br>
                <input type="text" name="txtTipo_Identificacion"><br>
                Numero targeta p:<br>
                <input type="text" name="txtNumero_Targeta"><br>
                Años de experiencia:<br>
                <input type="number" name="txtAños_Exp" step="any"/><br>
                Especialidad:<br>
                <input type="text" name="txtEspecialidad"><br>
                Hora Inicio:<br>
                <input type="text" name="txtHora_I"><br>
                Hora Final:<br>
                <input type="text" name="txtHora_F"><br>
                <input type="submit" name="accion" value="Agregar_M"><br>
                <a href="Controlador?accion=listar_M">Regresar</a>
            </form>
            </div>
        </div>
    </body>
</html>