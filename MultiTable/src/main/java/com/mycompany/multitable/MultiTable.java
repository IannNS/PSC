package com.mycompany.multitable;

import java.util.Scanner;

public class MultiTable {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int increment, multTable;
        
        System.out.println("Escolha a taboada que voce deseja: ");
        multTable = read.nextInt();
        
        System.out.println("Taboada do " +multTable+" : ");
        for (increment = 0; increment <= 10; increment++){
            System.out.println(increment+ " x " +multTable+ " = " +multTable * increment);
        }
    }
}
