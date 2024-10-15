package com.alej.back;


import java.io.*;
import java.util.HashMap;

public class Lector {
    private File file;

    public int id;
    public double nota;

    public Lector(){}

    public void lee(int id) throws IOException {
        if (!file.exists()){
            throw new FileNotFoundException("El fichero no existe!!!!!!");
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);


        br.read();


    }

    public void lee() throws FileNotFoundException {
        if (!file.exists()){
            throw new FileNotFoundException("El fichero no existe!!!!!!");
        }
        HashMap<Integer, Double> hm = new HashMap<>();

    }

}
