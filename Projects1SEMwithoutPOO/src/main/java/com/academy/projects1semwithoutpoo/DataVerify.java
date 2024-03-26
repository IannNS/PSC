package com.academy.projects1semwithoutpoo;

import java.util.Scanner;

public class DataVerify {

    Scanner read = new Scanner(System.in);
    int increment, femCount, manCount;
    String gender;
    Double totalHeight, height, roundHeight, biggestHeight, shorttestHeight;

    void DataVerifyMethod() {
        totalHeight = 0.0;
        biggestHeight = 0.0;
        shorttestHeight = 0.0;
        femCount = 0;
        manCount = 0;
        height = 0.0;
        increment = 1;

        while (increment <= 10) {
            System.out.println("Digite o genero (masculino ou feminino) da pessoa para adicionar a lista: ");
            gender = read.next();
            if (gender.equals("feminino")) {
                femCount += 1;
            }

            System.out.println("Digite a altura da pessoa para adicionar a lista: ");
            height = read.nextDouble();
            if (gender.equals("masculino")) {
                manCount += 1;
                totalHeight += height;
            }

            if (increment == 1) {
                biggestHeight = height;
                shorttestHeight = height;
            }

            if (height > biggestHeight) {
                biggestHeight = height;
            }

            if (height < shorttestHeight) {
                shorttestHeight = height;
            }
            increment++;
        }
        roundHeight = totalHeight / manCount;

        System.out.println("A maior altura e " + biggestHeight + ", e a menor altura e " + shorttestHeight);
        System.out.println("O número de mulheres e: " + femCount);
        System.out.println("A media das alturas dos homens e: " + roundHeight);
    }
}
