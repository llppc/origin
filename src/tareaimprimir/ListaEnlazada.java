package tareaimprimir;

/**
 * Clase de la lista simple enlazada.
 * 
 * @version 17 enero 2024
 * @author nelsoncarrillo
 */
public class ListaEnlazada {
    //lista de inventario
    NodoSimple primero;
    NodoSimple ultimo;
    int size=0;
    
    /**
     * M&eacutetodo constructor de la lista.
     * @version 17 enero 2024
     * @author nelsoncarrillo
     */
    public ListaEnlazada(){
    }
    
    /**
     * Devuelve el primer nodo de la lista.
     * 
     * @version 17 enero 2024
     * @author nelsoncarrillo
     * @return primer elemento contenido en la lista
     */
    NodoSimple getpFirst() {
        return this.primero;
    }
    
    /**
     * Inserta a la &uacuteltima posici&oacuten digamos de la lista.
     * Inserta un elemento pasado como param.
     * 
     * @version 17 enero 2024
     * @author nelsoncarrillo
     * @param nuevo regalo a insertar.
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
     * Devuelve true si encuentra en la lista el Elemento.
     * Este elemento es pasado como param.
     * 
     * @version 17 enero 2024
     * @author nelsoncarrillo
     * @param n regalo a buscar
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
     * Recorre los regalos e imprime su m&eacutetodo polim&oacuterfico.
     * El polim&oacuterfico es pues propio de los pokemones, nos referimos a eso.
     * 
     * @version 17 enero 2024
     * @author nelsoncarrillo
     */
    void recorrereimprimir(){   
        for(NodoSimple indice = this.getpFirst(); indice != null ; indice = indice.getNxt() ){
            System.out.println((indice.getElemento()).menuItem());
        }       
    }
    
    /**
     * Elimina de la lista el elemento pasado.
     * Pasado pues como param
     * 
     * @version 17 enero 2024
     * @author nelsoncarrillo
     * @param n regalo a eliminar
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