package com.mycompany.calculatorendless;

import java.util.Scanner;

public class CalculatorEndless {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Double value1, value2, res;
        int option, exit;
        
        exit = 0;
        while(exit == 0){
            System.out.println("\nOla! Digite a opcao de calculo que voce deseja excecutar: \n\n1 - Soma;\n2 - Subtracao;\n3 - Multiplicacao;\n4 - Divisao;\n\n9 - Finalizar programa.");
            option = read.nextInt();
            
            switch(option){
            case 1:
                System.out.println("Digite o primeiro valor: ");
                value1 = read.nextDouble();
                System.out.println("Digite o segundo valor: ");
                value2 = read.nextDouble();
                
                res = value1 + value2;
                System.out.println("Resultado da sua soma e: "+res);
                option = 0;
                break;
                
            case 2:
                System.out.println("Digite o primeiro valor: ");
                value1 = read.nextDouble();
                System.out.println("Digite o segundo valor: ");
                value2 = read.nextDouble();
                
                res = value1 - value2;
                System.out.println("Resultado da sua subtracao e: "+res);
                option = 0;
                break;
                
            case 3:
                System.out.println("Digite o primeiro valor: ");
                value1 = read.nextDouble();
                System.out.println("Digite o segundo valor: ");
                value2 = read.nextDouble();
                
                res = value1 * value2;
                System.out.println("Resultado da sua multiplicacao e: "+res);
                option = 0;
                break;
                
            case 4:
                System.out.println("Digite o primeiro valor: ");
                value1 = read.nextDouble();
                System.out.println("Digite o segundo valor: ");
                value2 = read.nextDouble();
                
                res = value1 / value2;
                System.out.println("Resultado da sua divisao e: "+res);
                option = 0;
                break;
                
            case 9:
                exit = 1;
                System.out.println("Programa finalizado!");
                break;
                
            default:
                System.out.println("Por favor, digite uma opcao coerente com as presentes na tabela!");
                option = 0;
                break;
            }
        }
    }
}
