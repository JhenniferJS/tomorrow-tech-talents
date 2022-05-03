package br.com.letscode.revisao2;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quando contatos é possivel adicionar na sua agenda? ");
        int n = sc.nextInt();
        String[][] agenda = new String[n][3];

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                System.out.print(agenda[i][j] + " ");
            }
            System.out.println();
        }
        boolean adicionar = true;

        while(adicionar){
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Inserir contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Sair");
            int op = sc.nextInt();

            switch(op){
                case 1:
                    boolean adicionado = false;
                    for(int i=0; i<n; i++){
                        if(agenda[i][0] == null){
                            sc.nextLine();
                            System.out.println("Codigo: ");
                            agenda[i][0] = sc.nextLine();
                            System.out.println("Telefone: ");
                            agenda[i][1] = sc.nextLine();
                            System.out.println("Idade: ");
                            agenda[i][2] = sc.nextLine();
                            adicionado = true;
                            break;
                        }
                    }
                    System.out.println(adicionado == true ? "Adicionado com sucesso" : "Agenda lotada");
                    break;
                case 2:
                    boolean removido = false;
                    sc.nextLine();
                    System.out.println("Qual o codigo do contato que deseja remover? ");
                    String codigo = sc.nextLine();
                    for(int i=0; i<n; i++){
                        if(agenda[i][0] != null){
                            if(agenda[i][0].equals(codigo)){
                                agenda[i][0] = null;
                                agenda[i][1] = null;
                                agenda[i][2] = null;
                                removido = true;
                                break;
                            }
                        }
                    }
                    System.out.println(removido == true? "Contato removido com sucesso" : "Contato nao encontrado");
                    break;
                case 3:
                    adicionar = false;
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

            System.out.println();
            System.out.println("Sua agenda: ");
            for(int i=0; i<n; i++){
                if(agenda[i][0] != null){
                    System.out.println("Codigo: " + agenda[i][0] + " | Telefone: " + agenda[i][1] + " | Idade: " + agenda[i][2]);
                }
            }
            System.out.println();
        }

    }
}
