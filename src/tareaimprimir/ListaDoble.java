/*fpush
 * C nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 *Clase de Lista doblemente enlazadas
 * @version 17 enero 2024
 * @author nelsoncarrillo
 */
public class ListaDoble {
    
    //Atributos de la lista doble son mismos que la simple se usa primero y ultimo de referencia
    NodoDoble primero;
    NodoDoble ultimo;
    int size=0;
    
    /**
    *Devuelve el primer nodo
    * @version 17 enero 2024
    * @param n/a
    */
    NodoDoble getPrimero(){
        return this.primero;
    }
    
    /**
    *Inserta en el primer lugar de la lista pasando un regalo como elemento
    * @version 17 enero 2024
    * @param Regalo
    */
    void insertarprimero(Regalo r1){
        NodoDoble nuevo = new NodoDoble(r1);
        nuevo.setSiguiente(primero);
        if(primero!=null){
            primero.setAnterior(nuevo);
        }
        this.primero=nuevo;
        this.size+=1;
    }
    
    /**
    *Inserta un elemento pasado como regalo justo despu&eacutes de un nodo referenciado como @param
    * @version 17 enero 2024
    * @param NodoDoble,Regalo
    */
    void insertardespues(NodoDoble anterior,Regalo r1){
        NodoDoble nuevo = new NodoDoble(r1);
        nuevo.setSiguiente(anterior.getSiguiente());
        if(anterior.getSiguiente()!=null){
            (anterior.getSiguiente()).setAnterior(nuevo);
        }
        anterior.setSiguiente(nuevo);
        nuevo.setAnterior(anterior);
    }
    
    /**
    *Elimina el nodo de la lista que contenga el regalo pasado como @param
    * @version 17 enero 2024
    * @param Regalo
    */
    void eliminar(Regalo r1){
        NodoDoble actual;
        boolean encontrado = false;
        actual=this.primero;
        while((actual!=null)&&(!encontrado)){
            encontrado = ((actual.getElemento()).equals(r1));
            if(!encontrado){
                actual=actual.getSiguiente();
            }
        }
        if(actual!=null){
            if(actual==this.primero){
                this.primero = actual.getSiguiente();
                if(actual.getSiguiente()!=null){
                    (actual.getSiguiente()).setAnterior(null);
                }
            }else if(actual.getSiguiente()!=null){
                (actual.getAnterior()).setSiguiente(actual.getSiguiente());
                (actual.getSiguiente()).setAnterior(actual.getAnterior());
            }else{
                (actual.getAnterior()).setSiguiente(null);
                
            }
        }
    }
    
    /**
     * Recorre los regalos e imprime su m&eacutetodo polim&oacuterfico 
     * @version 17 enero 2024
     * @param none
     */
    void recorrereimprimir(){   
        int n=0;
        for(NodoDoble indice = this.getPrimero(); indice != null ; indice = indice.getSiguiente()){
            n+=1;
            System.out.println("Baya Numero " + n);
        }       
    }
    
}
