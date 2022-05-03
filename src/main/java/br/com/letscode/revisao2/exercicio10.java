package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaIdadeOtimo = 0;
        int contOtimo = 0;
        int contRegular = 0;
        int contBom = 0;

        for(int i=0; i<5; i++){
            System.out.println("Idade: ");
            int idade = sc.nextInt();

            int opniao;
            do{
                System.out.println("Deixe sua opniao:");
                System.out.println("3 - ótimo");
                System.out.println("2 - bom");
                System.out.println("1 - regular");
                opniao = sc.nextInt();
            }while (opniao != 1 && opniao != 2 && opniao !=3);

            if(opniao == 1){
                contRegular++;
            }
            else if(opniao == 2){
                contBom++;
            }
            else{
                somaIdadeOtimo += idade;
                contOtimo++;
            }
        }

        System.out.println("Média das idades das pessoas que responderam ótimo: " + somaIdadeOtimo/contOtimo);
        System.out.println("Quantidade de pessoas que respondeu regular: " + contRegular);
        System.out.println("Percentagem de pessoas que responderam “bom” entre todos os espectadores analisados: " + (double)(contBom/5));
    }
}
