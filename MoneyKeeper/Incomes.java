import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.*;

public class Incomes {
 private JPanel incomes;
 private ArrayList<Integer> incomeArray = new ArrayList<>();
 
 
 public Incomes(JPanel i) {
  this.incomes = i;
  
  
  //Income Type Options
  String[] incomeOps = { "Primary Job", "Second Job", "Side Job", "Hobby", "Other"};
 
  
  JLabel incomeLabel = new JLabel("Incomes:");
  JComboBox incms = new JComboBox(incomeOps);
  JLabel priIncome = new JLabel("Primary income (No commas):");
  JTextField incomeAmmt = new JTextField(8);
  
  
  this.incomes.add(priIncome);
  this.incomes.add(incomeAmmt);
  this.incomes.add(incomeLabel);
  this.incomes.add(incms);
  
  JButton addInc2 = new JButton("Add Income");
  addInc2.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
    addIncome();
   }
  });
  this.incomes.add(addInc2);
  
  
  JButton sumInc = new JButton("Sum Incomes");
  sumInc.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
    sumIncomes();
   }
  });
  this.incomes.add(sumInc);
  
  
 }
 
 public int sumIncomes() {
  int sum = 0;
  for (int i : this.incomeArray) {
   sum += i;
  }
  
  System.out.println(sum);
  
  JPanel sumPanel = new JPanel();
  JLabel incomeSum1 = new JLabel("Income Sum:");
  JLabel incomeSum2 = new JLabel(Integer.toString(sum));
  sumPanel.add(incomeSum1);
  sumPanel.add(incomeSum2);
  this.incomes.add(sumPanel);
  this.incomes.updateUI();
  JOptionPane.showMessageDialog(null, sum, "Sum Expense Display", JOptionPane.INFORMATION_MESSAGE);
  return sum;
 }
 
 
 public int addIncome() {
  
  //System.out.println(this.incomes.getComponent(3));
  
  String name = (String)((JComboBox) this.incomes.getComponent(3)).getSelectedItem();
  String ammt = (String)((JTextField)this.incomes.getComponent(1)).getText().trim();
  JLabel newIncome = new JLabel(name);
  JTextArea newAmmt = new JTextArea(ammt, 1, 8);
  
  this.incomes.add(newIncome);
  this.incomes.add(newAmmt);
  this.incomes.updateUI();
  
  //System.out.println(ammt+".");
  Integer incomeAmmt = Integer.parseInt(ammt);
  //System.out.println(incomeAmmt);
  this.incomeArray.add(incomeAmmt);
  
  return incomeAmmt;
 } 
 
 

}
