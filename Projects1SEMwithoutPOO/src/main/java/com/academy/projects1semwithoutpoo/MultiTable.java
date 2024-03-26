package com.academy.projects1semwithoutpoo;

import java.util.Scanner;

public class MultiTable {

    Scanner read = new Scanner(System.in);
    int increment, multTable;
    
    void MultiTableMethod(){
        System.out.println("Escolha a taboada que voce deseja: ");
        multTable = read.nextInt();
        
        System.out.println("Taboada do " +multTable+" : ");
        for (increment = 0; increment <= 10; increment++){
            System.out.println(increment+ " x " +multTable+ " = " +multTable * increment);
        }
    }
}
