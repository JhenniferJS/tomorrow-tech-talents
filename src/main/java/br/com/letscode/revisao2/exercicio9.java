package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println("Nota 1: ");
                double nota1 = sc.nextDouble();
                System.out.println("Nota 2: ");
                double nota2 = sc.nextDouble();
                System.out.println("Media aritmetica: " + (nota1+nota2)/2);
                break;
            case 2:
                System.out.println("Nota 1: ");
                double n1 = sc.nextDouble();
                System.out.println("Peso 1: ");
                double p1 = sc.nextDouble();

                System.out.println("Nota 2: ");
                double n2 = sc.nextDouble();
                System.out.println("Peso 2: ");
                double p2 = sc.nextDouble();
                System.out.println("Nota 3: ");

                double n3 = sc.nextDouble();
                System.out.println("Peso 3: ");
                double p3 = sc.nextDouble();

                System.out.printf("Media ponderada: %.2f", (n1*p1 + n2*p2 + n3*p3)/(p1 + p2 + p3));
                break;
            default:
                System.out.println("Entrada invalida");
        }
    }
}
