package org.cours.java.objet;

import org.cours.java.unite.TypeUnite;

import java.util.Arrays;

public class ArmeFactory {
    public Arme create(String nom) {
        Arme arme;
        switch (nom) {
            case "massue":
                arme = new Arme("Massue", 4.2f, false);
                arme.addAllSensible(Arrays.asList(TypeUnite.HUMANOIDE, TypeUnite.ANIMAL));
                break;
            case "répartie":
                arme = new Arme("Répartie", 3f, true);
                arme.addSensible(TypeUnite.HUMANOIDE);
                break;
            case "humour":
                arme = new Arme("Humour", 3f, true);
                arme.addSensible(TypeUnite.HUMANOIDE);
                break;
            default:
                throw new IllegalArgumentException("Arme " +  nom + " inconnue");
        }
        return arme;
    }
}
