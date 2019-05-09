
package Interfaces;

import Modelo.Medico;
import Modelo.Paciente;
import java.util.List;

public interface CRUD {
    public List listar();
    public Paciente list(String Identificacion_P);
    public boolean add(Paciente per);
    public boolean edit(Paciente per);
    public boolean eliminar(String Identificacion_P);
}