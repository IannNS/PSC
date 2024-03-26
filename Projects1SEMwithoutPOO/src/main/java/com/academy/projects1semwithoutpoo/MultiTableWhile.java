package com.academy.projects1semwithoutpoo;

import java.util.Scanner;

public class MultiTableWhile {

    Scanner scan = new Scanner(System.in);
    int increment, userIn, res;
    
    void MultiTableWhileMethod(){
        increment = 0;
        
        System.out.println("Digite o valor da taboada de sejada: ");
        userIn = scan.nextInt();
        
        while (increment <= 10){
            res = increment * userIn;
            System.out.println(userIn+"x"+increment+"="+res);
            increment = increment + 1;
        }
    }
}
