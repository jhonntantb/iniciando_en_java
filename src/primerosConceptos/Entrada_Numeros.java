package primerosConceptos;

import javax.swing.JOptionPane;

public class Entrada_Numeros {
    public static void main(String[] args) {

        double c = 1000.0;

        System.out.printf("%1.4f", c / 3);

        String num1 = JOptionPane.showInputDialog("Introduce un número");
        double num2 = Double.parseDouble(num1);

        System.out.print("la raiz de " + num2 + " es ");
        System.out.printf("%1.2f", Math.sqrt(num2));
    }
}
