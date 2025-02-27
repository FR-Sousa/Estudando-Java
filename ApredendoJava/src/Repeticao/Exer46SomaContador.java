package Repeticao;

public class Exer46SomaContador {
    public static void main(String[] args) {
        int c = 6, soma = 0;
        while (c <= 100){
            System.out.print(c+ " + ");
            soma += c ;
            c+=2;
        }
        System.out.println("\nSoma dos números de 6 a 100 pulando 2 casa é : " + soma);
    }
}
