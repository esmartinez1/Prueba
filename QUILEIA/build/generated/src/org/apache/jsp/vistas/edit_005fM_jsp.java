package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Medico;
import ModeloDAO.MedicoDAO;

public final class edit_005fM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            ");

                MedicoDAO dao=new MedicoDAO();
                String identificacion_M=(String)request.getAttribute("identificacion_M");
                Medico m=(Medico)dao.list(identificacion_M);
                
            
      out.write("\n");
      out.write("            <h1>Modificar Paciente</h1>\n");
      out.write("            <form action=\"Controlador\">\n");
      out.write("                Nombre completo:<br>\n");
      out.write("                <input type=\"text\" name=\"txtNombre\" value=\"");
      out.print(m.getNombre());
      out.write("\"><br>\n");
      out.write("                Identificacion:<br>\n");
      out.write("                <input type=\"date\" name=\"txtIdentificacion_M\" value=\"");
      out.print(m.getIdentificacion_M());
      out.write("\"><br>\n");
      out.write("                Tipo de Identificacion:<br>\n");
      out.write("                <input type=\"text\" name=\"txtTipo_Identificacion\" value=\"");
      out.print(m.getTipo_Identificacion());
      out.write("\"><br>\n");
      out.write("                Numero Targeta Profesional:<br>\n");
      out.write("                <input type=\"text\" name=\"txtNumero_Targeta\" value=\"");
      out.print(m.getNumero_Targeta());
      out.write("\"><br>\n");
      out.write("                Años de experiencia:<br>\n");
      out.write("                <input type=\"number\" name=\"txtAños_Exp\" value=\"");
      out.print(m.getAños_Exp());
      out.write("\" step=\"any\"/><br>\n");
      out.write("                Especialidad:<br>\n");
      out.write("                <input type=\"text\" name=\"txtEspecialidad\" value=\"");
      out.print(m.getEspecialidad());
      out.write("\"><br>\n");
      out.write("                Hora de inicio:<br>\n");
      out.write("                <input type=\"text\" name=\"txtHora_I\" value=\"");
      out.print(m.getHora_I());
      out.write("\"><br>\n");
      out.write("                Hora de finalizacion:<br>\n");
      out.write("                <input type=\"text\" name=\"txtHora_F\" value=\"");
      out.print(m.getHora_F());
      out.write("\"><br>\n");
      out.write("                <input type=\"hidden\" name=\"txtidentificacion_M\" value=\"");
      out.print(m.getIdentificacion_M());
      out.write("\">\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Actualizar\"><br>\n");
      out.write("                <a href=\"Controlador?accion=listar\">Regresar</a>\n");
      out.write("            </form>\n");
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
