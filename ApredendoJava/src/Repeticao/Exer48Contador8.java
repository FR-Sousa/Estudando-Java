package Repeticao;

import java.util.Scanner;

/*
*  Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles. */
public class Exer48Contador8 {
    static Scanner teclado =new Scanner(System.in);

    public static void main(String[] args) {
        int num, c = 1, soma = 0;
        while(c <= 7){
            System.out.print("\nValor "+c+"°: " );
            num = teclado.nextInt();
            soma+=num;
            c++;
        }
        System.out.println("A soma e de "+soma);
    }
}
