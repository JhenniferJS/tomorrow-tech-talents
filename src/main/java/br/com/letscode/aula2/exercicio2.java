package br.com.letscode.aula2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Endereco: ");
        String endereco = sc.nextLine();
        System.out.println("CEP: ");
        String cep = sc.nextLine();
        System.out.println("Telefone: ");
        String telefone = sc.nextLine();

        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(cep + " " + telefone);
    }
}
