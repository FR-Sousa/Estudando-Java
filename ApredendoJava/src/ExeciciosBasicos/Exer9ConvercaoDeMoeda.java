package ExeciciosBasicos;
/*
*  Faça um algoritmo que leia quanto dinheiro uma pessoa tem
* na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer9ConvercaoDeMoeda {
    static Scanner s =new Scanner(System.in);

    public static void main(String[] args) {
       double real, convercao;

        System.out.print("Quanto tem na carteira R$:");
        real =s.nextDouble();

        convercao = real * 5.73;

        System.out.println("Tenho na cartetira "+real+ " em Reais vou compra "
                +new DecimalFormat(".#").format(convercao)+" Dolares");



    }


}
