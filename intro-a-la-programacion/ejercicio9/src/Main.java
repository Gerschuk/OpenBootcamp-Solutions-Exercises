import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {

       //Instance of Cliente
       Cliente cliente = new Cliente();
       cliente.setEdad(34);
       cliente.setNombre("Pedro");
       cliente.setTelefono("+5492200000");
       cliente.setCredito(100.5);
       System.out.println("Edad del cliente: " + cliente.getEdad());
       System.out.println("Nombre del cliente: " + cliente.getNombre());
       System.out.println("Teléfono del cliente: " + cliente.getTelefono());
       System.out.println("Crédito del cliente: " + cliente.getCredito() + "$");
        System.out.println("-----------------------------------------------");

       //Instance of Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(25);
        trabajador.setNombre("Juan");
        trabajador.setTelefono("+354568888");
        trabajador.setSalario(1000);
        System.out.println("Edad del trabajador: " + trabajador.getEdad());
        System.out.println("Nombre del trabajador: " + trabajador.getNombre());
        System.out.println("Teléfono del trabajador: " + trabajador.getTelefono());
        System.out.println("Crédito del trabajador: " + trabajador.getSalario() + "Euros");
    }
}


class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}