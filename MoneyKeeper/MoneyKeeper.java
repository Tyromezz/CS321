import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class MoneyKeeper {
 
 public ArrayList<JPanel> panelList = new ArrayList<>();
  public Incomes inc;
 public Expenses exp;
 public Help help;
 
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
  
  
  
  JButton expenseScreen = new JButton("Expenses");
  expenseScreen.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
    expensePanel.setVisible(true);
    incomePanel.setVisible(false);
   }
  });
  
  JButton incomeScreen = new JButton("Incomes");
  incomeScreen.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
    expensePanel.setVisible(false);
    incomePanel.setVisible(true);
   }
  });
  
  JButton helpButton = new JButton("Help");
  incomeScreen.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent event) {
     if (incomePanel.isVisible()){
       help.getHelpMessage(Incomes.class);
     }}
  });
  
  
 
  
  JPanel buttonPanel = new JPanel();
  buttonPanel.add(incomeScreen);
  buttonPanel.add(expenseScreen);
  buttonPanel.setLayout(new FlowLayout());
  buttonPanel.add(helpButton);
  guiFrame.add(buttonPanel, BorderLayout.SOUTH);
  
  

  
  //The JFrame uses the BorderLayout layout manager.
  //Put the two JPanels and JButton in different areas.
  guiFrame.setLayout(new FlowLayout());
  guiFrame.add(incomePanel, BorderLayout.CENTER);
  guiFrame.add(expensePanel, BorderLayout.CENTER);
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
