package com.academy.projects1semwithoutpoo;

public class ForFirstExample {
    String[] nome = {"Paulo" , "Bruno", "Pedro"};
    int i;
    
    void ForFirstExampleMethod(){
        // LEMBRE-SE: for(INICIO; FIM; INCREMENTO;
        for (i = 0; i <= 10; i ++){
            System.out.println("Funcionario numero:"+i+": Nome do funcionario:" +nome[i]);
        }
    }
}
