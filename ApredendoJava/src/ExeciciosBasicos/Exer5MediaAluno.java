package ExeciciosBasicos;
/*
*  Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5 */

import java.util.Scanner;

public class Exer5MediaAluno {
    static Scanner s =new Scanner(System.in);

    public static void main(String[] args) {
        double n1, n2, media;

        System.out.print("Nota 1: ");
        n1 =s.nextDouble();
        System.out.print("Nota 2: ");
        n2 =s.nextDouble();

        media = (n1 + n2)/2;

        System.out.println("A média entre "+n1+" e "+n2+" é igual a "+media);
    }
}
