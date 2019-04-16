package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);


        for(Integer i = 0 ; i < lista.size();i++){
            System.out.println(lista.get(i));
        }




    }
}
