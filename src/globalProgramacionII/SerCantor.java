package globalProgramacionII;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public abstract class SerCantor implements Puede_cantar, Serializable {
    //private static final long SerialVersionUID =5704966374418918048;
    public String tipo;
    public final String nombre;
    public final LocalDate fecha_de_nacimiento;
    public Momento cuando;

    public SerCantor(String nombre, String fecha_de_nacimiento) {
        this.nombre = nombre;
        int dia=Integer.valueOf(fecha_de_nacimiento.substring(0,2));
        int mes=Integer.valueOf(fecha_de_nacimiento.substring(2,4));
        int anio=Integer.valueOf(fecha_de_nacimiento.substring(4,8));
        LocalDate fn=LocalDate.of(anio,mes,dia);
        this.fecha_de_nacimiento = fn;
    }
    public int calcularEdad()
    {
        LocalDate fechaHoy= LocalDate.now();
        int edad= Period.between(fecha_de_nacimiento, fechaHoy).getYears();
        return edad;
    }
    @Override
    public abstract void cantar();

    public void hacerCantar(SerCantor s){}

}
