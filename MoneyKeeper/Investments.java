import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Investments {
	private JPanel invests;
	private ArrayList<Integer> investArray = new ArrayList<>();
	
	public Investments (JPanel i) {
		this.invests = i;
		
		// Investment Type Options
		String[] investOps = {"Primary Investment", "Second Investement"};
		
		JLabel 	   investLabel = new JLabel    ("Investments: "); 
		JComboBox  invts   	   = new JComboBox (investOps);
		JLabel 	   priInvest   = new JLabel    ("Primary investment: ");
		JTextField investAmmt  = new JTextField(8);
		
		this.invests.add (priInvest);
		this.invests.add (investAmmt);
		this.invests.add (investLabel);
		this.invests.add (invts);
		
		JButton addInv2 = new JButton ("Add Inv Class Call");
		addInv2.addActionListener (new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent event) {
				addInvest();
			}
		});
		this.invests.add(addInv2);
	}
	
	public int sumInvests() {
		int sum = 0;
		for (int i : this.investArray) {
			sum += i;
		}
		
		System.out.println(sum);
		
		return sum;
	}
	
	public int addInvest() {
		
		// System.out.println (this.invests.getComponent(3));
		
		String name = (String) ( (JComboBox)  this.invests.getComponent(3)).getSelectedItem();
		String ammt = (String) ( (JTextField) this.invests.getComponent(1)).getText().trim();
		JLabel newInvest  = new JLabel 	  (name);
		JTextArea newAmmt = new JTextArea (ammt, 1, 8);
		
		this.invests.add (newInvest);
		this.invests.add (newAmmt);
		this.invests.updateUI();
		
		// System.out.println (ammt + ".");
		Integer investAmmt = Integer.parseInt(ammt);
		// System.out.println (investAmmt);
		this.investArray.add (investAmmt);
		
		return investAmmt;
	}
}
