/*
 * ck nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 *ck nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 *Clase hija de la superclase regalos
 * @author nelsoncarrillo
 */
public class Pokebola extends Regalo{
    public Pokebola (){
        super.amistad = 300;
        super.costo = 200;
    }
    
    /**
     Polimorfismo con el m&eacutetodo de regalo para su despliegue en el men&uacute
     */
    String menuItem(){
        return "200 WATTS --> POKEBOLAS";
    }
}
