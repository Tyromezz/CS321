import javax.swing.*;

public class Incomes {
	JPanel incomes;
	
	
	public Incomes(JPanel i) {
		this.incomes = i;
		
	}
	
	public int getIncome() {
		
		//System.out.println(this.incomes.getComponent(0));
		this.incomes.revalidate();
		System.out.println(this.incomes.getComponentCount());
		return 0;
		
	}
	
	public int addIncome(String name, String ammt) {
		JLabel newIncome = new JLabel(name);
		JTextArea newAmmt = new JTextArea(ammt, 1, 8);
		//System.out.println(name + ", " + ammt);
		
		this.incomes.add(newIncome);
		this.incomes.add(newAmmt);
		this.incomes.updateUI();
		
		return Integer.getInteger(ammt);
	}
	
}
