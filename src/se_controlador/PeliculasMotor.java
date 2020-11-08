package se_controlador;
import javax.swing.JTextArea;
import vista.PeliculasView;

public class PeliculasMotor {
        public static void main(String[] args) {
        // TODO code application logic here
        PeliculasView view = new PeliculasView(); //inicializo la vista
        JTextArea ta = view.txt_Result; //inicializo un objeto TxA para enviarselo como parametro al motor
        MotorController motorController = new MotorController(ta);  //inicializo el motor
        view.setMotorController(motorController);
        

        //EventHandler eventController = new EventHandler(view);
        //motorController.addEscuchador(eventController); 
       
            
    }
}
