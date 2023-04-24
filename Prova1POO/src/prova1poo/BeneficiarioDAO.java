
package prova1poo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;


public class BeneficiarioDAO {
    
    public void inserir(Beneficiario b){
        try{
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String comando = "insert into beneficiario(cpf, nome, nasc, ingressoplano, genero) values (" + b.getCpf()
                    + ", '"+ b.getNome() +"', " + b.getNasc().getTime() + ", " + b.getIngressoNoPlano().getTime() + ", " + b.getGenero() + ")";
            //String comando = "insert into beneficiario(cpf, nome, nasc, ingressoplano, genero) values (" + b.getCpf()+ ", '"+ b.getNome() +"')";
            System.out.println(comando);
            st.executeUpdate(comando);
            
            
        }catch(Exception e){
            System.out.println("Erro na conexão!");
	    e.printStackTrace();
        }
    }
    
    public Beneficiario pesquisar(int cpf){
        try{
         Connection conexao = Conexao.getConexao();
         Statement st = conexao.createStatement();
         ResultSet rs = st.executeQuery("select * from beneficiario where cpf = " + cpf);
         if(rs.next()){
             Beneficiario b = new Beneficiario();
             String nome = rs.getString("nome");
             Long nasc = rs.getLong("nasc");
             Date dnasc = new Date(nasc);
             Long ingressoplano = rs.getLong("ingressoplano");
             Date dingressoplano = new Date(ingressoplano);
             Integer genero = rs.getInt("genero");
             b.setCpf(cpf);
             b.setNome(nome);
             b.setNasc(dnasc);
             b.setIngressoNoPlano(dingressoplano);
             b.setGenero(genero);
             st.close();
             return b;
         }
         
        }catch(Exception e){
            System.out.println("Erro na conexão!");
	    e.printStackTrace();
        }
            return null;
    }
    
    public void removerTudo() {
		try { 
	        Connection conexao = Conexao.getConexao();
	        Statement st = conexao.createStatement();
			String comando = "delete from beneficiario";
			st.executeUpdate(comando); 
			st.close();
	     } catch (Exception e) {
	    	   System.out.println("Erro na recuperacao de dados!");
	    	   e.printStackTrace();
	    	   System.exit(1);
	     }	
	}
    
}
