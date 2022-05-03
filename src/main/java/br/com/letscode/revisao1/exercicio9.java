package br.com.letscode.revisao1;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[3][5];
        int[] somaLinha = new int[3];
        int[] somaColuna = new int[5];

        System.out.println("Entre com 15 numeros:");
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                numeros[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            int linha = 0;
            for(int j=0; j<5; j++){
                linha += numeros[i][j];
                System.out.print(numeros[i][j] + " ");
            }
            somaLinha[i] = linha;
            System.out.println();
        }

        for(int j=0; j<5; j++){
            int coluna = 0;
            for(int i=0; i<3; i++){
                coluna += numeros[i][j];
            }
            somaColuna[j] = coluna;
        }

        for(int l : somaLinha){
            System.out.print(l + " ");
        }
        System.out.println();
        for(int c : somaColuna){
            System.out.print(c + " ");
        }
    }
}
