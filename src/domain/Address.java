package domain;

import util.Instance;

import java.io.Serializable;

public class Address implements Serializable {
    private final int id;
    private String rue;
    private String ville;
    private static final Instance instance = new Instance();

    public Address(String rue, String ville) {
        this.id = instance.getNext();
        this.rue = rue;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
