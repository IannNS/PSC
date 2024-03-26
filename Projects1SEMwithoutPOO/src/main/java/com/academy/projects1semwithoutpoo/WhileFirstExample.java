package com.academy.projects1semwithoutpoo;

import java.util.Scanner;

public class WhileFirstExample {
    // escreva um programa que, enquanto a idade for menor ou igual a 18, ele possa receber mesada. 
    // Faça a leitura de 5 pessoas, sabendo-se que a entrada será pelo usuário.       
    int increment, idades;

    void WhileFirstExampleMethod() {
        increment = 1;
        Scanner read = new Scanner(System.in);

        while (increment <= 5) {
            System.out.println("Digite a idade da pessoa: ");
            idades = read.nextInt();
            if (idades <= 18) {
                System.out.println("A pessoa numero " + increment + " pode receber mesada.\n");
            } else {
                System.out.println("A pessoa numero " + increment + " nao pode receber mesada.\n");
            }

            ++increment;
        }
    }
}
