import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Expenses {
 private JPanel expenses;
 private ArrayList<Integer> expenseArray = new ArrayList<>();
 
 public Expenses (JPanel i) {
  this.expenses = i;
  
  // Expense Type Option
  String[] expenseOps = { "Rent", "Gas", "Insurance", "Food", "Utilities", "Entertainment", "Other"};
  
  JLabel expenseLabel = new JLabel ("Expenses:");
  JComboBox expns = new JComboBox (expenseOps);
  JLabel costLabel = new JLabel ("Cost (No commas):");
  JTextField expenseAmmt = new JTextField(8);
  
  this.expenses.add (costLabel);
  this.expenses.add (expenseAmmt);
  this.expenses.add (expenseLabel);
  this.expenses.add (expns);
  
  JButton addExp2 = new JButton ("Add Expense");
  addExp2.addActionListener (new ActionListener() {
   @Override
   public void actionPerformed (ActionEvent event) {
    addExpense();
   }
  });
  this.expenses.add (addExp2);
  
  JButton sumExp = new JButton ("Sum Expenses");
  sumExp.addActionListener (new ActionListener() {
   @Override
   public void actionPerformed (ActionEvent event) {
    sumExpenses();
   }
  });
  this.expenses.add (sumExp);
  
 }
 
 public int sumExpenses() {
  int sum = 0;
  for (int i : this.expenseArray) {
   sum += i;
  }
  
  System.out.println (sum);
        JPanel sumPanel = new JPanel();
        JLabel incomeSum1 = new JLabel("Expenses Sum: $");
        JLabel incomeSum2 = new JLabel(Integer.toString(sum));
        sumPanel.add(incomeSum1);
        sumPanel.add(incomeSum2);
        this.expenses.add(sumPanel);
        this.expenses.updateUI();
  
  return sum;
 }
 
 public int addExpense() {
  
  // System.out.println (this.expenses.getComponent(3));
  
  String name = (String) ( (JComboBox)  this.expenses.getComponent(3)).getSelectedItem();
  String ammt = (String) ( (JTextField) this.expenses.getComponent(1)).getText().trim();
  JLabel newExpense = new JLabel (name);
  JTextArea newAmmt = new JTextArea (ammt, 1, 8);
  
  this.expenses.add (newExpense);
  this.expenses.add (newAmmt);
  this.expenses.updateUI();
  
  //System.out.println (ammt + ".");
  Integer expenseAmmt = Integer.parseInt (ammt);
  //System.out.println (expenseAmmt);
  this.expenseArray.add(expenseAmmt);
  
  return expenseAmmt;
 }
 
 
 // Overloaded addExpense() function to accept a specified input. Used in testing our code. 
 public int addExpense(int ammt) {
   
  Integer expenseAmmt = ammt;
  this.expenseArray.add(expenseAmmt);
  
  return expenseAmmt;
 }
 
}
