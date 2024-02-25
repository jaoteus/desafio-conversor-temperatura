package org.example;

public class Main {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static double grausCelsius;
    public static double grausKelvin;
    public static double grausFahrenheit;

    public static void main(String[] args) {
        System.out.print("Digite o valor em graus celsius: ");
        grausCelsius = scanner.nextFloat();

        grausKelvin = getGrausKelvin(grausCelsius);
        grausFahrenheit = getGrausFahrenheit(grausCelsius);

        System.out.println("Graus Kelvin: " + grausKelvin +
                "\nGraus Fahrenheit " + grausFahrenheit);
    }

    public static double getGrausKelvin(double grausCelsius){
        return grausCelsius + 273.15;
    }
    public static double getGrausFahrenheit(double grausCelsius){
        return (grausCelsius * 1.8) + 32;
    }
}