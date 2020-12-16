package org.cours.java.model.unite;

import org.cours.java.model.objet.Arme;

public class UniteArmee extends Unite{
    private Arme arme;

    public UniteArmee(String nom, boolean ennemi, TypeUnite type, int vie, Arme arme) {
        super(nom, ennemi, type, vie);
        this.arme = arme;
    }

    public Arme getArme() {
        return arme;
    }

    public void equipper(Arme arme) {
        this.arme = arme;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", arme=" + arme;
    }
}
