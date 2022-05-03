package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalV = 0;
        double totalP = 0;
        double total = 0;
        double primeiraPrestação = 0;
        boolean isPrimeiroP = true;

        for(int i=0; i<15; i++){
            char codigo;
            do{
                System.out.println("Código da transacao: ");
                codigo = sc.nextLine().charAt(0);
            }while(codigo != 'V' && codigo != 'P');
            System.out.println("Valor da transacao: ");
            double valor = sc.nextDouble();

            if(codigo == 'V'){
                totalV += valor;
                total += valor;
            }
            if(codigo == 'P'){
                totalP += valor;
                total += valor;
                if(isPrimeiroP){
                    primeiraPrestação = valor;
                    isPrimeiroP = false;
                }
            }
            sc.nextLine();
        }
        System.out.printf("Valor total das prestações a vista: R$ %.2f", totalV);
        System.out.printf("\nValor total das prestações a prazo: R$ %.2f", totalP);
        System.out.printf("\nValor total das compras efetuadas: R$ %.2f", total);
        System.out.printf("\nValor da primeira prestação a prazo: R$ %.2f", (primeiraPrestação/3));
    }
}
