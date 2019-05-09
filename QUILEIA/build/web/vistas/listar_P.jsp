<%-- 
    Document   : listar
    Created on : 04-may-2019, 21:01:43
    Author     : Estibo
--%>

<%@page import="Modelo.Paciente"%>
<%@page import="java.util.*"%>
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
            <h1>Pacientes</h1>
            <a href="Controlador?accion=add_P">Agregar Nuevo</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>NOMBRE</th>
                        <th>FECHA DE NACIMIENTO</th>
                        <th>IDENTIFICACION</th>
                        <th>TIPO IDENTIFICACION</th>
                        <th>EPS DE AFILIACION</th>
                        <th>HISTORIA CLINICA</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    PacienteDAO dao=new PacienteDAO();
                    List<Paciente>list=dao.listar();
                    Iterator<Paciente>iter=list.iterator();
                    Paciente p=null;
                    while(iter.hasNext()){
                        p=iter.next();
                %>
                <tbody>
                    <tr>
                        <td><%= p.getNombre()%></td>
                        <td><%= p.getFecha_Nacimiento()%></td>
                        <td><%= p.getIdentificacion_P()%></td>
                        <td><%= p.getTipo_Identificacion()%></td>
                        <td><%= p.getEPS_Afiliacion()%></td>
                        <td><%=p.getHistoria_Clinica()%></td>
                        <td>
                            <a href="Controlador?accion=editar_P&identificacion_P=<%= p.getIdentificacion_P()%>">Editar</a>
                            <a href="Controlador?accion=eliminar_P&identificacion_P=<%= p.getIdentificacion_P()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
                <a href="">Regresar</a>
        </div>
    </body>
</html>
