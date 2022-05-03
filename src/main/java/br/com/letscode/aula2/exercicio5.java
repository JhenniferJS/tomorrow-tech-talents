package br.com.letscode.aula2;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tempo gasto na viagem? ");
        double tempo = sc.nextDouble();

        System.out.println("Qual a velocidade media? ");
        double velocidade = sc.nextDouble();

        double litros = (tempo*velocidade)/12;

    System.out.printf("Serao necessarios %.2f litros de combustivel", litros);
    }

}
