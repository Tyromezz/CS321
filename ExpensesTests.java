import org.junit.*;
import static org.junit.Assert.*;
import javax.swing.*;

public class ExpensesTests {
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("ExpensesTests");
    }

    private Expenses expenseUI;

    public ExpensesTests() { }

    @Before
    public void setUp() {
        MoneyKeeper testUI = new MoneyKeeper(); // mk_object
        this.expenseUI = testUI.exp;
    }

    @Test
    public void testSumExpenses() {
        System.out.println("sumExpenses");
        Expenses instance = this.expenseUI;
        // test for 5 values summing and emulate clicking
        for (int i = 1; i < 6; i++) {
            ((JTextField) instance.getExpensesPanel().getComponent(1)).setText(Integer.toString(i));
            ((JButton) instance.getExpensesPanel().getComponent(4)).doClick();
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
        ((JTextField) instance.getExpensesPanel().getComponent(1)).setText("10000");
        int result = instance.addExpense();
        int expResult = 10000;
        assertEquals(expResult, result);
    }

    // Expenses Tests
    @Test(timeout = 2000)
    public void test_Incomes_1() {
    }


}
