package com.academy.projects1semwithoutpoo;

import java.util.Scanner;

public class MonthShowSwitch {

    Scanner read = new Scanner(System.in);
    int option;
    
    void MonthShowSwitchMethod(){
        System.out.println("Digite o mês em numero inteiro (Entre 1 até 12 )  ");
        option = read.nextInt();
        
        switch(option){
            case 1:
                System.out.println("O mês do número digitado é Janeiro");
                break;
            case 2:
                System.out.println("O mês do número digitado é Fevereiro");
                break;
            case 3:
                System.out.println("O mês do número digitado é Março");
                break;
            case 4:
                System.out.println("O mês do número digitado é Abril");
                break;
            case 5:
                System.out.println("O mês do número digitado é Maio");
                break;
            case 6:
                System.out.println("O mês do número digitado é Junho");
                break;
            case 7:
                System.out.println("O mês do número digitado é Julho");
                break;
            case 8:
                System.out.println("O mês do número digitado é Agosto");
                break;
            case 9:
                System.out.println("O mês do número digitado é Setembro");
                break;
            case 10:
                System.out.println("O mês do número digitado é Outubro");
                break;
            case 11:
                System.out.println("O mês do número digitado é Novembro");
                break;
            case 12:
                System.out.println("O mês do número digitado é Dezembro");
                break;
                
            default:
                System.out.println("ERRO, digite somente n meros entre 1 e 12");
                break;
        }
    }
}
