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
  
  // Investment Type Options
  String[] investOps = {"Primary Investment", "Second Investement"};
  
  JLabel     investLabel = new JLabel    ("Investments: "); 
  

  this.investmentPanel.add (investLabel);
  
  JButton addInv2 = new JButton ("Set Values");
  addInv2.addActionListener (new ActionListener() {
   @Override
   public void actionPerformed (ActionEvent event) {
    //addInvest();
   }
  });
  this.investmentPanel.add(addInv2);
 }
 public String investmentSuggestion(){
   String message = "";
   int deltaValue = currentObject.calculateDelta();
   
   
   if (deltaValue <= 100) {
     message = String.format("You have a total of $%d in your account. Currently, we do not suggest you invest your money in anything", deltaValue);
   }
   
   // Don't invest in something big. Small investments are ok.
   else if (deltaValue > 100 && deltaValue < 1000){}
   
   //Can invest more money in a larger 
   else {
   
   }
   
   return message;
 }
 
 
 
}
