
package telegram;
import modelo.mdAlumno;
import negocioalumnos.clsAlumno;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
   
public class clsprimerbot extends TelegramLongPollingBot{
    /**
     * Method for receiving messages.
     * @param update Contains a message from the user.
     */
    @Override
    public void onUpdateReceived(Update update) {
	String message = update.getMessage().getText();
        String respuesta="No te entiendo";
        String idtelegram=update.getMessage().getChatId().toString();
       
        respuesta = new IA.ClsDialogos().ProcesaDialogo(message);
        
        if(message.equalsIgnoreCase("Hola")){
        respuesta="Hola, en que te puedo ayudar";
    } 
        if(idtelegram.equals("Muestrame mis datos")|| idtelegram.equals("890147887")){
                            
            respuesta="carnet :20920\n" +" nombre: RICARDO ADOLFO ARGUETA ESCOBAR \n" +" Correo: Juanito@gmail.com \n" +" Media: 42.0\n"+" Desviacion: 31.17049887313323\n" +"\n" +" Mediana: 44.0\n" +"\n" +" Moda: 0.0\n" +"\n" +" Rango: -89.0";
      }
        
        System.out.println("Recibiendo Mensaje = "+message);
        System.out.println("De usuario = "+update.getMessage().getChatId().toString());
	sendMsg(update.getMessage().getChatId().toString(), respuesta);    
}
    /**
     * Method for creating a message and sending it.
     * @param chatId chat id
     * @param s The String that you want to send as a message.
     */
    public synchronized void sendMsg(String chatId, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            System.out.print(e.toString());
           
        }
    }
    /**
     * This method returns the bot's name, which was specified during registration.
     * @return bot name
     */
    @Override
    public String getBotUsername() {
        return "marceloprogra2";
    }
    /**
     * This method returns the bot's token for communicating with the Telegram server
     * @return the bot's token
     */
    @Override
    public String getBotToken() {
        return "915450885:AAGA0DrtzdUdY94HRh4CwoH-9WD3ywGO_bM";
    }
}
