import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class MoneyKeeperTests {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("MoneyKeeperTests");
  }
  
  static MoneyKeeper mk_object = new MoneyKeeper(); 

  
  // Money Keeper Tests
  @Test (timeout=2000) public void test_MoneyKeeper_setup1(){
	  //verify initial setup of variables is correct
	  assert(mk_object.panelList.toString().contains("JPanel"));
	  assertEquals(mk_object.panelList.size(), 4);
	  
  }
  

 @Test (timeout=2000) public void test_MoneyKeeper_calculateDelta(){
	 mk_object.inc.addIncome(500);
	 mk_object.exp.addExpense(400);
	 assertEquals(mk_object.calculateDelta(), 100);
	  
 }
 
 
 @Test (timeout=2000) public void test_MoneyKeeper_calculateDeltaNeg(){
	 mk_object = new MoneyKeeper();
	 mk_object.inc.addIncome(500);
	 mk_object.exp.addExpense(600);
	 assertEquals(mk_object.calculateDelta(), -100);
	  
 }
 
 
 @Test (timeout=2000) public void test_MoneyKeeper_calculateDeltaZero(){
	 mk_object = new MoneyKeeper();
	 mk_object.inc.addIncome(500);
	 mk_object.exp.addExpense(500);
	 assertEquals(mk_object.calculateDelta(), 0);
	  
 }
 
 @Test (timeout=2000) public void test_MoneyKeeper_calculateDeltaSetup(){
	 mk_object = new MoneyKeeper();
	 assertEquals(mk_object.calculateDelta(), 0);
 }

}