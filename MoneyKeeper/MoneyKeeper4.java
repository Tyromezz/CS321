/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author triun
 */
public class MoneyKeeper4 extends javax.swing.JFrame {

    /**
     * Creates new form moneyKeeper4
     */
    public MoneyKeeper4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        Incomes = new javax.swing.JButton();
        Expenses = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Investments = new javax.swing.JButton();
        Debt = new javax.swing.JButton();
        incomePanel = new javax.swing.JPanel();
        income = new javax.swing.JLabel();
        incomeAmount = new javax.swing.JTextField();
        IncomeType = new javax.swing.JLabel();
        IncomeTypes = new javax.swing.JComboBox<>();
        addIncome = new javax.swing.JButton();
        sumIncome = new javax.swing.JButton();
        incomeStatus = new javax.swing.JScrollPane();
        incomes = new javax.swing.JTextArea();
        expensePanel = new javax.swing.JPanel();
        expense = new javax.swing.JLabel();
        expenseAmount = new javax.swing.JTextField();
        expenseType = new javax.swing.JLabel();
        expenseTypes = new javax.swing.JComboBox<>();
        addExpense = new javax.swing.JButton();
        sumExpense = new javax.swing.JButton();
        expenseStatus = new javax.swing.JScrollPane();
        expenses = new javax.swing.JTextArea();
        investPanel = new javax.swing.JPanel();
        invest = new javax.swing.JLabel();
        investAmount = new javax.swing.JTextField();
        InvestType = new javax.swing.JLabel();
        InvestTypes = new javax.swing.JComboBox<>();
        addInvest = new javax.swing.JButton();
        sumInvest = new javax.swing.JButton();
        investStatus = new javax.swing.JScrollPane();
        invests = new javax.swing.JTextArea();
        SuggestInvest = new javax.swing.JButton();
        debtPanel = new javax.swing.JPanel();
        debt = new javax.swing.JLabel();
        debtAmount = new javax.swing.JTextField();
        schoolType = new javax.swing.JLabel();
        schoolTypes = new javax.swing.JComboBox<>();
        addDebt = new javax.swing.JButton();
        sumDebt = new javax.swing.JButton();
        debtStatus = new javax.swing.JScrollPane();
        debts = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Money Keeper");

