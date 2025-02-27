package Repeticao;
/*
*  Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares. */

import java.util.Scanner;

public class Exer49ImparOuPar {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int c = 1, impa = 0, par = 0, num;
        while (c <= 6){
            System.out.print("Valor "+c+" : ");
            num = teclado.nextInt();
            if (num % 2 == 0){
                par++;
            }else {
                impa++;
            }
            c++;
        }
        System.out.println("São pares "+par);
        System.out.println("São impares "+impa);


    }
}
