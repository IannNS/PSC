package com.mycompany.forfirstexample;

public class ForFirstExample {

    public static void main(String[] args) {
        String[] nome = {"Paulo" , "Bruno", "Pedro"};
        int i;
        // LEMBRE-SE: for(INICIO; FIM; INCREMENTO;
        for (i = 0; i <= 10; i ++){
            System.out.println("Funcionario numero:"+i+": Nome do funcionario:" +nome[i]);
        }
    }
}
