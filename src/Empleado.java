
public abstract class Empleado {
    protected int codigo;
    protected String nombre;
    protected String apellido;
    protected String cargo;
    protected double sueldoBase;

    public Empleado(int codigo, String nombre, String apellido, String cargo, double sueldoBase){
        if (codigo<= 0){
            throw new IllegalArgumentException("El codigo debe ser positivo");
        }
        if (sueldoBase <0){
            throw new IllegalArgumentException("El sueldo base no puede ser negativo");
        }

        this.codigo=codigo;
        this.apellido=apellido;
        this.nombre=nombre;
        this.cargo=cargo;
        this.sueldoBase=sueldoBase;

    }

    public int getCodigo(){return codigo;}
    public String getNombre(){return nombre + " " +apellido;}
    public String getCargo() {return cargo;}

    public abstract double calcularSueldo();

    @Override
    public String toString(){
        return "Codigo: "+codigo+
                ",Nombre: "+ nombre+
                ", Cargo: "+cargo+
                ",Sueldo: "+sueldoBase;
    }

}
