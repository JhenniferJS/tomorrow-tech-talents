package br.com.letscode.aula1;

public class exercicio13 {
    public static void main(String[] args) {
        double valorCusto = 55600;
        double imposto = 0.45;
        double distribuidor = 0.28;

        System.out.println("Custo de fabrica: " + valorCusto);
        System.out.println("Custo ao consumidor final: " + (valorCusto + (valorCusto*imposto) + (valorCusto*distribuidor)));
    }
}
