package ExeciciosBasicos;
/*
*  Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas
vindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer! */

import java.util.Scanner;

public class Apresentacao {
    static Scanner n =new Scanner(System.in);
    public static void main(String[] args) {
        String nome;

        System.out.print("Qual é seu Nome? : ");
        nome = n.next();
        System.out.println("Olá "+nome+ " é um prazer te conhecer!");
    }
}
