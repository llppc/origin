package tareaimprimir;
import java.util.Scanner;

public class TareaImprimir {
    
    /**
     * Este es el main de mi programa
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Usuario user = new Usuario();
        Tamagotchi t1= new Tamagotchi();
        Tienda s1 = new Tienda();
        
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
                    user.sumarCash();
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
        
        long Inicial = System.currentTimeMillis();
        while (true) {
            /**
             Menu de seleccion
             */
            
            long transcurrido=System.currentTimeMillis()-Inicial;
            System.out.println("");
            System.out.println("TIEMPO TRANSCURRIDO: "+(transcurrido/1000)%60);
            System.out.println("WATTS DISPONIBLES: "+user.getCash());
            System.out.println("--> Ingrese 1 para comprar. ");
            System.out.println("--> Ingrese 2 para ver la amistad.");
            System.out.println("--> Ingrese 3 para jugar.");
            System.out.println("--> Ingrese 4 para salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
              
                s1.menu(user, t1);
            } else if (opcion == 4) {
                decrementoThread.interrupt(); //Se detienen los hilos.
                incrementoThread.interrupt();
                break;
            } else if (opcion == 3) {
                
                t1.jugar(user);
            } else if (opcion == 2) {
                
                t1.verAmistad();
            }
            int menuselectionaward = 5;
            user.ganarapostar(menuselectionaward);
        }
        /**
           Se fuerza la salida del porgrama dado que el hilo no permite 
         * que termine de cerrar
         */
        System.out.println("Fin del programa");
        System.exit(0);
    }
}
                
            
                
                
            
                    
            
            
            
        
        
     

