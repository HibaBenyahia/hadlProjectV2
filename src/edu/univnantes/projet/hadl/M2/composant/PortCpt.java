package edu.univnantes.projet.hadl.M2.composant;


import java.util.ArrayList;
import java.util.Observable;

public class PortCpt extends InterfaceCpt {

    //private ArrayList<Ports> ports;
    private String nom;


    public PortCpt(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt, String nom1) {
        super(nom, serviceCS, portCpt);
        this.nom = nom1;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

}