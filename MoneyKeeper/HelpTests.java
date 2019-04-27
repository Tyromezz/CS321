import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class HelpTests {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("HelpTests");
  }
  
  static MoneyKeeper mk_object = new MoneyKeeper(); 

  
  // Help Tests. Test getHelpMessage() to ensure you obtain the correct message when passing in the Incomes class.  
  @Test (timeout=2000) public void test_Help_1Incomes(){
    String message = "The Incomes feature allows you to add multiple streams of incomes (Primary, Secondary, Side Job, Hobby, Other) to your Financial Planner.\nTo add a new income, please enter the amount of money you make.\nThen select the type of income by choosing from the drop-down menu.\nFinally, click 'Add Income' to add the new income.";
    assertEquals(message, mk_object.help.getHelpMessage(Incomes.class));
  }
  
  // Test getHelpMessage() to ensure you obtain the correct message when passing in the Expenses class.
  @Test (timeout=2000) public void test_Help_2Expenses(){
    String message = "The Expenses feature allows you to add planned or unplanned expenses to your Financial Planner.\nTo add a new expense, please enter the cost of the expense.\nThen select the type of expense by choosing from the expenses drop-down menu.\nFinally, click 'Add Expense' to add the new expense.";
    assertEquals(message, mk_object.help.getHelpMessage(Expenses.class));
  }
  
  // Test getHelpMessage() to ensure you obtain the correct message when passing in the Investments class.
  @Test (timeout=2000) public void test_Help_3Investments(){
    String message = "The Investments feature suggests multiple investments options based on your current income, total expenses and (any) student loan amount."; 
    assertEquals(message, mk_object.help.getHelpMessage(Investments.class));
  }
  
  
  // Test getHelpMessage() to ensure you obtain the correct message when passing in the StudentDebt class.
  @Test (timeout=20000) public void test_Help_4StudentDebt(){
    String message = "The Student Debt feature allows you to enter multiple student loans to your Financial Planner.\nTo add a new loan, please enter the amount of loan you took out and the type of loan.\nFinally, click 'Add Loan' to add the new loan."; 
    assertEquals(message, mk_object.help.getHelpMessage(StudentDebt.class));
  }
  
}