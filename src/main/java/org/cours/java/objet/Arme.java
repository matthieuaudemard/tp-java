package org.cours.java.objet;

import org.cours.java.unite.TypeUnite;
import org.cours.java.unite.Unite;

import java.util.ArrayList;
import java.util.List;

public class Arme extends ObjetUtilisable {
    private float potentielDestruction;
    private boolean lancable;
    protected List<TypeUnite> sensibles = new ArrayList<>();

    public Arme(String nom, float potentielDestruction, boolean lancable) {
        super(nom);
        this.potentielDestruction = potentielDestruction;
        this.lancable = lancable;
    }

    public float getPotentielDestruction() {
        return potentielDestruction;
    }

    public void setPotentielDestruction(float potentielDestruction) {
        this.potentielDestruction = potentielDestruction;
    }

    public boolean isLancable() {
        return lancable;
    }

    public void setLancable(boolean lancable) {
        this.lancable = lancable;
    }

    public List<TypeUnite> getSensibles() {
        return sensibles;
    }

    public void addSensible(TypeUnite typeUnite) {
        sensibles.add(typeUnite);
    }

    public void addAllSensible(List<TypeUnite> typeUnites) {
        sensibles.addAll(typeUnites);
    }

    @Override
    public void utiliser(Unite cible) {
        System.out.print(nom + " utilisé sur " + cible.getNom() +
                (sensibles != null && !sensibles.isEmpty() && sensibles.contains(cible.getType()) ? " sensible !!" : " pas sensible !!"));
    }

    @Override
    public String toString() {
        return super.toString() +
                ", potentielDestruction=" + potentielDestruction +
                ", lancable=" + lancable;
    }
}
