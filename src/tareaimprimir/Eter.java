/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 * Clase hija de Regalos
 * @author nelsoncarrillo
 */
public class Eter extends Regalo{
    public Eter(){
        super.amistad = 600;
        super.costo = 400;
    }
    
    /**
     Polimorfismo con el m&eacutetodo de regalo para su despliegue en el men&uacute
     */
    String menuItem(){
        return "400 WATTS --> ETERES";
    }
}
