package ejercicio9;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 9: CitaMédica - Paciente - Profesional ===\n");

        Paciente paciente = new Paciente("Roberto Silva", "OSDE");
        System.out.println("Paciente creado: " + paciente);

        Profesional profesional = new Profesional("Dra. Susana López", "Cardiología");
        System.out.println("\nProfesional creado: " + profesional);

        CitaMedica cita = new CitaMedica("2024-12-15", "10:30", paciente, profesional);
        System.out.println("\nCita Médica creada: " + cita);

        System.out.println("\n--- Asociación Unidireccional: CitaMédica → Paciente ---");
        System.out.println("La cita conoce al paciente: " + cita.getPaciente().getNombre());
        
        System.out.println("\n--- Asociación Unidireccional: CitaMédica → Profesional ---");
        System.out.println("La cita conoce al profesional: " + cita.getProfesional().getNombre());
    }
}
