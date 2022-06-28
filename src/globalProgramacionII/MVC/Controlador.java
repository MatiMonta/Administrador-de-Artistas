
package globalProgramacionII.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import globalProgramacionII.Instrumento;
import globalProgramacionII.Artista;
import globalProgramacionII.Canario;
import globalProgramacionII.Gallo;
import globalProgramacionII.SerCantor;
import globalProgramacionII.Momento;
import java.io.Serializable;
import java.util.ArrayList;

public class Controlador implements ActionListener, Serializable{
    private Vista view;
    private Modelo model;
    private Cantantes1 view1;

    ArrayList<Instrumento> instrumento= new ArrayList();
    
    public Controlador(Vista view, Modelo model, Cantantes1 view1) {
        this.view = view;
        this.model = model;
        this.view1 = view1;
        this.view.agregarBoton.addActionListener(this);
        this.view1.modificarBoton.addActionListener(this);
        this.view1.eliminarBoton.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("Reproductor de Matias");
        view.setLocationRelativeTo(null);
        ArrayList<Instrumento> instrumento= model.inst.getDatos();
        for (Instrumento x: instrumento) {
            view.cajaInstrumentos.addItem(x.nombre);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.agregarBoton)      //Toma el valor del RadioButtom
         {  
             valideRadios();
             view.ingNombre.setText("");
         }
        if(e.getSource()==view.verBoton)
        {
           
        }
        
    }
    
    
    private void valideRadios(){
        if(view.artistaBoton.isSelected())
        {
            model.agregarArtista(view.ingNombre.getText(), view.cajaMomento.getSelectedItem().toString(), view.cajaInstrumentos.getSelectedItem().toString(), view.cajaTipo.getSelectedItem().toString(), view.cajaDia.getSelectedItem().toString(), view.cajaMes.getSelectedItem().toString(), view.cajaAnio.getSelectedItem().toString());
        }
        if(view.canarioBoton.isSelected())
        {
            model.agregarCanario(view.ingNombre.getText(), view.cajaMomento.getSelectedItem().toString(), view.cajaDia.getSelectedItem().toString(), view.cajaMes.getSelectedItem().toString(), view.cajaAnio.getSelectedItem().toString());

        }
        if(view.galloBoton.isSelected())
        {
            model.agregarGallo(view.ingNombre.getText(), view.cajaMomento.getSelectedItem().toString(), view.cajaDia.getSelectedItem().toString(), view.cajaMes.getSelectedItem().toString(), view.cajaAnio.getSelectedItem().toString());

            }
        }
    }
