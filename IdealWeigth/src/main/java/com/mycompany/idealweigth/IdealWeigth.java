package com.mycompany.idealweigth;

import javax.swing.JOptionPane;

public class IdealWeigth {

    public static void main(String[] args) {
        String[] gender = {"Masculino", "Feminino"};
        double idealWeigth, heightToDouble;
        String height;
        int options = JOptionPane.showOptionDialog(null, "Escolha o sexo cujo você deseja utilizar para fazer o cálculo", "Selecione:", 0, 3, null, gender, gender[0]);
        height = JOptionPane.showInputDialog("Digite sua altura: ");
        heightToDouble = Double.parseDouble(height);
        
        if (options == 0){
            idealWeigth = (72.7 * heightToDouble) - 58;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + idealWeigth);
        } else{
            idealWeigth = (62.1 * heightToDouble) - 44.7;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + idealWeigth);
        }
    }
}
