package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();
        System.out.println("Quantidade de horas trabalhada no mes: ");
        double horas = sc.nextDouble();

        double salarioBruto = valorHora*horas;
        double ir;
        double sindicato = 0.03;

        if(salarioBruto <= 900){
            ir = 0;
        }
        else if(salarioBruto <= 1500){
            ir = 0.05;
        }
        else if(salarioBruto <= 2500){
            ir = 0.1;
        }
        else{
            ir = 0.2;
        }

        double salarioLiquido = salarioBruto - (salarioBruto*ir) - (salarioBruto*sindicato);
        System.out.println("Folha de pagamento:");
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("IR: " + salarioBruto*ir);
        System.out.println("Sindicato: " + salarioBruto*sindicato);
        System.out.println("FGTS: " + salarioBruto*0.11);
        System.out.println("Salario liquido: " + salarioLiquido);
    }
}
