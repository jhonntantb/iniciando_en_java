package primerosConceptos;

import javax.swing.JOptionPane;

public class Entrada_Ejemplo_2 {

    public static void main(String[] args) {
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor:");
        String edad = JOptionPane.showInputDialog("introduce la edad por favotr:");
        int edad_usuario = Integer.parseInt(edad);
        System.out.println(
                "Hola " + nombre_usuario + " el año que viene tendras " + (edad_usuario + 1) + " años de edad");

    }
}
