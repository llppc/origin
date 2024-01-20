package tareaimprimir;

/**
 * Clase hija o subclase de Regalo
 * 
 * @author nelsoncarrillo
 * @version 1.0 17 enero 2024
 */
public class CarameloRaro extends Regalo{
    /**
    * M&eacutetodo constructor del Caramelo Raro, subclase de regalo. 
    * Este regalo lo puede recibir solamente pikachu.
    * 
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024
    */
    public CarameloRaro(){
        super.amistad = 1600;
        super.costo = 1100;
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
        return "1100 WATTS --> CARAMELOS RAROS";
    }
}
