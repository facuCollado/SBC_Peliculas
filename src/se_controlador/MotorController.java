package se_controlador;
import clases.Tipos;
import clases.User;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import jess.*;
import jess.swing.JTextAreaWriter;
/**
 *
 * @author Usuario
 */
public class MotorController {
    Rete motor; //metodos clips

    public MotorController() {
    }
    
    public MotorController(JTextArea ta){
        try {
            motor = new Rete();
            
            //escribir en el textarea
            JTextAreaWriter taw = new JTextAreaWriter(ta);
            motor.addOutputRouter("t", taw);
            //reseteo y cargo el archivo
            motor.reset();
            motor.batch("clips/rules2.clp");
            
        } catch (JessException e) {
            Logger.getLogger(MotorController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
      public void setTipoPelicula(Tipos tipo, User user) throws IOException{
         try {
             
             motor.add(tipo);//agrego los datos de la clase tipo
             motor.add(user);//agrego los datos de user *es solo el nombre
        } catch (JessException e) {
            Logger.getLogger(MotorController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
  /*  public void addEscuchador(EventHandler eventController){
        motor.addJessListener(eventController);
        motor.setEventMask(JessEvent.DEFRULE_FIRED);
    }*/
    
    public void ejecutar(){
        try {
            //ejectuo las reglas
            motor.run();
        } catch (Exception e) {
            Logger.getLogger(MotorController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
