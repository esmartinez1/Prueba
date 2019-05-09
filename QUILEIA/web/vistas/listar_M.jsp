<%-- 
    Document   : listar_M
    Created on : 08-may-2019, 9:35:30
    Author     : Estibo
--%>

<%@page import="Modelo.Medico"%>
<%@page import="java.util.*"%>
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
            <h1>Medicos</h1>
            <a href="Controlador?accion=add_M">Agregar Nuevo</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>NOMBRE</th>
                        <th>IDENTIFICACION</th>
                        <th>TIPO IDENTIFICACION</th>
                        <th>NUMERO TARGETA P</th>
                        <th>AÑOS EXPERIENCIA</th>
                        <th>ESPECIALIDAD</th>
                        <th>HORA INICIO</th>
                        <th>HORA FINAL</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    MedicoDAO dao=new MedicoDAO();
                    List<Medico>list=dao.listar();
                    Iterator<Medico>iter=list.iterator();
                    Medico m=null;
                    while(iter.hasNext()){
                        m=iter.next();
                %>
                <tbody>
                    <tr>
                        <td><%= m.getNombre()%></td>
                        <td><%= m.getIdentificacion_M()%></td>
                        <td><%= m.getTipo_Identificacion()%></td>
                        <td><%= m.getNumero_Targeta()%></td>
                        <td><%= m.getAños_Exp()%></td>
                        <td><%=m.getEspecialidad()%></td>
                        <td><%=m.getHora_I()%></td>
                        <td><%=m.getHora_F()%></td>
                        <td>
                            <a href="Controlador?accion=editar_M&identificacion_M=<%= m.getIdentificacion_M()%>">Editar</a>
                            <a href="Controlador?accion=eliminar_M&identificacion_M=<%= m.getIdentificacion_M()%>">Remover</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
                <a href="">Regresar</a>
        </div>
    </body>
</html>