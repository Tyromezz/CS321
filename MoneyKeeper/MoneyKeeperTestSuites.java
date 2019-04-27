import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import java.util.Arrays.*;

public class MoneyKeeperTestSuites {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("MoneyKeeperTests",  // Testing for MoneyKeeper class. various methods etc.
                                    "IncomesTests",
                                    "ExpensesTests",
                                    "StudentDebtTests",
                                    "InvestmentsTests",
                                    "HelpTests"
                                   );
  }
}
