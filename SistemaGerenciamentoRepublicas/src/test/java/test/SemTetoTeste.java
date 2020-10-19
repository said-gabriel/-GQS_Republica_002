/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

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
public class SemTetoTeste {

    public SemTetoTeste() {
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

    @Test //
    public void CT01() {

        SemTeto semTeto = new SemTeto("Michael Jordam", "Jordan", "1234-5678", "mj.com", "1234-5678", "1234-5678");

        String valorEsperado1 = "Michael Jordam";
        String valorEsperado2 = "Jordan";
        String valorEsperado3 = "1234-5678";
        String valorEsperado4 = "mj.com";
        String valorEsperado5 = "1234-5678";
        String valorEsperado6 = "1234-5678";

        assertEquals(semTeto.getNome(), valorEsperado1);
        assertEquals(semTeto.getApelido(), valorEsperado2);
        assertEquals(semTeto.getTelResp1(), valorEsperado3);
        assertEquals(semTeto.getLinkSociais(), valorEsperado4);
        assertEquals(semTeto.getTelResp2(), valorEsperado5);
        assertEquals(semTeto.getTelefone(), valorEsperado6);

    }
}
