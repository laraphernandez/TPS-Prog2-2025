public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Setear profesor (sincronizando lso dos lados)
    public void setProfesor(Profesor p) {
        // Si ya tenía un profesor previo, quitarse de su lista
        if (this.profesor != null && this.profesor != p) {
            this.profesor.eliminarCurso(this);
        }

        // Asignar el nuevo profesor
        this.profesor = p;

        // Agregar este curso a la lista del nuevo profesor
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    // Mostrar información del curso
    public void mostrarInfo() {
        System.out.println("===============================");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: Sin asignar");
        }
        System.out.println("===============================");
    }
}
