
package prova1poo;


public class IdadeInvalidaException extends Exception{
    
    public IdadeInvalidaException(){
        super("A idade informada nao obedece as regras de negocio\n");
    }
    
}
