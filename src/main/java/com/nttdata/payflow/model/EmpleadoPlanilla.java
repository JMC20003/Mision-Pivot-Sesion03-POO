package com.nttdata.payflow.model;

/**
 * Empleado con sueldo fijo mensual.
 */
// TODO 5: implementa la interfaz Bonificable.
public class EmpleadoPlanilla extends Empleado implements Bonificable {

    private static final double ASIGNACION_FAMILIAR = 100.00;
    private static final double TASA_BONO_DESEMPENO = 0.10;

    // TODO 6: declara los atributos privados y finales: sueldoBase, tieneHijos y evaluacion.
    private final double sueldoBase;
    private final boolean tieneHijos;
    private final int evaluacion;

    public EmpleadoPlanilla(String id, String nombre, Area area,
                            double sueldoBase, boolean tieneHijos, int evaluacion) {
        super(id, nombre, area);
        // TODO 7: valida sueldoBase > 0 y evaluacion entre 1 y 5 (IllegalArgumentException)
        //         y asigna los atributos.
        if (!(sueldoBase > 0)) {
            throw new IllegalArgumentException("El sueldo base debe ser mayor que cero.");
        }
        if (evaluacion < 1 || evaluacion > 5) {
            throw new IllegalArgumentException("La evaluación debe estar entre 1 y 5.");
        }
        this.sueldoBase = sueldoBase;
        this.tieneHijos = tieneHijos;
        this.evaluacion = evaluacion;
    }

    // TODO 8 (RN-03): bono = 10% del sueldo base si la evaluación es 4 o 5; en otro caso, 0.
    @Override
    public double calcularBono() {
        return evaluacion >= 4 ? sueldoBase * TASA_BONO_DESEMPENO : 0.0;
    }

    // TODO 9 (RN-02): pago = sueldo base + asignación familiar (100.00 si tiene hijos) + bono.
    @Override
    public double calcularPagoMensual() {
        return sueldoBase + (tieneHijos ? ASIGNACION_FAMILIAR : 0.0) + calcularBono();
    }

    // TODO 10: getTipo() debe devolver "Planilla" y getSueldoBase() el sueldo base.
    @Override
    public String getTipo() {
        return "Planilla";
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
}
