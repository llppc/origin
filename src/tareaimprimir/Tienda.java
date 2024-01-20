/*
 * lick nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

import java.util.Scanner;

/** Clase tienda donde compra con watts los regalos.
 * 
 * @author nelsoncarrillo
 * @version 1.0 17 enero 2024
 */
public class Tienda {
    /**
     * Se instancian los regalos para utilizar su informacion
     * que ser&iacutea amistad y su costo
     */
    Baya b1=new Baya();
    Pokebola p1 =new Pokebola();
    Eter e1 = new Eter();
    Elixir el1 = new Elixir();
    CarameloRaro cr1 = new CarameloRaro();
    ListaEnlazada inventario = new ListaEnlazada();
    ListaDoble inventariobayas = new ListaDoble();
    Scanner myObje = new Scanner(System.in);
    
    
    /**
     * Abastece el inventario al iniciar el programa con los regalos.
     * Pues sino, al abrir el menu se multiplicaria y se resuelve dicho error. 
     * 
     * @author nelsoncarrillo
     * @version 1.0 17 enero 2024
     */
    void fillInventario(){
        (this.inventario).insertarlast(e1);
        (this.inventario).insertarlast(b1);
        (this.inventario).insertarlast(p1);
        (this.inventario).insertarlast(el1);
        (this.inventario).insertarlast(cr1);
        (this.inventariobayas).insertarprimero(b1);
        (this.inventariobayas).insertarprimero(b1);
        (this.inventariobayas).insertarprimero(b1);
        (this.inventariobayas).insertarprimero(b1);
    }
    
    /**
     * Despliega menu de seleccion acorde a el regalo.
     * Acorde pues, al regalo que se desea comprar
     * 
     * @param user objeto tipo usuario para modificar su cash con su setter
     * @param t1 objeto tipo pokemon que vendria siendo el pikachu o pachirisu para modificar
     * su amistad con setter.
     * @author nelsoncarrillo
     * @version 1.0 17 enero 2024
     */
    void menu(Usuario user,Pokemon t1){
        
        if(t1 instanceof Pikachu){
            
            if(inventario.size==0){
                System.out.println(" Inventario Vacío.");
            }else{
            
                int transfer = 0;
                System.out.println("");
                System.out.println("Ingrese la cantidad de watts a pagar.");
                inventario.recorrereimprimir();
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
                        inventario.eliminarElemento(b1);

                    } else if (transfer == p1.costo()) {

                        user.setCash(cash-p1.costo());
                        t1.darAmistad(p1.amistad());
                        inventario.eliminarElemento(p1);

                    }else if (transfer == e1.costo()) {

                        user.setCash(cash-e1.costo());
                        t1.darAmistad(e1.amistad());
                        inventario.eliminarElemento(e1);

                    }else if (transfer == el1.costo()) {

                        user.setCash(cash-el1.costo());
                        t1.darAmistad(el1.amistad());
                        inventario.eliminarElemento(el1);

                    }else if (transfer == cr1.costo()) {

                        user.setCash(cash-cr1.costo());
                        t1.darAmistad(cr1.amistad()); 
                        inventario.eliminarElemento(cr1);

                    }

                }else{
                    /**En caso de que no disponga de los watts necesarios
                     */
                    throw new IllegalStateException("Saldo Insuficiente");

                }
            }    
        }
            
      }else{ //si es instance de pachirisu que s&oacutelo recibe bayas
            
            int transfer = 0;
            System.out.println("");
            System.out.println("Ingrese el numero de la baya.");
            inventariobayas.recorrereimprimir();
            System.out.println("O INGRESE "+(inventariobayas.size+1) + " PARA VOLVER");
            while(transfer>(inventariobayas.size+1) || 0>=transfer){
                System.out.println("Ingrese ->");
                transfer= myObje.nextInt();

            int cash =  user.getCash();

            /**
             Se verifica que disponga del saldo
             * para luego modificar acorde al regalo que compr&oacute
             * la amistad del tamagotchi y los watts de saldo del user
             */
            if(cash >= 100 && transfer!=(inventariobayas.size+1)){
                    user.setCash(cash-b1.costo());
                    inventariobayas.eliminar(b1);
            }else if(transfer!=(inventariobayas.size+1)){
                /**En caso de que no disponga de los watts necesarios
                 */
                throw new IllegalStateException("Saldo Insuficiente");

            }
        }
        }
    
    }
}
     
