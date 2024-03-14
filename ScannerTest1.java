import java.util.Scanner;

public class ScannerTest1 {
  public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    String nome;
    int ra, idade, nota1, nota2, nota3, nota4, media, tdm;

    System.out.println("Bem vindo a Escola Joaquim, Digite seu nome: ");
    nome = read.next();
    System.out.println("Digite a sua idade: ");
    idade = read.nextInt();
    System.out.println("Digite seu ra: ");
    ra = read.nextInt();
    System.out.println("Digite sua nota de matemática: ");
    nota1 = read.nextInt();
    System.out.println("Digite sua nota de ciências: ");
    nota2 = read.nextInt();
    System.out.println("Digite sua nota de Português: ");
    nota3 = read.nextInt();
    System.out.println("Digite sua nota de Física: ");
    nota4 = read.nextInt();

    tdm = 4;
    media = (nota1 + nota2 + nota3 + nota4) / tdm;

    System.out.printf("Nome: %s\n", nome);
    System.out.println("Idade: " + idade);
    System.out.println("Ra: " + ra);
    System.out.println("Sua média é de: " + media);
  }
}