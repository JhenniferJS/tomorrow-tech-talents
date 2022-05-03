package br.com.letscode.revisao1;

import java.util.Random;

public class exercicio1 {
    public static void main(String[] args) {
        Random random = new Random();

        double[] numeros = new double[10];

        for(int i=0; i<10; i++){
            numeros[i] = random.nextDouble() * 100;
        }

        for(double n: numeros){
            System.out.println(n);
        }
    }
}
