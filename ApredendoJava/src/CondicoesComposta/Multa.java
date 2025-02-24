package CondicoesComposta;
/*
*  Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida. */

import java.util.Scanner;

public class Multa {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double velocidade, multa, excessoDeVelocidade;

        // valor da velocidade do carro
        System.out.print("Velocidade do Motorista: ");
        velocidade = teclado.nextDouble();

        // variavel para saber o valor que passol soa 80
        excessoDeVelocidade = velocidade - 80;

        //contabiliza o valor da multa
        multa = excessoDeVelocidade * 5;

        //estrutura para fazer a condição se esta multado ou não
        if (velocidade <= 80){
            System.out.println("Está no limite de velocidade boa viagem.");
        }else {
            System.out.println("Utrapassou o limite de velocidade vai ser multado em R$"+multa );
        }

   }
}
