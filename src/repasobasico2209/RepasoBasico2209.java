
package repasobasico2209;

import ico.fes.cosas.Reloj;

/**
 *
 * @author Carlos GarMon
 */
public class RepasoBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reloj wacho = new Reloj();
        wacho.setHora(23);
        wacho.setMinuto(59);
        wacho.setSegundo(33);
        
        while(true){
            wacho.incrementarSegundo();
            wacho.mostrarHoraActual();
        }
    }
   
}
