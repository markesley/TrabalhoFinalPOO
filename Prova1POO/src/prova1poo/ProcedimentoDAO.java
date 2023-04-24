
package prova1poo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProcedimentoDAO {
    
    public void inserir(Procedimento p){
         try{
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String comando = "insert into procedimento(codigo, nome, idademin, idademax, genero, unicidade, honorario, material, "
                    + "periodicidade, carencia, porte, custooperacional, discriminador) values (" + p.getCodigo()
                    + ", '"+ p.getNome() +"', " + p.getIdadeMin() + ", " + p.getIdadeMax() + ", " + p.getGenero();
                if(p instanceof Cirurgia){
                    comando = comando + "," + ((Cirurgia)p).getUnicidade() + "," + ((Cirurgia)p).getHonorario()+ ","+
                            ((Cirurgia)p).getMaterial() + " , 0, 0, 0, 0, 2)";    
                
                }else if(p instanceof Exame){
                    comando = comando + ", 0, 0, 0," + ((Exame)p).getPeriodicidade() + "," + ((Exame)p).getCarencia() + "," +
                            ((Exame)p).getPorte() + "," + ((Exame)p).getCustoOperacional() + ", 1)";
                }
            
            System.out.println(comando);
            st.executeUpdate(comando);
            
            
        }catch(Exception e){
            System.out.println("Erro na conexão!");
	    e.printStackTrace();
        }
    }
    
    public Procedimento pesquisar(int cod){
        try{
         Connection conexao = Conexao.getConexao();
         Statement st = conexao.createStatement();
         ResultSet rs = st.executeQuery("select * from procedimento where codigo = " + cod);
         if(rs.next()){
             String nome = rs.getString("nome");
             Integer idadem = rs.getInt("idademin");
             Integer idadeM = rs.getInt("idademax");
             Integer genero = rs.getInt("genero");
             Integer unicidade = rs.getInt("unicidade");
             Double honorario = rs.getDouble("honorario");
             Double material = rs.getDouble("material");
             Integer periodicidade = rs.getInt("periodicidade");
             Integer carencia = rs.getInt("carencia");
             Double porte = rs.getDouble("porte");
             Double custoOperacional = rs.getDouble("custooperacional");
             Integer discriminador = rs.getInt("discriminador");
             
             Procedimento p;
             
             if(discriminador==1){
                 p = new Exame(cod, nome, idadem, idadeM, genero, carencia, periodicidade, porte, custoOperacional);
             }else{
                 p = new Cirurgia(cod, nome, idadem, idadeM, genero, unicidade, honorario, material);
             }
             
             st.close();
             return p;
         }
         
        }catch(Exception e){
            System.out.println("Erro na conexão!");
	    e.printStackTrace();
        }
            return null;
        
    }
    
    public void deletar(int cod){
        try { 
	        Connection conexao = Conexao.getConexao();
	        Statement st = conexao.createStatement();
			String comando = "delete from procedimento where codigo = " + cod;
			st.executeUpdate(comando); 
			st.close();
	     } catch (Exception e) {
	    	   System.out.println("Erro na deleção de dados!");
	    	   e.printStackTrace();
	    	   System.exit(1);
	     }	
        
        
    }
    
    public void removerTudo() {
		try { 
	        Connection conexao = Conexao.getConexao();
	        Statement st = conexao.createStatement();
			String comando = "delete from procedimento";
			st.executeUpdate(comando); 
			st.close();
	     } catch (Exception e) {
	    	   System.out.println("Erro na recuperacao de dados!");
	    	   e.printStackTrace();
	    	   System.exit(1);
	     }	
	}
    
}
