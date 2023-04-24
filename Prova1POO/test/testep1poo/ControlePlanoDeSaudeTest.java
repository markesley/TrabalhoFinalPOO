/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testep1poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import prova1poo.*;
import static org.junit.Assert.*;

/**
 *
 * @author marke
 */
public class ControlePlanoDeSaudeTest {
    
    public ControlePlanoDeSaudeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarBeneficiario method, of class ControlePlanoDeSaude.
     */
    /*@Test
    public void testCadastrarBeneficiario() throws BeneficiarioExistenteException, DadosInvalidosException, IdadeInvalidaException, ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ControlePlanoDeSaude controle = new ControlePlanoDeSaude();
        Beneficiario b1 = new Beneficiario(456,"Jose",formato.parse("05/11/2021"),formato.parse("17/09/2001"),1);
        try{
            controle.cadastrarBeneficiario(b1);
            System.out.println("Beneficiario cadastrado");
        }catch(IdadeInvalidaException a){
            System.out.println(a.getMessage());
        }
        
        
        
    }

    
    @Test
    public void testCadastrarBeneficiarioIdadeExc() throws BeneficiarioExistenteException, DadosInvalidosException, IdadeInvalidaException, ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ControlePlanoDeSaude controle = new ControlePlanoDeSaude();
        Beneficiario b1 = new Beneficiario(456,"Jose",formato.parse("05/11/2021"),formato.parse("17/09/2010"),1);
        try{
            controle.cadastrarBeneficiario(b1);
            System.out.println("Beneficiario cadastrado");
        }catch(IdadeInvalidaException a){
            System.out.println(a.getMessage());
        }
        
        
    }
    
    @Test
    public void testCadastrarBeneficiarioDadosInvExc() throws BeneficiarioExistenteException, DadosInvalidosException, IdadeInvalidaException, ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ControlePlanoDeSaude controle = new ControlePlanoDeSaude();
        Beneficiario b1 = new Beneficiario(456,"Jose",formato.parse("05/11/2021"),formato.parse("17/09/2001"),0);
        try{
            controle.cadastrarBeneficiario(b1);
            System.out.println("Beneficiario cadastrado");
        }catch(DadosInvalidosException a){
            System.out.println(a.getMessage());
        }
        
        
    }
    
    @Test
    public void testCadastrarBeneficiarioBenExistExc() throws BeneficiarioExistenteException, DadosInvalidosException, IdadeInvalidaException, ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ControlePlanoDeSaude controle = new ControlePlanoDeSaude();
        Beneficiario b1 = new Beneficiario(456,"Jose",formato.parse("05/11/2021"),formato.parse("17/09/2001"),1);
        try{
            controle.cadastrarBeneficiario(b1);
            System.out.println("Beneficiario cadastrado");
        }catch(BeneficiarioExistenteException a){
            System.out.println(a.getMessage());
        }
        
        Beneficiario b2 = new Beneficiario(456,"Jose",formato.parse("05/11/2021"),formato.parse("17/09/2001"),1);
        try{
            controle.cadastrarBeneficiario(b2);
            System.out.println("Beneficiario cadastrado");
        }catch(BeneficiarioExistenteException a){
            System.out.println(a.getMessage());
        }

        
        
    }
    

    

    /**
     * Test of pesquisarProcedimento method, of class ControlePlanoDeSaude.
     */
    /*@Test
    public void testPesquisarProcedimento() throws Exception {
        System.out.println("pesquisarProcedimento");
        int cod = 0;
        ControlePlanoDeSaude instance = new ControlePlanoDeSaude();
        Procedimento expResult = null;
        Procedimento result = instance.pesquisarProcedimento(cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarBeneficiario method, of class ControlePlanoDeSaude.
     */
    /*@Test
    public void testPesquisarBeneficiario() throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ControlePlanoDeSaude controle = new ControlePlanoDeSaude();
        Beneficiario b1 = new Beneficiario(456,"Jose",formato.parse("31/10/2021"),formato.parse("17/09/2001"),1);
        try{
            controle.cadastrarBeneficiario(b1);
        }catch(IdadeInvalidaException a){
            a.getMessage();
        }
        Beneficiario novo = controle.pesquisarBeneficiario(456);
        //System.out.println(novo.getNome());
        
        try{
            controle.cadastrarBeneficiario(novo);
        }catch(BeneficiarioExistenteException a){
            System.out.println(a.getMessage());
        }
        
        
    }
    
    @Test
	public void testarCadastroDeBeneficiarioCorreto() throws BeneficiarioExistenteException, IdadeInvalidaException, DadosInvalidosException, BeneficiarioInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       Beneficiario outro = plano.pesquisarBeneficiario(111);
       assertEquals("Pedro", outro.getNome());
       assertEquals(ingressoNoPlano, outro.getIngressoNoPlano());
       assertEquals(nasc, outro.getNasc());
       assertEquals(1, outro.getGenero());
    }
        
     @Test
    public void testarCadastroDeExameOk() throws DadosInvalidosException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Exame e = new Exame(1, "Hemograma", 0, 150, 3, 30, 60, 1, 120);
       plano.salvarProcedimento(e);
       Exame e1 = (Exame) plano.pesquisarProcedimento(1);
       assertEquals(0, e1.getIdadeMin());
       assertEquals(150, e1.getIdadeMax());
       assertEquals(3, e1.getGenero());
       assertEquals(30, e1.getCarencia());
       assertEquals(60, e1.getPeriodicidade());
       assertEquals(1, e1.getPorte(), 0.0001);
       assertEquals(120, e1.getCustoOperacional(), 0.0001);
    }
    
    @Test
    public void testarCadastroDeExameDadosInvExc() throws DadosInvalidosException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       
       Exame e = new Exame(1, "Hemograma", -1, 150, 3, 30, 60, 1, 120);
       try{
           plano.salvarProcedimento(e);
       }catch(DadosInvalidosException a){
           System.out.println(a.getMessage());
       }
       try{
            Exame e1 = (Exame) plano.pesquisarProcedimento(1);
            assertEquals(0, e1.getIdadeMin());
            assertEquals(150, e1.getIdadeMax());
            assertEquals(3, e1.getGenero());
            assertEquals(30, e1.getCarencia());
            assertEquals(60, e1.getPeriodicidade());
            assertEquals(1, e1.getPorte(), 0.0001);
            assertEquals(120, e1.getCustoOperacional(), 0.0001);
       }catch(ProcedimentoInexistenteException a){
           System.out.println(a.getMessage());
       }
       
    }
    
    @Test
    public void testarCadastroDeCirurgiaOk() throws DadosInvalidosException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Cirurgia e = new Cirurgia(1, "Cesarea", 10, 150, 2, 10, 600.0, 300.0);
       plano.salvarProcedimento(e);
       //Cirurgia e1 = (Cirurgia) plano.pesquisarProcedimento(1);
       Cirurgia e1 = (Cirurgia) plano.pesquisarProcedimento(1);
       assertEquals("Cesarea", e1.getNome());
       assertEquals(10, e1.getIdadeMin());
       assertEquals(150, e1.getIdadeMax());
       assertEquals(2, e1.getGenero());
       assertEquals(10, e1.getUnicidade());
       assertEquals(600, e1.getHonorario(), 0.0001);
       assertEquals(300, e1.getMaterial(), 0.0001);
       e = new Cirurgia(1, "Cesarea2", 11, 151, 3, 11, 601.0, 301.0);
       plano.salvarProcedimento(e);
       e1 = (Cirurgia) plano.pesquisarProcedimento(1);
       assertEquals("Cesarea2", e1.getNome());
       assertEquals(11, e1.getIdadeMin());
       assertEquals(151, e1.getIdadeMax());
       assertEquals(3, e1.getGenero());
       assertEquals(11, e1.getUnicidade());
       assertEquals(601, e1.getHonorario(), 0.0001);
       assertEquals(301, e1.getMaterial(), 0.0001);
    }
    
    @Test
    public void testarSolicitarCirurgiaOk() throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Cirurgia e1 = new Cirurgia(1, "Cesarea", 10, 150, 3, 2, 600.0, 300.0);
       plano.salvarProcedimento(e1);
       
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
    	   Date hoje = new Date();
    	   
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       
       plano.solicitar(111, 1, hoje);
       //plano.solicitar(111, 1, hoje);
       
       
       
       

       // Um item no histórico
       //assertEquals(1, plano.quantidade(111, 1));
    }*/
    
