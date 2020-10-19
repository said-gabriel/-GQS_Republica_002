package test;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Endereco;
import model.Morador;
import model.Representante;
import model.Republica;
import model.SemTeto;
import model.Vaga;
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
public class HistoricoRepublicaTeste {

    public HistoricoRepublicaTeste() {
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

    @Test//testando adicionar republica
    public void CT01() {
        LocalDate veData = LocalDate.now();
        Republica rep = new Republica("NBA", new Endereco(), "29305-151", "garagem", new Vaga(10), new Representante(new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678"))));

        LocalDate veData1 = LocalDate.now();
        Republica rep2 = new Republica("KGGT", new Endereco(), "23605-151", "piscina", new Vaga(15), new Representante(new Morador(new SemTeto("Lucas Silva", "Lukinha", "8524-9732", "lukas.com", "8524-9761", "3916-7612"))));

        ArrayList<Republica> veListaRep = new ArrayList<>();
        veListaRep.add(rep);
        veListaRep.add(rep2);

        Morador m1 = new Morador(new SemTeto("Carlos", "carlin", "2587-7952", "carlos.com", "1976-3165", "1112-3999"));
        m1.addRepublicaHistorico(rep);
        m1.addRepublicaHistorico(rep2);

        assertEquals(veListaRep.toString(),m1.getHistorico().getHistorico().toString());

    }
}
