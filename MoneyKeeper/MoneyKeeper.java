import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;

public class MoneyKeeper {
 public ArrayList<JPanel> panelList = new ArrayList<>();
 public Incomes inc;
 public Expenses exp;
 public Investments invest;
 public Help help;
 public StudentDebt debt;
 
 public static void main(String[] args) {
  new MoneyKeeper();
 }

 public MoneyKeeper() {
  JFrame guiFrame = new JFrame();
  guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  guiFrame.setTitle("MoneyKeeper");
  guiFrame.setSize(850, 800);
  //This will center the JFrame in the middle of the screen
  guiFrame.setLocationRelativeTo(null);
 
  //Expense Options
  String[] expenses = { "Rent", "Gas", "Insurance", "Food", "Utilities", "Entertainment"};
  
  //The first JPanel instantiates an Incomes Class
  JPanel incomePanel = new JPanel();
  this.inc = new Incomes(incomePanel);
  this.panelList.add(incomePanel);
  this.help = new Help();
  
  
  
  //The second JPanel instantiates an Expenses Class
  //make suse the JPanel is not visible at start.
  JPanel expensePanel = new JPanel();
  this.exp = new Expenses(expensePanel);
  this.panelList.add(expensePanel);
  expensePanel.setVisible(false);
  
  
  //The second JPanel instantiates an Investments Class
  //make suse the JPanel is not visible at start.
  JPanel investmentPanel = new JPanel();
  this.invest = new Investments(investmentPanel, this);
  this.panelList.add(investmentPanel);
  investmentPanel.setVisible(false);
  
  
  //The second JPanel instantiates an Student Debt Class
  //make suse the JPanel is not visible at start.
  JPanel studentDebtPanel = new JPanel();
  this.debt = new StudentDebt(studentDebtPanel);
  this.panelList.add(studentDebtPanel);
  studentDebtPanel.setVisible(false);
  
  
  JButton expenseScreen = new JButton("Expenses");
  expenseScreen.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
    expensePanel.setVisible(true);
    incomePanel.setVisible(false);
    investmentPanel.setVisible(false);
    
   }
  });
  
  JButton incomeScreen = new JButton("Incomes");
  incomeScreen.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
    expensePanel.setVisible(false);
    incomePanel.setVisible(true);
    investmentPanel.setVisible(false);
    studentDebtPanel.setVisible(false);
   }
  });
  
  
  JButton investmentButton = new JButton("Investments");
  investmentButton.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
     expensePanel.setVisible(false);
     incomePanel.setVisible(false);
     investmentPanel.setVisible(true);
     studentDebtPanel.setVisible(false);
    
     
     }
  });
  
  JButton studentDebtButton = new JButton("Student Debt");
  studentDebtButton.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
     expensePanel.setVisible(false);
     incomePanel.setVisible(false);
     investmentPanel.setVisible(false);
     studentDebtPanel.setVisible(true);
     }
  });
  
  
  
  JButton helpButton = new JButton("Help");
  helpButton.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
     //System.out.println(incomePanel.isVisible());
     //System.out.println(expensePanel.isVisible());
     //System.out.println(investmentPanel.isVisible());
     //System.out.println(studentDebtPanel.isVisible()); 
     String message = "";
     
     if (incomePanel.isVisible()){
       message = help.getHelpMessage(Incomes.class);
     }
     else if (expensePanel.isVisible()){
       
       message = help.getHelpMessage(Expenses.class);
     }
     
     else if (investmentPanel.isVisible()){
       
       message = help.getHelpMessage(Investments.class);
     }
     
     else if (studentDebtButton.isVisible()){
      message = help.getHelpMessage(StudentDebt.class);
     }
     
     // Display the appropriate help message as a seperate dialog box.
     JOptionPane.showMessageDialog(null, message, "Help Display", JOptionPane.INFORMATION_MESSAGE);
     
     
   }
   
  });
  
 
  
  JPanel buttonPanel = new JPanel();
  buttonPanel.add(incomeScreen);
  buttonPanel.add(expenseScreen);
  buttonPanel.setLayout(new FlowLayout());
  buttonPanel.add(helpButton);
  buttonPanel.add(investmentButton);
  buttonPanel.add(studentDebtButton);
  guiFrame.add(buttonPanel, BorderLayout.SOUTH);
  
  

  
  //The JFrame uses the BorderLayout layout manager.
  //Put the two JPanels and JButton in different areas.
  guiFrame.setLayout(new FlowLayout());
  guiFrame.add(incomePanel, BorderLayout.CENTER);
  guiFrame.add(expensePanel, BorderLayout.CENTER);
  guiFrame.add(investmentPanel, BorderLayout.CENTER);
  guiFrame.add(studentDebtPanel, BorderLayout.CENTER);
  //guiFrame.add(expenseScreen, BorderLayout.SOUTH);
  //guiFrame.add(incomeScreen, BorderLayout.SOUTH);
  //make sure the JFrame is visible
  guiFrame.setVisible(true);
 }
    // Calculate the difference between income and expenses. Used in multiple
 // functions throughout the application. Allows program to plan for various extra investments,
 // suggest student debt pay off plan etc. 
 public int calculateDelta() {
   int delta = this.inc.sumIncomes() - this.exp.sumExpenses();
   return delta;
 }
}
