package Repeticao;
/*
*  Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou! */

public class Exer39Contagem2 {
    public static void main(String[] args) {
        int c = 10;

        //no while ( c >= 3) esse e usado para contagem decrecente
        while (c >= 3){
            System.out.print(c+ " ");
            // usa c-- para decresente e c++ para crecente
            c--;
        }
        System.out.print("Acabou!");
    }
}
