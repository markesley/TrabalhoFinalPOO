
package prova1poo;


public class BeneficiarioExistenteException extends Exception{
    
    public BeneficiarioExistenteException(){
        super("Esse beneficiario ja foi cadastrado");
    }
    
}