    /*@Test
    public void testarSolicitarCirurgiaUnicidadeExc() throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Cirurgia e1 = new Cirurgia(1, "Cesarea", 10, 150, 3, 1, 600.0, 300.0);
       plano.salvarProcedimento(e1);
       
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
           
           gc.set(2021, 8, 1);
           Date temp = gc.getTime();
           
    	   Date ingressoNoPlano = gc.getTime();
    	   Date hoje = new Date();
    	   
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       
       plano.solicitar(111, 1, temp);
       try{
            plano.solicitar(111, 1, hoje);
       }catch(UnicidadeException a){
           System.out.println(a.getMessage());
       }
           
       
       
       
       

       // Um item no histórico
       //assertEquals(1, plano.quantidade(111, 1));
    }*/
    
    /*@Test
    public void testarSolicitarExamesOK()throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException{
         ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
         Exame e = new Exame(1, "Hemograma", 0, 150, 3, 30, 60, 1, 120);
         plano.salvarProcedimento(e);
         GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
           //gc.set(2021, 9, 1);
    	   Date ingressoNoPlano = gc.getTime();
           
           gc.set(2021, 7, 1);
           Date temp = gc.getTime();
    	   Date hoje = new Date();
        Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
        plano.cadastrarBeneficiario(b);
        plano.solicitar(111, 1, temp);
        //plano.solicitar(111, 1, hoje);
        
    }*/
    
