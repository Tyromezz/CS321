import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class InvestmentsTests {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("InvestmentsTests");
  }
  
  static MoneyKeeper mk_object = new MoneyKeeper(); 

  
  
  // Investments Tests
  @Test (timeout=2000) public void test_Investments_1(){ assertEquals("You have a total of $0 free to use in your account.\nCurrently, we do not suggest you invest your money in anything.", mk_object.invest.investmentSuggestion()); }

}