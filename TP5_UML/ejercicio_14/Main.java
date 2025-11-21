package ejercicio14;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 14: EditorVideo - Proyecto - Render ===\n");

        Proyecto proyecto = new Proyecto("Documental Naturaleza", 45);
        System.out.println("Proyecto creado: " + proyecto);

        EditorVideo editor = new EditorVideo("Adobe Premiere Pro");
        System.out.println("\nEditor de Video creado: " + editor);

        System.out.println("\n--- Dependencia de Creación: EditorVideo crea Render ---");
        editor.exportar("MP4", proyecto);
        
        System.out.println("\nEl Render se crea dentro del método pero NO se conserva como atributo.");
    }
}