        Incomes.setText("Incomes");
        Incomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomesActionPerformed(evt);
            }
        });

        Expenses.setText("Expenses");
        Expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpensesActionPerformed(evt);
            }
        });

        Help.setText("Help");

        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        Investments.setText("Investments");
        Investments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvestmentsActionPerformed(evt);
            }
        });

        Debt.setText("Student Depts");
        Debt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Incomes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Expenses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Help)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remove)
                .addGap(10, 10, 10)
                .addComponent(Investments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Debt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Incomes)
                    .addComponent(Expenses)
                    .addComponent(Help)
                    .addComponent(Investments)
                    .addComponent(Debt)
                    .addComponent(Remove))
                .addContainerGap())
        );

        income.setText("Income (No comma): ");

        incomeAmount.setToolTipText("");

        IncomeType.setText("Income Types: ");

        IncomeTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primary Job", "Secondary Job", "Side Job", "Hobby", "Other" }));

        addIncome.setText("Add Income");

        sumIncome.setText("Sum Incomes");
        sumIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumIncomeActionPerformed(evt);
            }
        });

        incomes.setColumns(20);
        incomes.setRows(5);
        incomeStatus.setViewportView(incomes);

        javax.swing.GroupLayout incomePanelLayout = new javax.swing.GroupLayout(incomePanel);
        incomePanel.setLayout(incomePanelLayout);
        incomePanelLayout.setHorizontalGroup(
            incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incomePanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addIncome)
                    .addGroup(incomePanelLayout.createSequentialGroup()
                        .addComponent(IncomeType)
                        .addGap(18, 18, 18)
                        .addComponent(IncomeTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sumIncome)
                    .addGroup(incomePanelLayout.createSequentialGroup()
                        .addComponent(income)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(incomeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        incomePanelLayout.setVerticalGroup(
            incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incomePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(incomeStatus)
                    .addGroup(incomePanelLayout.createSequentialGroup()
                        .addGroup(incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(incomeAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(income, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IncomeType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IncomeTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(addIncome)
                        .addGap(26, 26, 26)
                        .addComponent(sumIncome)))
                .addGap(82, 82, 82))
        );

        expense.setText("Expense:");

        expenseAmount.setToolTipText("");

        expenseType.setText("Expense Type: ");

        expenseTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rent", "Gas", "Insurance", "Food", "Utilities", "Entertainment", "Other" }));

        addExpense.setText("Add Expense");

        sumExpense.setText("Sum Expenses");

        expenses.setColumns(20);
        expenses.setRows(5);
        expenseStatus.setViewportView(expenses);

        javax.swing.GroupLayout expensePanelLayout = new javax.swing.GroupLayout(expensePanel);
        expensePanel.setLayout(expensePanelLayout);
        expensePanelLayout.setHorizontalGroup(
            expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expensePanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addExpense)
                    .addGroup(expensePanelLayout.createSequentialGroup()
                        .addComponent(expenseType)
                        .addGap(18, 18, 18)
                        .addComponent(expenseTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(expensePanelLayout.createSequentialGroup()
                        .addComponent(expense)
                        .addGap(18, 18, 18)
                        .addComponent(expenseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sumExpense))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expenseStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        expensePanelLayout.setVerticalGroup(
            expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expensePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(expenseStatus)
                    .addGroup(expensePanelLayout.createSequentialGroup()
                        .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(expenseAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(expense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(expensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expenseType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expenseTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(addExpense)
                        .addGap(26, 26, 26)
                        .addComponent(sumExpense)))
                .addGap(73, 73, 73))
        );

        invest.setText("Investment: ");

        investAmount.setToolTipText("");

        InvestType.setText("Investment Type: ");

        InvestTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addInvest.setText("Add Investment");

        sumInvest.setText("Sum Investment");

        invests.setColumns(20);
        invests.setRows(5);
        investStatus.setViewportView(invests);

        SuggestInvest.setText("Suggested Investment");

        javax.swing.GroupLayout investPanelLayout = new javax.swing.GroupLayout(investPanel);
        investPanel.setLayout(investPanelLayout);
        investPanelLayout.setHorizontalGroup(
            investPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(investPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(investPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addInvest)
                    .addGroup(investPanelLayout.createSequentialGroup()
                        .addComponent(InvestType)
                        .addGap(18, 18, 18)
                        .addComponent(InvestTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(investPanelLayout.createSequentialGroup()
                        .addComponent(invest)
                        .addGap(18, 18, 18)
                        .addComponent(investAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sumInvest)
                    .addComponent(SuggestInvest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(investStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        investPanelLayout.setVerticalGroup(
            investPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(investPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(investPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(investPanelLayout.createSequentialGroup()
                        .addGroup(investPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(investAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(invest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(investPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvestType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InvestTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(addInvest)
                        .addGap(26, 26, 26)
                        .addComponent(sumInvest)
                        .addGap(18, 18, 18)
                        .addComponent(SuggestInvest)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(investPanelLayout.createSequentialGroup()
                        .addComponent(investStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        debt.setText("Debt: ");

        debtAmount.setToolTipText("");

        schoolType.setText("School: ");

        schoolTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primary", "Middle", "High", "Undergraduate", "Graduate" }));

        addDebt.setText("Add Debt");

        sumDebt.setText("Sum Debt");

        debts.setColumns(20);
        debts.setRows(5);
        debtStatus.setViewportView(debts);

        javax.swing.GroupLayout debtPanelLayout = new javax.swing.GroupLayout(debtPanel);
        debtPanel.setLayout(debtPanelLayout);
        debtPanelLayout.setHorizontalGroup(
            debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debtPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDebt)
                    .addGroup(debtPanelLayout.createSequentialGroup()
                        .addComponent(schoolType)
                        .addGap(18, 18, 18)
                        .addComponent(schoolTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(debtPanelLayout.createSequentialGroup()
                        .addComponent(debt)
                        .addGap(18, 18, 18)
                        .addComponent(debtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sumDebt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(debtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        debtPanelLayout.setVerticalGroup(
            debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debtPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(debtStatus)
                    .addGroup(debtPanelLayout.createSequentialGroup()
                        .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(debtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(debt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(debtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schoolType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schoolTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(addDebt)
                        .addGap(26, 26, 26)
                        .addComponent(sumDebt)))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(incomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(expensePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(investPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(debtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(expensePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(investPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(debtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IncomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomesActionPerformed
        incomePanel.setVisible(true);
        expensePanel.setVisible(false);
        investPanel.setVisible(false);
        debtPanel.setVisible(false);
    }//GEN-LAST:event_IncomesActionPerformed

    private void ExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpensesActionPerformed
        incomePanel.setVisible(false);
        expensePanel.setVisible(true);
        investPanel.setVisible(false);
        debtPanel.setVisible(false);
    }//GEN-LAST:event_ExpensesActionPerformed

    private void InvestmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvestmentsActionPerformed
        incomePanel.setVisible(false);
        expensePanel.setVisible(false);
        investPanel.setVisible(true);
        debtPanel.setVisible(false);
    }//GEN-LAST:event_InvestmentsActionPerformed

    private void DebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebtActionPerformed
        incomePanel.setVisible(false);
        expensePanel.setVisible(false);
        investPanel.setVisible(false);
        debtPanel.setVisible(true);
    }//GEN-LAST:event_DebtActionPerformed

    private void sumIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumIncomeActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveActionPerformed
    
    class RemoveListener implements ActionListener {
      
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MoneyKeeper4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoneyKeeper4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoneyKeeper4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoneyKeeper4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyKeeper4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Debt;
    private javax.swing.JButton Expenses;
    private javax.swing.JButton Help;
    private javax.swing.JLabel IncomeType;
    private javax.swing.JComboBox<String> IncomeTypes;
    private javax.swing.JButton Incomes;
    private javax.swing.JLabel InvestType;
    private javax.swing.JComboBox<String> InvestTypes;
    private javax.swing.JButton Investments;
    private javax.swing.JButton Remove;
    private javax.swing.JButton SuggestInvest;
    private javax.swing.JButton addDebt;
    private javax.swing.JButton addExpense;
    private javax.swing.JButton addIncome;
    private javax.swing.JButton addIncome2;
    private javax.swing.JButton addIncome3;
    private javax.swing.JButton addInvest;
    private javax.swing.JLabel debt;
    private javax.swing.JTextField debtAmount;
    private javax.swing.JPanel debtPanel;
    private javax.swing.JScrollPane debtStatus;
    private javax.swing.JTextArea debts;
    private javax.swing.JButton debts4;
    private javax.swing.JButton debts5;
    private javax.swing.JLabel expense;
    private javax.swing.JTextField expenseAmount;
    private javax.swing.JPanel expensePanel;
    private javax.swing.JScrollPane expenseStatus;
    private javax.swing.JLabel expenseType;
    private javax.swing.JComboBox<String> expenseTypes;
    private javax.swing.JTextArea expenses;
    private javax.swing.JButton expenses4;
    private javax.swing.JButton expenses5;
    private javax.swing.JButton help4;
    private javax.swing.JButton help5;
    private javax.swing.JLabel income;
    private javax.swing.JLabel income2;
    private javax.swing.JLabel income3;
    private javax.swing.JTextField incomeAmount;
    private javax.swing.JTextField incomeAmount2;
    private javax.swing.JTextField incomeAmount3;
    private javax.swing.JPanel incomePanel;
    private javax.swing.JPanel incomePanel2;
    private javax.swing.JPanel incomePanel3;
    private javax.swing.JPanel incomePanel4;
    private javax.swing.JScrollPane incomeStatus;
    private javax.swing.JScrollPane incomeStatus2;
    private javax.swing.JScrollPane incomeStatus3;
    private javax.swing.JLabel incomeType2;
    private javax.swing.JLabel incomeType3;
    private javax.swing.JComboBox<String> incomeTypes2;
    private javax.swing.JComboBox<String> incomeTypes3;
    private javax.swing.JTextArea incomes;
    private javax.swing.JButton incomes5;
    private javax.swing.JTextArea incomes6;
    private javax.swing.JButton incomes7;
    private javax.swing.JTextArea incomes8;
    private javax.swing.JLabel invest;
    private javax.swing.JTextField investAmount;
    private javax.swing.JPanel investPanel;
    private javax.swing.JScrollPane investStatus;
    private javax.swing.JTextArea invests;
    private javax.swing.JButton invests4;
    private javax.swing.JButton invests5;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton remove4;
    private javax.swing.JButton remove5;
    private javax.swing.JLabel schoolType;
    private javax.swing.JComboBox<String> schoolTypes;
    private javax.swing.JButton sumDebt;
    private javax.swing.JButton sumExpense;
    private javax.swing.JButton sumIncome;
    private javax.swing.JButton sumIncomes2;
    private javax.swing.JButton sumIncomes3;
    private javax.swing.JButton sumInvest;
    // End of variables declaration//GEN-END:variables
}
