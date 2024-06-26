/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

import java.util.Scanner;

/** Clase tienda donde compra con watts los regalos
 * 
 * @author nelsoncarrillo
 */
public class Tienda {
    /**
     Se instancian los regalos para utilizar su informacion
     * que ser&iacutea amistad y su costo
     */
    Baya b1=new Baya();
    Pokebola p1 =new Pokebola();
    Eter e1 = new Eter();
    Elixir el1 = new Elixir();
    CarameloRaro cr1 = new CarameloRaro();


    
    Scanner myObje = new Scanner(System.in);
    
    /**
     Despliega menu de seleccion acorde a el regalo
     * que se desea comprar
     * @param Usuario para modificar su cash con su setter
     * @param Tamagotchi que vendria siendo el pikachu para modificar
     * su amistad con setter
     */
    void menu(Usuario user,Tamagotchi t1){
        int transfer = 0;
        System.out.println("");
        System.out.println("Ingrese la cantidad de watts a pagar.");
        System.out.println(b1.menuItem());
        System.out.println(p1.menuItem());
        System.out.println(e1.menuItem());
        System.out.println(el1.menuItem());
        System.out.println(cr1.menuItem());
        System.out.println("O INGRESE 4 PARA VOLVER");
        while(transfer != b1.costo() & transfer!=p1.costo() & transfer!=e1.costo() & transfer!=el1.costo() & transfer!=cr1.costo() & transfer!=4){
            System.out.println("Ingrese ->");
            transfer= myObje.nextInt();
            
        int cash =  user.getCash();
        
        /**
         Se verifica que disponga del saldo
         * para luego modificar acorde al regalo que compr&oacute
         * la amistad del tamagotchi y los watts de saldo del user
         */
        if(cash >= transfer || transfer==4){
            if (transfer == b1.costo()) {
                
                user.setCash(cash-b1.costo());
                t1.darAmistad(b1.amistad());  
                
            } else if (transfer == p1.costo()) {
                
                user.setCash(cash-p1.costo());
                t1.darAmistad(p1.amistad());
                
            }else if (transfer == e1.costo()) {
                
                user.setCash(cash-e1.costo());
                t1.darAmistad(e1.amistad()); 
                
            }else if (transfer == el1.costo()) {
                
                user.setCash(cash-el1.costo());
                t1.darAmistad(el1.amistad()); 
                
            }else if (transfer == cr1.costo()) {
                
                user.setCash(cash-cr1.costo());
                t1.darAmistad(cr1.amistad()); 
                
            }
            
        }else{
            /**En caso de que no disponga de los watts necesarios
             */
            throw new IllegalStateException("Saldo Insuficiente");
            
        }
        
      }
    
    }
}
     
