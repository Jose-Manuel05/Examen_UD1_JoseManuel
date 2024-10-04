package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    //Inicio del ejercicio 1
    public void ejercicio1 () {

        Scanner scanner = new Scanner(System.in);

        //Pido un numero al usuario
        System.out.println("Introduce un numero...");
        //Establezco el valor de la variable numero a 0
        int numero = 0;

        //Inicio del try catch
        try {

            numero = scanner.nextInt();

            //Condicion para no poder meter numeros negativos
            if (numero < 0) {
                System.out.println("Error introduce un nuemro entero");
            }

        //Si se cumple el siguente error muestra un mensaje por la pantalla
        }catch (InputMismatchException error){

            System.out.println("Error introduce un valor valido...");
            scanner.next();

        }

        //Operacion para el valor absoluto de un numero
        int valorAbsolutoEntero = Math.abs(numero);
        System.out.println("El valor absoluto es: " +valorAbsolutoEntero);

    }





    //Inicio del ejercicio 2
    public void ejercicio2 () {

        Scanner scanner = new Scanner(System.in);

        //Preguntamos el nombre del usuario
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        //Establecemos el inicio de las preguntas
        System.out.println("La obra de " + nombre);
        //Preguntamos el ancho de la pared y lo guardamos
        System.out.println("Introduce el ancho de la pared...");
        int ancho = scanner.nextInt();
        //Preguntamos el largo de la pared y lo guardamos
        System.out.println("Introduce el largo de la pared...");
        int largo = scanner.nextInt();
        //Preguntamos el ancho  de los azulejos y lo guardamos
        System.out.println("Introduce el ancho del azulejo...");
        int anchoazu = scanner.nextInt();
        //Preguntamos el largo  de los azulejos y lo guardamos
        System.out.println("Introduce el largo del azulejo...");
        int largoazu = scanner.nextInt();

    }

}
