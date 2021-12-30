package domain;

import util.Instance;

import java.util.ArrayList;

public class Person {

    private int id;
    private final String nom;
    private final String prenom;
    private final ArrayList<Address> addresses;
    private static final Instance instance = new Instance();

    public Person(String nom, String prenom) {
        this.id = instance.getNext();
        this.nom = nom;
        this.prenom = prenom;
        this.addresses = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
