package primerosConceptos;

import java.util.Scanner;

public class Entrada_Ejemplo_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre");

        String usuario = entrada.nextLine();

        System.out.println("Introduce tu edad");

        int edad = entrada.nextInt();

        System.out.println("Hola " + usuario + ". El año que viene tedras " + (edad + 1) + " años");
    }
}