    /*@Test
    public void testarSolicitarExamesExc()throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException{
         ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
         Exame e = new Exame(1, "Hemograma", 50, 150, 2, 30, 60, 1, 120);
         plano.salvarProcedimento(e);
         GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
           //gc.set(2021, 9, 1);
    	   Date ingressoNoPlano = gc.getTime();
           
           gc.set(2021, 7, 1);
           Date temp = gc.getTime();
    	   Date hoje = new Date();
        Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
        Beneficiario b1 = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
        plano.cadastrarBeneficiario(b);
        try{
            plano.cadastrarBeneficiario(b1);
        }catch(BeneficiarioExistenteException a){
            System.out.println(a.getMessage());
        }
        //plano.solicitar(111, 1, temp);
        //plano.solicitar(111, 1, hoje);
        try{
            plano.solicitar(112, 1, hoje);
        }catch(BeneficiarioInexistenteException a){
            System.out.println(a.getMessage());
        }
        
        try{
            plano.solicitar(111, 2, hoje);
        }catch(ProcedimentoInexistenteException a){
            System.out.println(a.getMessage());
        }
        
        try{
            plano.solicitar(111, 1, hoje);
        }catch(IdadeInvalidaException a){
            System.out.println(a.getMessage());
        }
        
      
    }
    
    @Test
    public void testarSolicitarExamesExc2()throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException{
         ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
         Exame e = new Exame(1, "Hemograma", 0, 150, 2, 30, 60, 1, 120);
         plano.salvarProcedimento(e);
         GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
           //gc.set(2021, 9, 1);
    	   Date ingressoNoPlano = gc.getTime();
           
           gc.set(2021, 7, 1);
           Date temp = gc.getTime();
    	   Date hoje = new Date();
        Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
        plano.cadastrarBeneficiario(b);
        //plano.solicitar(111, 1, temp);
        try{
            plano.solicitar(111, 1, hoje);
        }catch(GeneroInvalidoException a){
            System.out.println(a.getMessage());
        }
        
    }*/
    
    /*@Test
    public void testarSolicitarExamesExcCarencia()throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException{
         ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
         Exame e = new Exame(1, "Hemograma", 0, 150, 1, 30, 60, 1, 120);
         plano.salvarProcedimento(e);
         GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 1 de novembro de 2021
    	   gc.set(2021, 9, 1);
           //gc.set(2021, 9, 1);
    	   Date ingressoNoPlano = gc.getTime();
           
           gc.set(2021, 9, 23);
           Date temp = gc.getTime();
    	   Date hoje = new Date();
        Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
        plano.cadastrarBeneficiario(b);
        //plano.solicitar(111, 1, temp);
        try{
        //plano.solicitar(111, 1, hoje);
        plano.solicitar(111, 1, temp);
        }catch(CarenciaException a){
            System.out.println(a.getMessage());
        }
        
    }*/
    
    /*@Test
    public void testarSolicitarExamesExcPeriodicidade()throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException{
         ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
         Exame e = new Exame(1, "Hemograma", 0, 150, 1, 20, 90, 1, 120);
         plano.salvarProcedimento(e);
         GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 1 de agosto de 2021
    	   gc.set(2021, 7, 1);
           //1 de setembro de 2021
    	   Date ingressoNoPlano = gc.getTime();
           gc.set(2021, 8, 26);
           Date temp = gc.getTime();
           gc.set(2021, 10, 26);
    	   Date hoje = gc.getTime();
        Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
        plano.cadastrarBeneficiario(b);
        //plano.solicitar(111, 1, temp);
        //try{
        plano.solicitar(111, 1, temp);
        try{
            plano.solicitar(111, 1, hoje);
        }catch(PeriodicidadeException a){
            System.out.println(a.getMessage());
        }
        
    }*/
    
