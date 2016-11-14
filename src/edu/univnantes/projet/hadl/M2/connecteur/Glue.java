package edu.univnantes.projet.hadl.M2.connecteur;

import java.util.ArrayList;

public class Glue {

    private String name;
    ArrayList<RoleCntFourni> roleCntFournis;
    ArrayList<RoleCntRequis> roleCntRequis;

    public Glue(String name, ArrayList<RoleCntFourni> roleCntFournis, ArrayList<RoleCntRequis> roleCntRequises) {
        this.name = name;
        this.roleCntFournis = roleCntFournis;
        this.roleCntRequis = roleCntRequises;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<RoleCntFourni> getRoleCntFournis() {
        return roleCntFournis;
    }

    public void setRoleCntFournis(ArrayList<RoleCntFourni> roleCntFournis) {
        this.roleCntFournis = roleCntFournis;
    }

    public ArrayList<RoleCntRequis> getRoleCntRequis() {
        return roleCntRequis;
    }

    public void setRoleCntRequis(ArrayList<RoleCntRequis> roleCntRequis) {
        this.roleCntRequis = roleCntRequis;
    }

}
