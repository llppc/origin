package tareaimprimir;

/**
 * Clase hija o subclase de Regalo
 * 
 * @author nelsoncarrillo
 * @version 1.0 17 enero 2024
 */
public class Elixir extends Regalo{
    /**
    * M&eacutetodo constructor del Elixir, subclase de regalo. 
    * Este regalo lo puede recibir solamente pikachu.
    * 
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024
    */
    public Elixir(){
        super.amistad = 1100;
        super.costo = 700;
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
        return "700 WATTS --> ELIXIRES";
    }
}
