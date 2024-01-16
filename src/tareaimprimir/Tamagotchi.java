/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaimprimir;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase de tamagotchi lo que vendr&iacutea siendo pikachu
 * @author nelsoncarrillo
 */
public class Tamagotchi {
    private long amistad=0;
    Scanner myObje = new Scanner(System.in);
    
    /**
     Se le resta el nivel de amistad al tamagotchi
     * Hecho especialmente para disminuir el nivel cada segundo
     */
    public void restaram(){
        this.amistad-=1;
    }
    
    /**
     Se le suma una cantidad n de amistad a la que ya acumulaba 
     * @param Amistad que proviene de regalos
     */
    public void darAmistad(int n){
        this.amistad+=n;
    }
    
    /**
     Hecha para obtener el nivel al momento de llamar la funci&oacuten
     * de amistad del tamagotchi
     */
    public long getAmistad(){
        return this.amistad;
    }
    
    /**
     * Imprime numero de amistad y dependiendo de este ya que el maximo es 
     * 10000 pues el &aacutenimo del tamagotchi
     */
    public void verAmistad(){
        System.out.println("");
        System.out.println("NIVEL DE AMISTAD:    "+this.amistad+" BAYAS.");
        if(10000>= this.amistad & this.amistad >=7500){
            System.out.println("");
            System.out.println(" |\\---/|");
            System.out.println(" | ^_^ |");
            System.out.println("  \\_^_/");
        } else if(7500> this.amistad & this.amistad >=5000){
                        System.out.println("");
            System.out.println(" |\\---/|");
            System.out.println(" | O_O |");
            System.out.println("  \\_^_/");
        }else if(5000> this.amistad & this.amistad >=2500){
                        System.out.println("");

            System.out.println(" |\\---/|");
            System.out.println(" | >_< |");
            System.out.println("  \\_^_/");
        }else if(2500> this.amistad & this.amistad >=0){
                        System.out.println("");
            System.out.println(" |\\---/|");
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
            System.out.println("LA CARTA ACTUAL DE PIKACHU: " +cartaActual);
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
    
    
    

    }




