/*nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 * Clase hija o subclase de Regalo
 * @author nelsoncarrillo
 */
public class Baya extends Regalo{
    public Baya(){
        super.amistad = 100;
        super.costo = 100;
    }
    /**
     Polimorfismo con el m&eacutetodo de regalo para su despliegue en el men&uacute
     */
    String menuItem(){
        return "100 WATTS --> BAYAS";
    }
}
