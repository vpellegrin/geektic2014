package com.ninja_squad.geektic.model;

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
    private Integer id;
    private String libelle;
    private String photo;

    //CONSTRUCTEURS

    public Interet(){}

    public Interet(int id, String libelle, String photo){
        this.setId(id);
        this.setLibelle(libelle);
        this.setPhoto(photo);
    }


    //GETTER SETTER

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
