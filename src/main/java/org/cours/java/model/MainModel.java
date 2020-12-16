package org.cours.java.model;

import org.cours.java.model.objet.ArmeFactory;
import org.cours.java.model.unite.Principal;
import org.cours.java.model.unite.TypeUnite;
import org.cours.java.model.unite.Unite;
import org.cours.java.model.unite.UniteArmee;

import java.util.ArrayList;
import java.util.List;

public class MainModel {
    public static void main(String[] args) {
        final List<Unite> unites = new ArrayList<>();
        final ArmeFactory armeFactory = new ArmeFactory();
        unites.add(new Principal("Mélanie", false, armeFactory.create("répartie")));
        unites.add(new Principal("Matthieu", false, armeFactory.create("humour")));
        unites.add(new UniteArmee("Toll", true, TypeUnite.HUMANOIDE, 200, armeFactory.create("massue")));
        unites.add(new Unite("Chat", false, TypeUnite.ANIMAL, 9));
        unites.forEach(System.out::println);
        ((UniteArmee)unites.get(0)).getArme().utiliser(unites.get(3));
    }
}
