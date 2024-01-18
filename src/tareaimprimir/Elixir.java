/*
 * Cnbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 *Clase hija del Regalos
 * @author nelsoncarrillo
 */
public class Elixir extends Regalo{
    public Elixir(){
        super.amistad = 1100;
        super.costo = 700;
    }
    
    /**
     Polimorfismo con el m&eacutetodo de regalo para su despliegue en el men&uacute
     */
    String menuItem(){
        return "700 WATTS --> ELIXIRES";
    }
}
