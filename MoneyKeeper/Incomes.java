import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Incomes {
	JPanel incomes;
	
	
	public Incomes(JPanel i) {
		this.incomes = i;
		
		//Income Type Options
		String[] incomeOps = { "Primary Job", "Second Job", "Side Job", "Hobby", "Other"};
	
		
		JLabel incomeLabel = new JLabel("Incomes:");
		JComboBox incms = new JComboBox(incomeOps);
		JLabel priIncome = new JLabel("Primary income:");
		JTextField incomeAmmt = new JTextField(8);
		
		
		this.incomes.add(priIncome);
		this.incomes.add(incomeAmmt);
		this.incomes.add(incomeLabel);
		this.incomes.add(incms);
		
		JButton addInc2 = new JButton("Add Inc Class Call");
		addInc2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				addIncome("Hello", "1202");
			}
		});
		this.incomes.add(addInc2);
		
		
	}
	
	public int getIncome() {
		
		//System.out.println(this.incomes.getComponent(0));
		this.incomes.revalidate();
		System.out.println(this.incomes.getComponentCount());
		return 0;
		
	}
	
	public int addIncome(String name, String ammt) {
		
		//System.out.println(this.incomes.getComponent(3));
		
		name = (String)((JComboBox) this.incomes.getComponent(3)).getSelectedItem();
		ammt = (String)((JTextField)this.incomes.getComponent(1)).getText();
		JLabel newIncome = new JLabel(name);
		JTextArea newAmmt = new JTextArea(ammt, 1, 8);
		//System.out.println(name + ", " + ammt);
		
		this.incomes.add(newIncome);
		this.incomes.add(newAmmt);
		this.incomes.updateUI();
		
		return 0;
	}	
	
}
