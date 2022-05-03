package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();

        if(idade >= 18 && idade <= 67){
            System.out.println("Voce pode doar sangue :)");
        }
        else{
            System.out.println("Voce nao pode doar sangue :(");
        }
    }
}
