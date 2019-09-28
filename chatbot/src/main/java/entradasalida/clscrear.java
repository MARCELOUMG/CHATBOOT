
package entradasalida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.mdAlumno;


public class clscrear {
    public List<mdAlumno> crear(){
        List<mdAlumno> ArregloAlumnos = new ArrayList<mdAlumno>();
        ArregloAlumnos = new clsarchivo().leer();
        Scanner sc = new Scanner(System.in);
        String opc="";
        
        System.out.println("¿que deseas obtener de los alumnos?");
        System.out.println("1. Desviacion\n"
        +"2. Media\n"
        +"3. Mediana\n"
        +"4. Moda\n"
        +"5. Rango\n");
        System.out.println("ingresa la la opcion a escoger");
        opc = sc.nextLine();
        
        switch(opc){
            case "1":
                try{
       File fichero = new File("C:\\Users\\chelo\\Desktop\\datos.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
         for (mdAlumno e : ArregloAlumnos) {
               
                bw.write(e.getCarnet()+" "+e.getIdtele()+" "+e.getCorreo()+" "+e.getNombre()+
        "\nDesviacion: "+e.getDesviacion2()+"\n");
            }
            bw.close();
                    System.out.println("su archivo ha sido creado");
        }catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
    }
                break;
        case "2":
                try{
       File fichero = new File("C:\\Users\\chelo\\Desktop\\datos.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
         for (mdAlumno e : ArregloAlumnos) {
               
                bw.write(e.getCarnet()+" "+e.getIdtele()+" "+e.getCorreo()+" "+e.getNombre()+
        "\nMedia: "+e.getMedia()+"\n");
            }
            bw.close();
            System.out.println("su archivo ha sido creado");
        }catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
    }
                break;
         case "3":
                try{
       File fichero = new File("C:\\Users\\chelo\\Desktop\\datos.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
         for (mdAlumno e : ArregloAlumnos) {
               
                bw.write(e.getCarnet()+" "+e.getIdtele()+" "+e.getCorreo()+" "+e.getNombre()+
        "\nMediana: "+e.getMediana()+"\n");
            }
            bw.close();
            System.out.println("su archivo ha sido creado");
        }catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
    }
                break; 
        case "4":
                try{
       File fichero = new File("C:\\Users\\chelo\\Desktop\\datos.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
         for (mdAlumno e : ArregloAlumnos) {
               
                bw.write(e.getCarnet()+" "+e.getIdtele()+" "+e.getCorreo()+" "+e.getNombre()+
        "\nModa: "+e.getModa()+"\n");
            }
            bw.close();
            System.out.println("su archivo ha sido creado");
        }catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
    }
                break;
        case "5":
                try{
       File fichero = new File("C:\\Users\\chelo\\Desktop\\datos.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
         for (mdAlumno e : ArregloAlumnos) {
               
                bw.write(e.getCarnet()+" "+e.getIdtele()+" "+e.getCorreo()+" "+e.getNombre()+
        "\nRango: "+e.getRango()+"\n");
            }
            bw.close();
            System.out.println("su archivo ha sido creado");
        }catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
    }
                break;
        }
        
        
        return ArregloAlumnos;
    }
    
}
