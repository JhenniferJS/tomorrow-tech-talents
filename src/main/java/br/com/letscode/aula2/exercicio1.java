package br.com.letscode.aula2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Turma: ");
        String turma = sc.nextLine();

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        System.out.println("Aluno(a): " + nome);
        System.out.println("Turma: " + turma);
        System.out.printf("Média das notas: %.2f", media);
    }
}
