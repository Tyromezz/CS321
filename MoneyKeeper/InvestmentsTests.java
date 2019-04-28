import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class InvestmentsTests {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("InvestmentsTests");
  }
  
  static MoneyKeeper mk_object = new MoneyKeeper(); 

  
  
  // Investments Tests. Test only method in Investments, investmentSuggestion() method. 
  // Condition we are testing: (deltaValue <= 0). With no income or expenses added, test preliminary attributes. 
  @Test (timeout=2000) public void test_Investments_1(){ 
    String message = "You have a total of $0 free to use in your account.\nCurrently, we do not suggest you invest your money in anything.";
    assertEquals(message, mk_object.invest.investmentSuggestion());
  
  }
  
  // Investments Tests. test investmentSuggestion() method. Condition we are testing: (deltaValue <= 0)
  @Test (timeout=2000) public void test_Investments_2(){
    String message = "You have a total of $0 free to use in your account.\nCurrently, we do not suggest you invest your money in anything.";
    mk_object.inc.addIncome(100000);
    mk_object.exp.addExpense(1000);
    mk_object.exp.addExpense(500);
    mk_object.exp.addExpense(98500);  //Delta should be 0. 
    assertEquals(message, mk_object.invest.investmentSuggestion());
  
  }
  
  
   // Investments Tests. test investmentSuggestion() method. Condition we are testing: (deltaValue > 0 && deltaValue <= 1000) & NO DEBT.
  @Test (timeout=2000) public void test_Investments_3(){
    MoneyKeeper mk_object3 = new MoneyKeeper();
    String message = "You have a total of $1000 free to use in your account.\nYou may want to invest your money in small shares of the stock market, real estate, capital or gold.";
    mk_object3.inc.addIncome(100000);
    mk_object3.exp.addExpense(1000);
    mk_object3.exp.addExpense(500); 
    mk_object3.exp.addExpense(97500); //Delta should be 1000.   
    assertEquals(message, mk_object3.invest.investmentSuggestion());
  
  }
  
  // Investments Tests.  Condition we are testing: (deltaValue > 0 && deltaValue <= 1000) & DEBT.
  @Test (timeout=2000) public void test_Investments_4(){
    MoneyKeeper mk_object4 = new MoneyKeeper();
    String message = "You have a total of $1000 free to use in your account.\nYou also have $977 in student debt. We suggest that you invest this money into paying off your loans.\nThe remaining (if any) can be used in smaller investments like stocks.";
    mk_object4.inc.addIncome(100000);
    mk_object4.exp.addExpense(1000);
    mk_object4.exp.addExpense(500); 
    mk_object4.exp.addExpense(97500); //Delta should be 1000. 
    mk_object4.debt.addDebt(977);
    
    assertEquals(message, mk_object4.invest.investmentSuggestion());
  }
  
  // Investments Test. test investmentSuggestion() method. Condition we are testing: (delta > 1000) & NO DEBT
  // Can put more money into larger investments.
  @Test (timeout=2000) public void test_Investments_5(){
    MoneyKeeper mk_object4 = new MoneyKeeper();
    String message = "You have a total of $98500 free to use in your account.\nYou may want to invest this money in the stock market, real estate, capital or gold.";    
    mk_object4.inc.addIncome(100000);
    mk_object4.exp.addExpense(1000);
    mk_object4.exp.addExpense(500); //Delta should be 98500.
    
    assertEquals(message, mk_object4.invest.investmentSuggestion());
  }
  
  
  // Investments Test. test investmentSuggestion() method. Condition we are testing: (delta > 1000) & DEBT
  // They have debt with large amount of savings. Suggest to invest in paying off student debt first. 
  @Test (timeout=2000) public void test_Investments_6(){
    MoneyKeeper mk_object4 = new MoneyKeeper();
    String message = "You have a total of $98500 free to use in your account.\nYou also have $32177 in student debt. We suggest that you invest this money into paying off your loans first.\nThe remaining (if any) can be used in investments like stocks, real estate or capital.";
    mk_object4.inc.addIncome(100000);
    mk_object4.exp.addExpense(1000);
    mk_object4.exp.addExpense(500); //Delta should be 98500.
    mk_object4.debt.addDebt(10943);
    mk_object4.debt.addDebt(21234); //Total Debt: 32177
    
    assertEquals(message, mk_object4.invest.investmentSuggestion());
  }
  
  
  

}