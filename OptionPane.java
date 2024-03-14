//Importar a biblioteca JOptionPane do Javax Swing é excencial. Sem ela, é impossível a criação de painéis e sua formatação.
import javax.swing.JOptionPane;

public class OptionPane {
    public static void main(String args[]){
        //Criei um buffer de opções de string, assim, o texto de cada opção aparece em um botão.
        String[] options = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        //criando uma variável para salvar o index da seleção do usuário e, assim, decidir qual operação ser realizada.
        var selection = JOptionPane.showOptionDialog(null, "Selecione a operação desejada: ", "Operações", 0, 3, null, options, options[0]);

        if(selection == 0){
            //Declarando as variáveis para fazer as operações. (mesma em todas as operações).
            String value1Message, value2Message;
            int value1, value2, result;

            //Entrada dos valores. (mesma em todas as operações, só muda o conteúdo da mensagem).
            value1Message = JOptionPane.showInputDialog("Digite o primeiro valor da soma:");
            value2Message = JOptionPane.showInputDialog("Digite o segundo valor da soma:");

            value1 = Integer.parseInt(value1Message);
            value2 = Integer.parseInt(value2Message);
            
            //Essa variável muda de valor para a respectiva operação necessária.
            result = value1 + value2;
            
            //Mostra o resultado das operações. A única coisa que muda dessa para as outras é o conteúdo da mensagem!
            JOptionPane.showMessageDialog(null, "Resultado da sua soma: " + result);
        }

        if(selection == 1){
            String value1Message, value2Message;
            int value1, value2, result;

            value1Message = JOptionPane.showInputDialog("Digite o primeiro valor da subtração:");
            value2Message = JOptionPane.showInputDialog("Digite o segundo valor da subtração:");

            value1 = Integer.parseInt(value1Message);
            value2 = Integer.parseInt(value2Message);
            result = value1 - value2;

            JOptionPane.showMessageDialog(null, "Resultado da sua subtração: " + result);
        }

        if(selection == 2){
            String value1Message, value2Message;
            int value1, value2, result;

            value1Message = JOptionPane.showInputDialog("Digite o primeiro valor da multiplicação:");
            value2Message = JOptionPane.showInputDialog("Digite o segundo valor da multiplicação:");

            value1 = Integer.parseInt(value1Message);
            value2 = Integer.parseInt(value2Message);
            result = value1 * value2;

            JOptionPane.showMessageDialog(null, "Resultado da sua multiplicação: " + result);
        }

        if(selection == 3){
            String value1Message, value2Message;
            int value1, value2, result;

            value1Message = JOptionPane.showInputDialog("Digite o primeiro valor da divisão:");
            value2Message = JOptionPane.showInputDialog("Digite o segundo valor da divisão:");

            value1 = Integer.parseInt(value1Message);
            value2 = Integer.parseInt(value2Message);
            result = value1 / value2;

            JOptionPane.showMessageDialog(null, "Resultado da sua divisão: " + result);
        }
    }
}