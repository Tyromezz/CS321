import javax.swing.*;

public class Incomes {
	JPanel incomes;
	
	
	public Incomes(JPanel i) {
		this.incomes = i;
		
	}
	
	public int getIncome() {
		System.out.println(this.incomes.getComponent(0));
		return 0;
		
	}
	
}
