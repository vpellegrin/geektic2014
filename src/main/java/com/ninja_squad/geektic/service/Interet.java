package com.ninja_squad.geektic.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Valentin on 22/06/2015.
 */
@Entity
public class Interet {
    @Id
    private int id;
    private String libelle;
    private String description;

    public Interet(int id, String libelle, String description){
        this.setId(id);
        this.setLibelle(libelle);
        this.setDescription(description);
    }
    public Interet(){}

    public List<Interet> lesInterets(){
        Interet g1 = new Interet(0001, "PHP", "WAOUUUUUUU ici on aime le PHP et on parle de PHP");
        Interet g2 = new Interet(0002, "C#", "WAOUUUUUUU ici on aime le C# et on parle de C#");
        Interet g3 = new Interet(0003, "JAVA", "WAOUUUUUUU ici on aime le JAVA et on parle de JAVA");

        ArrayList lesInteret = new ArrayList();
        lesInteret.add(g1);
        lesInteret.add(g2);
        lesInteret.add(g3);
        return lesInteret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
