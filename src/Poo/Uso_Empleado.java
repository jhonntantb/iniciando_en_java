package Poo;

import java.util.*;

public class Uso_Empleado {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Jefatura jefe_RRHH = new Jefatura("juan", 55000, 2006, 9, 25);

        jefe_RRHH.establece_incentivo(2570);

        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 02, 06);
        misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 07);
        misEmpleados[3] = new Empleado("Antonio Fernandez");
        misEmpleados[4] = jefe_RRHH;// polimorfismo en acción. Principio de sutitución
        misEmpleados[5] = new Jefatura("Carlos", 95000, 2006, 9, 25);

        Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];
        jefa_finanzas.establece_incentivo(55000);

        jefe_RRHH.subeSueldo(5);

        for (Empleado e : misEmpleados) {
            e.subeSueldo(5);
        }

        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo()
                    + " Fecha de alta: " + e.dameFechaContrato());
        }

    }
}

class Empleado {

    public Empleado(String nom, double suel, int agno, int mes, int dia) {

        nombre = nom;
        sueldo = suel;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
    }

    // sobrecarga de constructures
    public Empleado(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }

    public String dameNombre() {// getter
        return nombre + " Id: " + Id;
    }

    public double dameSueldo() {// getter
        return sueldo;
    }

    public Date dameFechaContrato() {// getter
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente;

}

class Jefatura extends Empleado {

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }

    public void establece_incentivo(double b) {
        incentivo = b;
    }

    public double dameSueldo() {
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }

    private double incentivo;
}
