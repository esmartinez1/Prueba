/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Medico;
import java.util.List;

public interface CRUDM {
    public List listar();
    public Medico list(String Identificacion_M);
    public boolean add(Medico med);
    public boolean edit(Medico med);
    public boolean eliminar(String Identificacion_M);
}
