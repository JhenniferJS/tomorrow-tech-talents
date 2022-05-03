package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Velocidade maxima permitida na via: ");
        int velocidadePermitida = sc.nextInt();
        System.out.println("Velocidade em que o motorista dirigia: ");
        int velocidadeMotorista = sc.nextInt();

        int velocidadeUltrapassa = velocidadeMotorista - velocidadePermitida;

        if(velocidadeUltrapassa > 0 && velocidadeUltrapassa <= 10){
            System.out.println("Multa no valor de R$50,00");
        }
        else if(velocidadeUltrapassa >= 11 && velocidadeUltrapassa <= 30){
            System.out.println("Multa no valor de R$100,00");
        }
        else if(velocidadeUltrapassa > 30){
            System.out.println("Multa no valor de R$200,00");
        }
        else{
            System.out.println("Velocidade esta dentro da permitida");
        }
    }
}
