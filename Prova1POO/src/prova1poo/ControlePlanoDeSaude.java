
package prova1poo;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlePlanoDeSaude extends PlanoDeSaude {

    ArrayList<Beneficiario> beneficiarios = new ArrayList<Beneficiario>();
    ArrayList<Procedimento> procedimentos = new ArrayList<Procedimento>();
    HistoricoDAO todoHist = new HistoricoDAO();
    
    public void cadastrarBeneficiario(Beneficiario b) throws BeneficiarioExistenteException, DadosInvalidosException, IdadeInvalidaException{
        
        Beneficiario teste = null;
        try {
            teste = pesquisarBeneficiario(b.getCpf());
        } catch (BeneficiarioInexistenteException ex) {
            
        }
        if(teste==null){
            if(calculaIdade(b.getNasc())>=18 && calculaIdade(b.getNasc())<=65){
                
                 if(b.getCpf()>0 && b.getNome()!=null && b.getNome()!= "" && b.getNasc()!= null && b.getIngressoNoPlano()!= null && b.getGenero()>0 && b.getGenero()<3){
                     //beneficiarios.add(b);
                     BeneficiarioDAO dao = new BeneficiarioDAO();
                     dao.inserir(b);
                 }else{
                     throw new DadosInvalidosException();
                 }
                 
                
            }else{
                throw new IdadeInvalidaException();
            }
        }else{
            throw new BeneficiarioExistenteException();
        }
        
    }

    
    public void salvarProcedimento(Procedimento p) throws DadosInvalidosException{
        Procedimento proc = null;
        try{
            proc = pesquisarProcedimento(p.getCodigo());
        }catch(ProcedimentoInexistenteException a){
            
        }
        if(proc == null){//novo procedimento
            if(p instanceof Exame){
                if(((Exame)p).getCodigo()>0 && ((Exame)p).getNome()!=null && ((Exame)p).getNome()!= "" && ((Exame)p).getIdadeMax()>0 && ((Exame)p).getIdadeMax()> ((Exame)p).getIdadeMin() && ((Exame)p).getIdadeMin()>=0
                        && ((Exame)p).getGenero()>0 && ((Exame)p).getGenero()<4 && ((Exame)p).getCarencia()>0 && ((Exame)p).getPeriodicidade()>0 && ((Exame)p).getPorte()>0
                        && ((Exame)p).getCustoOperacional()>0){
                    //procedimentos.add(p);
                    ProcedimentoDAO pbd = new ProcedimentoDAO();
                    pbd.inserir(p);
                    
                }else{
                    throw new DadosInvalidosException();
                }
            }
            
            if(p instanceof Cirurgia){
                if(((Cirurgia)p).getCodigo()>0 && ((Cirurgia)p).getNome()!=null && ((Cirurgia)p).getNome()!= "" && ((Cirurgia)p).getIdadeMax()>0 && ((Cirurgia)p).getIdadeMax()> ((Cirurgia)p).getIdadeMin() && ((Cirurgia)p).getIdadeMin()>=0
                        && ((Cirurgia)p).getGenero()>0 && ((Cirurgia)p).getGenero()<4 && ((Cirurgia)p).getUnicidade()>0 && ((Cirurgia)p).getHonorario()>0
                        && ((Cirurgia)p).getMaterial()>0){
                    //procedimentos.add(p);
                    ProcedimentoDAO pbd = new ProcedimentoDAO();
                    pbd.inserir(p);
                }else{
                    throw new DadosInvalidosException();
                }
            }
            
            
            
        }else{//alteracao
            if(p instanceof Exame){
                /*((Exame)proc).setCodigo(p.getCodigo());
                ((Exame)proc).setNome(p.getNome());
                ((Exame)proc).setIdadeMax(p.getIdadeMax());
                ((Exame)proc).setIdadeMin(p.getIdadeMin());
                ((Exame)proc).setGenero(p.getGenero());
                ((Exame)proc).setCarencia(((Exame) p).getCarencia());
                ((Exame)proc).setPeriodicidade(((Exame) p).getPeriodicidade());
                ((Exame)proc).setCustoOperacional(((Exame) p).getCustoOperacional());
                ((Exame)proc).setPorte(((Exame) p).getPorte());*/
                
                ProcedimentoDAO pbd = new ProcedimentoDAO();
                pbd.deletar(p.getCodigo());
                pbd.inserir(p);
                
                
            }
            if(p instanceof Cirurgia){
                /*((Cirurgia)proc).setCodigo(p.getCodigo());
                ((Cirurgia)proc).setNome(p.getNome());
                ((Cirurgia)proc).setIdadeMax(p.getIdadeMax());
                ((Cirurgia)proc).setIdadeMin(p.getIdadeMin());
                ((Cirurgia)proc).setGenero(p.getGenero());
                ((Cirurgia)proc).setUnicidade(((Cirurgia) p).getUnicidade());
                ((Cirurgia)proc).setHonorario(((Cirurgia) p).getHonorario());
                ((Cirurgia)proc).setMaterial(((Cirurgia) p).getMaterial());*/
                ProcedimentoDAO pbd = new ProcedimentoDAO();
                pbd.deletar(p.getCodigo());
                pbd.inserir(p);
                
                
            }
        }
        
    }

   
    public void solicitar(int cpf, int codProcedimento, Date data) throws IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException {
        
        try{
            Beneficiario baux = pesquisarBeneficiario(cpf);
            try{
                Procedimento paux = pesquisarProcedimento(codProcedimento);
                
                if(calculaIdade(baux.getNasc())>=paux.getIdadeMin() && calculaIdade(baux.getNasc())<=paux.getIdadeMax()){
                    if(baux.getGenero()==paux.getGenero() || paux.getGenero()==3){
                        if(paux instanceof Exame){
                            if(difDatas(data,baux.getIngressoNoPlano())>=((Exame) paux).getCarencia()){
                                //HistoricoDAO todoHist = new HistoricoDAO();
                                
                                for(Historico hist : todoHist.recuperarTodos()){
                                    if(hist.cpf == baux.getCpf() && hist.codigo == codProcedimento && difDatas(data,hist.data)<((Exame) paux).getPeriodicidade()){
                                        throw new PeriodicidadeException();
                                    }  
                                }
                                todoHist.inserir(cpf, codProcedimento, data);
                                //baux.adicionarProc(paux, data, ((Exame) paux).valorExame());
                                //apenas para teste: System.out.println("Solicitacao concluida");
                                
                                
                            }else{
                                throw new CarenciaException();
                            }
                        }
                        if(paux instanceof Cirurgia){
                            //HistoricoDAO todoHist = new HistoricoDAO();
                            int quant=0;
                            for(Historico hist: todoHist.recuperarTodos()){
                                if(hist.cpf == baux.getCpf() && hist.codigo == codProcedimento){
                                    quant++;
                                }
                            }
                            if(quant>=((Cirurgia) paux).getUnicidade()){
                                throw new UnicidadeException();
                            }else{
                                todoHist.inserir(cpf, codProcedimento, data);
                                //baux.adicionarProc(paux, data, ((Cirurgia) paux).valorCirurgia());
                                //apenas pra teste: System.out.println("Solicitacao concluida");
                            }
                        }
                    }else{
                        throw new GeneroInvalidoException();
                    }
                }else{
                    throw new IdadeInvalidaException();
                }
                
            }catch(ProcedimentoInexistenteException p){
                throw new ProcedimentoInexistenteException();
            }
            
        }catch(BeneficiarioInexistenteException a){
            throw new BeneficiarioInexistenteException();
        }
        
        
    }

    
    public double faturar(int mes, int ano) {
        double faturamento=0;
        /*for(Beneficiario bene : beneficiarios){
            for(Historico hist : bene.procBen){
                if(hist.data.getMonth()+1==mes && hist.data.getYear()+1900==ano){
                    faturamento = faturamento + hist.valorProcedimento;
                }
                
            }
        }*/
        
        for(Historico hist : todoHist.recuperarTodos()){
            if(hist.data.getMonth()+1==mes && hist.data.getYear()+1900==ano){
                faturamento = faturamento + hist.getValorProcedimento();
            }
        }
        
        return faturamento;
    }

   
    public Procedimento pesquisarProcedimento(int cod) throws ProcedimentoInexistenteException {
        ProcedimentoDAO dao = new ProcedimentoDAO();
        Procedimento p = dao.pesquisar(cod);
        if(p!=null){
            return p;
        }
            
        throw new ProcedimentoInexistenteException();
    }

    
    public Beneficiario pesquisarBeneficiario(int cpf) throws BeneficiarioInexistenteException{
        /*for(Beneficiario b : beneficiarios){
            if(b.getCpf()==cpf){
                return b;
            }
        }*/
        BeneficiarioDAO dao = new BeneficiarioDAO();
        Beneficiario b = dao.pesquisar(cpf);
        if(b!=null){
            return b;
        }
        
        
         throw new BeneficiarioInexistenteException();
    }
    
}
