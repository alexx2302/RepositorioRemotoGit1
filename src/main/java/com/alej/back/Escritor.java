package com.alej.back;
import java.io.*;
import java.util.HashMap;


public class Escritor {
    private File file;

    public int id;
    public double nota;


public void escribe (int id, double nota) throws IOException{
    FileWriter fw = new FileWriter(file, true); //append true para concatenar
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(id + " " + nota); //Aqui quiero que me escriba el formato en el que quiero que aparezca el fichero (el id, ESPACIO, nota)
    bw.close();
}
public void escribe (HashMap<Integer, Double> hm) throws IOException{

     FileWriter fw = new FileWriter(file, false);
     BufferedWriter bw = new BufferedWriter(fw);
    for (int id : hm.keySet()) { //Iterador para ir id por id en el fichero
        bw.write(id + " " + hm.get(id));
    }
        bw.close();
    }

}
