package com.mycompany.usjt1sem;
   
//Importando a biblioteca do JOptionPane
import javax.swing.JOptionPane;

public class CalculatorBestICan{
    public static void main(String[] args) {
        //Criei um buffer de opções de string, assim, o texto de cada opção aparece em um botão.
        String[] options = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        //Declarando as variáveis para fazer as operações. (mesma em todas as operações).
        String value1Message, value2Message;
        float value1, value2, result;
        //criando uma variável para salvar o index da seleção do usuário e, assim, decidir qual operação ser realizada.
        var selection = JOptionPane.showOptionDialog(null, "Selecione a operação desejada: ", "Operações", 0, 3, null, options, options[0]);
        
        switch(selection){
            case 0 -> {
                //Entrada dos valores. (mesma em todas as operações, só muda o conteúdo da mensagem).
                value1Message = JOptionPane.showInputDialog("Digite o primeiro valor da soma:");
                value2Message = JOptionPane.showInputDialog("Digite o segundo valor da soma:");
                
                value1 = Float.parseFloat(value1Message);
                value2 = Float.parseFloat(value2Message);
                
                //Essa variável muda de valor para a respectiva operação necessária.
                result = value1 + value2;
                
                //Mostra o resultado das operações. A única coisa que muda dessa para as outras é o conteúdo da mensagem!
                JOptionPane.showMessageDialog(null, "Resultado da sua soma: " + result);
            }
            
            case 1 -> {
                value1Message = JOptionPane.showInputDialog("Digite o primeiro valor da subtração:");
                value2Message = JOptionPane.showInputDialog("Digite o segundo valor da subtração:");
                
                value1 = Float.parseFloat(value1Message);
                value2 = Float.parseFloat(value2Message);
                result = value1 - value2;
                
                JOptionPane.showMessageDialog(null, "Resultado da sua subtração: " + result);
            }
            
            case 2 -> {
                value1Message = JOptionPane.showInputDialog("Digite o primeiro valor da multiplicação:");
                value2Message = JOptionPane.showInputDialog("Digite o segundo valor da multiplicação:");
                
                value1 = Float.parseFloat(value1Message);
                value2 = Float.parseFloat(value2Message);
                result = value1 * value2;
                
                JOptionPane.showMessageDialog(null, "Resultado da sua multiplicação: " + result);
            }
            
            case 3 -> {
                value1Message = JOptionPane.showInputDialog("Digite o primeiro valor da divisão:");
                value2Message = JOptionPane.showInputDialog("Digite o segundo valor da divisão:");
                
                value1 = Float.parseFloat(value1Message);
                value2 = Float.parseFloat(value2Message);
                result = value1 / value2;
                
                JOptionPane.showMessageDialog(null, "Resultado da sua divisão: " + result);
            }
        }
    }
}
