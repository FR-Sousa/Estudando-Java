package ExeciciosBasicos;
/*
*  Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10 */

import java.util.Scanner;

public class Exer6NumeroInteiro {
    static Scanner s =new Scanner(System.in);

    public static void main(String[] args) {
        int antecessor, sucessor, num;

        System.out.print("Digite um Número: ");
        num = s.nextInt();

        antecessor = num - 1;
        sucessor = num + 1;

        System.out.println("O antecessor de "+ num+ " é "+antecessor);
        System.out.println("O sucessor de "+ num +  " é "+sucessor);
    }
}
