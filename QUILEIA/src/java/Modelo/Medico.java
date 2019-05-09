/*
- Nombre Completo (CADENA) 
- Identificación (CADENA) 
- Tipo de identificación(CADENA) 
- Número de Tarjeta Profesional (CADENA) 
- Años de experiencia (DECIMAL)
- Especialidad (CADENA) 
- Hora Inicio Atención (CADENA) 
- Hora Fin de Atención (CADENA)*/
package Modelo;

public class Medico {
    String nombre,identificacion_M,tipo_Identificacion,numero_Targeta,especialidad,hora_I,hora_F;
    double Años_Exp;
    
    public Medico(){
    
    }
    public Medico(String nombre, String identificacion_M, String tipo_Identificacion, String numero_Targeta, String especialidad, String hora_I, String hora_F, double Años_exp) {
        this.nombre = nombre;
        this.identificacion_M = identificacion_M;
        this.tipo_Identificacion = tipo_Identificacion;
        this.numero_Targeta = numero_Targeta;
        this.especialidad = especialidad;
        this.hora_I = hora_I;
        this.hora_F = hora_F;
        this.Años_Exp = Años_exp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion_M() {
        return identificacion_M;
    }

    public void setIdentificacion_M(String identificacion_M) {
        this.identificacion_M = identificacion_M;
    }

    public String getTipo_Identificacion() {
        return tipo_Identificacion;
    }

    public void setTipo_Identificacion(String tipo_Identificacion) {
        this.tipo_Identificacion = tipo_Identificacion;
    }

    public String getNumero_Targeta() {
        return numero_Targeta;
    }

    public void setNumero_Targeta(String numero_Targeta) {
        this.numero_Targeta = numero_Targeta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHora_I() {
        return hora_I;
    }

    public void setHora_I(String hora_I) {
        this.hora_I = hora_I;
    }

    public String getHora_F() {
        return hora_F;
    }

    public void setHora_F(String hora_F) {
        this.hora_F = hora_F;
    }

    public double getAños_Exp() {
        return Años_Exp;
    }

    public void setAños_Exp(double Años_Exp) {
        this.Años_Exp = Años_Exp;
    }
    
}
