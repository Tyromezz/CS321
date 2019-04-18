import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class StudentDebt {
	private JPanel debts;
	private ArrayList<Integer> debtArray = new ArrayList<>();
	
	public StudentDebt (JPanel i) {
		this.debts = i;
		
		// Debt Type Options
		String[] debtOps = { "Primary Debt", "Second Debt"};
		
		JLabel debtLabel = new JLabel ("Debts:");
		JComboBox debts = new JComboBox (debtOps);
		JLabel priDebt = new JLabel ("Primary debt:");
		JTextField debtAmmt = new JTextField(8);
		
		this.debts.add(priDebt);
		this.debts.add(debtAmmt);
		this.debts.add(debtLabel);
		this.debts.add(debts);
		
		JButton addDpt2 = new JButton ("Add Dpt Class CAll");
		addDpt2.addActionListener (new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent event) {
				addDebt();
			}
		});
		this.debts.add (addDpt2);
		
		JButton sumDpt = new JButton ("Sum Debts");
		sumDpt.addActionListener (new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent event) {
				sumDebts();
			}
		});
		this.debts.add (sumDpt);
	}
	
	public int sumDebts() {
		int sum = 0;
		for (int i : this.debtArray) {
			sum += i;
		}
		
		System.out.println (sum);
		
		return sum;
	}
	
	public int addDebt() {
		
		// System.out.println (this.debts.getComponent(3));
		
		String name = (String) ((JComboBox)  this.debts.getComponent(3)).getSelectedItem();
		String ammt = (String) ((JTextField) this.debts.getComponent(1)).getText().trim();
		JLabel newDebt = new JLabel (name);
		JTextArea newAmmt = new JTextArea (ammt, 1, 8);
		
		this.debts.add(newDebt);
		this.debts.add(newAmmt);
		this.debts.updateUI();
		
		// System.out.println (ammt + ".");
		Integer debtAmmt = Integer.parseInt (ammt);
		// System.out.println (debtAmmt);
		this.debtArray.add (debtAmmt);
		
		return debtAmmt;
	}

}
