package com.mycompany.calculatorifelse;

import javax.swing.JOptionPane;

public class CalculatorIfElse {

    public static void main(String[] args) {
        int trueSelection;
        float num1F, num2F, result;
        String num1, num2, selection;
        
        num1 = JOptionPane.showInputDialog("Insira o primeiro número: ");
        num2 = JOptionPane.showInputDialog("Insira o segundo número: ");
        selection = JOptionPane.showInputDialog("Qual operação deseja realizar?\n 1 - Soma;\n 2 - Subtração;\n 3 - Multiplicação;\n 4 - Divisão.");
        
        num1F = Float.parseFloat(num1);
        num2F = Float.parseFloat(num2);
        trueSelection = Integer.parseInt(selection);
        if(trueSelection == 1){
            result = num1F + num2F;
            JOptionPane.showMessageDialog(null, "O resultado da sua soma é: " + result);
        } else if (trueSelection == 2){
            result = num1F - num2F;
            JOptionPane.showMessageDialog(null, "O resultado da sua subtração é: " + result);
        } else if (trueSelection == 3){
            result = num1F * num2F;
            JOptionPane.showMessageDialog(null, "O resultado da sua multiplicação é: " + result);
        } else if (trueSelection == 4){
            result = num1F / num2F;
            JOptionPane.showMessageDialog(null, "O resultado da sua divisão é: " + result);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas as opções disponíveis. Qualquer coisa diferente não será considerada!");
        }
    }
}
