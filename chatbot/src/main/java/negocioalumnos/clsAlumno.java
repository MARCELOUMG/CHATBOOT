
package negocioalumnos;

import entradasalida.clsarchivo;
import java.util.List;
import modelo.mdAlumno;


public class clsAlumno {
    
    public mdAlumno buscaralumno(String Carnet){
       
       List<mdAlumno> todos;
        todos = new clsarchivo().leer();
        mdAlumno respuestaAlumno = new mdAlumno();
        
        for(mdAlumno Alumnoindividual:todos){
            if(Alumnoindividual.getCarnet().equals(Carnet)){
                respuestaAlumno = Alumnoindividual;
            }
        }
        return respuestaAlumno;
    }
    
    public mdAlumno buscarnombre(String Nombre){
        List<mdAlumno> tod;
        tod = new clsarchivo().leer();
        mdAlumno respuesta = new mdAlumno();
        
        for (mdAlumno Alumno : tod){
            if(Alumno.getNombre().equals(Nombre)){
                respuesta = Alumno;
            }
        }
        return respuesta;
    }
}
