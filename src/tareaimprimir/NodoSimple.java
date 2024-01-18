/*
 * Clinbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 *Clase de Nodo para las listas enlazadas
 * @version 17 enero 2024
 * @author nelsoncarrillo
 */
public class NodoSimple {
    //atributos de un nodo simple, solo tiene next.
    Regalo elemento;
    NodoSimple nxt;
    
    //m&eacutetodo constructor
    public NodoSimple(Regalo n){
        this.elemento=n;
        this.nxt=null;
    }
    
    //getter del nodo siguiente
    NodoSimple getNxt(){
        return this.nxt;
    }
    
    //setter del nodo siguiente
    void setNxt(NodoSimple n){
        this.nxt=n;
    }
    
    //getter del elemento que es el regalo
    Regalo getElemento(){
        return this.elemento;
    }
    
    //setter del elemento regalo
    void setElemento(Regalo n){
        this.elemento=n;
    }
   
}
