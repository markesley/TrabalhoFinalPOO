
package prova1poo;


public class Exame extends Procedimento{
    
    private int carencia=0;
    private int periodicidade=0;
    private double porte=0;
    private double custoOperacional=0;
    private double valor;
            
    public Exame(int codigo, String nome, int idadeMin, int idadeMax, int genero, int carencia, int periodicidade, double porte, double custoOperacional){
        super(codigo, nome, idadeMin, idadeMax, genero);
        //try{
            this.carencia = carencia;
            this.periodicidade = periodicidade;
            this.porte = porte;
            this.custoOperacional = custoOperacional;
        /*}catch(Exception a){
            throw new DadosInvalidosException();
        }*/
        
    }
    
    public double valorExame(){
        valor = porte * 100.0 + custoOperacional;
        return valor;
    }

    public int getCarencia() {
        return carencia;
    }

    public void setCarencia(int carencia) {
        this.carencia = carencia;
    }

    public int getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(int periodicidade) {
        this.periodicidade = periodicidade;
    }

    public double getPorte() {
        return porte;
    }

    public void setPorte(double porte) {
        this.porte = porte;
    }

    public double getCustoOperacional() {
        return custoOperacional;
    }

    public void setCustoOperacional(double custoOperacional) {
        this.custoOperacional = custoOperacional;
    }

    

    
        
    
}
