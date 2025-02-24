package ExeciciosBasicos;
/*
*  Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eexer8Metros {
    static Scanner s =new Scanner(System.in);

    public static void main(String[] args) {
        double metro, km, hm, dam, dm, cm, mm;
        System.out.print("Digite uma distância em metros:  ");
        metro = s.nextDouble();

       km = metro /  1000;
       hm = metro / 100;
       dam = metro / 10;
       dm = metro * 10;
       cm = metro * 100;
       mm = metro * 1000;
        System.out.println("A distância de "+new DecimalFormat(".##").format(metro) +"m corresponde a :");

        System.out.println(km+"Km \t\t "+dm+"dm");
        System.out.println(hm+"Hm \t\t "+cm+"cm");
        System.out.println(dam+"Dam \t\t "+mm+"mm");




    }
}
