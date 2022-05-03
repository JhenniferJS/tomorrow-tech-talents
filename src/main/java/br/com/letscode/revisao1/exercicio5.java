package br.com.letscode.revisao1;

public class exercicio5 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {10, 20, 30}};
        int linha = 1;

        double media = mediaLinha(matriz, linha);
        System.out.println(media);
    }

    public static double mediaLinha(int[][] matriz, int linha) {
        int soma = 0;

        for (int j = 0; j < matriz[0].length; j++) {
            soma += matriz[linha][j];
        }

        return soma/matriz[0].length;
    }
}
