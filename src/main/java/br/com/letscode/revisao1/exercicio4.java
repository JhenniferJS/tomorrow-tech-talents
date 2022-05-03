package br.com.letscode.revisao1;

public class exercicio4 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{10,20,30}};

        int soma = somaValores(matriz);
        System.out.println(soma);
    }

    public static int somaValores(int[][] matriz){
        int soma = 0;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}
