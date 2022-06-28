package globalProgramacionII;

import globalProgramacionII.MVC.Cantantes1;
import globalProgramacionII.MVC.Controlador;
import globalProgramacionII.MVC.Modelo;
import globalProgramacionII.MVC.Vista;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GlobalProgramacionII implements Serializable{
    //private static final long SerialVersionUID =1L;
    public static void main(String[] args) {
        
        Modelo mod = new Modelo();
        Vista view = new Vista();
        Cantantes1 view1= new Cantantes1(view,true);
        view.setVisible(true);
        Controlador ctrl = new Controlador(view, mod, view1);
        view.setVisible(true);
        mod.agregarInstrumentos();
        ctrl.iniciar();
        
    /*    try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("D:\\ empleados.ddr"))){
    // Escribimos en un fichero
        if(){}
       }catch(IOException e){
        }*/
    }
}
