package primerosConceptos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Areas {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);

        System.out.println("Elije una opción: \n1: cuadrado \n2: Reactángulo \n3: Triángulo \n4: Círculo");

        int figura = entrada.nextInt();

        switch (figura) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("Area del cuadrado es: " + (Math.pow(lado, 2)));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("Area del rectangulo es: " + base * altura);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("Area del triangulo es: " + (base * altura / 2));
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("Area del circulo es:");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;
            default:
                System.out.println("La opcion no es correcta ");
        }
    }

}
