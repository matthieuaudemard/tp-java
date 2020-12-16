package org.cours.java.objet;

import org.cours.java.unite.Unite;

public class PotionSoin extends ObjetUtilisable{

    public PotionSoin() {
        super("Potion de soin");
    }

    @Override
    public void utiliser(Unite utilisateur) {
        utilisateur.setVie(utilisateur.getVie() + 10);
    }
}
