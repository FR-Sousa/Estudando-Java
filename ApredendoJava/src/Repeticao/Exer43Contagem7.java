package Repeticao;

import java.util.Scanner;

/*
*  Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou! */
public class Exer43Contagem7 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int valor1, valor2,icre;
        System.out.print("Digite o primeiro valor: ");
        valor1 = teclado.nextInt();
        System.out.print("Digite o primeiro valor: ");
        valor2 = teclado.nextInt();
        System.out.print("Digite o incremento: ");
        icre = teclado.nextInt();

        while ( valor1 < valor2 && valor1 > 1){
            System.out.print(valor1 + " ");
            valor1+= icre;
            valor1 -=  icre;



        }


    }
}
