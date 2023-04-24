
package prova1poo;


public class Cirurgia extends Procedimento{
    private int unicidade=0;
    private double honorario=0;
    private double material=0;
    
    public Cirurgia (int codigo, String nome, int idadeMin, int idadeMax, int
    genero, int unicidade, double honorario, double material){
        super(codigo, nome, idadeMin, idadeMax, genero);
        //try{
            this.unicidade = unicidade;
            this.honorario = honorario;
            this.material = material;
        /*}catch(Exception a){
            throw new DadosInvalidosException();
        }*/
    }

    public double valorCirurgia(){
        return honorario + material;
    }
    
    public int getUnicidade() {
        return unicidade;
    }

    public void setUnicidade(int unicidade) {
        this.unicidade = unicidade;
    }

    public double getHonorario() {
        return honorario;
    }

    public void setHonorario(double honorario) {
        this.honorario = honorario;
    }

    public double getMaterial() {
        return material;
    }

    public void setMaterial(double material) {
        this.material = material;
    }

    

    
    
    
}
