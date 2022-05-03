package br.com.letscode.aula3;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        System.out.println("Entre com 10 numeros inteiros e positivos:");
        for(int i=0; i<10; i++){
            int n = sc.nextInt();
            soma += n;
            if(n > maior){
                maior = n;
            }
            if(n < menor){
                menor = n;
            }
        }

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Media: " + soma/10);
    }
}
