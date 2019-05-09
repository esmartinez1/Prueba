
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PacienteDAO implements CRUD {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Paciente p=new Paciente();
    @Override
    public List listar() {
        ArrayList<Paciente>list=new ArrayList<>();
        String sql="select * from paciente";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Paciente p=new Paciente();
                p.setNombre(rs.getString("Nombre"));
                p.setFecha_Nacimiento(rs.getDate("Fecha_Nacimiento"));
                p.setIdentificacion_P(rs.getString("Identificacion_P"));
                p.setTipo_Identificacion(rs.getString("Tipo_Identificacion"));
                p.setEPS_Afiliacion(rs.getString("EPS_Afiliacion"));
                p.setHistoria_Clinica(rs.getString("Historia_Clinica"));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Paciente list(String Identificacion_P) {
        String sql="select * from paciente where Identificacion_P"+Identificacion_P;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setNombre(rs.getString("Nombre"));
                p.setFecha_Nacimiento(rs.getDate("Fecha_Nacimiento"));
                p.setIdentificacion_P(rs.getString("Identificacion_P"));
                p.setTipo_Identificacion(rs.getString("Tipo_Identificacion"));
                p.setEPS_Afiliacion(rs.getString("EPS_Afiliacion"));
                p.setHistoria_Clinica(rs.getString("Historia_Clinica"));
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Paciente per) {
        String sql="Insert into paciente(Nombre, Fecha_Nacimiento, Identificacion, Tipo_Identificacion,EPS_Afiliacion, Historia_Clinica)values('"+per.getNombre()+"','"+per.getFecha_Nacimiento()+"','"+per.getIdentificacion_P()+"','"+per.getTipo_Identificacion()+"','"+per.getEPS_Afiliacion()+"','"+per.getHistoria_Clinica()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Paciente per) {
        String sql="update paciente set Nombre='"+per.getNombre()+"',Fecha_Nacimiento='"+per.getFecha_Nacimiento()+"',Identificacion='"+per.getIdentificacion_P()+"',Tipo_Identificacion='"+per.getTipo_Identificacion()+"',EPS_Afiliacion='"+per.getEPS_Afiliacion()+"',Historia_Clinica='"+per.getHistoria_Clinica()+"'where Nombre="+per.getNombre();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(String Identificacion_P) {
        String sql="delete from paciente whera Identificacion_P="+Identificacion_P;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
