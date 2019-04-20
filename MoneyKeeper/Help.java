import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.*;

public class Help {
 //private Object requestedClass;
 
 // Help Constructor.
 public Help() {
   //this.requestedClass = c;
 }
 
 
 public String getHelpMessage(Object requestedClass) {
   String message = "";
   if (requestedClass == Expenses.class) {
     //Display Instructions for Expenses Class. 
     message = "The Expenses feature allows you to add planned and unplanned expenses to your Financial Planner.\n To add a new expense, please enter the cost of the expense.\nThen select the type of expense by choosing from the expenses drop-down menu.\nFinally, click 'Add Expense' to add the new expense.";
   }
   
   else if (requestedClass == Incomes.class){
     System.out.println("GOT HERE");
     //Display Instructions for Incomes Class. 
     message = "The Incomes feature allows you to add multiple streams of incomes (Primary, Secondary, Side Job, Hobby, Other) to your Financial Planner.\n To add a new income, please enter the amount of money you make.\nThen select the type of income by choosing from the drop-down menu.\nFinally, click 'Add Income' to add the new income.";
   }
   
   else if (requestedClass == StudentDebt.class){
     //Display Instructions for Student Debt Class. 
     message = "The Student Debt feature allows you to enter multiple student loans to your Financial Planner.\n To add a new loan, please enter the amount of load you took out.\nThen select the type of loan by choosing from the loans drop-down menu.\nFinally, click 'Add Loan' to add the new loan."; 
   }
   
   else if (requestedClass == Investments.class) {
     // Display Instructions for Investments Class. We might not need this as Investments is something the 
     // program decides based on how much money you have available to spend, your student debt amount etc. 
     message = "The Investments feature suggests multiple investments options based on your current income, total expenses and student loan amount."; 
   }
   
   JOptionPane.showMessageDialog(null, message, "Help Display", JOptionPane.INFORMATION_MESSAGE);
   
   
   return message;
 }
 
}
