package br.com.letscode.aula3;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1;
        int n;
        do{
            System.out.println("Entre com um inteiro maior que zero: ");
            n = sc.nextInt();
        }while (n <= 0);

        for(int i=n; i>0; i--){
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