    /*@Test 
        public void meuTest() throws DadosInvalidosException, IdadeInvalidaException, BeneficiarioExistenteException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException{
        ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
        Exame e = new Exame(1, "Hemograma", 0, 150, 1, 30, 60, 1, 120);
        Cirurgia c = new Cirurgia(11, "Cesarea", 10, 150, 3, 1, 600.0, 300.0);
        plano.salvarProcedimento(c);
        plano.salvarProcedimento(e);
        
        GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2015, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
    	   Date hoje = new Date();
    	   
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       
       plano.solicitar(111, 1, hoje);
       plano.solicitar(111, 11, hoje);
    }*/
        
    
    /*@Test
    public void testarFaturamento() throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Exame e = new Exame(1, "Hemograma", 0, 150, 1, 30, 60, 1, 120);
       Cirurgia c = new Cirurgia(11, "Cesarea", 10, 150, 3, 1, 600.0, 300.0);
       plano.salvarProcedimento(c);
       plano.salvarProcedimento(e);
       
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2015, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
    	   Date hoje = new Date();
    	   
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       
       plano.solicitar(111, 1, hoje);
       plano.solicitar(111, 11, hoje);

       int mes = hoje.getMonth() + 1;
       int ano = hoje.getYear() + 1900;
       double valor = plano.faturar(mes, ano);
       assertEquals(1120, valor, 0.0001);
    }*/
    
    /*@Test
    public void testarFaturamento2() throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Exame e = new Exame(1, "Hemograma", 0, 150, 1, 30, 60, 1, 120);
       Cirurgia c = new Cirurgia(11, "Cesarea", 10, 150, 3, 1, 600.0, 300.0);
       plano.salvarProcedimento(c);
       plano.salvarProcedimento(e);
       
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2015, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
           
           gc.set(2021, 7, 1);
           Date temp = gc.getTime();
    	   Date hoje = new Date();
    	   
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       Beneficiario a = new Beneficiario(222, "Juliano",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(a);
       
       plano.solicitar(111, 1, hoje);
       plano.solicitar(111, 11, hoje);
       plano.solicitar(222,11,temp);

       int mes = hoje.getMonth() + 1;
       int ano = hoje.getYear() + 1900;
       double valor = plano.faturar(mes, ano);
       assertEquals(1120, valor, 0.0001);
       
       int mes1 = temp.getMonth() + 1;
       int ano1 = temp.getYear() + 1900;
       double valor1 = plano.faturar(mes1, ano1);
       assertEquals(900, valor1, 0.0001);
    }*/
    
    
    /*@Test
    public void testarBeneficiarioDAO(){
        Beneficiario b = new Beneficiario();
        BeneficiarioDAO dao = new BeneficiarioDAO();
        b.setCpf(12);
        b.setNome("Ruiva");
        dao.inserir(b);
        
        Beneficiario outro = dao.pesquisar(12);
        
        assertEquals(12, outro.getCpf());
        
        
    }*/
    
    /*@Test
    public void testarBeneficiarioDAO() throws DadosInvalidosException{
        GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
          
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
           
           
       Beneficiario b = new Beneficiario(111, "Pedro", ingressoNoPlano, nasc, 1);
       BeneficiarioDAO dao = new BeneficiarioDAO();
       dao.inserir(b);
       Beneficiario outro = dao.pesquisar(111);
       assertEquals(111, outro.getCpf());
       
    }
    
    @Test
    public void testarProcedimentoDAOExame(){
        Exame e = new Exame(1, "Hemograma", 0, 150, 3, 30, 60, 1, 120);
        ProcedimentoDAO dao = new ProcedimentoDAO();
        dao.inserir(e);
        
        Procedimento teste = dao.pesquisar(1);
        assertEquals(1, teste.getCodigo());
    }*/
    
    /*@Test
    public void testarProcedimentoDAOCirurgia(){
        Cirurgia e = new Cirurgia(2, "Cesarea", 10, 150, 2, 10, 600.0, 300.0);
        ProcedimentoDAO dao = new ProcedimentoDAO();
        dao.inserir(e);
        
        Procedimento teste = dao.pesquisar(2);
        assertEquals(2, teste.getCodigo());
    }*/
    
