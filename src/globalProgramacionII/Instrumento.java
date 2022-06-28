package globalProgramacionII;

import java.io.Serializable;

public class Instrumento implements Serializable{
    //private static final long SerialVersionUID =1L;
    public String nombre;
    public String tipo;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean ejecuta(boolean ej){
    return ej;
    }
}
