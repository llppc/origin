/*fpush
 * C nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nelsoncarrillo
 */
public class Pachirisu extends Pokemon{
    
    int bayas=0;
    Scanner myObje = new Scanner(System.in);
    
    
    /**
     * Imprime numero de bayas ya que este no acepta amistad
     * sino que se guarda las bayas
     * y dependiendo de este ya que el maximo es 
     * 10000 pues el &aacutenimo del tamagotchi
     */
    public void verAmistad(){
        System.out.println("");
        System.out.println("BAYAS RECOLECTADAS:    "+this.bayas);
        if(10>= this.bayas & this.bayas >=7){
            System.out.println("");
            System.out.println(" ________");
            System.out.println(" | ^_^ |");
            System.out.println("  \\_^_/");
        } else if(7> this.bayas & this.bayas >=5){
                        System.out.println("");
            System.out.println(" ________");
            System.out.println(" | O_O |");
            System.out.println("  \\_^_/");
        }else if(5> this.bayas & this.bayas >=2){
                        System.out.println("");

            System.out.println(" ________");
            System.out.println(" | >_< |");
            System.out.println("  \\_^_/");
        }else if(2> this.bayas & this.bayas >=0){
                        System.out.println("");
            System.out.println(" ________");
            System.out.println(" | T_T |");
            System.out.println("  \\_^_/");
        }
        System.out.println("");
    }
    
    /**
     En vez de crear una clase juego, lo vi como un atributo propio 
     * del tamagotchi ya que este genera una carta del mazo y por
     * @param Usuario se le modifica los watts con su m&eacutetodo de apostar
     */
    public void jugar(Usuario user){
        int opt=0;
        int apt=0;
        Random r = new Random();
        int cartaActual = r.nextInt(10) + 1;
        while(opt==0){
            System.out.println("");
            System.out.println("LA CARTA ACTUAL DE PACHIRISU: " +cartaActual);
            System.out.println("Ingrese 1 para ingresar apuesta a que sera mayor.");
            System.out.println("Ingrese 2 para ingresar apuesta a que sera menor.");
            System.out.println("Ingrese 3 para regresar.");
            while(opt!=1 & opt!=2 & opt!=3){
            System.out.println("Ingrese ->");
            opt= myObje.nextInt();
            }
            if(opt==1){
                System.out.println("");
                System.out.println("INGRESE apuesta: "); 
                apt= myObje.nextInt();
                boolean t = user.apostar(apt);
                if(t==true){
                    int cartaActul = r.nextInt(10) + 1;
                    System.out.println("CARTA EN MESA: "+cartaActul);
                    if(cartaActul>cartaActual){
                        user.ganarapostar(apt);
                    }else {
                        user.perderapostar(apt);
                    }
                    cartaActual=cartaActul;
                }

            }else if (opt==3){
                break;
            }else if (opt==2){
                System.out.println("");
                System.out.println("INGRESE apuesta: "); 
                apt= myObje.nextInt();
                boolean t = user.apostar(apt);
                if(t==true){
                    int cartaActul = r.nextInt(10) + 1;
                    System.out.println("CARTA EN MESA: "+cartaActul);
                    if(cartaActul<cartaActual){
                        user.ganarapostar(apt);
                    }else {
                        user.perderapostar(apt);
                    }
                    cartaActual=cartaActul;
                }
                
            }
        }
        
    }
     /**
     * En vez de dar amistad se le da bayas con este m&eacutetodo
     */
    void darAmistad(int baya){
        this.bayas+=baya;
    }
}
