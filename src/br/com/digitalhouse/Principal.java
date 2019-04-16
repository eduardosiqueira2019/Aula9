package br.com.digitalhouse;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa tairo = new Pessoa("Tairo","Roberto",30);
        Pessoa jessica = new Pessoa("Jessica","Milena",18);
        Pessoa vini = new Pessoa("Vini","PHP",35);

        pessoas.add(tairo);
        pessoas.add(jessica);
        pessoas.add(vini);

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " Sobrenome: " + pessoa.getSobrenome() + "\n");
        }

        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(tairo);
        pessoaSet.add(jessica);
        pessoaSet.add(vini);
        pessoaSet.add(vini);
        pessoaSet.add(vini);

        /*for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " Sobrenome: " + pessoa.getSobrenome() + "\n");
        }*/

        Map<String,Pessoa> pessoaMap = new HashMap<>();

        pessoaMap.put("tairo",tairo);
        pessoaMap.put("jessica",jessica);
        pessoaMap.put("vini",vini);

        for(String chave:pessoaMap.keySet()){
            System.out.println("Nome: " + pessoaMap.get(chave).getNome() +"\nSobrenome: " + pessoaMap.get(chave).getSobrenome() + "\n");
        }

        //exercício 1
        Map<Integer,String> loteriaDosSonhos = new HashMap<>();

        loteriaDosSonhos.put(0,"Ovos");
        loteriaDosSonhos.put(1,"Água");
        loteriaDosSonhos.put(2,"Escopeta");
        loteriaDosSonhos.put(3,"Cavalo");
        loteriaDosSonhos.put(4,"Dentista");


        //exercicio 2
        Map<String,List<String> > apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");

     for (String chave: apelidos.keySet()){
         System.out.println("Apelidos do: "+ chave);
         for(String apelido : apelidos.get(chave)){
             System.out.println("\t" + apelido);
         }
     }




    }


}
