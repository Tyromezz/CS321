import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class StudentDebt {
    private JPanel studentDebt;
    private ArrayList<Integer> studentDebtArray = new ArrayList<>();

    public StudentDebt (JPanel i) {
        this.studentDebt = i;

        // Student Type Option? We will be having the user type in a School name that they owe money to
        String[] studentDebtSchool = { "School"}; // probably wont need this

        JLabel debtLabel = new JLabel ("School:"); // Labels the array, probably won't need bc array isn't needed
        JComboBox expns = new JComboBox (studentDebtSchool);
        JLabel debtCostLabel = new JLabel ("Debt Amount:");
        JTextField debtAmmt = new JTextField(8);

        // add name of school and the debt amount
        this.studentDebt.add (debtCostLabel);
        this.studentDebt.add (debtAmmt);
        this.studentDebt.add (debtLabel);
        this.studentDebt.add (expns);

        JButton addDebt2 = new JButton ("Add Debt (School)");
        addDebt2.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent event) {
                addDebt();
            }
        });
        this.studentDebt.add (addDebt2);

        JButton sumDebt = new JButton ("Sum Expenses");
        sumDebt.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent event) {
                sumStudentDebt();
            }
        });
        this.studentDebt.add (sumDebt);

    }

    public int sumStudentDebt() {
        int sum = 0;
        for (int i : this.studentDebtArray) {
            sum += i;
        }

        System.out.println (sum);

        return sum;
    }

    public int addDebt() {

        // System.out.println (this.expenses.getComponent(3));

        String name = (String) ( (JComboBox)  this.studentDebt.getComponent(3)).getSelectedItem();
        String ammt = (String) ( (JTextField) this.studentDebt.getComponent(1)).getText().trim();
        JLabel newExpense = new JLabel (name);
        JTextArea newAmmt = new JTextArea (ammt, 1, 8);

        this.studentDebt.add (newExpense);
        this.studentDebt.add (newAmmt);
        this.studentDebt.updateUI();

        //System.out.println (ammt + ".");
        Integer expenseAmmt = Integer.parseInt (ammt);
        //System.out.println (expenseAmmt);
        //this.studentDebt.add(expenseAmmt);

        return expenseAmmt;
    }
}
