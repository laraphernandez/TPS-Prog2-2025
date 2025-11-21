import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Agregar profesor
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
        System.out.println("Profesor agregado: " + p.getNombre());
    }

    // Agregar curso
    public void agregarCurso(Curso c) {
        cursos.add(c);
        System.out.println("Curso agregado: " + c.getNombre());
    }

    // Asignar profesor a curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre());
        } else {
            if (curso == null) {
                System.out.println("Curso con código " + codigoCurso + " no encontrado.");
            }
            if (profesor == null) {
                System.out.println("Profesor con ID " + idProfesor + " no encontrado.");
            }
        }
    }

    // Listar profesores
    public void listarProfesores() {
        System.out.println("\n=== PROFESORES DE " + nombre + " ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    // Listar cursos
    public void listarCursos() {
        System.out.println("\n=== CURSOS DE " + nombre + " ===");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // Buscar profesor por ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // Buscar curso por código
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    // Eliminar curso
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper relación con profesor si existe
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("Curso con código " + codigo + " no encontrado.");
        }
    }

    // Eliminar profesor
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null los cursos que dictaba
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso c : cursosDelProfesor) {
                c.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("Profesor con ID " + id + " no encontrado.");
        }
    }

    // Mostrar reporte: cantidad de cursos por profesor
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " (" + p.getEspecialidad() + "): " 
                             + p.getCursos().size() + " curso(s)");
        }
    }
}
