package globalProgramacionII;

import java.io.Serializable;

public class Momento implements Serializable {
    //private static final long SerialVersionUID =1L;
    public String tipo;
    private boolean alegria;

    public Momento(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAlegria() {
        return alegria;
    }

    public void setAlegria(boolean alegria) {
        this.alegria = alegria;
    }

    public String horario(String h) {
        return h;
    }
}
