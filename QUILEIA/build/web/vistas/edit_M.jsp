<%-- 
    Document   : newjsp
    Created on : 08-may-2019, 9:35:00
    Author     : Estibo
--%>

<%@page import="Modelo.Medico"%>
<%@page import="ModeloDAO.MedicoDAO"%>
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
                MedicoDAO dao=new MedicoDAO();
                String identificacion_M=(String)request.getAttribute("identificacion_M");
                Medico m=(Medico)dao.list(identificacion_M);
                
            %>
            <h1>Modificar Medico</h1>
            <form action="Controlador">
                Nombre completo:<br>
                <input type="text" name="txtNombre" value="<%=m.getNombre()%>"><br>
                Identificacion:<br>
                <input type="date" name="txtIdentificacion_M" value="<%=m.getIdentificacion_M()%>"><br>
                Tipo de Identificacion:<br>
                <input type="text" name="txtTipo_Identificacion" value="<%=m.getTipo_Identificacion()%>"><br>
                Numero Targeta Profesional:<br>
                <input type="text" name="txtNumero_Targeta" value="<%=m.getNumero_Targeta()%>"><br>
                Años de experiencia:<br>
                <input type="number" name="txtAños_Exp" value="<%=m.getAños_Exp()%>" step="any"/><br>
                Especialidad:<br>
                <input type="text" name="txtEspecialidad" value="<%=m.getEspecialidad()%>"><br>
                Hora de inicio:<br>
                <input type="text" name="txtHora_I" value="<%=m.getHora_I()%>"><br>
                Hora de finalizacion:<br>
                <input type="text" name="txtHora_F" value="<%=m.getHora_F()%>"><br>
                <input type="hidden" name="txtidentificacion_M" value="<%=m.getIdentificacion_M()%>">
                <input type="submit" name="accion" value="Actualizar_M"><br>
                <a href="Controlador?accion=listar_M">Regresar</a>
            </form>
        </div>
    </body>
</html>