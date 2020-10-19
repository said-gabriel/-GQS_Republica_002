/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;
import model.Morador;
import model.ReclamacaoSugestao;
import model.SemTeto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author 55289
 */
public class VagaTeste {
    
    public VagaTeste() {
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
 @Test //Teste funcao solucionar
    public void CT01(){
        
        LocalDate agora = LocalDate.now();
        Morador morador = new Morador(new SemTeto());
        
        ReclamacaoSugestao reclamacao = new ReclamacaoSugestao("Barulho demais a noite", morador);
        reclamacao.solucionar();
        
        assertEquals(reclamacao.getDataSolucao().toString(),agora.toString());   
    }
    
    @Test //Teste de instancia
    public void CT02(){
        
        ReclamacaoSugestao sugestao= new ReclamacaoSugestao("Cheiro de cigarro no corredor", new Morador(new SemTeto("Lucas", "Lucas", "2812345678", "fb.gg/lucas", "55", "55")));
        
        String valor1 = "Cheiro de cigarro no corredor";
        String valor2 = "Lucas";
        String valor3 = "Lucas";
        String valor4 = "2812345678";
        String valor5 = "fb.gg/lucas";
        String valor6 = "55";
        
        assertEquals(valor1, sugestao.getDescricao());
        assertEquals(valor2, sugestao.getMorador().getPessoa().getNome());
        assertEquals(valor3, sugestao.getMorador().getPessoa().getApelido());
        assertEquals(valor4, sugestao.getMorador().getPessoa().getTelefone());
        assertEquals(valor5, sugestao.getMorador().getPessoa().getLinkSociais());
        assertEquals(valor6, sugestao.getMorador().getPessoa().getTelResp1());
        
        
    }
  
}
