package ec.edu.puce;

public class paciente {

    private String nombre;
    private String identificacion;
    private double peso;
    private double altura;

    public paciente(String nombre, String identificacion, double peso, double altura) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.peso = peso;
        this.altura = altura;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    public String getNombre() {
        return nombre;
    }
}
