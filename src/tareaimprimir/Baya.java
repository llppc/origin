package tareaimprimir;

/**
 * Clase hija o subclase de Regalo
 * 
 * @author nelsoncarrillo
 * @version 1.0 17 enero 2024
 */
public class Baya extends Regalo{
    
    /**
    * M&eacutetodo constructor de la Baya subclase de regalo. 
    * Este regalo lo puede recibir tanto pachirisu como pikachu, es decir, 
    * ya que pachirisu solo acepta bayas.
    * 
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024
    */
    public Baya(){
        super.amistad = 100;
        super.costo = 100;
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
        return "100 WATTS --> BAYAS";
    }
}