    /*@Test
	public void testarFaturamento() throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Exame e = new Exame(1, "Hemograma", 0, 150, 1, 30, 1, 1, 120);
       Cirurgia c = new Cirurgia(11, "Cesarea", 10, 150, 3, 5, 600.0, 300.0);
       plano.salvarProcedimento(c);
       plano.salvarProcedimento(e);
       
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2015, 9, 31);
       Date ingressoNoPlano = gc.getTime();
    	   
       //Solicitação em outubro 
    	   gc.set(2016, 9, 01);
    	   Date hoje = gc.getTime();;
    	   
       Beneficiario b1 = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b1);
       
       Beneficiario b2 = new Beneficiario(222, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b2);
       
       plano.solicitar(111, 1, hoje);
       plano.solicitar(111, 11, hoje);

       double valor = plano.faturar(10, 2016);
       assertEquals(1120, valor, 0.0001);

       //Solicitação em novembro 
	   gc.set(2016, 10, 01);
	   hoje = gc.getTime();;

       plano.solicitar(222, 1, hoje);
       plano.solicitar(222, 11, hoje);

       //Verifica fatura de novembro
       Double valor2 = plano.faturar(11, 2016);
       assertEquals(1120, valor2, 0.0001);
       //Verifica se outubro continua com mesmo valor
       valor = plano.faturar(10, 2016);
       assertEquals(1120, valor, 0.0001);

       //Solicitação de novo em novembro 
	   gc.set(2016, 10, 14);
	   hoje = gc.getTime();;

       plano.solicitar(222, 1, hoje);
       plano.solicitar(222, 11, hoje);

       //Verifica se novembro muda o valor
       double valor3 = plano.faturar(11, 2016);
       assertEquals(2240, valor3, 0.0001);
       //Verifica se outubro continua com mesmo valor
       valor = plano.faturar(10, 2016);
       assertEquals(1120, valor, 0.0001);
    }*/
    
    //Testes da Correcao Prof
    
    /*@Test
	public void testarCadastroDeBeneficiarioCorreto() throws BeneficiarioExistenteException, IdadeInvalidaException, DadosInvalidosException, BeneficiarioInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       Beneficiario outro = plano.pesquisarBeneficiario(111);
       assertEquals("Pedro", outro.getNome());
       assertEquals(ingressoNoPlano, outro.getIngressoNoPlano());
       assertEquals(nasc, outro.getNasc());
       assertEquals(1, outro.getGenero());
	}*/
    
    /*@Test
	public void testarCadastroDeBeneficiarioJaCadastrado() throws BeneficiarioExistenteException, IdadeInvalidaException, DadosInvalidosException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       try {
         plano.cadastrarBeneficiario(b);
         fail("Deveria ter dado exceção de beneficiário já cadastrado.");
       } catch (BeneficiarioExistenteException e) {
    	     // Tudo certo!
       }       
	}*/
    
    /*@Test
	public void testarCadastroDeBeneficiarioComIdadeInvalida() throws BeneficiarioExistenteException, IdadeInvalidaException, DadosInvalidosException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1950
       gc.set(1950, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       try {
         plano.cadastrarBeneficiario(b);
         fail("Deveria ter dado exceção de idade inválida.");
       } catch (Exception e) {
    	     assertTrue(e instanceof IdadeInvalidaException);
       }       
       // 14 de novembro de 2006
       gc.set(2006, 10, 14);
    	   nasc = gc.getTime();
       Beneficiario b2 = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       try {
           plano.cadastrarBeneficiario(b2);
           fail("Deveria ter dado exceção de idade inválida.");
       } catch (Exception e) {
  	     assertTrue(e instanceof IdadeInvalidaException);
       }        
	}*/
    
    /*@Test
	public void testarCadastroDeBeneficiarioComDadosInvalidos() throws BeneficiarioExistenteException, IdadeInvalidaException, DadosInvalidosException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
       Beneficiario b = new Beneficiario(0, "Pedro",  ingressoNoPlano, nasc, 1);
       try {
         plano.cadastrarBeneficiario(b);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e) {
    	     assertTrue(e instanceof DadosInvalidosException);
       } 
       
       b = new Beneficiario(111, "",  ingressoNoPlano, nasc, 1);
       try {
         plano.cadastrarBeneficiario(b);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e) {
    	     assertTrue(e instanceof DadosInvalidosException);
       }  
       
       b = new Beneficiario(111, null,  ingressoNoPlano, nasc, 1);
       try {
         plano.cadastrarBeneficiario(b);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e) {
    	     assertTrue(e instanceof DadosInvalidosException);
       } 
       
       b = new Beneficiario(111, "Pedro",  null, nasc, 1);
       try {
         plano.cadastrarBeneficiario(b);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e) {
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       b = new Beneficiario(111, "Pedro",  ingressoNoPlano, null, 1);
       try {
         plano.cadastrarBeneficiario(b);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e) {
    	     assertTrue(e instanceof DadosInvalidosException);
       } 
       
       b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 0);
       try {
         plano.cadastrarBeneficiario(b);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e) {
    	     assertTrue(e instanceof DadosInvalidosException);
       }

       b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 3);
       try {
         plano.cadastrarBeneficiario(b);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e) {
    	     assertTrue(e instanceof DadosInvalidosException);
       }
	}*/
    
