package Repeticao;
/*
*  Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou! */
public class Exer40Contagem3 {
    public static void main(String[] args) {
        int c = 0;
        while (c <= 18){
            System.out.print(c+" ");
            c = c +3;
        }
        System.out.print("Acabou!");
    }
}
