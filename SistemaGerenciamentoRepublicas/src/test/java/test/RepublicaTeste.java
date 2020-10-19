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
public class RepublicaTeste {

    public RepublicaTeste() {
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

    @Test//teste terminar republica
    public void CT01() {
        LocalDate veData = LocalDate.now();
        Republica rep = new Republica("NBA", new Endereco(), "29305-151", "garagem", new Vaga(10), new Representante(new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678"))));

        rep.terminarRepublica();

        assertEquals(veData.toString(), rep.getDataExtincao().toString());

    }

    @Test //teste adicionar morador
    public void CT02() {
        LocalDate veData = LocalDate.now();
        Republica rep = new Republica("NBA", new Endereco(), "29305-151", "garagem", new Vaga(10), new Representante(new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678"))));

        Morador morador1 = new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678"));
        Morador morador2 = new Morador(new SemTeto("Scottie Pippen", "Pippen", "1234-5678", "sc.com", "1234-5678", "1234-5678"));
        rep.getMoradores().add(morador1);
        rep.getMoradores().add(morador2);

        ArrayList<Morador> veMoradores = new ArrayList<>();
        veMoradores.add(morador1);
        veMoradores.add(morador2);

        assertEquals(veMoradores, rep.getMoradores());

    }
}
