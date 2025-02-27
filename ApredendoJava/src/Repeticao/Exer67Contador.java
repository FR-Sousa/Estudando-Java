package Repeticao;
/*
*  Faça um programa usando a estrutura “para” que leia um número inteiro
positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!*/

import java.util.Scanner;

public class Exer67Contador {
    static Scanner teclado =new Scanner(System.in);

    public static void main(String[] args) {
        int c, num;
        System.out.print("Digite um valor: ");
        num = teclado.nextInt();
        for (c =0; c <= num;c++){
            System.out.print(c+" ,");
        }
        System.out.println("FIM!");
    }
}
