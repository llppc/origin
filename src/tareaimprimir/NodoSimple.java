package tareaimprimir;

/**
 *Clase de Nodo para las listas enlazadas.
 * 
 * @version 17 enero 2024
 * @author nelsoncarrillo
 */
public class NodoSimple {
    //atributos de un nodo simple, solo tiene next.
    Regalo elemento;
    NodoSimple nxt;
    
    /**
    * M&eacutetodo constructor.
    * Permite instanciar objetos de la clase.
    * 
    * @version 17 enero 2024
    * @author nelsoncarrillo
    * @param n regalo que contendr&aacute el nodo
    */
    public NodoSimple(Regalo n){
        this.elemento=n;
        this.nxt=null;
    }
    
    /**
    * Devuelve el siguiente nodo.
    * getter del nodo que le sigue.
    * 
    * @version 17 enero 2024
    * @author nelsoncarrillo
    * @return nodo que le sigue
    */
    NodoSimple getNxt(){
        return this.nxt;
    }
    
    /**
    * Establece el siguiente nodo.
    * setter del nodo que le sigue.
    * 
    * @version 17 enero 2024
    * @author nelsoncarrillo
    * @param n nodo que le sigue
    */
    void setNxt(NodoSimple n){
        this.nxt=n;
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
