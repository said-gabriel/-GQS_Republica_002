package test;

import model.Endereco;
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
public class EnderecoTeste {

    public EnderecoTeste() {
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
    public void CT01() {
        String veBairro = "Coramara";
        String veRua = "Antonio Leão";
        int veNum = 35;
        String vePontoRef = "ao lado da farmacia";
        String veLocalGeo = "Sul do Estado";
        String veEstado = "Espírito Santo";
        String veCidade = "Mimoso do Sul";
        
        Endereco endereco = new Endereco("Coramara", "Antonio Leão", 35, "ao lado da farmacia", "Sul do Estado", "Mimoso do Sul", "Espírito Santo");
        
        assertEquals(veBairro,endereco.getBairro());
        assertEquals(veRua,endereco.getRua());
        assertEquals(veNum,endereco.getNum());
        assertEquals(vePontoRef,endereco.getPontoRef());
        assertEquals(veLocalGeo,endereco.getLocalGeo());
        assertEquals(veEstado, endereco.getEstado());
        assertEquals(veCidade, endereco.getCidade());
        
    }
}
