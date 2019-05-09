<%-- 
    Document   : edit
    Created on : 04-may-2019, 21:02:11
    Author     : Estibo
--%>

<%@page import="Modelo.Paciente"%>
<%@page import="ModeloDAO.PacienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%
                PacienteDAO dao=new PacienteDAO();
                String identificacion_P=(String)request.getAttribute("identificacion_P");
                Paciente p=(Paciente)dao.list(identificacion_P);
                
            %>
            <h1>Modificar Paciente</h1>
            <form action="Controlador">
                Nombre completo:<br>
                <input type="text" name="txtNombre" value="<%=p.getNombre()%>"><br>
                Fecha de Nacimiento:<br>
                <input type="date" name="txtFecha_Nacimiento" value="<%=p.getFecha_Nacimiento()%>"><br>
                Identificacion:<br>
                <input type="text" name="txtIdentificacion_P" value="<%=p.getIdentificacion_P()%>"><br>
                Tipo de Identificacion:<br>
                <input type="text" name="txtTipo_Identificacion" value="<%=p.getTipo_Identificacion()%>"><br>
                EPS de afiliacion:<br>
                <input type="text" name="txtEPS_Afiliacion" value="<%=p.getEPS_Afiliacion()%>"><br>
                Historia Clinica:<br>
                <input type="text" name="txtHistoria_Clinica" value="<%=p.getHistoria_Clinica()%>"><br>
                <input type="hidden" name="txtidentificacion_p" value="<%=p.getIdentificacion_P()%>">
                <input type="submit" name="accion" value="Actualizar_P"><br>
                <a href="Controlador?accion=listar_P">Regresar</a>
            </form>
        </div>
    </body>
</html>
