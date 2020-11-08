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
        
       /* int type = je.getType();  //que tipo de evento esta surgiendo
        Rete rete = (Rete)je.getSource();
        Context context = je.getContext(); //en que motor esta definido la variable
        Helper helper = new Helper(rete);
        
         if(type == JessEvent.DEFRULE_FIRED){
           Fact respuesta = helper.findFactByTempleteName("MAIN::moviesResult"); //busco el template 
            if (respuesta != null){
               String slotV;
               
               Fact nodo = null;
               try {
                   slotV = respuesta.get(0).toString();
                   System.out.println("CHAU: "+slotV);
                   nodo = helper.findFactByTemplateName("MAIN::Respuesta", "tipo_pelicula", slotV); //busco alguna respuesta con ese slot y el valor
                   System.out.println("KE: " + nodo);
                   if(nodo != null){
                       String res = nodo.getSlotValue("movie_name").stringValue(context);
                       vista.showResult("PELICULA ELEGIDA----- " + res);
                   }
               } catch (JessException ex) {
                   Logger.getLogger(EventHandler.class.getName()).log(Level.SEVERE, null, ex);
               }

              // res = res + "\n-------\n" ;
                //System.out.println("PROBANDO UNO DOS TRES: "+ res);
                //vista.showResult(res);
            }
            
        }      */
    }
}
