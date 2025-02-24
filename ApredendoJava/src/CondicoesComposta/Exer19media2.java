package CondicoesComposta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer19media2 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double n1, n2, media;
        String nome;

        System.out.print("Nome do Aluno: ");
        nome = teclado.next();

        System.out.print("Nota 01: ");
        n1 = teclado.nextDouble();
        System.out.print("Nota 02: ");
        n2 = teclado.nextDouble();

        media =(n1 + n2)/2;
        System.out.println("O aluno "+nome+ " teve uma nota de "+new DecimalFormat(".##").format(media));
        if (media >= 7){
            System.out.println("Teve um bom aproveitamento.");
        }else {
            System.out.println("Não teve um bom aproveitamento.");
        }

    }
}
