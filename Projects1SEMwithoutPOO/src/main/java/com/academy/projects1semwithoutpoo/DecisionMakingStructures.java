package com.academy.projects1semwithoutpoo;

import javax.swing.JOptionPane;

public class DecisionMakingStructures {

    String grade1, grade2;
    double grade1ToDouble, grade2ToDouble, balance;
    
    void DecisionMakingStructuresMethod(){
        grade1 = JOptionPane.showInputDialog("Insira a sua primeira nota:");
        grade1ToDouble = Double.parseDouble(grade1);
        
        grade2 = JOptionPane.showInputDialog("Insira a sua segunda nota:");
        grade2ToDouble = Double.parseDouble(grade2);
        
        balance = (grade1ToDouble + grade2ToDouble) / 2;
        //Estrutura de decisão composta
        if(balance >= 7){
            JOptionPane.showMessageDialog(null, "Você foi aprovado!");
        } else{
            JOptionPane.showMessageDialog(null, "Você foi reprovado!");
        }
    }
}
