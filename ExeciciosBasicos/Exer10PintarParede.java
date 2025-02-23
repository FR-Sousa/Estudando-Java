package ExeciciosBasicos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exer10PintarParede {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double altura, largura,area, demao;
        System.out.print("Altura da parede: ");
        altura = teclado.nextDouble();
        System.out.print("Largura da parede: ");
        largura = teclado.nextDouble();

        area = largura * altura;
        //usado para aredondar para cima
        BigDecimal bd = new BigDecimal(area).setScale(1, RoundingMode.HALF_UP);
        demao = area / 2;
        BigDecimal dm = new BigDecimal(demao).setScale(1, RoundingMode.HALF_UP);

        System.out.println("A área a ser pintada e de "+bd+ " e vai ser pecisso de "+dm+" litros por demão");

    }
}
