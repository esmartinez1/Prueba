/*
- Nombre Completo (CADENA) 
- Identificación (CADENA) 
- Tipo de identificación(CADENA) 
- Número de Tarjeta Profesional (CADENA) 
- Años de experiencia (DECIMAL) 
- Especialidad (CADENA) 
- Hora Inicio Atención (CADENA) 
- Hora Fin de Atención (CADENA)*/
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUDM;
import Modelo.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MedicoDAO implements CRUDM {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Medico m=new Medico();

    @Override
    public List listar() {
        ArrayList<Medico>list=new ArrayList<>();
        String sql="select * from medico";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Medico m=new Medico();
                m.setNombre(rs.getString("Nombre"));
                m.setIdentificacion_M(rs.getString("Identificacion_M"));
                m.setTipo_Identificacion(rs.getString("Tipo_Identificacion"));
                m.setNumero_Targeta(rs.getString("Numero_Targeta"));
                m.setAños_Exp(rs.getDouble("Años_Exp"));
                m.setEspecialidad(rs.getString("Especialidad"));
                m.setHora_I(rs.getString("Hora_I"));
                m.setHora_F(rs.getString("Hora_F"));
                list.add(m);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Medico list(String Identificacion_M) {
        String sql="select * from medico where Identificacion_M"+Identificacion_M;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                m.setNombre(rs.getString("Nombre"));
                m.setIdentificacion_M(rs.getString("Identificacion_M"));
                m.setTipo_Identificacion(rs.getString("Tipo_Identificacion"));
                m.setNumero_Targeta(rs.getString("Numero_Targeta"));
                m.setAños_Exp(rs.getDouble("Años_Exp"));
                m.setEspecialidad(rs.getString("Especialidad"));
                m.setHora_I(rs.getString("Hora_I"));
                m.setHora_F(rs.getString("Hora_F"));
            }
        } catch (Exception e) {
        }
        return m;
    }

    @Override
    public boolean add(Medico med) {
        String sql="Insert into medico(Nombre, Fecha_Nacimiento, Identificacion_M, Tipo_Identificacion, Numero_Targeta, Años_Exp, Especialidad, Hora_I, Hora_F)values('"+med.getNombre()+"','"+med.getIdentificacion_M()+"','"+med.getTipo_Identificacion()+"','"+med.getNumero_Targeta()+"','"+med.getAños_Exp()+"','"+med.getEspecialidad()+"','"+med.getHora_I()+"','"+med.getHora_F()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Medico med) {
         String sql="update medico set Nombre='"+med.getNombre()+"',Identificacion_M='"+med.getIdentificacion_M()+"',Tipo_Identificacion='"+med.getTipo_Identificacion()+"',Numero_Targeta='"+med.getNumero_Targeta()+"',Años_Exp='"+med.getAños_Exp()+"',Especialidad='"+med.getEspecialidad()+"',Hora_I='"+med.getHora_I()+"',Hora_F='"+med.getHora_F()+"'where Identificacion_M="+med.getIdentificacion_M();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(String Identificacion_M) {
        String sql="delete from medico whera Identificacion_M="+Identificacion_M;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
    
}
