package br.com.letscode.aula1;

public class exercicio1 {
    public static void main(String[] args) {

        double celsius = 25.0;
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;
        double rankine = celsius * 1.8 + 32 + 459.67;
        double reaumur = celsius * 0.8;

        System.out.println("Kelvin: " + kelvin);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Rankine: " + rankine);
        System.out.println("Réaumur: " + reaumur);
    }
}
