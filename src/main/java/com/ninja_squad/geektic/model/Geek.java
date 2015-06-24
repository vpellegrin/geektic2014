package com.ninja_squad.geektic.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Valentin on 22/06/2015.
 */
@Entity
public class Geek {
    @ManyToMany
    @JoinTable(name = "GEEKINTERET",
            joinColumns = @JoinColumn(name = "ID_GEEK"),
            inverseJoinColumns = @JoinColumn(name = "ID_INTERET"))
    private Set<Interet> lesInterets;
    @Id
    private Integer id;
    private String nom;
    private String prenom;
    private String mail;
    private String sexe;
    private String photo;
    private String description_courte;
    private String description_longue;

    //CONSTRUCTEURS

    public Geek(){}

    public Geek (int id, String nom, String prenom, String mail, String sexe, String photo, String description_courte, String description_longue){
        this.setId(id);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setMail(mail);
        this.setSexe(sexe);
        this.setPhoto(photo);
        this.setDescription_courte(description_courte);
        this.setDescription_longue(description_longue);
    }

    //GETTER SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription_courte() {
        return description_courte;
    }

    public void setDescription_courte(String description_courte) {
        this.description_courte = description_courte;
    }

    public String getDescription_longue() {
        return description_longue;
    }

    public void setDescription_longue(String description_longue) {
        this.description_longue = description_longue;
    }

    //FIN GETTER SETTER

}
