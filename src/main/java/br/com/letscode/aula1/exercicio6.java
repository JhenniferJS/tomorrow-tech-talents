package br.com.letscode.aula1;

public class exercicio6 {
    public static void main(String[] args) {
        double real = 1000;
        double euro = real/5.11;
        double dolar = real/4.7;
        double libra = real/6.13;

        System.out.println(real + " reais equivalem a " + euro + " euros");
        System.out.println(real + " reais equivalem a " + dolar + " dolares");
        System.out.println(real + " reais equivalem a " + libra + " libras");
    }
}
