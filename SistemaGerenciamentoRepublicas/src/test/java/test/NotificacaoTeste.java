package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.Notificacao;
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
public class NotificacaoTeste {

    public NotificacaoTeste() {
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

    @Test//teste de instancia
    public void CT01() {
        String veDescricao = "Contas de luz precisam ser pagas!";
        LocalDate veDataInicio = LocalDate.now();
        String data = "2020-10-25";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate veDataFim = LocalDate.parse(data, formatter);

        Notificacao notificacao = new Notificacao("Contas de luz precisam ser pagas!", veDataInicio, veDataFim);

        assertEquals(veDataFim.toString(), notificacao.getDataFim().toString());
        assertEquals(veDataInicio.toString(), notificacao.getDataInicio().toString());
        assertEquals(veDescricao, notificacao.getDescricao());
    }

}
