package primerosConceptos;

public class Calculos_con_Math {
    public static void main(String[] args) {
        double raiz = Math.sqrt(9);

        double base = 5;

        double exponente = 3;

        int resultado = (int) Math.pow(base, exponente);

        System.out.println("resultado de " + base + " elevado a " + exponente + " es " + resultado);
    }
}
