package ec.edu.puce;

public class Main {

    public static void main(String[] args) {

        sistema_turnos sistema = new ec.edu.puce.sistema_turnos();

        paciente p1 = new paciente("Juan Perez", "1723456789", 70, 1.75);
        paciente p2 = new paciente("Maria Lopez", "1712345678", 60, 1.65);
        paciente p3 = new paciente("Carlos Torres", "1709876543", 82, 1.80);

        sistema.registrarPaciente(p1);
        sistema.registrarPaciente(p2);
        sistema.registrarPaciente(p3);

        sistema.mostrarPacientes();

        sistema.atenderPaciente();
        sistema.atenderPaciente();
        sistema.atenderPaciente();
    }
}
