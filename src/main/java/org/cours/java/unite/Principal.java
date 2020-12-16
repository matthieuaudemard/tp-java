package org.cours.java.unite;

import org.cours.java.objet.Arme;

public class Principal extends UniteArmee {
    public Principal(String nom, boolean ennemi, Arme arme) {
        super(nom, ennemi, TypeUnite.HUMANOIDE, 100, arme);
    }
}
