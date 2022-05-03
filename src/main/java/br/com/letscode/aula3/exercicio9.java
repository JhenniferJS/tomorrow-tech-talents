package br.com.letscode.aula3;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[10];
        int cont = 0;

        System.out.println("Entre com 10 idades: ");
        for(int i=0; i<10; i++){
            idades[i] = sc.nextInt();
            if(idades[i] >= 18){
                cont++;
            }
        }

        System.out.println(cont + " pessoas possuem mais de 18 anos");
    }
}
