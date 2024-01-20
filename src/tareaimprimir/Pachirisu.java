package tareaimprimir;

import java.util.Random;
import java.util.Scanner;

/**
 * Subclase de pokemon.
 * Pues pachirisu es un tipo de pokemon, y al modificar la opci&oacuten de 
 * elegir si usar a pachirisu o pikachu se cre&oacute esta herencia.
 * 
 * @author nelsoncarrillo
 * @version 1.0 17 enero 2024
 */
public class Pachirisu extends Pokemon{
    
    int bayas=0; //este agrega atributo de bayas, no usa amistad
    Scanner myObje = new Scanner(System.in);//para los inputs por consola.
    
    
    /**
    * Imprime por pantalla el ascii art del pachirisu acorde a sus bayas.
    * Tipo de polimorfismo para el m&eacutetodo de la superclase pokemon, este
    * depende pues del nivel de bayas mientras que el de piakchu de la amistad.
    * 
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024   
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
    * Permite abrir el juego de las apuestas.
    * M&eacutetodo propuesto a polimorfismo tanto para pikachu como 
    * pachirisu, aunque para esta version ambos tienen lo mismo.
    * 
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024
    * @param user instancia del usuario que apostar&aacute y gana o pierde watts.
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
    * Se le da la amistad proveniente de un regalo.
    * La unica manera de obtener amistad es mediante un regalo, pero al ser pachirisu
    * solo acepta bayas y en vez de tratarse de amistad es en bayas. Pues 
    * surge el polimorfismo con respecto a la otra subclase de pokemon, el pikachu.
    * 
    * @author nelsoncarrillo
    * @version 1.0 17 enero 2024.
    * @param n integer de la cantidad de bayas.
    */
    void darAmistad(int baya){
        this.bayas+=baya;
    }
}
