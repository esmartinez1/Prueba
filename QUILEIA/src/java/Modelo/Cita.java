/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Cita {
    Medico m =new Medico();
    Paciente p=new Paciente();
    String hora_Cita;
    public Cita(){
    }

    public Cita(String hora_Cita) {
        this.hora_Cita = hora_Cita;
    }

    public Medico getM() {
        return m;
    }

    public void setM(Medico m) {
        this.m = m;
    }

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
    }

    public String getHora_Cita() {
        return hora_Cita;
    }

    public void setHora_Cita(String hora_Cita) {
        this.hora_Cita = hora_Cita;
    }
    
}
