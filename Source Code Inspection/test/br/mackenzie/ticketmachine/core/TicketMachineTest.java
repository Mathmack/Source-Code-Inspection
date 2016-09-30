/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.ticketmachine.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lntormin
 */
public class TicketMachineTest {
    
    public TicketMachineTest() {
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

    /**
     * Test of inserir method, of class TicketMachine.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("============Inserir============");
        TicketMachine tm=new TicketMachine(100);
        tm.inserir(10);
        assertEquals(10, tm.getSaldo());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of imprimir method, of class TicketMachine.
     */
    @Test
    public void testImprimir() throws Exception {
        System.out.println("============Imprimir============");
        TicketMachine tm = new TicketMachine(200);
        tm.inserir(100);
        String expResult = "*****************\n"
                + "*** R$100,00 ****\n"
                + "*****************\n";
        String result = tm.imprimir();
        assertEquals(expResult, result);
    }
    
}
