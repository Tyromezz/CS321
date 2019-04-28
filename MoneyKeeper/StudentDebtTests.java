import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class StudentDebtTests {
    public static void main(String args[]){
        org.junit.runner.JUnitCore.main("StudentDebtTests");
    }

    static MoneyKeeper mk_object = new MoneyKeeper();

    // Student Debt addDebt Test
    @Test (timeout=2000) public void test_StudentDebt_1() {
        MoneyKeeper mk_object2 = new MoneyKeeper();
        assertEquals(0, mk_object2.debt.addDebt(0));
        assertEquals(100, mk_object2.debt.addDebt(100));
    }

    // Student Debt sumDebt Test
    @Test (timeout=2000) public void test_StudentDebt_2(){
        assertEquals(0, mk_object.debt.sumStudentDebt());
        mk_object.debt.addDebt(50);
        assertEquals(50, mk_object.debt.sumStudentDebt());
        mk_object.debt.addDebt(112);
        assertEquals(162, mk_object.debt.sumStudentDebt());
        mk_object.debt.addDebt(28974);
        assertEquals(29136, mk_object.debt.sumStudentDebt());
    }

}
