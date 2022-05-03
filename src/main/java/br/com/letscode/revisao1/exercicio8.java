package br.com.letscode.revisao1;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exist = false;
        int[] numeros = new int[10];
        System.out.println("Entre com 10 valores ate 100: ");
        for(int i=0; i<10; i++){
            numeros[i] = sc.nextInt();
        }

        System.out.println("Entre com um numero: ");
        int n = sc.nextInt();

        for(int i : numeros){
            if(i == n){
                exist = true;
            }
        }

        System.out.println(exist == true ? "O valor existe no conjunto" : "O valor não existe no conjunto");
    }
}
