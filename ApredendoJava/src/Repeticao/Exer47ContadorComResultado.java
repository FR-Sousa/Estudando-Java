package Repeticao;
/*
*  Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
450 + 400 + 350 + 300 + ... + 50 + 0 */

public class Exer47ContadorComResultado {
    public static void main(String[] args) {
        int c = 500, soma = 0;
        while (c >= 0){
            System.out.print(c + "  ");
            soma += c;
            c-=50;
        }
        System.out.println("\nA soma de todos os números é " +soma);
    }
}
