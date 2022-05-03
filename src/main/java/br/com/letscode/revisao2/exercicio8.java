package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int cont = 0;

        for(int i=0; i<7;i++){
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Peso: ");
            double peso = sc.nextDouble();

            soma += idade;
            if(peso > 90){
                cont++;
            }
        }

        System.out.println("Quantidade de pessoas acima de 90 quilos: " + cont);
        System.out.println("Media das idades: " + soma/7);
    }
}
