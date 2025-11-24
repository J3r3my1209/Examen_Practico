public class EmpleadoTiempoCompleto extends Empleado {
    private double bono;

    public EmpleadoTiempoCompleto(int codigo, String nombre, String apellido, String cargo, double sueldoBase,
                                  double bono){
        super(codigo, nombre, apellido, cargo, sueldoBase);

    if (this.bono <0){
        throw new IllegalArgumentException("El bono no puede ser negativo");
    }
    this.bono= bono;
    }

    @Override
    public double calcularSueldo(){
        return sueldoBase+bono;
    }
}
