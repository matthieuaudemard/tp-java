package org.cours.java.unite;

public class Unite {
    protected String nom;
    protected boolean ennemi;
    protected TypeUnite type;
    protected int vie;

    public Unite(String nom, boolean ennemi, TypeUnite type, int vie) {
        this.nom = nom;
        this.ennemi = ennemi;
        this.type = type;
        this.vie = vie;
    }

    public boolean isEnnemi() {
        return ennemi;
    }

    public void setEnnemi(boolean ennemi) {
        this.ennemi = ennemi;
    }

    public TypeUnite getType() {
        return type;
    }

    public void setType(TypeUnite type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +
                "nom='" + nom + '\'' +
                ", ennemi=" + ennemi +
                ", type=" + type;
    }
}
