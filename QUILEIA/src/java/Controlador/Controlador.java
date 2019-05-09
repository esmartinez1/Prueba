
package Controlador;

import Modelo.Medico;
import Modelo.Paciente;
import ModeloDAO.MedicoDAO;
import ModeloDAO.PacienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {
    String listarP="vistas/listar_P.jsp";
    String addP="vistas/add_P.jsp";
    String editP="vistas/edit_P.jsp";
    String identificacion_P;
    Paciente p=new Paciente();
    PacienteDAO dao=new PacienteDAO();
    String listarM="vistas/listar_M.jsp";
    String addM="vistas/add_M.jsp";
    String editM="vistas/edit_M.jsp";
    String identificacion_M;
    Medico m=new Medico();
    MedicoDAO dao2=new MedicoDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acceso="",action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar_P")){
        acceso=listarP;
        }else if(action.equalsIgnoreCase("add_P")){
            acceso=addP;
        }
        else if(action.equalsIgnoreCase("Agregar_P")){
            String nombre=request.getParameter("txtNombre"),identificacion=request.getParameter("txtIdentificacion_P"),tipo_identificacion=request.getParameter("txtTipo_Identificacion"),EPS_afiliacion=request.getParameter("txtEPS_Afiliacion"),Historia_clinica=request.getParameter("txtHistoria_Clinica");
            String fecha_Nacimiento=request.getParameter("txtFecha_Nacimiento");
            p.setNombre(nombre);
            String startDate="01-02-2013";
            SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
            java.util.Date date = null;
            try {
                date = format.parse(startDate);
            } catch (ParseException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            p.setFecha_Nacimiento(sqlStartDate);
            p.setIdentificacion_P(identificacion);
            p.setTipo_Identificacion(tipo_identificacion);
            p.setEPS_Afiliacion(EPS_afiliacion);
            p.setHistoria_Clinica(Historia_clinica);
            dao.add(p);
            acceso=listarP;
        }
        else if(action.equalsIgnoreCase("editar_P")){
            request.setAttribute("identificacion_P", request.getParameter("identificacion_P"));
            acceso=editP;
        }
        else if(action.equalsIgnoreCase("Actualizar_P")){
            identificacion_P = (request.getParameter("identificacion_P"));
            String nombre=request.getParameter("txtNombre"),tipo_identificacion=request.getParameter("txtTipo_Identificacion"),EPS_afiliacion=request.getParameter("txtEPS_Afiliacion"),Historia_clinica=request.getParameter("txtHistoria_Clinica");
            String fecha_Nacimiento=request.getParameter("txtFecha_Nacimiento");
            p.setNombre(nombre);
            SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
            java.util.Date date = null;
            try {
                date = format.parse(fecha_Nacimiento);
            } catch (ParseException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            p.setFecha_Nacimiento(sqlStartDate);
            p.setIdentificacion_P(identificacion_P);
            p.setTipo_Identificacion(tipo_identificacion);
            p.setEPS_Afiliacion(EPS_afiliacion);
            p.setHistoria_Clinica(Historia_clinica);
            dao=edit(p);
            acceso=listarP;
        }
        else if(action.equalsIgnoreCase("eliminar_P")){
            identificacion_P=request.getParameter("identificacion_p");
            p.setIdentificacion_P(identificacion_P);
            dao.eliminar(identificacion_P);
            acceso=listarP;
        }
        //////////////////////////////
        else if(action.equalsIgnoreCase("listar_M")){
        acceso=listarM;
        }else if(action.equalsIgnoreCase("add_M")){
            acceso=addM;
        }
        else if(action.equalsIgnoreCase("Agregar_M")){
            String nombre=request.getParameter("txtNombre"),identificacion=request.getParameter("txtIdentificacion_M"),tipo_identificacion=request.getParameter("txtTipo_Identificacion"),numeroTargeta=request.getParameter("txtNumero_Targeta"),especialidad=request.getParameter("txtEspecialidad"),horaI=request.getParameter("txtHora_I"),horaF=request.getParameter("txtHora_F");
            double añosExp=Double.parseDouble(request.getParameter("txtAños_Exp"));
            m.setNombre(nombre);
            m.setIdentificacion_M(identificacion);
            m.setTipo_Identificacion(tipo_identificacion);
            m.setNumero_Targeta(numeroTargeta);
            m.setAños_Exp(añosExp);
            m.setEspecialidad(especialidad);
            m.setHora_I(horaI);
            m.setHora_F(horaF);
            dao2.add(m);
            acceso=listarM;
        }
        else if(action.equalsIgnoreCase("editar_M")){
            request.setAttribute("identificacion_M", request.getParameter("identificacion_M"));
            acceso=editM;
        }
        else if(action.equalsIgnoreCase("Actualizar_M")){
            String nombre=request.getParameter("txtNombre"),identificacion=request.getParameter("txtIdentificacion_M"),tipo_identificacion=request.getParameter("txtTipo_Identificacion"),numeroTargeta=request.getParameter("txtNumero_Targeta"),especialidad=request.getParameter("txtEspecialidad"),horaI=request.getParameter("txtHora_I"),horaF=request.getParameter("txtHora_F");
            double añosExp=Double.parseDouble(request.getParameter("txtAños_Exp"));
            m.setNombre(nombre);
            m.setIdentificacion_M(identificacion);
            m.setTipo_Identificacion(tipo_identificacion);
            m.setNumero_Targeta(numeroTargeta);
            m.setAños_Exp(añosExp);
            m.setEspecialidad(especialidad);
            m.setHora_I(horaI);
            m.setHora_F(horaF);
            dao2=edit(m);
            acceso=listarM;
        }
        else if(action.equalsIgnoreCase("eliminar_M")){
            identificacion_M=request.getParameter("identificacion_M");
            m.setIdentificacion_M(identificacion_M);
            dao2.eliminar(identificacion_M);
            acceso=listarM;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private PacienteDAO edit(Paciente p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private MedicoDAO edit(Medico m){
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

