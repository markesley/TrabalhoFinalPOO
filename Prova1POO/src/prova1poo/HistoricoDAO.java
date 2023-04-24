
package prova1poo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;


public class HistoricoDAO {
    
    public void inserir(int cpf, int cod, Date data){
        try{
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String comando = "insert into historico(procedimento, beneficiario, data) values (" + cod
                    + ", " + cpf + ", " + data.getTime() + ")";
            
            System.out.println(comando);
            st.executeUpdate(comando);
            
            
        }catch(Exception e){
            System.out.println("Erro na conexão!");
	    e.printStackTrace();
        }
    }
    
    public ArrayList<Historico> recuperarTodos(){
        try { 
	        Connection conexao = Conexao.getConexao();
	        Statement st = conexao.createStatement();
	        ResultSet rs = st.executeQuery("select * from historico");
	        ArrayList<Historico> todos = new ArrayList<Historico>();
	        while (rs.next()) {
	        	int cpf = rs.getInt("beneficiario");
	        	int codP = rs.getInt("procedimento");
                        Long dataSolic = rs.getLong("data");
                        Date dataS = new Date (dataSolic);
                        
	        	Historico p = new Historico();
                  
                        p.setCpf(cpf);
                        p.setCodigo(codP);
                        p.setData(dataS);
                        //valor do procedimento
                        ProcedimentoDAO proc = new ProcedimentoDAO();
                        double valor =0;
                        Procedimento P = proc.pesquisar(codP);
                        if(P instanceof Exame){
                            valor = ((Exame) P).valorExame();
                        }
                        if(P instanceof Cirurgia){
                            valor = ((Cirurgia) P).valorCirurgia();
                        }
                        
                        p.setValorProcedimento(valor);
                        
	        	todos.add(p);
	        }
        	st.close();
	        return todos;
        } catch (Exception e) {
    	   System.out.println("Erro na recuperacao de dados!");
    	   e.printStackTrace();
    	   System.exit(1);
        }
		return null;
        
    }
    
    public void removerTudo() {
		try { 
	        Connection conexao = Conexao.getConexao();
	        Statement st = conexao.createStatement();
			String comando = "delete from historico";
			st.executeUpdate(comando); 
			st.close();
	     } catch (Exception e) {
	    	   System.out.println("Erro na recuperacao de dados!");
	    	   e.printStackTrace();
	    	   System.exit(1);
	     }	
	}
    
}