    /*@Test
	public void testarCadastroDeExameOk() throws DadosInvalidosException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Exame e = new Exame(1, "Hemograma", 0, 150, 3, 30, 60, 1, 120);
       plano.salvarProcedimento(e);
       Exame e1 = (Exame) plano.pesquisarProcedimento(1);
       assertEquals(0, e1.getIdadeMin());
       assertEquals(150, e1.getIdadeMax());
       assertEquals(3, e1.getGenero());
       assertEquals(30, e1.getCarencia());
       assertEquals(60, e1.getPeriodicidade());
       assertEquals(1, e1.getPorte(), 0.0001);
       assertEquals(120, e1.getCustoOperacional(), 0.0001);
	}*/
    
    /*@Test
	public void testarCadastroDeExameComDadosInvalidos() throws DadosInvalidosException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       
       // Codigo invalido
       Exame e1 = new Exame(-1, "Hemograma", 0, 150, 3, 30, 60, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Nome invalido
       e1 = new Exame(1, null, 0, 150, 3, 30, 60, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }

       // Nome invalido
       e1 = new Exame(1, "", 0, 150, 3, 30, 60, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Idade minima invalido
       e1 = new Exame(1, "Hemograma", -1, 150, 3, 30, 60, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Idade maxima invalido
       e1 = new Exame(1, "Hemograma", 0, -1, 3, 30, 60, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       //Idade maxima menor que a mínima
       e1 = new Exame(1, "Hemograma", 10, 9, 3, 30, 60, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Genero invalido
       e1 = new Exame(1, "Hemograma", 0, 150, 0, 30, 60, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Genero invalido
       e1 = new Exame(1, "Hemograma", 0, 150, 4, 30, 60, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Carencia invalido
       e1 = new Exame(1, "Hemograma", 0, 150, 3, -1, 60, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Periodicidade invalido
       e1 = new Exame(1, "Hemograma", 0, 150, 3, 30, -1, 1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Porte invalido
       e1 = new Exame(1, "Hemograma", 0, 150, 3, 30, 60, -1, 120);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Custo operacional invalido
       e1 = new Exame(1, "Hemograma", 0, 150, 3, 30, 60, 1, -1);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
	}*/
    
    /*@Test
	public void testarCadastroDeCirurgiaOk() throws DadosInvalidosException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Cirurgia e = new Cirurgia(1, "Cesarea", 10, 150, 2, 10, 600.0, 300.0);
       plano.salvarProcedimento(e);
       Cirurgia e1 = (Cirurgia) plano.pesquisarProcedimento(1);
       assertEquals("Cesarea", e1.getNome());
       assertEquals(10, e1.getIdadeMin());
       assertEquals(150, e1.getIdadeMax());
       assertEquals(2, e1.getGenero());
       assertEquals(10, e1.getUnicidade());
       assertEquals(600, e1.getHonorario(), 0.0001);
       assertEquals(300, e1.getMaterial(), 0.0001);
       e = new Cirurgia(1, "Cesarea2", 11, 151, 3, 11, 601.0, 301.0);
       plano.salvarProcedimento(e);
       e1 = (Cirurgia) plano.pesquisarProcedimento(1);
       assertEquals("Cesarea2", e1.getNome());
       assertEquals(11, e1.getIdadeMin());
       assertEquals(151, e1.getIdadeMax());
       assertEquals(3, e1.getGenero());
       assertEquals(11, e1.getUnicidade());
       assertEquals(601, e1.getHonorario(), 0.0001);
       assertEquals(301, e1.getMaterial(), 0.0001);
	}*/
    
