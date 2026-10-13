# PayFlow — Taller POO

Solución del **Taller 2: Programación Orientada a Objetos**. El módulo calcula la nómina de empleados de planilla, por horas, gerentes y practicantes, y genera una boleta inmutable por empleado.

## Requisitos
- JDK 17
- IntelliJ IDEA (Community o Ultimate)

## Abrir en IntelliJ IDEA
1. Descomprime el archivo.
2. **File > Open…** y selecciona la carpeta `payflow-base` (o su `pom.xml`). Elige **Trust Project** si lo solicita.
3. Verifica el SDK: **File > Project Structure > Project > SDK: 17**.

## Funcionalidad

- Valida los datos obligatorios de cada empleado y los datos específicos de cada modalidad.
- Calcula sueldo base, asignación familiar, bono por desempeño, bono de gestión y pago de horas extra.
- Rechaza empleados con identificadores duplicados y expone la lista de empleados como solo lectura.
- Calcula los totales de nómina y por área mediante polimorfismo.
- Genera boletas inmutables en el orden de registro.

## Componentes

| Archivo | Estado |
|---|---|
| `model/Area.java`, `model/Bonificable.java`, `model/Boleta.java` | Tipos de área, contrato de bonos y boleta inmutable |
| `model/Empleado.java` | Clase abstracta base con validación de datos obligatorios |
| `model/EmpleadoPlanilla.java` | Sueldo mensual, asignación familiar y bono por desempeño |
| `model/EmpleadoPorHoras.java` | Pago por horas normales y horas extra al 150% |
| `model/Gerente.java` | Empleado de planilla con bono de gestión |
| `model/Practicante.java` | Empleado con subvención fija |
| `servicio/Nomina.java` | Administración de empleados, totales y generación de boletas |
| `Main.java`, `validacion/Validador.java` | Ejemplo de uso y validador automático |

## Cómo validar tu avance
En IntelliJ IDEA, ejecuta `validacion/Validador.java` con el botón ▶ junto al método `main`. El validador muestra 20 verificaciones y el puntaje automático sobre 20.

Para ver un ejemplo de nómina y sus boletas, ejecuta `Main.java`.
