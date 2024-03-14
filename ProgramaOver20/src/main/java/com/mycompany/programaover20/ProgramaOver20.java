package com.mycompany.programaover20;

import java.util.Scanner;

public class ProgramaOver20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numberIn;
        
        System.out.println("Digite o número que você deseja verificar: ");
        numberIn = read.nextInt();
        
        if(numberIn >= 20){
            System.out.printf("Seu número é %d! Por ser maior que 20, ele foi exibido.", numberIn);
        }
    }
}
