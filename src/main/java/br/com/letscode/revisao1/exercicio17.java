package br.com.letscode.revisao1;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int habitantes = 0;
        int totalFilhos = 0;
        double totalSalario = 0;
        double maiorSalario = 0;
        int salarioMenor150 = 0;
        boolean isHabitanteValido = true;

        while(isHabitanteValido){
            System.out.println("Digite o salario:");
            double salario = sc.nextDouble();

            System.out.println("Numero de filhos:");
            int numFilhos = sc.nextInt();

            isHabitanteValido = salario >= 0;

            if(isHabitanteValido){
                habitantes++;
                totalFilhos += numFilhos;
                totalSalario += salario;

                if(salario > maiorSalario){
                    maiorSalario = salario;
                }

                if(salario < 150){
                    salarioMenor150++;
                }
            }
        }

        System.out.println("Media do salario da populacao: " + totalSalario/habitantes);
        System.out.println("Media do numero de filhos: " + totalFilhos/habitantes);
        System.out.println("Maior salario: " + maiorSalario);
        System.out.println("Percentual de salario inferior a 150: " + salarioMenor150/habitantes * 100 + "%");
    }
}
