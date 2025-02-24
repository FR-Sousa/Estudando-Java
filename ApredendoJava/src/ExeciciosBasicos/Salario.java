package ExeciciosBasicos;

/*
*  Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho. */

import java.util.Scanner;

public class Salario {
     static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String fucionario;

        System.out.print("Nome do Fucionário: ");
        fucionario = s.next();

        System.out.print("Salário: ");
        float salario = s.nextFloat();

        System.out.println("O Fucionário "+fucionario+ " tem um salário de R$"+salario+ " em junho.");



    }
}
