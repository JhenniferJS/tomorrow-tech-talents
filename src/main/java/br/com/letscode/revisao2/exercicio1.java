package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidades de anos em que fuma: ");
        int anos = sc.nextInt();
        System.out.println("Numero de cigarros fumados por dia: ");
        int qtdCigarros = sc.nextInt();
        System.out.println("Preço de uma carteira com 20 cigarros: ");
        double preco = sc.nextDouble();

        System.out.println("Quantidade de dinheiro gasto com cigarros: " + (anos*365*qtdCigarros*preco/20));
    }
}
