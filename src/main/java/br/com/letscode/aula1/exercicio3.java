package br.com.letscode.aula1;

public class exercicio3 {
    public static void main(String[] args) {
        double c = 5000;
        int t = 12;
        double i = 0.02;
        double m = c * Math.pow((1+i), t);

        System.out.println("Total a ser pago com juros: " + m);
    }
}
