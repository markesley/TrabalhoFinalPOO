
package prova1poo;


public class Procedimento {
    private int codigo=0;
    private String nome=null;
    private int idadeMin=-1;
    private int idadeMax=-1;
    private int genero=0;
    
    public Procedimento(int codigo, String nome, int idadeMin, int idadeMax, int genero){
        //try{
            this.codigo = codigo;
            this.nome = nome;
            this.idadeMin = idadeMin;
            this.idadeMax = idadeMax;
            this.genero = genero;
        /*}catch(Exception a){
                        throw new DadosInvalidosException();
                }*/
            
        
    }
    public Procedimento(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public void setIdadeMin(int idadeMin) {
        this.idadeMin = idadeMin;
    }

    public int getIdadeMax() {
        return idadeMax;
    }

    public void setIdadeMax(int idadeMax) {
        this.idadeMax = idadeMax;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
        
    
}
