package globalProgramacionII;

import java.io.Serializable;
import java.util.ArrayList;

public class Gallo extends SerCantor implements Serializable {
    //private static final long SerialVersionUID =1L;

    public Gallo(String nombre, String fecha_de_nacimiento) {
        super(nombre, fecha_de_nacimiento);
    }
   
    @Override
    public void cantar() {
    }

}
