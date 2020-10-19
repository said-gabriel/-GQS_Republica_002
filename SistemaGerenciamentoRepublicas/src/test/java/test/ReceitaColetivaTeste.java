/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.ReceitaColetiva;
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
public class ReceitaColetivaTeste {
    
    public ReceitaColetivaTeste() {
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
    public void CT01(){
        String veFonte = "Supermercado Casagrande";
        double veValor = 300.0;
        ReceitaColetiva receita = new ReceitaColetiva("Supermercado Casagrande", 300.0);
        
        assertEquals(veValor,receita.getValor(),0.00001);
        assertEquals(veFonte,receita.getFonte());
    }
}
