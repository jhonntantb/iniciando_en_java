package Poo;

public class Constantes_Pruebas {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Empleados Trabajador1 = new Empleados("Paco");
        Empleados Trabajador2 = new Empleados("Ana");
        Empleados Trabajador3 = new Empleados("Antonio");
        Empleados Trabajador4 = new Empleados("Maria");

        Trabajador1.cambiaSeccion("RRHH");

        System.out.println(Trabajador1.devuelveDatos() + "\n" + Trabajador2.devuelveDatos()
                + "\n" + Trabajador3.devuelveDatos() + "\n" + Trabajador4.devuelveDatos());

        System.out.println(Empleados.dameIdSiguiente());
    }
}

class Empleados {

    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administración";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public void cambiaSeccion(String seccion) {// setter
        this.seccion = seccion;
    }

    public String devuelveDatos() {
        return "El nombre es: " + nombre + ", la seccion es: " + seccion + " y el Id es: " + Id;
    }

    public static String dameIdSiguiente() {
        return "El id siguinte es: " + IdSiguiente;
    }

    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente = 1;
}