    /*@Test
	public void testarCadastroDeCirurgiaComDadosInvalidos() throws DadosInvalidosException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       
       // Codigo invalido
       Cirurgia e1 = new Cirurgia(-1, "Cesarea", 10, 150, 2, 10, 600.0, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Nome invalido
       e1 = new Cirurgia(1, "", 10, 150, 2, 10, 600.0, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }

       // Nome invalido
       e1 = new Cirurgia(1, null, 10, 150, 2, 10, 600.0, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Idade minima invalido
       e1 = new Cirurgia(1, "Cesarea", -1, 150, 2, 10, 600.0, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Idade maxima invalido
       e1 = new Cirurgia(1, "Cesarea", 10, -1, 2, 10, 600.0, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       //Idade maxima menor que a mínima
       e1 = new Cirurgia(1, "Cesarea", 10, 9, 2, 10, 600.0, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Genero invalido
       e1 = new Cirurgia(1, "Cesarea", 10, 150, 0, 10, 600.0, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Genero invalido
       e1 = new Cirurgia(1, "Cesarea", 10, 150, 4, 10, 600.0, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Unicidade invalido
       e1 = new Cirurgia(1, "Cesarea", 10, 150, 2, -1, 600.0, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
              
       // Honorario invalido
       e1 = new Cirurgia(1, "Cesarea", 10, 150, 2, 10, -1, 300.0);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
       
       // Material invalido
       e1 = new Cirurgia(1, "Cesarea", 10, 150, 2, 10, 600.0, -1);
       try {
         plano.salvarProcedimento(e1);
         fail("Deveria ter dado exceção de dados inválidos.");
       } catch (Exception e){
    	     assertTrue(e instanceof DadosInvalidosException);
       }
	}*/
    
    /*@Test
	public void testarSolicitarCirurgiaComErro() throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Cirurgia e1 = new Cirurgia(2, "�rnia", 43, 150, 1, 1, 600.0, 300.0);
       plano.salvarProcedimento(e1);
       
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1979
       gc.set(1979, 11, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2016, 10, 31);
    	   Date ingressoNoPlano = gc.getTime();
    	   Date hoje = new Date();
    	   
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       
       // Idade do beneficiário menor que a mínima exigida para o procedimento
       try {
         plano.solicitar(111, 2, hoje);
         fail("Deveria ter dado erro de idade invalida.");
       } catch (Exception e){
    	     assertTrue(e instanceof IdadeInvalidaException);
       }
       
       // Idade do beneficiário maior que a máxima exigida para o procedimento
       e1 = new Cirurgia(1, "�rnia", 10, 40, 1, 1, 600.0, 300.0);
       plano.salvarProcedimento(e1);
       try {
           plano.solicitar(111, 1, hoje);
           fail("Deveria ter dado erro de idade invalida.");
       } catch (Exception e){
      	     assertTrue(e instanceof IdadeInvalidaException);
       }

       // Genero do procedimento diferente do beneficiario
       e1 = new Cirurgia(1, "Cesarea", 10, 150, 2, 1, 600.0, 300.0);
       plano.salvarProcedimento(e1);
       try {
           plano.solicitar(111, 1, hoje);
           fail("Deveria ter dado erro de genero invalido.");
       } catch (Exception e){
      	     assertTrue(e instanceof GeneroInvalidoException);
       }
       
       // Unicidade do procedimento maior 
       e1 = new Cirurgia(1, "Cesarea", 10, 150, 3, 1, 600.0, 300.0);
       plano.salvarProcedimento(e1);
       try {
           plano.solicitar(111, 1, hoje);
           plano.solicitar(111, 1, hoje);
           fail("Não deveria solicitar novamente!");
       } catch (Exception e){
      	     assertTrue(e instanceof UnicidadeException);
       }
	}*/
    
