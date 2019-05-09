package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Medico;
import java.util.*;
import ModeloDAO.MedicoDAO;

public final class listar_005fM_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1>Medicos</h1>\n");
      out.write("            <a href=\"ControladorM?accion=add_M\">Agregar Nuevo</a>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>NOMBRE</th>\n");
      out.write("                        <th>IDENTIFICACION</th>\n");
      out.write("                        <th>TIPO IDENTIFICACION</th>\n");
      out.write("                        <th>NUMERO TARGETA P</th>\n");
      out.write("                        <th>AÑOS EXPERIENCIA</th>\n");
      out.write("                        <th>ESPECIALIDAD</th>\n");
      out.write("                        <th>HORA INICIO</th>\n");
      out.write("                        <th>HORA FINAL</th>\n");
      out.write("                        <th>ACCIONES</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    MedicoDAO dao=new MedicoDAO();
                    List<Medico>list=dao.listar();
                    Iterator<Medico>iter=list.iterator();
                    Medico m=null;
                    while(iter.hasNext()){
                        m=iter.next();
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( m.getNombre());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getIdentificacion_M());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getTipo_Identificacion());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getNumero_Targeta());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getAños_Exp());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(m.getEspecialidad());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(m.getHora_I());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(m.getHora_F());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"Controlador?accion=editar_M&identificacion_p=");
      out.print( m.getIdentificacion_M());
      out.write("\">Editar</a>\n");
      out.write("                            <a href=\"ControladorM?accion=eliminar_M&identificacion_p=");
      out.print( m.getIdentificacion_M());
      out.write("\">Remover</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
