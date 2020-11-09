package se_controlador;

import java.io.StringWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Helper;
import jess.*;
import vista.PeliculasView;

public class EventHandler implements JessListener {
    PeliculasView vista;
    
    public EventHandler (PeliculasView vista){
        this.vista = vista; 
    }
    @Override
    public void eventHappened(JessEvent je){
        
        /*int type = je.getType();  //que tipo de evento esta surgiendo
        Rete rete = (Rete)je.getSource();
        Context context = je.getContext(); //en que motor esta definido la variable
        Helper helper = new Helper(rete);
        
        if(type == JessEvent.DEFRULE_FIRED){
            Fact respuesta = helper.findFactByTempleteName("MAIN::respuesta");

            if (respuesta == null)
            {
                vista.showResult("No consigo una solución en base a las caracteristicas mencionadas");  
            }
            else  if(respuesta != null){                           
                try {
                     String res = respuesta.get(0).toString();
                     //res = res + respuesta.get(1).toString();

                    vista.showResult(res);
                    } catch (JessException e) {
                        System.out.println("Error: "+ e);
                       }
            }
        }          */
    }
}
