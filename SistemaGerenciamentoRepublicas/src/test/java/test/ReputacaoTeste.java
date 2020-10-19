package test;

import model.Reputacao;
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
public class ReputacaoTeste {

    public ReputacaoTeste() {
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

    @Test//teste reclamacoes indice
    public void CT01() {
        int veReclamacoes = 10;
        int veReclamacoesResolvidas = 5;
        int veTarefasDadas = 10;
        int veTarefasConcluidas = 7;
        int veAtrasoPagamento = 15;

        Reputacao reputacao = new Reputacao(veReclamacoes, veReclamacoesResolvidas, veTarefasDadas, veTarefasConcluidas, veAtrasoPagamento);

        double veIndiceReclamacoes = 10 / 5;

        assertEquals(veIndiceReclamacoes, reputacao.reclamacoesIndice(),000.1);
    }

    @Test//teste compromisso com pagamento indice
    public void CT02() {
        int veReclamacoes = 10;
        int veReclamacoesResolvidas = 5;
        int veTarefasDadas = 10;
        int veTarefasConcluidas = 7;
        int veAtrasoPagamento = 15;

        Reputacao reputacao = new Reputacao(veReclamacoes, veReclamacoesResolvidas, veTarefasDadas, veTarefasConcluidas, veAtrasoPagamento);

        double veCompromissoPagamento = 10 / 10 + 15;

        assertEquals(veCompromissoPagamento, reputacao.compromissoPagamento(),000.1);
    }

    @Test//teste tarefas concluidas indice
    public void CT03() {
        int veReclamacoes = 10;
        int veReclamacoesResolvidas = 5;
        int veTarefasDadas = 10;
        int veTarefasConcluidas = 7;
        int veAtrasoPagamento = 15;

        Reputacao reputacao = new Reputacao(veReclamacoes, veReclamacoesResolvidas, veTarefasDadas, veTarefasConcluidas, veAtrasoPagamento);

        double veTarefasConcluidasindice = 10 / 7;

        assertEquals(veTarefasConcluidasindice, reputacao.tarefasConcluidasIndice(),000.1);
    }

}
