
package prova1poo;

import java.util.Date;


public class Historico {
   

    
    public int cpf;
    public int codigo;
    public Date data;
    public double valorProcedimento;
    
    
    /*public Historico(int codigo, Date data, double valor){
        this.codigo = codigo;
        this.data = data;
        this.valorProcedimento = valor;
        //this.quant = quant;
    }*/
    public Historico(){
        
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorProcedimento() {
        return valorProcedimento;
    }

    public void setValorProcedimento(double valorProcedimento) {
        this.valorProcedimento = valorProcedimento;
    }
        
    
    
}
