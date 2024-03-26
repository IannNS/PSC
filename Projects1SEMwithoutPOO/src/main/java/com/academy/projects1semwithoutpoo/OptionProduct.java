package com.academy.projects1semwithoutpoo;

import java.util.Scanner;

public class OptionProduct {

    Scanner read = new Scanner(System.in);
    int option;
    String nameProd;

    void OptionProductMethod() {
        System.out.println("Digite o nome do seu produto: ");
        nameProd = read.next();
        System.out.println("Digite o tipo do seu produto dentre as categorias: \n\n1 - Alimento nao perecivel\n2 - Alimento perecivel\n3 - Vestuario\n4 - Limpeza");
        option = read.nextInt();

        switch (option) {
            case 1:
                System.out.println("Seu produto " + nameProd + " foi cadastrado como: Alimento nao perecivel");
                break;
            case 2:
                System.out.println("Seu produto " + nameProd + " foi cadastrado como: Alimento perecivel");
                break;
            case 3:
                System.out.println("Seu produto " + nameProd + " foi cadastrado como: Vestuario");
                break;
            case 4:
                System.out.println("Seu produto " + nameProd + " foi cadastrado como: Limpeza");
                break;
        }
    }
}