    /*@Test
	public void testarSolicitarExameComErro() throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Exame e1 = new Exame(1, "Hemograma", 0, 150, 3, 30, 60, 1, 120);
       plano.salvarProcedimento(e1);
       
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1979, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2020, 9, 31);
    	   Date ingressoNoPlano = gc.getTime();
    	   Date hoje = new Date();
    	   
       Beneficiario b = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b);
       
       // Exame inexistente
       e1 = new Exame(1, "Hemograma", 0, 150, 3, 30, 60, 1, 120);
       plano.salvarProcedimento(e1);
       try {
         plano.solicitar(111, 9, hoje);
         fail("Deveria ter dado erro de exame inexistente.");
       } catch (Exception e){
    	     assertTrue(e instanceof ProcedimentoInexistenteException);
       }
       
       // Paciente inexistente
       try {
         plano.solicitar(999, 1, hoje);
         fail("Deveria ter dado erro de paciente inexistente.");
       } catch (Exception e){
    	     assertTrue(e instanceof BeneficiarioInexistenteException);
       }
       
       // Idade do beneficiário menor que a mínima exigida para o procedimento
       e1 = new Exame(1, "Hemograma", 43, 150, 3, 30, 60, 1, 120);
       plano.salvarProcedimento(e1);
       try {
         plano.solicitar(111, 1, hoje);
         fail("Deveria ter dado erro de idade invalida.");
       } catch (Exception e){
    	     assertTrue(e instanceof IdadeInvalidaException);
       }
       
       // Idade do beneficiário maior que a máxima exigida para o procedimento
       e1 = new Exame(1, "Hemograma", 0, 40, 3, 30, 60, 1, 120);
       plano.salvarProcedimento(e1);
       try {
           plano.solicitar(111, 1, hoje);
           fail("Deveria ter dado erro de idade invalida.");
       } catch (Exception e){
      	     assertTrue(e instanceof IdadeInvalidaException);
       }

       // Genero do procedimento diferente do beneficiario
       e1 = new Exame(1, "Hemograma", 0, 150, 2, 30, 60, 1, 120);
       plano.salvarProcedimento(e1);
       try {
           plano.solicitar(111, 1, hoje);
           fail("Deveria ter dado erro de genero invalido.");
       } catch (Exception e){
      	     assertTrue(e instanceof GeneroInvalidoException);
       }
       
       // Carencia do procedimento maior 
       e1 = new Exame(1, "Hemograma", 0, 150, 3, 500, 60, 1, 120);
       plano.salvarProcedimento(e1);
       try {
           plano.solicitar(111, 1, hoje);
           fail("Deveria ter dado erro de carencia invalida.");
       } catch (Exception e){
      	   assertTrue(e instanceof CarenciaException);
       }
       
       // Periodicidade do procedimento maior 
       e1 = new Exame(1, "Hemograma", 0, 150, 3, 35, 35, 1, 120);
       plano.salvarProcedimento(e1);
       hoje = new Date();
       Beneficiario b1 = new Beneficiario(222, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b1);
       plano.solicitar(222, 1, hoje);
       hoje.setMonth(hoje.getMonth()-1);
       try {
           plano.solicitar(222, 1, hoje);
           fail("Deveria ter dado erro de periodicidade invalida.");
       } catch (Exception e){
      	   assertTrue(e instanceof PeriodicidadeException);
       }
	}*/
    
    /*@Test
	public void testarFaturamento() throws DadosInvalidosException, BeneficiarioExistenteException, IdadeInvalidaException, GeneroInvalidoException, CarenciaException, PeriodicidadeException, UnicidadeException, BeneficiarioInexistenteException, ProcedimentoInexistenteException {
       ControlePlanoDeSaude plano = new ControlePlanoDeSaude();
       Exame e = new Exame(1, "Hemograma", 0, 150, 1, 30, 1, 1, 120);
       Cirurgia c = new Cirurgia(11, "Cesarea", 10, 150, 3, 5, 600.0, 300.0);
       plano.salvarProcedimento(c);
       plano.salvarProcedimento(e);
       
       GregorianCalendar gc = new GregorianCalendar();
       // 14 de novembro de 1974
       gc.set(1974, 10, 14);
    	   Date nasc = gc.getTime();
    	   // 31 de outubro de 2016
    	   gc.set(2015, 9, 31);
       Date ingressoNoPlano = gc.getTime();
    	   
       //Solicitação em outubro 
    	   gc.set(2016, 9, 01);
    	   Date hoje = gc.getTime();;
    	   
       Beneficiario b1 = new Beneficiario(111, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b1);
       
       Beneficiario b2 = new Beneficiario(222, "Pedro",  ingressoNoPlano, nasc, 1);
       plano.cadastrarBeneficiario(b2);
       
       plano.solicitar(111, 1, hoje);
       plano.solicitar(111, 11, hoje);

       double valor = plano.faturar(10, 2016);
       assertEquals(1120, valor, 0.0001);

       //Solicitação em novembro 
	   gc.set(2016, 10, 01);
	   hoje = gc.getTime();;

       plano.solicitar(222, 1, hoje);
       plano.solicitar(222, 11, hoje);

       //Verifica fatura de novembro
       Double valor2 = plano.faturar(11, 2016);
       assertEquals(1120, valor2, 0.0001);
       //Verifica se outubro continua com mesmo valor
       valor = plano.faturar(10, 2016);
       assertEquals(1120, valor, 0.0001);

       //Solicitação de novo em novembro 
	   gc.set(2016, 10, 14);
	   hoje = gc.getTime();;

       plano.solicitar(222, 1, hoje);
       plano.solicitar(222, 11, hoje);

       //Verifica se novembro muda o valor
       double valor3 = plano.faturar(11, 2016);
       assertEquals(2240, valor3, 0.0001);
       //Verifica se outubro continua com mesmo valor
       valor = plano.faturar(10, 2016);
       assertEquals(1120, valor, 0.0001);
    }*/


    
}
