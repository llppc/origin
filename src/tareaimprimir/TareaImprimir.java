package tareaimprimir;
import java.util.Scanner;

public class TareaImprimir {
    
    /**
     * Este es el main de mi programa.
     * @author nelsoncarrillo
     * @version 1.0 17 enero 2024
     */
    public static void main(String[] args) {
        
        //para poder elegir con cu&aacutel pokemon jugar
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngrese 1 para jugar con Pikachu.\nIngrese 2 para jugar con Pachirisu.\n-->");
        String selection = scanner.nextLine();
        while(!"1".equals(selection) && !"2".equals(selection)){
           System.out.println("ERROR, ingrese una opcion valida.\n-->");
           selection = scanner.nextLine();  
        }
        
        //se inicializa usuario y tienda, son iguales para ambos casos
        Usuario user = new Usuario();
        Tienda s1 = new Tienda();
        long Inicial = System.currentTimeMillis();
        
        
        if("1".equals(selection)){
            
            Pikachu t1= new Pikachu();
           
            /** LOS THREADS PARA PODER SUMAR EN SIMULTANEO EL CASH 
             *  Los tuve que buscar en internet, nota: no se ver&aacute en clase
             * Nombre, descripcion,autor,version,tipo de retornos,comentario
             * 
             * 
             * @author
             * @version
             * @return
             * 
             */
            Thread incrementoThread = new Thread(() -> {
                long tiempoInicial = System.currentTimeMillis();
                long tiempoActual;
                while (true) {
                    tiempoActual = System.currentTimeMillis();
                    if ((tiempoActual - tiempoInicial >= 1000)&user.getCash()>=0) {
                        user.sumarCash(1);
                        tiempoInicial = tiempoActual;
                    }
                }
            });

            /** LOS THREADS PARA PODER RESTAR EN SIMULTANEO BAYAS
             *  Los tuve que buscar en internet, nota: no se ver&aacute en clase
             */
            Thread decrementoThread = new Thread(() -> {
                long tiempoInicial = System.currentTimeMillis();
                long tiempoActual;
                while (true) {
                    tiempoActual = System.currentTimeMillis();
                    if ((tiempoActual - tiempoInicial >= 1000)& t1.getAmistad()>0) {
                        t1.restaram();
                        tiempoInicial = tiempoActual;
                    }
                }
            });

            decrementoThread.start(); //Se inicia thread para decrementar bayas.
            incrementoThread.start(); //Se inicia thread para sumar watts.

            s1.fillInventario();
            while (true) {
                /**
                 Menu de seleccion
                 */

                long transcurrido= System.currentTimeMillis()- Inicial;
                System.out.println("");
                System.out.println("TIEMPO TRANSCURRIDO: "+(transcurrido/1000)%60);
                System.out.println("WATTS DISPONIBLES: "+user.getCash());
                System.out.println("--> Ingrese 1 para comprar. ");
                System.out.println("--> Ingrese 2 para ver la amistad.");
                System.out.println("--> Ingrese 3 para jugar.");
                System.out.println("--> Ingrese 4 para salir");               
                String selectio = scanner.nextLine();
                while(!"1".equals(selectio) && !"2".equals(selectio) && !"3".equals(selectio)&& !"4".equals(selectio)){
                System.out.println("ERROR, ingrese una opcion valida.\n-->");
                selectio = scanner.nextLine();  
                }
                

                if ("1".equals(selectio)) {
                    s1.menu(user, t1);
                } else if ("4".equals(selectio)) {
                    decrementoThread.interrupt(); //Se detienen los hilos.
                    incrementoThread.interrupt();
                    break;
                } else if ("3".equals(selectio)) {

                    t1.jugar(user);
                } else if ("2".equals(selectio)) {

                    t1.verAmistad();
                }
                user.sumarCash(10);
            }
        
        }else{//Si usa al pachirisu
            
            
            Pachirisu t1= new Pachirisu();
            

            /** LOS THREADS PARA PODER SUMAR EN SIMULTANEO EL CASH 
             *  Los tuve que buscar en internet, nota: no se ver&aacute en clase
             * Nombre, descripcion,autor,version,tipo de retornos,comentario
             * 
             * 
             * @author
             * @version
             * @return
             * 
             */
            Thread incrementoThread = new Thread(() -> {
                long tiempoInicial = System.currentTimeMillis();
                long tiempoActual;
                while (true) {
                    tiempoActual = System.currentTimeMillis();
                    if ((tiempoActual - tiempoInicial >= 1000)&user.getCash()>=0) {
                        user.sumarCash(1);
                        tiempoInicial = tiempoActual;
                    }
                }
            });

            incrementoThread.start(); //Se inicia thread para sumar watts.

            
            s1.fillInventario();
            while (true) {
                /**
                 Menu de seleccion
                 */

                long transcurrido=System.currentTimeMillis()- Inicial;
                System.out.println("");
                System.out.println("TIEMPO TRANSCURRIDO: "+(transcurrido/1000)%60);
                System.out.println("WATTS DISPONIBLES: "+user.getCash());
                System.out.println("--> Ingrese 1 para comprar. ");
                System.out.println("--> Ingrese 2 para ver la amistad.");
                System.out.println("--> Ingrese 3 para jugar.");
                System.out.println("--> Ingrese 4 para salir");
                 String selecti = scanner.nextLine();
                while(!"1".equals(selecti) && !"2".equals(selecti) && !"3".equals(selecti)&& !"4".equals(selecti)){
                System.out.println("ERROR, ingrese una opcion valida.\n-->");
                selecti = scanner.nextLine();  
                }
                user.sumarCash(10);
                
                if ("1".equals(selecti)) {

                    s1.menu(user, t1);
                } else if ("4".equals(selecti)) {
                 //Se detienen los hilos.
                    incrementoThread.interrupt();
                    break;
                } else if ("3".equals(selecti)) {

                    t1.jugar(user);
                } else if ("2".equals(selecti)) {

                    t1.verAmistad();
                }
                
            }
            
        }
    /**
    Se fuerza la salida del porgrama dado que el hilo no permite 
      * que termine de cerrar
      */
     System.out.println("Fin del programa");
     System.exit(0);
    }
}
                
            
                
                
            
                    
            
            
            
        
        
     

