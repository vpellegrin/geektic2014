package com.ninja_squad.geektic.service;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
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
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String sexe;
    private String photo;
    private String description_courte;
    private String description_longue;

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

    public Geek(){}

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

    /*public List<Geek> lesGeeks(){
        Geek g1 = new Geek(0001, "DUPONT", "Jean", "jean.dupont@gmail.com", "H");
        Geek g2 = new Geek(0002, "GOUNON", "Damien", "damien.gounon@gmail.com", "H");
        Geek g3 = new Geek(0003, "SAPET", "Paul", "paul.sapet@gmail.com", "H");

        ArrayList lesGEEKS = new ArrayList();
        lesGEEKS.add(g1);
        lesGEEKS.add(g2);
        lesGEEKS.add(g3);
        return lesGEEKS;
    }
    public List<Geek> searchGeek(String sexe, String interet){
        Geek g1 = new Geek(0001, "DUPONT", "Jean", "jean.dupont@gmail.com", "H");
        Geek g2 = new Geek(0002, "GOUNON", "Damien", "damien.gounon@gmail.com", "H");
        Geek g3 = new Geek(0003, "SAPET", "Paul", "paul.sapet@gmail.com", "H");

        ArrayList lesGEEKS = new ArrayList();
        lesGEEKS.add(g1);
        lesGEEKS.add(g2);
        lesGEEKS.add(g3);
        return lesGEEKS;
    }
    public Geek lesGeekss(int id){
        Geek g1 = new Geek(0001, "DUPONT", "Jean", "jean.dupont@gmail.com", "H");
        Geek g2 = new Geek(0002, "GOUNON", "Damien", "damien.gounon@gmail.com", "H");
        Geek g3 = new Geek(0003, "SAPET", "Paul", "paul.sapet@gmail.com", "H");
        Geek g4 = new Geek(0005, "erreur", "erreur", "erreur", "erreur");
        Geek g5;

        if (id == 1){
            g5=g1;
        }else if (id == 2){
            g5=g2;
        }else if (id == 3){
            g5=g3;
        }else{
            g5=g4;
        }


        return g5;
    }*/

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
}
