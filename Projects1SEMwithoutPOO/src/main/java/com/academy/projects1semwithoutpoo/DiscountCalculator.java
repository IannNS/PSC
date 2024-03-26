package com.academy.projects1semwithoutpoo;

import javax.swing.JOptionPane;

public class DiscountCalculator {

    String price;
    double priceToDouble;
    
    void DiscountCalculator(){
        price = JOptionPane.showInputDialog("Digite o valor do seu produto (com ou sem casas decimais): ");
        priceToDouble = Double.parseDouble(price);
        
        if(priceToDouble > 10000){
            priceToDouble -= priceToDouble * 0.4;
            JOptionPane.showMessageDialog(null, "Seu desconto foi de 40%! seu novo valor é:\n" + priceToDouble);
        } else if (priceToDouble <= 10000 && priceToDouble > 5000){
            priceToDouble -= priceToDouble * 0.2;
            JOptionPane.showMessageDialog(null, "Seu desconto foi de 20%! seu novo valor é:\n" + priceToDouble);
        } else if (priceToDouble <= 5000 && priceToDouble > 2500){
            priceToDouble -= priceToDouble * 0.1;
            JOptionPane.showMessageDialog(null, "Seu desconto foi de 10%! seu novo valor é:\n" + priceToDouble);
        } else{
            priceToDouble -= priceToDouble * 0.05;
            JOptionPane.showMessageDialog(null, "Seu desconto foi de 5%! seu novo valor é:\n" + priceToDouble);
        }
    }
}
