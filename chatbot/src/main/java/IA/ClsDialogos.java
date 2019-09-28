
package IA;

import correo.clsenviarcorreo;
import java.time.LocalDateTime;

import modelo.mdAlumno;
import negocioalumnos.clsAlumno;


public class ClsDialogos {
    
    private String DatosNotas(String carnet){
        return carnet;
    }
    public String ProcesaDialogo(String mensaje){
          
        String respuesta ="",r="",destinatario ="", asunto = "Mis Datos Personales", cuerpo = "";
         LocalDateTime locaDate = LocalDateTime.now();
        int hora = locaDate.getHour();
        
        if(mensaje.startsWith("#carnet")){
           
            String carnet = mensaje.replace("#carnet","").trim();
            String r2 = DatosNotas(carnet);
            mdAlumno alumno = new clsAlumno().buscaralumno(r2);
            
            if(alumno.getNombre()==null){
                respuesta="carnet no existe";
                  
            }else{    
                if(hora>=6&&hora<=13){
                    if(alumno.getSexo().equals("M")){
                    respuesta="Buen Dia Señor"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
                if(alumno.getSexo().equals("F")){
                    respuesta="Buen Dia Señorita"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
                }
                if(hora>=14&&hora<=18){
                    if(alumno.getSexo().equals("M")){
                    respuesta="Buen tarde Señor"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
                if(alumno.getSexo().equals("F")){
                    respuesta="Buen tarde Señorita"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
                }
                   
                                 
            }  
        }if(mensaje.startsWith("#nombre")){
            String [] datos = mensaje.split(" ");
            
            StringBuffer cadena = new StringBuffer();
            
            for(int x=1; x<datos.length;x++){
            
                cadena =cadena.append(datos[x]+" ");
        }
            mdAlumno alumno = new clsAlumno().buscarnombre(cadena.toString().toUpperCase());
            
            if(alumno.getNombre()==null){
                respuesta="carnet no existe";      
            }else{
           if(hora>=6&&hora<=13){
                    if(alumno.getSexo().equals("M")){
                    respuesta="Buen Dia Señor"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
                if(alumno.getSexo().equals("F")){
                    respuesta="Buen Dia Señorita"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
                }
                if(hora>=14&&hora<=18){
                    if(alumno.getSexo().equals("M")){
                    respuesta="Buen tarde Señor"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
                if(alumno.getSexo().equals("F")){
                    respuesta="Buen tarde Señorita"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
                }
            }  
        }if(mensaje.contains("carnet")||mensaje.contains("Carnet")){
           
            char [] cadenon = mensaje.toCharArray();
            String carnet = "";
            //character.isDigit Comprueba si el carácter pasado como parámetro es un dígito. Si es un dígito devuelve true, en caso contrario devuelve false.
            for(int i =0; i<cadenon.length;i++){
                
                if(Character.isDigit(cadenon[i])){
                    carnet += cadenon[i];
                }
            }
            
            String res2 = DatosNotas(carnet);
            mdAlumno alumno = new clsAlumno().buscaralumno(res2);
            
            if(alumno.getNombre()==null){
                respuesta="carnet no existe";
                  
            }else{
                if(alumno.getSexo().equals("M")){
                    respuesta="Buen dia Señor"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
                if(alumno.getSexo().equals("F")){
                    respuesta="Buen dia Señorita"+"\nnombre: "+ alumno.getNombre()+"carnet :"+alumno.getCarnet()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
                "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                }
            }   
        }
        if(mensaje.contains("carnet")&&mensaje.contains("correo") ){
           
            char [] cad = mensaje.toCharArray();
            String carnet = "";
            //character.isDigit Comprueba si el carácter pasado como parámetro es un dígito. 
                //Si es un dígito devuelve true, en caso contrario devuelve false.
            for(int i =0; i<cad.length;i++){
                
                if(Character.isDigit(cad[i])){
                    carnet += cad[i];
                }
            }
            String res2 = DatosNotas(carnet);
            mdAlumno alumno = new clsAlumno().buscaralumno(res2);
            
            if(alumno.getNombre()==null){
                respuesta="carnet no existe";      
            }else{
            r="carnet :"+alumno.getCarnet()+"\nnombre: "+ alumno.getNombre()+"\nCorreo: "+alumno.getCorreo()+" \n"+"\tMedia: "+alumno.getMedia()+"\n"+
            "\tDesviacion: "+alumno.getDesviacion2()+"\n"+"\tMediana: "+alumno.getMediana()+"\n"+"\tModa: "+alumno.getModa()+"\n"+"\tRango: "+alumno.getRango();
                
                destinatario = alumno.getCorreo();
                cuerpo = r;
                
               clsenviarcorreo.enviarConGMail(destinatario, asunto, cuerpo);
               respuesta="todo se ha enviado";
            }   
        }       
    return respuesta;
    }
}
