import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<Empleado> empleados= new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        int opcion= 0;
        do{
            System.out.println("\n--- Menu de Empleados ---");
            System.out.println("1.- Registrar empleado tiempo completo");
            System.out.println("2.- Registrar empleado medio tiempo");
            System.out.println("3.- Mostrar empleados registrados");
            System.out.println("4.- Mostrar estadisticas");
            System.out.println("5.- Salir");
            System.out.println("Ingrese una opcion: ");

            try{
                opcion = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Opcion Invalida");
                sc.nextLine();
                continue;
            }
            switch (opcion){
                case 1: //Tiempo completo
                    try{
                        System.out.println("Codigo: ");
                        int codigo = sc.nextInt(); sc.nextLine();

                        System.out.println("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.println("Apellido: ");
                        String apellido = sc.nextLine();

                        System.out.println("Cargo: ");
                        String cargo = sc.nextLine();

                        System.out.println("Sueldo: ");
                        double sueldoBase = sc.nextDouble();

                        System.out.println("Bono: ");
                        double bono = sc.nextDouble();

                        empleados.add(new EmpleadoTiempoCompleto(codigo, nombre, apellido, cargo, sueldoBase, bono));
                        System.out.println("Empleado tiempo completo registrado exitosamente");
                    }catch (Exception e){
                        System.out.println("Error" +e.getMessage());
                    }
                    break;

                case 2: //Medio Tiempo
                    try{
                        System.out.println("Codigo: ");
                        int codigo = sc.nextInt(); sc.nextLine();

                        System.out.println("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.println("Apellido: ");
                        String apellido = sc.nextLine();

                        System.out.println("Cargo: ");
                        String cargo = sc.nextLine();

                        System.out.println("Horas Trabajadas: ");
                        int horasTrabajadas = sc.nextInt(); sc.nextLine();

                        System.out.println("Pago por Horas: ");
                        double pagoPorHora = sc.nextDouble();

                        empleados.add(new EmpleadoMedioTiempo(codigo, nombre, apellido, cargo, horasTrabajadas, pagoPorHora));
                        System.out.println("Empleado medio tiempo registrado exitosamente");
                    }catch (Exception e){
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;

                case 3: //Mostrar Empleados
                    if(empleados.isEmpty()){
                        System.out.println("La lista esta vacia");
                    }else{
                        System.out.println("\n --- Lista de empelados regstrados ---");
                        for (Empleado emp: empleados) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 4: // Estadisticas
                    if(empleados.isEmpty()) {
                        System.out.println("No hay ningun empleado registrado");
                    }else {
                            Empleado mayor = empleados.get(0);
                            double suma=0;
                            for (Empleado emp: empleados){
                                if (emp.calcularSueldo()>mayor.calcularSueldo()){
                                    mayor=emp;
                                }
                                suma += emp.calcularSueldo();
                            }

                            double promedio= suma / empleados.size();

                            System.out.println("El empleado con mayor salario es: "+mayor.getNombre());
                            System.out.println("El promedio salarial entre todos los empleados es: "+promedio);
                    }
                    break;

                case 5: //Salir
                    System.out.println("Saliendo....");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);

        sc.close();

    }
}