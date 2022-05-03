package br.com.letscode.revisao1;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] g = {'a','c','e','b','d','d','a','b','e','e'};
        char[] r = new char[10];
        int cont = 0;

        System.out.println("Entre com suas respostas: ");
        for(int i=0; i<10; i++){
            r[i] = sc.nextLine().charAt(0);
        }

        for(int i=0; i<10; i++){
            if(g[i] == r[i]){
                cont++;
            }
        }

        System.out.println(cont >= 6 ? "APROVADO" : "REPROVADO");
    }
}
