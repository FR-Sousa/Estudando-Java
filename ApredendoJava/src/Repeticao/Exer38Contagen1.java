package Repeticao;
/*
*  Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou!*/

public class Exer38Contagen1 {
    public static void main(String[] args) {
        int cont = 6;
        while (cont <= 10 ){
            System.out.print(cont+ "-");
            cont++;
        }
        System.out.print(" Acabou!!");
    }
}
