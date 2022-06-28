package globalProgramacionII;

import java.io.Serializable;

public class Canario extends SerCantor implements Serializable {
    //private static final long SerialVersionUID =1L;
    public Canario(String nombre, String fecha_de_nacimiento) {
        super(nombre, fecha_de_nacimiento);
    }
    
    @Override
    public void cantar() {
    }

}
