package CondicoesComposta;
/*
* Faça um programa que leia o ano de nascimento
* de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.  */

import java.time.Year;
import java.util.Scanner;

public class Exer18Votacao {
    static Scanner teclado =new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ano que você nasceu: ");
        int anoNacimento = teclado.nextInt();

         //
        int anoAtual = Year.now().getValue();

        int idade = anoAtual - anoNacimento;
        System.out.println(idade + " anos");

        if (idade >= 16){
            System.out.println("Pode vota esse ano");
        }else {
            System.out.println("Não pode vota");
        }




    }
}
