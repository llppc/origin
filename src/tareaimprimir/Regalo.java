/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Clck nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 *Superclase Regalo
 * @author nelsoncarrillo
 */
public abstract class Regalo {
    int amistad;
    int costo;
    
    /**
     es el getter de la amistad brindada de cada regalo
     */
    int amistad(){
        return this.amistad;
    }
    
    /**
     es el getter del costo de cada regalo
     */
    int costo(){
        return this.costo;
    }
    
    abstract String menuItem();
    
}
