package tareaimprimir;
/**
 Clase usuario, es como el cartera visto en clase
 * solo que adptado ya que lo veo m&aacutes como las acciones del usuario
 */
public class Usuario {
    
    private int cash; //Saldo en watts.

    /**
     Devuelve el saldo en watts del usuario
     */
    public int getCash() {
        return this.cash;
    }
    
    /**
     Establece el saldo del usuario
     @param Saldo a establecer
     */
    public void setCash(int cas) {
        this.cash =cas;
    }
    
    /**
     Se le agrega saldo en una unidad
     * Hecho especialmente para el sumar un watt por segundo
     */
    public void sumarCash() {
        this.cash+=1;
    }
    
    /**
     Permite apostar al usuario dependiendo de su cash, si dispone
     * del que desea apostar, pues esta se realizar&aacute
     * @param Apuesta en watts
     */
    public boolean apostar(int c){
        if(this.cash>=c){
           this.cash-=c; 
           return true;
        }else{
            throw new IllegalStateException("Saldo insuficiente");
        }
        
    }
    
    /**
     * Al apostar, el usuario tiene atributo de duplicar su apuesta
     * @param Apuesta realizada
     */
    public void ganarapostar(int c){
        this.cash+=(2*c);
        
    }
    
    /**
     * Al apostar, el usuario tiene atributo de perder pues toda la apuesta
     * @param Apuesta realizada
     */
    public void perderapostar(int c){
        System.out.println("PERDISTE.");
    }
}
