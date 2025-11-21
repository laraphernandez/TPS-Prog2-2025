# TRABAJO PRÁCTICO 5: RELACIONES UML 1 A 1
## Programación II - UTN


## 📋 Contenido

Este trabajo contiene la implementación completa de 14 ejercicios sobre relaciones UML 1 a 1 en Java.

### Estructura

```
/
├── README.md (este archivo)
├── ejercicio1/ (Pasaporte - Foto - Titular)
├── ejercicio2/ (Celular - Batería - Usuario)
├── ejercicio3/ (Libro - Autor - Editorial)
├── ejercicio4/ (TarjetaDeCrédito - Cliente - Banco)
├── ejercicio5/ (Computadora - PlacaMadre - Propietario)
├── ejercicio6/ (Reserva - Cliente - Mesa)
├── ejercicio7/ (Vehículo - Motor - Conductor)
├── ejercicio8/ (Documento - FirmaDigital - Usuario)
├── ejercicio9/ (CitaMédica - Paciente - Profesional)
├── ejercicio10/ (CuentaBancaria - ClaveSeguridad - Titular)
├── ejercicio11/ (Reproductor - Canción - Artista) - Dependencia de Uso
├── ejercicio12/ (Impuesto - Contribuyente - Calculadora) - Dependencia de Uso
├── ejercicio13/ (GeneradorQR - Usuario - CódigoQR) - Dependencia de Creación
└── ejercicio14/ (EditorVideo - Proyecto - Render) - Dependencia de Creación
```

---

## Ejercicios

### 1-10: RELACIONES 1 A 1

#### Ejercicio 1: Pasaporte - Foto - Titular
- **Composición**: Pasaporte → Foto (la foto se crea con el pasaporte)
- **Asociación Bidireccional**: Pasaporte ↔ Titular (ambos se conocen)
- Clases: `Pasaporte`, `Foto`, `Titular`, `Main`

#### Ejercicio 2: Celular - Batería - Usuario
- **Agregación**: Celular → Batería (la batería existe independientemente)
- **Asociación Bidireccional**: Celular ↔ Usuario
- Clases: `Celular`, `Bateria`, `Usuario`, `Main`

#### Ejercicio 3: Libro - Autor - Editorial
- **Asociación Unidireccional**: Libro → Autor (solo libro conoce autor)
- **Agregación**: Libro → Editorial
- Clases: `Libro`, `Autor`, `Editorial`, `Main`

#### Ejercicio 4: TarjetaDeCrédito - Cliente - Banco
- **Asociación Bidireccional**: TarjetaDeCrédito ↔ Cliente
- **Agregación**: TarjetaDeCrédito → Banco
- Clases: `TarjetaDeCredito`, `Cliente`, `Banco`, `Main`

#### Ejercicio 5: Computadora - PlacaMadre - Propietario
- **Composición**: Computadora → PlacaMadre
- **Asociación Bidireccional**: Computadora ↔ Propietario
- Clases: `Computadora`, `PlacaMadre`, `Propietario`, `Main`

#### Ejercicio 6: Reserva - Cliente - Mesa
- **Asociación Unidireccional**: Reserva → Cliente
- **Agregación**: Reserva → Mesa
- Clases: `Reserva`, `Cliente`, `Mesa`, `Main`

#### Ejercicio 7: Vehículo - Motor - Conductor
- **Agregación**: Vehículo → Motor
- **Asociación Bidireccional**: Vehículo ↔ Conductor
- Clases: `Vehiculo`, `Motor`, `Conductor`, `Main`

#### Ejercicio 8: Documento - FirmaDigital - Usuario
- **Composición**: Documento → FirmaDigital
- **Agregación**: FirmaDigital → Usuario
- Clases: `Documento`, `FirmaDigital`, `Usuario`, `Main`

#### Ejercicio 9: CitaMédica - Paciente - Profesional
- **Asociación Unidireccional**: CitaMédica → Paciente
- **Asociación Unidireccional**: CitaMédica → Profesional
- Clases: `CitaMedica`, `Paciente`, `Profesional`, `Main`

#### Ejercicio 10: CuentaBancaria - ClaveSeguridad - Titular
- **Composición**: CuentaBancaria → ClaveSeguridad
- **Asociación Bidireccional**: CuentaBancaria ↔ Titular
- Clases: `CuentaBancaria`, `ClaveSeguridad`, `Titular`, `Main`

### 11-12: DEPENDENCIA DE USO

#### Ejercicio 11: Reproductor - Canción - Artista
- **Asociación Unidireccional**: Canción → Artista
- **Dependencia de Uso**: `Reproductor.reproducir(Cancion cancion)`
- El reproductor usa la canción como parámetro pero NO la guarda
- Clases: `Reproductor`, `Cancion`, `Artista`, `Main`

#### Ejercicio 12: Impuesto - Contribuyente - Calculadora
- **Asociación Unidireccional**: Impuesto → Contribuyente
- **Dependencia de Uso**: `Calculadora.calcular(Impuesto impuesto)`
- La calculadora usa el impuesto como parámetro pero NO lo guarda
- Clases: `Impuesto`, `Contribuyente`, `Calculadora`, `Main`

### 13-14: DEPENDENCIA DE CREACIÓN

#### Ejercicio 13: GeneradorQR - Usuario - CódigoQR
- **Asociación Unidireccional**: CódigoQR → Usuario
- **Dependencia de Creación**: `GeneradorQR.generar(String valor, Usuario usuario)`
- El generador crea el código QR dentro del método pero NO lo conserva
- Clases: `GeneradorQR`, `CodigoQR`, `Usuario`, `Main`

#### Ejercicio 14: EditorVideo - Proyecto - Render
- **Asociación Unidireccional**: Render → Proyecto
- **Dependencia de Creación**: `EditorVideo.exportar(String formato, Proyecto proyecto)`
- El editor crea el render dentro del método pero NO lo conserva
- Clases: `EditorVideo`, `Render`, `Proyecto`, `Main`

---
