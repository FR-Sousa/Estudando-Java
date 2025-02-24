package ExeciciosBasicos;

import java.util.Scanner;

public class Exer11Equacao {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, delta;
        System.out.print("Valor de A: ");
        a = teclado.nextInt();
        System.out.print("Valor de B: ");
        b = teclado.nextInt();
        System.out.print("Valor de C: ");
        c = teclado.nextInt();

        delta = b * b - 4 * a * c;

        System.out.println("O valor do delta é "+delta);
    }
}
