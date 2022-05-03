package br.com.letscode.aula3;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu peso? (Kg)");
        double peso = sc.nextDouble();
        System.out.println("Qual sua altura? (m)");
        double altura = sc.nextDouble();

        double imc = peso/(Math.pow(altura,2));

        if(imc < 18.5){
            System.out.printf("Você está abaixo do peso. Seu IMC é %.2f", imc);
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.printf("Você está com peso normal. Seu IMC é %.2f", imc);
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.printf("Você está com excesso de peso. Seu IMC é %.2f", imc);
        }
        else{
            System.out.printf("Você está acima do peso. Seu IMC é %.2f", imc);
        }
    }
}
