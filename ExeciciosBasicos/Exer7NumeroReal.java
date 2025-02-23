package ExeciciosBasicos;
/*
*  Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer7NumeroReal {
    static Scanner s =new Scanner(System.in);

    public static void main(String[] args) {
        double num, dobro, tercaParte;

        System.out.print("Digite um Número: ");
        num =s.nextDouble();

        dobro = num * 2;
        tercaParte = num / 3;

        System.out.println("O dobro de "+num+ " é "+dobro);
        // Para formata um número decimal
        System.out.println("A terça parte de "+num+ " é "+new DecimalFormat(".#####").format( tercaParte));

    }
}
