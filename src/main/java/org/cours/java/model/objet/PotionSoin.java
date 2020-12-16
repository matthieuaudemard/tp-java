package org.cours.java.model.objet;

import org.cours.java.model.unite.Unite;

public class PotionSoin extends ObjetUtilisable{

    public PotionSoin() {
        super("Potion de soin");
    }

    @Override
    public void utiliser(Unite utilisateur) {
        utilisateur.setVie(utilisateur.getVie() + 10);
    }
}
