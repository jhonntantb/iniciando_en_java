package primerosConceptos;

import javax.swing.JOptionPane;

public class Comprueba_email_bucle_for {
    public static void main(String[] args) {

        int arroba = 0;
        boolean punto = false;

        String email = JOptionPane.showInputDialog("Introduce el email");

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                arroba++;
            }
            if (email.charAt(i) == '.') {
                punto = true;
            }
        }

        if (arroba == 1 && punto) {
            System.out.println("el email es correcto");
        } else {
            System.out.println("el email no es correcto");
        }
    }
}
