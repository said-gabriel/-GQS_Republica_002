package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.Morador;
import model.Representante;
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
public class RepresentanteTeste {

    public RepresentanteTeste() {
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

    @Test // testando instancia
    public void CT01() {
        Representante representante = new Representante(new Morador(new SemTeto("Michael Jordan", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678")));
        LocalDate veData1 = LocalDate.now();
        String data = "2020-10-25";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate veData2 = LocalDate.parse(data, formatter);

        representante.setDataFim(veData2);
        representante.setDataInicio(veData1);

        assertEquals(veData2.toString(), representante.getDataFim().toString());
        assertEquals(veData1.toString(), representante.getDataInicio().toString());

        String valorEsperado1 = "Michael Jordan";
        String valorEsperado2 = "Jordan";
        String valorEsperado3 = "1234-5678";
        String valorEsperado4 = "mj.com";
        String valorEsperado5 = "1234-5678";
        String valorEsperado6 = "1234-5678";

        assertEquals(representante.getRepresentante().getPessoa().getNome(), valorEsperado1);
        assertEquals(representante.getRepresentante().getPessoa().getApelido(), valorEsperado2);
        assertEquals(representante.getRepresentante().getPessoa().getTelResp1(), valorEsperado3);
        assertEquals(representante.getRepresentante().getPessoa().getLinkSociais(), valorEsperado4);
        assertEquals(representante.getRepresentante().getPessoa().getTelResp2(), valorEsperado5);
        assertEquals(representante.getRepresentante().getPessoa().getTelefone(), valorEsperado6);
    }
}
