package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Set<String> gods = new HashSet<String>();
        Set<String> planets = new HashSet<String>();
        Set<String> sweets = new HashSet<String>();
        Set<String> result = new HashSet<String>();

        gods.add("Mercury");
        gods.add("Mars");

        planets.add("Mercury");
        planets.add("Mars");

        sweets.add("Mars");

        gods.retainAll(sweets);
        gods.retainAll(planets);

        result = gods;
        System.out.println("!!!!" + result.toString() + "!!!!");
    }

}