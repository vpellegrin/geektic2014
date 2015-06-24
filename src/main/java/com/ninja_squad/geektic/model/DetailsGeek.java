package com.ninja_squad.geektic.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.ninja_squad.geektic.model.Geek;

/**
 * Created by Valentin on 24/06/2015.
 */
public class DetailsGeek {
    @JsonUnwrapped
    private Geek unGeek;
    private int vues;

    //CONSTRUCTEURS

    public DetailsGeek(){}

    public DetailsGeek(Geek unGeek, int vues){
        this.setUnGeek(unGeek);
        this.setVues(vues);
    }

    //GETTER SETTER

    public Geek getUnGeek() {
        return unGeek;
    }

    public void setUnGeek(Geek unGeek) {
        this.unGeek = unGeek;
    }

    public int getVues() {
        return vues;
    }

    public void setVues(int vues) {
        this.vues = vues;
    }
}
