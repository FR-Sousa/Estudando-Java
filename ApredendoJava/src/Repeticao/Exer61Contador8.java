package Repeticao;
/*
*  Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
“faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!*/

public class Exer61Contador8 {
    public static void main(String[] args) {
        int c = 0;
        do {
            System.out.print(c +" ");
            c+=3;
        }while (c <= 30);
        System.out.println("Acabou!!");
    }
}
