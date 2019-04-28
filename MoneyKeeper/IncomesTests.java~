import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class IncomesTests {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("IncomesTests");
  }
  
  static MoneyKeeper mk_object = new MoneyKeeper(); 

  
  
  // Incomes Tests
  @Test (timeout=2000) public void test_Incomes_1(){ 
    assertEquals(0, mk_object.inc.sumIncomes()); 
  }
  
  // Test if AddIncome() function works as intended.
  @Test (timeout=2000) public void test_Incomes_2(){ 
    MoneyKeeper mk_ob2 = new MoneyKeeper();
    assertEquals(100000, mk_ob2.inc.addIncome(100000));
    assertEquals(5000, mk_ob2.inc.addIncome(5000)); 
  }
  
  // Test if sumIncomes() works as intended. Multiple amounts.
  @Test (timeout=2000) public void test_Incomes_3(){ 
    mk_object.inc.addIncome(100000);
    mk_object.inc.addIncome(5000);
    mk_object.inc.addIncome(50);
    assertEquals(105050, mk_object.inc.sumIncomes());
  }
  
  // Test if sumIncomes() works as intended. See if it can handle a higher load of income inputs.
  @Test (timeout=2000) public void test_Incomes_4(){ 
    MoneyKeeper mk_object4 = new MoneyKeeper();
    mk_object4.inc.addIncome(100000);
    mk_object4.inc.addIncome(5000);
    mk_object4.inc.addIncome(50);
    mk_object4.inc.addIncome(150);
    mk_object4.inc.addIncome(70000);
    mk_object4.inc.addIncome(4000);
    mk_object4.inc.addIncome(7777);
    mk_object4.inc.addIncome(111111);
    mk_object4.inc.addIncome(9032);
    mk_object4.inc.addIncome(529);
    mk_object4.inc.addIncome(777347);
    assertEquals(1084996, mk_object4.inc.sumIncomes());
  }
  
  
  
  

}