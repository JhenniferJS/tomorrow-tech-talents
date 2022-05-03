package br.com.letscode.aula3;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        if(n1 < n2){
            for(int i=(n1+1); i<n2; i++){
                System.out.print(i + " ");
            }
        } else{
            for(int i=(n2+1); i<n1; i++){
                System.out.print(i + " ");
            }
        }
    }
}
