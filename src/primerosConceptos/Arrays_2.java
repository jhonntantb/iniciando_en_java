package primerosConceptos;

import javax.swing.JOptionPane;

public class Arrays_2 {
    public static void main(String[] args) {
        String[] paises = new String[8];
        for (int i = 0; i < 8; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce pais");
        }

        for (String elemento : paises) {
            System.out.println("Pais: " + elemento);
        }
    }
}
