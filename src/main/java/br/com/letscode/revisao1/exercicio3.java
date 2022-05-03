package br.com.letscode.revisao1;

public class exercicio3 {
    public static void main(String[] args) {
        double[][] matriz = {{1.5,2.7,3.65},{10.0,20.99,30.1}};

        double maior = maiorValor(matriz);
        System.out.println(maior);
    }

    public static double maiorValor(double[][] matriz){
        double maior = Double.MIN_VALUE;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
}
