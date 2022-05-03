package br.com.letscode.revisao1;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] gabarito = {1,1,1,3,3,3,2,2,2,1,1,3,3};
        int[] resposta = new int[13];
        boolean vencedor = true;

        System.out.println("Entre com seu jogo: ");
        for(int i=0; i<13; i++){
            resposta[i] = sc.nextInt();
        }

        for(int i=0; i<13; i++){
            if(gabarito[i] != resposta[i]){
                vencedor = false;
            }
        }

        System.out.println(vencedor == true ? "Ganhador" : "Não foi dessa vez =(");
    }
}
