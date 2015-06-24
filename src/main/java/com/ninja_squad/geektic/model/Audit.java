package com.ninja_squad.geektic.model;

import javax.persistence.*;

/**
 * Created by Valentin on 24/06/2015.
 */
@Entity
public class Audit {
    @Id
    private String heure;
    private String ip;
    @ManyToOne
    @JoinColumn(name = "ID_GEEK")
    private Geek unGeek;

    //CONSTRUCTEURS

    public Audit(){}

    public Audit(String heure, String ip, Geek unGeek){
        this.setHeure(heure);
        this.setIp(ip);
        this.setUnGeek(unGeek);
    }

    //GETTER SETTER

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Geek getUnGeek() {
        return unGeek;
    }

    public void setUnGeek(Geek unGeek) {
        this.unGeek = unGeek;
    }
}
