package com.ninja_squad.geektic.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentin on 22/06/2015.
 */
@Entity
public class Interet {
    @Id
    private int id;
    private String libelle;
    private String photo;

    public Interet(int id, String libelle, String photo){
        this.setId(id);
        this.setLibelle(libelle);
        this.setPhoto(photo);
    }
    public Interet(){}

    public List<Interet> lesInterets(){
        Interet g1 = new Interet(0001, "PHP", "php.png");
        Interet g2 = new Interet(0002, "C#", "csharp.png");
        Interet g3 = new Interet(0003, "JAVA", "java.png");

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
