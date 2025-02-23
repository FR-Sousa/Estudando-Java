package ExeciciosBasicos;

/*
*  Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13*/

import java.util.Scanner;

public class Exer4Somatorio {
    static Scanner s =new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2, soma;

        System.out.print("Digite um número: ");
        n1 =s.nextInt();

        System.out.print("Digite o Segundo número: ");
        n2 = s.nextInt();

        soma = n1 + n2;

        System.out.println("A soma "+n1+" e " +n2+ " é "+soma);

    }
}
