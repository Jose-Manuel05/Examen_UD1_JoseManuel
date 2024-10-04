package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public Examen() {
    }

    public void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero...");
        int numero = 0;

        try {
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("Error introduce un nuemro entero");
            }
        } catch (InputMismatchException var4) {
            System.out.println("Error introduce un valor valido...");
            scanner.next();
        }

        int valorAbsolutoEntero = Math.abs(numero);
        System.out.println("El valor absoluto es: " + valorAbsolutoEntero);
    }

    public void ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("La obra de " + nombre);
        System.out.println("Introduce el ancho de la pared...");
        int ancho = scanner.nextInt();
        System.out.println("Introduce el largo de la pared...");
        int largo = scanner.nextInt();
        System.out.println("Introduce el ancho del azulejo...");
        int anchoazu = scanner.nextInt();
        System.out.println("Introduce el largo del azulejo...");
        int largoazu = scanner.nextInt();
    }
}
