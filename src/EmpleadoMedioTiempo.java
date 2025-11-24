public class EmpleadoMedioTiempo extends Empleado {
    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoMedioTiempo(int codigo, String nombre, String apellido, String cargo,
                               int horasTrabajadas, double pagoPorHora){
        super(codigo, nombre, apellido, cargo, 0);
    if (horasTrabajadas<0 || pagoPorHora<0){
        throw new IllegalArgumentException("Las horas o pago por horas trabajadas no pueden ser negativas");
    }

    this.horasTrabajadas=horasTrabajadas;
    this.pagoPorHora=pagoPorHora;
    }

    @Override
    public double calcularSueldo(){
        return horasTrabajadas * pagoPorHora;
    }
}
