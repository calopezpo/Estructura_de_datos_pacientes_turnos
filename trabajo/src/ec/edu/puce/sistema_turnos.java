package ec.edu.puce;

import java.util.LinkedList;
import java.util.Queue;

public class sistema_turnos {

    private Queue<paciente> colaPacientes = new LinkedList<>();

    public void registrarPaciente(paciente paciente) {
        colaPacientes.offer(paciente);
        System.out.println("Paciente registrado. En espera: " + colaPacientes.size());
    }

    public void atenderPaciente() {

        if (colaPacientes.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
            return;
        }

        paciente p = colaPacientes.poll();

        System.out.println("\nPaciente atendido:");
        p.mostrarDatos();

        System.out.println("Restantes: " + colaPacientes.size());
    }

    public void mostrarPacientes() {

        System.out.println("\nPacientes en espera:");

        for (paciente p : colaPacientes) {
            System.out.println(p.getNombre());
        }
    }
}