//Facundo Marroquin A01383541 POO Primeros pasos en Java

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operacion;

        System.out.println("primer número:");
        num1 = scanner.nextDouble();

        System.out.println("segundo número:");
        num2 = scanner.nextDouble();

        System.out.println("operación (+, -, *, /):");
        operacion = scanner.next().charAt(0);

        double resultado;

        switch (operacion) {
            case '+':
                resultado = sumar(num1, num2);
                System.out.println("El resultado: " + resultado);
                break;
            case '-':
                resultado = restar(num1, num2);
                System.out.println("El resultado: " + resultado);
                break;
            case '*':
                resultado = multiplicar(num1, num2);
                System.out.println("El resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                    System.out.println("El resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
