package globalProgramacionII;

import java.io.Serializable;
import java.util.ArrayList;

public class Artista extends SerCantor implements Serializable {
   // private static final long SerialVersionUID =1L;
    public Instrumento[] usa=new Instrumento[1];

    public Artista(String nombre, String fecha_de_nacimiento) {
        super(nombre, fecha_de_nacimiento);
    }
    
    @Override
    public void cantar() {
    }
    
    public boolean hacerCantar() {
        return true;
    }

}
