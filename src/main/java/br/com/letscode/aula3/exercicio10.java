package br.com.letscode.aula3;

import java.util.Random;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numero = random.nextInt(100);
        int cont = 0;

        while(cont < 3){
            System.out.println("Tente acertar o numero! Você tem " + (3-cont) + " chance(s)");
            int i = sc.nextInt();
            cont++;

            if(cont == 3){
                System.out.println("Suas chances acabaram =( .. Mas voce pode jogar outra vez =)");
            }
            else{
                if(i == numero){
                    System.out.println("VOCE ACERTOU! Parabens");
                    break;
                }
                else if(i > numero){
                    System.out.println("Nao foi dessa vez.. Dica: o numero é menor do que o informado");
                }
                else{
                    System.out.println("Nao foi dessa vez.. Dica: o numero é maior do que o informado");
                }
            }
        }
    }
}
