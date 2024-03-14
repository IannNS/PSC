package com.mycompany.evenorodd;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numberIn, numberForAnalises;
        
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
