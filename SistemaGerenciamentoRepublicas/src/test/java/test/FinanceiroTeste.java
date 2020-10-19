package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import model.Despesa;
import model.Financeiro;
import model.Morador;
import model.Receita;
import model.ReceitaColetiva;
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
public class FinanceiroTeste {

    public FinanceiroTeste() {
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

    @Test//teste de saldo
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

        Receita receita = new Receita("Dinheiro do Lebron", 500.0, new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678")));

        ReceitaColetiva receitaColetiva = new ReceitaColetiva("Supermercado Casagrande", 300.0);

        Financeiro financeiro = new Financeiro();
        financeiro.getDespesa().add(despesa);
        financeiro.getReceita().add(receita);
        financeiro.getReceitaColetiva().add(receitaColetiva);

        double veSaldo = 500.0 + 300.0 - 300.0;

        assertEquals(veSaldo, financeiro.getSaldo(), 0.0001);
    }

    @Test//teste todas as despesas
    public void CT02() {
        String data = "2020-10-25";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate veDataFim = LocalDate.parse(data, formatter);

        Morador morador1 = new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678"));
        Morador morador2 = new Morador(new SemTeto("Scottie Pippen", "Pippen", "1234-5678", "sc.com", "1234-5678", "1234-5678"));

        ArrayList<Morador> veMoradores = new ArrayList<>();
        veMoradores.add(morador1);
        veMoradores.add(morador2);

        Despesa despesa = new Despesa("Conta luz", veDataFim, 200.0, "agora", 0, veMoradores);
        Despesa despesa2 = new Despesa("Conta Agua", veDataFim, 800.0, "agora", 0, veMoradores);
        Despesa despesa3 = new Despesa("Conta Agua", veDataFim, 800.0, "agora", 0, veMoradores);
        Despesa despesa4 = new Despesa("Conta Agua", veDataFim, 800.0, "agora", 0, veMoradores);

        Financeiro financeiro = new Financeiro();
        financeiro.getDespesa().add(despesa);
        financeiro.getDespesa().add(despesa2);
        financeiro.getDespesa().add(despesa3);
        financeiro.getDespesa().add(despesa4);

        double veTodasDespesas = 200.0 + 800.0*3;

        assertEquals(veTodasDespesas, financeiro.todasDespesas(), 0.0001);

    }

    @Test//teste todas receitas coletivas
    public void CT03() {

        ReceitaColetiva receitaColetiva1 = new ReceitaColetiva("Supermercado Casagrande", 300.0);
        ReceitaColetiva receitaColetiva2 = new ReceitaColetiva("Supermercado Casagrande", 300.0);
        ReceitaColetiva receitaColetiva3 = new ReceitaColetiva("Supermercado Casagrande", 300.0);

        Financeiro financeiro = new Financeiro();
        financeiro.getReceitaColetiva().add(receitaColetiva1);
        financeiro.getReceitaColetiva().add(receitaColetiva2);
        financeiro.getReceitaColetiva().add(receitaColetiva3);

        double veTotalReceitas = 900.0;

        assertEquals(veTotalReceitas, financeiro.todasReceitasColetivas(),0.0001);
    }
    @Test//teste todas receitas
    public void CT04() {

         Receita receita1 = new Receita("Dinheiro do Lebron", 500.0, new Morador(new SemTeto("Lebron", "Jordan", "1234-5678", "lb.com", "1234-5678", "1234-5678")));
          Receita receita2 = new Receita("Dinheiro do Curry", 700.0, new Morador(new SemTeto("Curry", "Jordan", "1234-5678", "cr.com", "1234-5678", "1234-5678")));
           Receita receita3 = new Receita("Dinheiro do Jordan", 800.0, new Morador(new SemTeto("Jordan", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678")));

        Financeiro financeiro = new Financeiro();
        financeiro.getReceita().add(receita1);
        financeiro.getReceita().add(receita2);
        financeiro.getReceita().add(receita3);

        double veTotalReceitas = 2000.0;

        assertEquals(veTotalReceitas, financeiro.todasReceitas(),0.0001);
    }
}
