package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1>Agregar Medico</h1>\n");
      out.write("            <form action=\"Controlador\">\n");
      out.write("                Nombre completo:<br>\n");
      out.write("                <input type=\"text\" name=\"txtNombre\"><br>\n");
      out.write("                Identificacion:<br>\n");
      out.write("                <input type=\"date\" name=\"Identificacion\"><br>\n");
      out.write("                Tipo Identificacion:<br>\n");
      out.write("                <input type=\"text\" name=\"txtTipo_Identificacion\"><br>\n");
      out.write("                Numero targeta p:<br>\n");
      out.write("                <input type=\"text\" name=\"txtNumero_Targeta\"><br>\n");
      out.write("                Años de experiencia:<br>\n");
      out.write("                <input type=\"text\" name=\"txtAños_Exp\"><br>\n");
      out.write("                Especialidad:<br>\n");
      out.write("                <input type=\"text\" name=\"txtEspecialidad\"><br>\n");
      out.write("                Hora Inicio:<br>\n");
      out.write("                <input type=\"text\" name=\"txtHora_I\"><br>\n");
      out.write("                Hora Final:<br>\n");
      out.write("                <input type=\"text\" name=\"txtHora_F\"><br>\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Agregar\"><br>\n");
      out.write("                <a href=\"Controlador?accion=listar\">Regresar</a>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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