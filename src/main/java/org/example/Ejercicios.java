package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ejercicios {


    public void demostrarHashSet() {
        Set<String> usuarios = new HashSet<>();

        usuarios.add("Marcos");
        usuarios.add("Paola");
        usuarios.add("Diego");
        usuarios.add("Diego");
        usuarios.add("Adriana");

        System.out.println("Contenido del HashSet: " + usuarios);

        System.out.println("En los usuarios está 'Paola'? " + usuarios.contains("Paola"));
        
    }
}
