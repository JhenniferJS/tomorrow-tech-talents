package br.com.letscode.aula2;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] praias = new String[5];
        double[] distancia = new double[5];
        double max = Double.MIN_VALUE;
        int posicao = 0;
        int cont = 0;
        double soma = 0;

        for(int i=0; i<5; i++){
            System.out.println("Nome da praia: ");
            praias[i] = sc.nextLine();
            System.out.println("Distancia do hotel: ");
            distancia[i] = sc.nextDouble();
            if(distancia[i] > max){
                posicao = i;
                max = distancia[i];
            }
            if(distancia[i] > 10 && distancia[i] < 15){
                cont++;
            }
            soma += distancia[i];
            sc.nextLine();
        }

        System.out.println("Praia mais distante do hotel: " + praias[posicao] + ", estando a " + distancia[posicao] + "km de distancia");
        System.out.println("Quantidade de praias localizadas a mais de 10km e menos de 15km do hotel: " + cont);
        System.out.printf("Media de distancia das praias ate o hotel: %.2f", (soma/5));
    }
}
