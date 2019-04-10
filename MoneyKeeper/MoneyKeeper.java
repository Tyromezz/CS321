import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoneyKeeper {
	
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
		Incomes inc = new Incomes(incomePanel);
		
		
		
		/*
		 * 
		 *  This is a basic new button, it creates a new internal class to re-define what to do when the button is pressed.
		 *  
		JButton addInc = new JButton("Add Income");
		addInc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JLabel newIncome = new JLabel((String)incms.getSelectedItem());
				//JTextField newIncomeAmt = new JTextField(incomeAmmt.getText(),8);
				JTextArea newAmmt = new JTextArea(incomeAmmt.getText(), 1, 8);
				
				incomePanel.add(newIncome);
				incomePanel.add(newAmmt);
				incomePanel.updateUI();
			}
		});
		incomePanel.add(addInc);
		*/
		
		
		
		//Create the second JPanel. Add a JLabel and JList and
		//make use the JPanel is not visible.
		final JPanel expensePanel = new JPanel();
		expensePanel.setVisible(false);
		JLabel listLbl = new JLabel("Expenses:");
		JList expns = new JList(expenses);
		expns.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		expensePanel.add(listLbl);
		expensePanel.add(expns);
		
		
		JButton changeScreen = new JButton("Incomes or Expenses");
		changeScreen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				expensePanel.setVisible(!expensePanel.isVisible());
				incomePanel.setVisible(!incomePanel.isVisible());
			}
		});
		
		//The JFrame uses the BorderLayout layout manager.
		//Put the two JPanels and JButton in different areas.
		guiFrame.add(incomePanel, BorderLayout.NORTH);
		guiFrame.add(expensePanel, BorderLayout.CENTER);
		guiFrame.add(changeScreen, BorderLayout.SOUTH);
		//make sure the JFrame is visible
		guiFrame.setVisible(true);
	}
}
