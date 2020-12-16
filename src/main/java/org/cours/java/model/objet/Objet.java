package org.cours.java.model.objet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Objet {

    private static final Logger logger = LoggerFactory.getLogger(Objet.class);

    protected String nom;

    public Objet(String nom) {
        this.nom = nom;
        logger.info("Create {} with name {}", getClass().getSimpleName(), nom);
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
