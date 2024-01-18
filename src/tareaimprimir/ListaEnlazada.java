/*
 * Ck nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 *Clase de la lista simple enlazada
 * @version 17 enero 2024
 * @author nelsoncarrillo
 */
public class ListaEnlazada {
    //lista de inventario
    NodoSimple primero;
    NodoSimple ultimo;
    int size=0;
    
    /**
     * M&eacutetodo constructor de la lista
     */
    public ListaEnlazada(){
    }
    
    /**
     * @return primer elemento contenido en la lista
     */
    NodoSimple getpFirst() {
        return this.primero;
    }
    
    /**
     * inserta a la &uacuteltima posici&oacuten digamos de la lista un elemento pasado como
     * @param Regalo
     */
    void insertarlast(Regalo nuevo){
        NodoSimple nuev = new NodoSimple(nuevo);
        if(this.size==0){
            this.primero=nuev;
            this.ultimo=nuev;
        }else{
            NodoSimple last = this.ultimo;
            last.setNxt(nuev);
            this.ultimo=nuev;  
        }
        this.size+=1;   
    }
    
    
    
    /**
     * Devuelve true si encuentra en la lista el Elemento pasado como 
     * @param Regalo
     */
    boolean buscarelemento(Regalo n){
        for(NodoSimple indice = this.getpFirst(); indice != null ; indice = indice.getNxt() ){            
            if( n.equals(indice.getElemento())){                
                return true;               
            }           
        }
        return false ;
    }
    
    /**
     * Recorre los regalos e imprime su m&eacutetodo polim&oacuterfico 
     * @version 17 enerp 2024
     * @param none
     */
    void recorrereimprimir(){   
        for(NodoSimple indice = this.getpFirst(); indice != null ; indice = indice.getNxt() ){
            System.out.println((indice.getElemento()).menuItem());
        }       
    }
    
    /**
     * Elimina de la lista el elemento pasado por 
     * @param Elemento
     */
    void eliminarElemento(Regalo n){
        NodoSimple actual,anterior;//puedes inicializar dos del mismo tipo
        boolean encontrado=false;//flag
        actual=this.primero;
        anterior=null;        
        while((actual!=null) && (!encontrado)){
            encontrado = (n.equals(actual.getElemento()));
            if(!encontrado){
                anterior = actual;
                actual = actual.getNxt();
            }
        }        
        if (actual!=null){
            
            if(actual==this.primero){
                this.primero = actual.getNxt();
            }else{
                anterior.setNxt(actual.getNxt());
            }
            actual=null;           
        }
    }
}