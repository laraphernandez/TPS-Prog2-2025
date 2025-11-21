import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Agregar curso (sincronizando ambos lados)
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            // Sincronizar el lado del curso
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    // Eliminar curso (sincronizando ambos lados)
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            // Sincronizar el lado del curso
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    // Listar cursos
    public void listarCursos() {
        System.out.println("Cursos del profesor " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  No tiene cursos asignados.");
        } else {
            for (Curso c : cursos) {
                System.out.println("  - " + c.getCodigo() + ": " + c.getNombre());
            }
        }
    }

    // Mostrar información del profesor
    public void mostrarInfo() {
        System.out.println("===============================");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
        System.out.println("===============================");
    }
}
