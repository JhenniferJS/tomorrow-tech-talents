package br.com.letscode.aula3;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            int n;
            do{
                System.out.println("Entre com um inteiro diferente de zero: ");
                n = sc.nextInt();
            }while (n == 0);

            if(n%2 == 0){
                System.out.println(n + " é par");
            } else {
                System.out.println(n + " é impar");
            }

            int op;
            do {
                System.out.println("Para inserir mais numeros digite 1, para sair digite 0");
                op = sc.nextInt();
            }while (op!=1 && op!=0);

            continuar = op == 1 ? true : false;
        }
    }
}
