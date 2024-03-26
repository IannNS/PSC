package com.academy.projects1semwithoutpoo;

import java.util.Scanner;

public class EvenOrOdd {

    Scanner read = new Scanner(System.in);
    int numberIn, numberForAnalises;
    
    void EvenOrOddMethod(){
        System.out.println("Digite o número que você deseja verificar: ");
        numberIn = read.nextInt();
        
        numberForAnalises = numberIn % 2;
        if(numberForAnalises == 0){
            System.out.println("Seu número é par");
        } else{
            System.out.println("Seu número é ímpar");
        }
    }
}
