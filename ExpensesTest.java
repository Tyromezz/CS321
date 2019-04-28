/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JButton;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author triun
 */
public class ExpensesTest {
    
    private Expenses expenseUI;
    public ExpensesTest() {
    }
    
    @Before
    public void setUp() {
        MoneyKeeper testUI = new MoneyKeeper();
        this.expenseUI = testUI.exp;        
    }
    
    @After
    public void tearDownClass() {
    }

    /**
     * Test of sumExpenses method, of class Expenses.
     */
    @Test
    public void testSumExpenses() {
        System.out.println("sumExpenses");
        Expenses instance = this.expenseUI;
        // test for 5 values summing and emulate clicking
        for(int i = 1; i < 6; i++){
            ((JTextField) instance.expenses.getComponent(1)).setText(Integer.toString(i));
            ((JButton)instance.expenses.getComponent(4)).doClick();
        }
        int result = instance.sumExpenses();
        int expResult = 15;
        assertEquals(expResult, result);
    }

    /**
     * Test of addExpense method, of class Expenses.
     */
    @Test
    public void testAddExpense() {
        System.out.println("addExpense");
        Expenses instance = this.expenseUI;
        // setting a number for testing
        ((JTextField) instance.expenses.getComponent(1)).setText("10000");
        int result = instance.addExpense();
        int expResult = 10000;
        assertEquals(expResult, result);
    }
    
}
