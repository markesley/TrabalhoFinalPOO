
package prova1poo;

import java.util.ArrayList;
import java.util.Date;


public class Beneficiario {
    private int cpf=0;
    private String nome=null;
    private Date ingressoNoPlano = null;
    private Date nasc = null;
    private int genero=0;
    public ArrayList <Historico> procBen = new ArrayList <Historico>();
    

     public Beneficiario(int cpf, String nome, Date ingressoNoPlano, Date nasc,int genero) throws DadosInvalidosException{
                
                //try{
                    
                    this.cpf = cpf;
                    this.nome = nome;
                    this.ingressoNoPlano = ingressoNoPlano;
                    this.nasc = nasc;
                    this.genero = genero;
                /*}catch(Exception a){
                        throw new DadosInvalidosException();
                }*/
                
            
     
    }
     
     
     
     public Beneficiario(){
         
     }
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getIngressoNoPlano() {
        return ingressoNoPlano;
    }

    public void setIngressoNoPlano(Date ingressoNoPlano) {
        this.ingressoNoPlano = ingressoNoPlano;
    }

    public Date getNasc() {
        return nasc;
    }

    public void setNasc(Date nasc) {
        this.nasc = nasc;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    public void adicionarProc(Procedimento p, Date dataSolic, double valor){
        /*for(Historico hist : procBen){
           if(hist.codigo == p.getCodigo()){
               
           }
        }*/
        /*if(p instanceof Exame){
         Historico Eteste = new Historico(p.getCodigo(),dataSolic,((Exame) p).valorExame());
         procBen.add(Eteste);
        }
        if(p instanceof Cirurgia){
         Historico Cteste = new Historico(p.getCodigo(),dataSolic,((Cirurgia) p).valorCirurgia());
         procBen.add(Cteste);
        }*/
    }
   
    
}
