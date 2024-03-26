package com.academy.projects1semwithoutpoo;

import java.util.Scanner;

public class ProgramOver20 {

    Scanner read = new Scanner(System.in);
    int numberIn;

    void ProgramOver20Method() {
        System.out.println("Digite o número que você deseja verificar: ");
        numberIn = read.nextInt();

        if (numberIn >= 20) {
            System.out.printf("Seu número é %d! Por ser maior que 20, ele foi exibido.", numberIn);
        }
    }
}
