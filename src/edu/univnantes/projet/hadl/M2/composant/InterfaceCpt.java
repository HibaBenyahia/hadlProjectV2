package edu.univnantes.projet.hadl.M2.composant;

import java.util.ArrayList;
import java.util.Observable;

public class InterfaceCpt extends Observable{
	private String nom;
    private ArrayList<ServiceCpt> serviceCS;
    private ArrayList<PortCpt> portCpt;

    public InterfaceCpt() {
    }

    public InterfaceCpt(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt) {
        this.nom = nom;
        this.serviceCS = serviceCS;
        this.portCpt = portCpt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<ServiceCpt> getServiceCS() {
        return serviceCS;
    }

    public void setServiceCS(ArrayList<ServiceCpt> serviceCS) {
        this.serviceCS = serviceCS;
    }

    public ArrayList<PortCpt> getPortCpt() {
        return portCpt;
    }

    public void setPortCpt(ArrayList<PortCpt> portCpt) {
        this.portCpt = portCpt;
    }
}
