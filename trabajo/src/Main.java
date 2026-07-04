package ec.edu.puce;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        sistema_turnos sistema = new sistema_turnos();

        // Pacientes registrados por defecto
        paciente p1 = new paciente("Luis Andrade", "1723456789", 72, 1.74);
        paciente p2 = new paciente("Valeria Mena", "1712345678", 58, 1.63);
        paciente p3 = new paciente("David Herrera", "1709876543", 80, 1.81);

        sistema.registrarPaciente(p1);
        sistema.registrarPaciente(p2);
        sistema.registrarPaciente(p3);

        System.out.println("\n====================================");
        System.out.println("SISTEMA DE ATENCIÓN DE PACIENTES");
        System.out.println("====================================");

        // Registrar nuevos pacientes
        System.out.print("\n¿Cuántos pacientes nuevos desea registrar?: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        for (int i = 1; i <= cantidad; i++) {

            System.out.println("\n--- Registro del paciente " + i + " ---");

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Identificación: ");
            String identificacion = teclado.nextLine();

            System.out.print("Peso (kg) solo en numero: ");
            double peso = Double.parseDouble(teclado.nextLine().replace(",", "."));

            System.out.print("Altura (m) ejemplo: 1.70: ");
            double altura = Double.parseDouble(teclado.nextLine().replace(",", "."));

            paciente nuevo = new paciente(nombre, identificacion, peso, altura);

            sistema.registrarPaciente(nuevo);
        }

        System.out.println("\n====================================");
        System.out.println("PACIENTES EN ESPERA");
        System.out.println("====================================");

        sistema.mostrarPacientes();

        System.out.println("\n====================================");
        System.out.println("INICIO DE LA ATENCIÓN");
        System.out.println("====================================");

        while (true) {

            System.out.print("\n¿Desea atender al siguiente paciente? (S/N): ");
            String opcion = teclado.nextLine();

            if (opcion.equalsIgnoreCase("S")) {
                sistema.atenderPaciente();
            } else {
                break;
            }
        }

        System.out.println("\nGracias por utilizar el sistema.");
        teclado.close();
    }
}