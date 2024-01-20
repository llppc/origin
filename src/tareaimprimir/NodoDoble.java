package tareaimprimir;

/**
 * Clase de Nodo doble para las listas de tipo dobles.
 * 
 * @version 17 enero 2024
 * @author nelsoncarrillo
 */
public class NodoDoble {
    //Atributos observamos que tiene el anterior a diferencia del NodoSimple
    Regalo elemento;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    /**
    * M&eacutetodo constructor.
    * Permite instanciar objetos de la clase NodoDoble.
    * 
    * @version 17 enero 2024
    * @author nelsoncarrillo
    * @param n regalo que contendr&aacute el nodo
    */
    public NodoDoble(Regalo n){
        this.elemento=n;
        this.siguiente=null;
        this.anterior=null;
    }
    
    /**
    * Establece el siguiente nodo.
    * setter del nodo que le sigue.
    * 
    * @version 17 enero 2024
    * @author nelsoncarrillo
    * @param n nodo que le sigue
    */
    void setSiguiente(NodoDoble n){
        this.siguiente=n;
    }
    
    /**
    * Establece el anterior nodo.
    * setter del nodo que le antecede.
    * 
    * @version 17 enero 2024
    * @author nelsoncarrillo
    * @param n nodo que le antecede
    */
    void setAnterior(NodoDoble n){
        this.anterior=n;
    }
    
    /**
    * Devuelve el siguiente nodo.
    * getter del nodo que le sigue.
    * 
    * @version 17 enero 2024
    * @author nelsoncarrillo
    * @return nodo que le sigue
    */
    NodoDoble getSiguiente(){
        return this.siguiente;
    }
    
    /**
    * Devuelve el anterior nodo.
    * getter del nodo que le antecede.
    * 
    * @version 17 enero 2024
    * @author nelsoncarrillo
    * @return nodo que le antecede
    */
    NodoDoble getAnterior(){
        return this.anterior;
    }
    
    /**
    * Devuelve el elemento del nodo.
    * getter del elemento propio del nodo.
    * 
    * @version 17 enero 2024
    * @author nelsoncarrillo
    * @return elemento del nodo.
    */
    Regalo getElemento(){
        return this.elemento;
    }
}
