package primerosConceptos;

import javax.swing.*;

public class Acceso_Aplicacion {
    public static void main(String[] args) {
        String clave = "Jhonatan";
        String pass = "";

        while (clave.equals(pass) == false) {

            pass = JOptionPane.showInputDialog("Introduce la contraseña");
            if (clave.equals(pass) == false) {
                System.out.println("Contraseña incorrecta");
            }
        }

        System.out.println("Contraseña correcta. Acceso Permitido");
    }
}
