package tareaimprimir;

/**
 * Clase hija o subclase de Regalo
 * 
 * @author nelsoncarrillo
 * @version 1.0 17 enero 2024
 */
public class Pokebola extends Regalo{
    /**
    * M&eacutetodo constructor de la pokebola, subclase de regalo. 
    * Este regalo lo puede recibir solamente pikachu.
    * 
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024
    */
    public Pokebola (){
        super.amistad = 300;
        super.costo = 200;
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
        return "200 WATTS --> POKEBOLAS";
    }
}
