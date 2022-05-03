package br.com.letscode.aula3;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 4 notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println(media >= 7 ? "Você esta aprovado =)" : "Você esta de recuperação =(");
    }
}
