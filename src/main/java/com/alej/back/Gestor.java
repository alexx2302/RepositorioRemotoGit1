package com.alej.back;

import java.io.File;
import java.util.*;

public class Gestor {

    public static void main(String[] args) {

        File file;
        //Crear hashmap

        /**
         *
         */

        HashMap<Integer, Double> mapa = new HashMap<>();
        mapa.put(8, 9.9);
        mapa.put(9, 2.4);
        mapa.put(10, 6.5);
        mapa.put(11, 3.5);
        System.out.println(mapa.get(8));
        System.out.println(mapa.get(9));
        System.out.println(mapa);
        //Recorrer
        for (int alumnado : mapa.keySet()) {
            System.out.println("ID - " + alumnado + " con nota - " + mapa.get(alumnado));
        }
        System.out.println(mapa.get(8));
    }
}