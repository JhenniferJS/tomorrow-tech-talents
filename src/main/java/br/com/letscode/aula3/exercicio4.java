package br.com.letscode.aula3;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int aux;

        System.out.println("Entre com 5 numeros: ");
        for(int i=0; i<5; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            for(int j = i; j < 5; j++) {
                if(array[j] > array[i]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        System.out.println("Numeros em ordem decrescente: ");
        for(int n : array){
            System.out.print(n + " ");
        }
    }
}
