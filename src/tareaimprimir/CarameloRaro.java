/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

/**
 * Clase hija del Regalo
 * @author nelsoncarrillo
 */
public class CarameloRaro extends Regalo{
    public CarameloRaro(){
        super.amistad = 1600;
        super.costo = 1100;
    }
    
    /**
     Polimorfismo con el m&eacutetodo de regalo para su despliegue en el men&uacute
     */
    String menuItem(){
        return "1100 WATTS --> CARAMELOS RAROS";
    }
}
