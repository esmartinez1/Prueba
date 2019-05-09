/*
- Nombre Completo (CADENA) 
- Fecha de Nacimiento (FECHA) 
- Identificación (CADENA) 
- Tipo identificación (CADENA) 
- EPS a la que está afiliado (CADENA) 
- Historia clínica (TEXTO)
*/
package Modelo;

import java.sql.Date;

public class Paciente {
    String Nombre,Identificacion_P,Tipo_Identificacion,EPS_Afiliacion,Historia_Clinica;
    Date Fecha_Nacimiento;
    
    public Paciente(){
    
    }

    public Paciente(String Nombre, String Identificacion_P, String Tipo_Identificacion, String EPS_Afiliacion, String Historia_Clinica, Date Fecha_Nacimiento) {
        this.Nombre = Nombre;
        this.Identificacion_P = Identificacion_P;
        this.Tipo_Identificacion = Tipo_Identificacion;
        this.EPS_Afiliacion = EPS_Afiliacion;
        this.Historia_Clinica = Historia_Clinica;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificacion_P() {
        return Identificacion_P;
    }

    public void setIdentificacion_P(String Identificacion_P) {
        this.Identificacion_P = Identificacion_P;
    }

    public String getTipo_Identificacion() {
        return Tipo_Identificacion;
    }

    public void setTipo_Identificacion(String Tipo_Identificacion) {
        this.Tipo_Identificacion = Tipo_Identificacion;
    }

    public String getEPS_Afiliacion() {
        return EPS_Afiliacion;
    }

    public void setEPS_Afiliacion(String EPS_Afiliacion) {
        this.EPS_Afiliacion = EPS_Afiliacion;
    }

    public String getHistoria_Clinica() {
        return Historia_Clinica;
    }

    public void setHistoria_Clinica(String Historia_Clinica) {
        this.Historia_Clinica = Historia_Clinica;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }
    
}
