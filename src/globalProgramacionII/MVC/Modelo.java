package globalProgramacionII.MVC;

import globalProgramacionII.Instrumento;
import globalProgramacionII.Artista;
import globalProgramacionII.Canario;
import globalProgramacionII.Gallo;
import globalProgramacionII.SerCantor;
import globalProgramacionII.Momento;
import globalProgramacionII.MiObjectOutputStream;
import globalProgramacionII.GestorFicheroSerializado;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Modelo implements Serializable{
    //private static final long SerialVersionUID =1L;
    File archivoInstru = new File("instrumentos.txt");
    File archivoArtista = new File("artistas.txt");
    File archivoCanario = new File("canarios.txt");
    File archivoGallo = new File("gallos.txt");
    ArrayList<Artista> artistas= new ArrayList();
    ArrayList<Canario> canarios= new ArrayList();
    ArrayList<Gallo> gallos= new ArrayList();
    
    GestorFicheroSerializado<Instrumento> inst = new GestorFicheroSerializado(archivoInstru);
    GestorFicheroSerializado<Artista> art = new GestorFicheroSerializado(archivoArtista);
    GestorFicheroSerializado<Canario> can = new GestorFicheroSerializado(archivoCanario);
    GestorFicheroSerializado<Gallo> gall = new GestorFicheroSerializado(archivoGallo);
    

public void agregarInstrumentos(){
        if(archivoInstru.exists())
        {}
        else{
        Instrumento guitarra= new Instrumento("Guitarra");
        Instrumento bajo=new Instrumento("Bajo");
        Instrumento bateria=new Instrumento("Bateria");
        Instrumento violin=new Instrumento("Violin");
        Instrumento saxo=new Instrumento("Saxo");
        Instrumento charango=new Instrumento("Charango");
        Instrumento acordeon=new Instrumento("Acordeon");
        Instrumento trompeta=new Instrumento("Trompeta");
        Instrumento flauta=new Instrumento("Flauta");
        
        inst.guardarDato(guitarra);
        inst.guardarDato(bajo);
        inst.guardarDato(bateria);
        inst.guardarDato(violin);
        inst.guardarDato(saxo);
        inst.guardarDato(charango);
        inst.guardarDato(acordeon);
        inst.guardarDato(trompeta);
        inst.guardarDato(flauta);
        }
    }
public ArrayList<Artista> obtenerArtista(){
    return art.getDatos();
}
public void agregarArtista(String nombre, String momento, String nInstrumento, String tInstrumento,String dia,String mes,String anio){
    String fechaNac=dia.concat(mes).concat(anio);
    String nombreart=nombre;
    Artista artista= new Artista(nombreart,(fechaNac+"."));
    artista.cuando=new Momento(momento);
    artista.usa[0]=new Instrumento(nInstrumento);
    artista.usa[0].nombre=nInstrumento;
    artista.usa[0].tipo=tInstrumento;
    artista.usa[0].ejecuta(false);
    artistas.add(artista);
    art.guardarDato(artista);
    }
public void agregarCanario(String nombre, String momento, String dia,String mes,String anio){
    if(dia!="Dia" && mes!="Mes" && anio!="Año")
    {
    String fechaNac=dia.concat(mes).concat(anio);
    Canario canario=new Canario(nombre,(fechaNac+"."));
    canario.cuando=new Momento(momento);
    can.guardarDato(canario);
    }
    else{
        JOptionPane.showMessageDialog(null, "Debes completar todos los campos de la fecha de nacimiento");
    }
}
public void agregarGallo(String nombre, String momento, String dia,String mes,String anio){
    String fechaNac=dia.concat(mes).concat(anio);
    Gallo gallo=new Gallo(nombre,(fechaNac+"."));
    gallo.cuando=new Momento(momento);
    gall.guardarDato(gallo);
    
}

}