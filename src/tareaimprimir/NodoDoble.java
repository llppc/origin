/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 *Clase de Nodo doble para las listas de tipo dobles
 * @version 17 enero 2024
 * @author nelsoncarrillo
 */
public class NodoDoble {
    //Atributos observamos que tiene el anterior a diferencia del NodoSimple
    Regalo elemento;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    /**
    *M&eacutetodo constructor
    * permite instanciar objetos de la clase NodoDoble
    * @param Regalo que contendr&aacute el nodo
    */
    public NodoDoble(Regalo n){
        this.elemento=n;
        this.siguiente=null;
        this.anterior=null;
    }
    
    //Setter del siguiente nodo
    void setSiguiente(NodoDoble n){
        this.siguiente=n;
    }
    
    //Setter del anterior nodo
    void setAnterior(NodoDoble n){
        this.anterior=n;
    }
    
    //Getter del siguiente nodo en la lista doble
    NodoDoble getSiguiente(){
        return this.siguiente;
    }
    
    //Getter del anterior nodo en la lista doble
    NodoDoble getAnterior(){
        return this.anterior;
    }
    
    //Getter del elemento contenido en el nodo doble 
    Regalo getElemento(){
        return this.elemento;
    }
}
