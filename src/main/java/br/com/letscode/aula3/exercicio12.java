package br.com.letscode.aula3;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do{
            System.out.println("Nome: (maior que 3 caracteres)");
            nome = sc.nextLine();
        }while (nome.length() < 4);

        do{
            System.out.println("Idade: (entre 0 e 150)");
            idade = sc.nextInt();
        }while((idade <= 0 || idade >= 150));

        do{
            System.out.println("Salario: (maior que 0)");
            salario = sc.nextDouble();
        }while (salario <= 0);

        sc.nextLine();
        do{
            System.out.println("Sexo: (f ou m)");
            sexo = sc.nextLine();
        }while(!sexo.equals("f") && !sexo.equals("m"));

        do{
            System.out.println("Estado civil: (s, c, v, d)");
            estadoCivil = sc.nextLine();
        }while(!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}
