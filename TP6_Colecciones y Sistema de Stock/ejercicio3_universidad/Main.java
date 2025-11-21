public class Main {
    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRÁCTICO 6 - EJERCICIO 3: UNIVERSIDAD, PROFESOR Y CURSO ===\n");

        // Crear universidad
        Universidad utn = new Universidad("Universidad Tecnológica Nacional");
        System.out.println("Universidad creada: " + utn.getNombre() + "\n");

        // Tarea 1: Crear al menos 3 profesores y 5 cursos
        System.out.println("TAREA 1: Creando profesores y cursos...");
        
        Profesor prof1 = new Profesor("P001", "Dr. Juan Pérez", "Programación");
        Profesor prof2 = new Profesor("P002", "Dra. María González", "Bases de Datos");
        Profesor prof3 = new Profesor("P003", "Ing. Carlos Rodríguez", "Redes");
        
        Curso curso1 = new Curso("C001", "Programación I");
        Curso curso2 = new Curso("C002", "Programación II");
        Curso curso3 = new Curso("C003", "Base de Datos I");
        Curso curso4 = new Curso("C004", "Redes y Comunicaciones");
        Curso curso5 = new Curso("C005", "Algoritmos y Estructuras de Datos");

        // Tarea 2: Agregar profesores y cursos a la universidad
        System.out.println("\nTAREA 2: Agregando profesores y cursos a la universidad...");
        utn.agregarProfesor(prof1);
        utn.agregarProfesor(prof2);
        utn.agregarProfesor(prof3);
        
        utn.agregarCurso(curso1);
        utn.agregarCurso(curso2);
        utn.agregarCurso(curso3);
        utn.agregarCurso(curso4);
        utn.agregarCurso(curso5);

        // Tarea 3: Asignar profesores a cursos
        System.out.println("\nTAREA 3: Asignando profesores a cursos...");
        utn.asignarProfesorACurso("C001", "P001");
        utn.asignarProfesorACurso("C002", "P001");
        utn.asignarProfesorACurso("C005", "P001");
        utn.asignarProfesorACurso("C003", "P002");
        utn.asignarProfesorACurso("C004", "P003");

        // Tarea 4: Listar cursos con su profesor y profesores con sus cursos
        System.out.println("\nTAREA 4: Listando cursos y profesores...");
        utn.listarCursos();
        utn.listarProfesores();
        
        System.out.println("\nDetalle de cursos por profesor:");
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();

        // Tarea 5: Cambiar el profesor de un curso
        System.out.println("\nTAREA 5: Cambiando profesor de un curso...");
        System.out.println("Cambiando profesor del curso Programación II...");
        utn.asignarProfesorACurso("C002", "P002");
        
        System.out.println("\nVerificando sincronización:");
        curso2.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();

        // Tarea 6: Remover un curso
        System.out.println("\nTAREA 6: Removiendo un curso...");
        utn.eliminarCurso("C005");
        
        System.out.println("\nVerificando que no aparece en la lista del profesor:");
        prof1.listarCursos();

        // Tarea 7: Remover un profesor
        System.out.println("\nTAREA 7: Removiendo un profesor...");
        utn.eliminarProfesor("P003");
        
        System.out.println("\nVerificando que el curso quedó sin profesor:");
        curso4.mostrarInfo();

        // Tarea 8: Mostrar reporte
        System.out.println("\nTAREA 8: Reporte de cursos por profesor...");
        utn.mostrarReporteCursosPorProfesor();

        // Estado final
        System.out.println("\n=== ESTADO FINAL ===");
        utn.listarProfesores();
        utn.listarCursos();
    }
}
