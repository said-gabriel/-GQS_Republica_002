/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Morador;
import model.SemTeto;
import model.Tarefa;
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
public class TarefaTeste {

    public TarefaTeste() {
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
    public void CT01() {
        Morador moradorEsperado1 = new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678"));
        Morador moradorEsperado2 = new Morador(new SemTeto("Scottie Pippen", "Pippen", "9876-5432", "sp.com", "9876-5432", "9876-5432"));
        ArrayList<Morador> listaEsperado5 = new ArrayList<>();
        listaEsperado5.add(moradorEsperado1);
        listaEsperado5.add(moradorEsperado2);
        String stringEsperado4 = "Arremessar 1000 bolas";

        Tarefa tarefa = new Tarefa(listaEsperado5, stringEsperado4);

        assertEquals(listaEsperado5, tarefa.getResponsaveis());
        assertEquals(stringEsperado4, tarefa.getDescricao());

    }
    @Test //teste de finalização de uma tarefa
    public void CT02(){
        LocalDate agora = LocalDate.now();
        Morador moradorEsperado1 = new Morador(new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678"));
        Morador moradorEsperado2 = new Morador(new SemTeto("Scottie Pippen", "Pippen", "9876-5432", "sp.com", "9876-5432", "9876-5432"));
        ArrayList<Morador> listaEsperado5 = new ArrayList<>();
        listaEsperado5.add(moradorEsperado1);
        listaEsperado5.add(moradorEsperado2);
        String stringEsperado4 = "Arremessar 1000 bolas";

        Tarefa tarefa = new Tarefa(listaEsperado5, stringEsperado4);
        tarefa.finalizar();
        
        assertEquals(tarefa.getDataTermino().toString(), agora.toString());
    }
}
