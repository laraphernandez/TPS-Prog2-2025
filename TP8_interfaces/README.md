# TP8 - Interfaces y Excepciones en Java

## 📋 Descripción

El proyecto está dividido en dos partes:

### Parte 1: Sistema de E-commerce con Interfaces
Implementación de un sistema de e-commerce utilizando interfaces para definir contratos de comportamiento.

**Interfaces implementadas:**
- `Pagable`: Define el contrato para calcular totales
- `Pago`: Define el contrato para procesar pagos
- `PagoConDescuento`: Extiende Pago y añade descuentos
- `Notificable`: Define el contrato para notificaciones

**Clases:**
- `Producto`: Representa productos con nombre y precio
- `Pedido`: Gestiona una lista de productos
- `Cliente`: Maneja información del cliente y notificaciones
- `TarjetaCredito`: Implementa pago con descuento
- `PayPal`: Implementa pago sin descuento

### Parte 2: Ejercicios sobre Excepciones
Ejercicios prácticos sobre manejo de excepciones en Java.

**Ejercicios incluidos:**
1. **División Segura**: Manejo de `ArithmeticException`
2. **Conversión de Cadena**: Manejo de `NumberFormatException`
3. **Lectura de Archivo**: Manejo de `FileNotFoundException`
4. **Excepción Personalizada**: Validación de edad con `EdadInvalidaException`
5. **Try-with-resources**: Lectura de archivo con cierre automático de recursos

---


### Ejecutar desde Terminal

**Parte 1 - Sistema E-commerce:**
```bash
cd src
javac ParteUno/*.java
java ParteUno.Main
```

**Parte 2 - Ejercicio específico (ejemplo División Segura):**
```bash
cd src
javac ParteDos/DivisionSegura.java
java ParteDos.DivisionSegura
```

### Ejecutar desde IDE
1. Importar el proyecto
2. Ejecutar la clase `Main.java` (Parte 1) o cualquier ejercicio de la Parte 2

---

## 📁 Estructura del proyecto

```
TP8_Interfaces_Excepciones/
├── src/
│   ├── ParteUno/
│   │   ├── Pagable.java
│   │   ├── Producto.java
│   │   ├── Pedido.java
│   │   ├── Pago.java
│   │   ├── PagoConDescuento.java
│   │   ├── TarjetaCredito.java
│   │   ├── PayPal.java
│   │   ├── Notificable.java
│   │   ├── Cliente.java
│   │   └── Main.java
│   └── ParteDos/
│       ├── DivisionSegura.java
│       ├── ConversionCadena.java
│       ├── LecturaArchivo.java
│       ├── EdadInvalidaException.java
│       ├── ValidadorEdad.java
│       └── LecturaConRecursos.java
├── datos.txt
├── README.md
└── .gitignore
```
