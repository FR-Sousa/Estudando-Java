package CondicoesComposta;
/*
* Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
*  - O primeiro valor é o maior
* - O segundo valor é o maior
* - Não existe valor maior, os dois são iguais  */

import java.util.Scanner;

public class Exer26MaiorMenor {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        int numero1 = teclado.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2){
            System.out.println(" O primeiro valor é o maior ");
        } else if (numero2 > numero1) {
            System.out.println(" O segundo valor é o maior");
        } else if (numero1 == numero2) {
            System.out.println(" Não existe valor maior, os dois são iguais");
        }


    }
}
