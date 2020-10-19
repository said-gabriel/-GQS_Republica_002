package test;

import model.Morador;
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
public class MoradorTeste {
    
    public MoradorTeste() {
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

   @Test
   public void CT01(){
       Morador morador = new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678"));
       
       String valorEsperado1 = "Michael Jordam";
        String valorEsperado2 = "Jordan";
        String valorEsperado3 = "1234-5678";
        String valorEsperado4 = "mj.com";
        String valorEsperado5 = "1234-5678";
        String valorEsperado6 = "1234-5678";

        assertEquals(morador.getPessoa().getNome(), valorEsperado1);
        assertEquals(morador.getPessoa().getApelido(), valorEsperado2);
        assertEquals(morador.getPessoa().getTelResp1(), valorEsperado3);
        assertEquals(morador.getPessoa().getLinkSociais(), valorEsperado4);
        assertEquals(morador.getPessoa().getTelResp2(), valorEsperado5);
        assertEquals(morador.getPessoa().getTelefone(), valorEsperado6);
       
   }
}
