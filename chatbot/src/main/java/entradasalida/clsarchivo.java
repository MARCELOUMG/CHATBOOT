
package entradasalida;

import calculadora.clsestadistica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import modelo.mdAlumno;

public class clsarchivo {
    
      public List<mdAlumno> leer(){
        String linea="";
        String nombres[];
        int vectir[];
        int i=0;
        
        List<mdAlumno> ArregloAlumnos = new ArrayList<mdAlumno>();
        
        clsestadistica calculadora;
        double media, mediana, moda, rango, desviacion2;
             File archivo = new File("C:\\Users\\chelo\\Desktop\\p2B.csv");
             Charset charset = Charset.forName("UTF-8");
             FileReader archivolector;
        try{
        archivolector = new FileReader(archivo);
        BufferedReader br = new BufferedReader(archivolector);
        while(br.ready()){
            
            if((linea = br.readLine())!=null){
            //System.out.println(linea);
                nombres = linea.split(";");
                vectir = new int[nombres.length];
                for(i=5;i<vectir.length;i++){
                    
               vectir[i] = Integer.parseInt(nombres[i]);
           
                }
                 calculadora = new clsestadistica(vectir);  
                  //System.out.println(nombres[0]);
    mediana = calculadora.mediana();
    desviacion2 = calculadora.desviacion();
    moda = calculadora.moda();
    rango = calculadora.rango();
    media = calculadora.promedio();
               
    mdAlumno alumno = new mdAlumno();
    
    alumno.setNombre(nombres[4]);
    alumno.setSexo(nombres[3]);
    alumno.setDesviacion2(desviacion2);
    alumno.setMedia(media);
    alumno.setMediana(mediana);
    alumno.setModa(moda);
    alumno.setRango(rango);
    alumno.setCarnet(nombres[0]);
    alumno.setIdtele(nombres[1]);
    alumno.setCorreo(nombres[2]);
    
    
    ArregloAlumnos.add(alumno);
                
            }
            
        }
           
            
        }catch(Exception ex){
            
            
        }
        return ArregloAlumnos;
    }
}
