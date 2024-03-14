public class ValidationAndResearch{
    public static void main(String args[]){

        //ATENÇÃO: VETORES INICIAM EM POSIÇÃO 0!

        String str = "Acadêmico Tech", str2 = "Tech", str3 = "Tech", str4 = "", str5 = "Tech";
        int length = str2.length();
        //retorna o caracter na posição número 2 do index da String.
        char response = str.charAt(2);

        System.out.println("Caractér selecionado é: " + response);

        //retorna a posição do primeiro caractér declarado para busca, neste caso, c.
        int firstChar = str.indexOf("c");

        //retorna a posição do último caractér declarado para busca, neste caso, c.
        int lastChar = str.lastIndexOf("c");

        System.out.println("Posição da primeira letra c é: " + firstChar);
        System.out.println("Posição da última letra c é: " + lastChar);
        System.out.println("Número de caractéres na String: " + length);
        System.out.println("Essa String está vazia? " + str3.isEmpty());
        System.out.println("Essa String está vazia? " + str4.isEmpty());
        System.out.println("Para letra minúscula: " + str5.toLowerCase());
        System.out.println("Para letra maiúscula: " + str5.toUpperCase());
    }
}
