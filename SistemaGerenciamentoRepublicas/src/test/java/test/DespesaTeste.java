package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import model.Despesa;
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
public class DespesaTeste {

    public DespesaTeste() {
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
        String data = "2020-10-25";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate veDataFim = LocalDate.parse(data, formatter);

        Morador morador1 = new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678"));
        Morador morador2 = new Morador(new SemTeto("Scottie Pippen", "Pippen", "1234-5678", "sc.com", "1234-5678", "1234-5678"));

        ArrayList<Morador> veMoradores = new ArrayList<>();
        veMoradores.add(morador1);
        veMoradores.add(morador2);

        Despesa despesa = new Despesa("Conta luz", veDataFim, 300.0, "agora", 0, veMoradores);
        
        String veDescricao = "Conta luz";
        String vePeriodo = "agora";
        double veValor = 300.0;
        
        assertEquals(veDescricao, despesa.getDescricao());
        assertEquals(vePeriodo, despesa.getPeriodo());
        assertEquals(veValor, despesa.getValor(),0.0001);
        assertEquals(veDataFim.toString(), despesa.getVencimento().toString());
        assertEquals(veMoradores, despesa.getParticipantes());
    }
}
