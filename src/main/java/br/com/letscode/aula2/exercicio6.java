package br.com.letscode.aula2;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for(int i=0; i<4; i++){
            System.out.println("Entre com o numero " + (i+1) + ":");
            int n = sc.nextInt();
            soma += Math.pow(n, 2);
        }

        System.out.println("Soma dos quadrados: " + soma);
    }
}
