import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Investments {
  public MoneyKeeper currentObject;
  public JPanel investmentPanel;
 
 public Investments (JPanel investmentPanel, MoneyKeeper currentObject) {
   this.investmentPanel = investmentPanel;
   this.currentObject = currentObject;
  
 
  
  //JLabel     investLabel = new JLabel    ("Investments: "); 
  

  //this.investmentPanel.add (investLabel);
  
  JButton addInv2 = new JButton ("Suggest Investment");
  addInv2.addActionListener (new ActionListener() {
   @Override
   public void actionPerformed (ActionEvent event) {
    investmentSuggestion();
   }
  });
  this.investmentPanel.add(addInv2);
 }
 public String investmentSuggestion(){
   String message = "";
   int deltaValue = currentObject.calculateDelta();
   int debtAmount = currentObject.debt.sumStudentDebt();
   
   // Do not invest.
   if (deltaValue <= 0) {
     message = String.format("You have a total of $%d free to use in your account.\nCurrently, we do not suggest you invest your money in anything.", deltaValue);
   }
   
   // Don't invest in something big. Small investments are ok.
   else if (deltaValue > 0 && deltaValue <= 1000){
     // They have debt with small amount of savings. Suggest to invest in paying off student debt. 
     if (debtAmount > 0) {
       message = String.format("You have a total of $%d free to use in your account.\nYou also have $%d in student debt. We suggest that you invest this money into paying off your loans.\nThe remaining (if any) can be used in smaller investments like stocks.", deltaValue, debtAmount);
     }
     // Don't have debt.
     else {
       message = String.format("You have a total of $%d free to use in your account\nYou may want to invest your money in small shares of the stock market, real estate, capital or gold.", deltaValue);
     }
   }
     
   //(delta > 1000). Can put more money into larger investments.
   else {
     // They have debt with large amount of savings. Suggest to invest in paying off student debt first. 
     if (debtAmount > 0) {
       message = String.format("You have a total of $%d free to use in your account.\nYou also have $%d in student debt. We suggest that you invest this money into paying off your loans first.\nThe remaining (if any) can be used in investments like stocks, real estate or capital.", deltaValue, debtAmount);
     }
     else {
       // Don't have debt.
       message = String.format("You have a total of $%d free to use in your account\nYou may want to invest this money in the stock market, real estate, capital or gold.", deltaValue);   
     }
   }
   
   JTextArea newAmmt = new JTextArea(message, 1, 8);
   this.investmentPanel.add(newAmmt);
   this.investmentPanel.updateUI();
   return message;
 }
}
