package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] respostas = new char[5];

        System.out.println("Para as questoes a seguir, responda 's' para sim e 'n' para nao");

        System.out.println("Telefonou para a vítima?");
        respostas[0] = sc.nextLine().charAt(0);
        System.out.println("Esteve no local do crime?");
        respostas[1] = sc.nextLine().charAt(0);
        System.out.println("Mora perto da vítima?");
        respostas[2] = sc.nextLine().charAt(0);
        System.out.println("Devia para a vítima?");
        respostas[3] = sc.nextLine().charAt(0);
        System.out.println("Já trabalhou com a vítima?");
        respostas[4] = sc.nextLine().charAt(0);

        int cont=0;
        for(int i=0; i<5; i++){
            if(respostas[i] == 's'){
                cont++;
            }
        }

        if(cont==2){
            System.out.println("SUSPEITA");
        }
        else if(cont==3 || cont==4){
            System.out.println("CUMPLICE");
        }
        else if(cont==5){
            System.out.println("ASSASSINO");
        }
        else{
            System.out.println("INOCENTE");
        }
    }
}
