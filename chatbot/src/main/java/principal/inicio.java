
package principal;

import modelo.mdAlumno;
import negocioalumnos.clsAlumno;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import telegram.clsprimerbot;


public class inicio {
    public static void telegramaProgra2(){
 // Initialize Api Context
        ApiContextInitializer.init();
        // Instantiate Telegram Bots API
        TelegramBotsApi botsApi = new TelegramBotsApi();
        // Register our bot
        try {
            botsApi.registerBot(new clsprimerbot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
}
    public static void main(String[] args){
        telegramaProgra2();
        // mdAlumno alumno = new clsAlumno().buscaralumno("25469");
    
      //  if (alumno.getCarnet()==null){
//            System.out.println("Carnet no existe");
//        }else{
//             System.out.println("carnet"+alumno.getCarnet()+"Nombre"+alumno.getNombre());
//        }
       
         
}
}
