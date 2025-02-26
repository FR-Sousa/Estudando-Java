package Repeticao;

import java.util.Scanner;

public class Exer42Contagem5 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int c= 1, num;
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        while (c <= num){
            System.out.print(c+" ");
            c++;
        }
        System.out.print("Acabou!!");
    }
}
