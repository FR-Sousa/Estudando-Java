package CondicoesComposta;
/*
*  Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.*/

import java.util.Scanner;

public class Exer20ImparOuPar {
    static Scanner teclado =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um Número: ");
        int num = teclado.nextInt();

        System.out.print("O número "+num+ " é ");
        if (num % 2 == 0){
            System.out.print("PAR");
        }else{
            System.out.print("ÌMPAR");
        }
    }
}
