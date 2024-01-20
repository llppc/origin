package tareaimprimir;

/**
 * Clase hija o subclase de Regalo
 * 
 * @author nelsoncarrillo
 * @version 1.0 17 enero 2024
 */
public class Eter extends Regalo{
    /**
    * M&eacutetodo constructor del Eter, subclase de regalo. 
    * Este regalo lo puede recibir solamente pikachu.
    * 
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024
    */
    public Eter(){
        super.amistad = 600;
        super.costo = 400;
    }
    
    /**
    * Devuelve un string a imprimir a la hora de desplegar un men&uacute de regalos.
    * Este m&eacutetodo lo comparten todos los regalos, pues es polimorfismo derivado
    * de la superclase.
    *
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024   
    * @return String con precio en watts del regalo
    */
    String menuItem(){
        return "400 WATTS --> ETERES";
    }
}
