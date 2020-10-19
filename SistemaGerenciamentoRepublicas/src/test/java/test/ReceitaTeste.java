package test;

import model.Morador;
import model.Receita;
import model.SemTeto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 55289
 */
public class ReceitaTeste {
    
    public ReceitaTeste() {
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

    @Test //teste de instancia
   public void CT01(){
       String veDescricao = "Dinheiro do Lebron";
       Double veValor = 500.0;
       
       Receita receita = new Receita("Dinheiro do Lebron", 500.0, new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678")));
       
       
       assertEquals(veDescricao,receita.getDescricao());
       assertEquals(veValor,receita.getValor(),0.0001);
       
   }
}
