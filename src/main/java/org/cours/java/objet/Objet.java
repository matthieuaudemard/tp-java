package org.cours.java.objet;

public abstract class Objet {
    protected String nom;

    public Objet(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +
                "nom='" + nom + '\'';
    }
}
