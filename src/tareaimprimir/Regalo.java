package tareaimprimir;

/**
 * Superclase de los regalos que se le dan a los pokemones.
 * 
 * @author nelsoncarrillo
 * @version 1.0 17 enero 2024
 */
public abstract class Regalo {
    //atributos de los regalos, tienen un costo y beneficio.
    int amistad;
    int costo;
    
    /**
    * Devuelve la amistad que da cada regalo.
    * Es el getter del atributo amistad para cada regalo.
    * 
    *
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024   
    * @return Integer de la amistad brindada por el regalo
    */
    int amistad(){
        return this.amistad;
    }
    
    /**
    * Devuelve el precio de cada regalo.
    * Es el getter del atributo costo para cada regalo.
    * 
    *
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024   
    * @return Integer del costo del regalo
    */
    int costo(){
        return this.costo;
    }
    
    /**
    * Devuelve un string a imprimir a la hora de desplegar un men&uacute de regalos.
    * Metodo abstracto supuesto a polimorfismo por cada regalo.
    *
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024   
    * @return String con precio en watts del regalo
    */
    abstract String menuItem();
    
}
