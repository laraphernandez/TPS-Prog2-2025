# Trabajo Práctico 6 - Colecciones y Sistema de Stock
## Programación II - UTN


## Estructura del Proyecto

```
TP6_Colecciones/
├── ejercicio1_stock/          # Sistema de gestión de inventario
│   ├── CategoriaProducto.java # Enum con categorías
│   ├── Producto.java          # Clase Producto
│   ├── Inventario.java        # Clase Inventario (1 a N)
│   └── Main.java              # Programa principal
│
├── ejercicio2_biblioteca/     # Sistema de gestión de biblioteca
│   ├── Autor.java             # Clase Autor
│   ├── Libro.java             # Clase Libro
│   ├── Biblioteca.java        # Clase Biblioteca (Composición 1 a N)
│   └── Main.java              # Programa principal
│
└── ejercicio3_universidad/    # Sistema académico
    ├── Profesor.java          # Clase Profesor
    ├── Curso.java             # Clase Curso
    ├── Universidad.java       # Clase Universidad (Bidireccional 1 a N)
    └── Main.java              # Programa principal
```

## Compilación y Ejecución

### Ejercicio 1 - Sistema de Stock
cd ejercicio1_stock
javac *.java
java Main


### Ejercicio 2 - Biblioteca
cd ejercicio2_biblioteca
javac *.java
java Main


### Ejercicio 3 - Universidad
cd ejercicio3_universidad
javac *.java
java Main