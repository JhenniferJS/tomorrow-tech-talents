package br.com.letscode.revisao1;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        Double[] preco = new Double[n];
        Integer[] estoque = new Integer[n];

        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.printf("Digite o nome do produto %d: \n", (i+1));
            nome[i] = sc.nextLine();

            System.out.printf("Digite o preço do produto %d: \n", (i+1));
            preco[i] = sc.nextDouble();

            System.out.printf("Digite a qauntidade em estoque do produto %d: \n", (i+1));
            estoque[i] = sc.nextInt();
        }

        double valorDoEstoque = 0;
        double valorDasMercadorias = 0;

        for(int i = 0; i<n; i++){
            valorDoEstoque += estoque[i] * preco[i];
            valorDasMercadorias += preco[i];
        }

        System.out.println("Valor total do estoque: " + valorDoEstoque);
        System.out.println("Media das mercadorias: " + valorDasMercadorias/n);
    }
}
