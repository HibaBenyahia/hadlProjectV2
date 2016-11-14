package edu.univnantes.projet.hadl.M2.composant;

import java.util.ArrayList;

public class ServiceCpt extends InterfaceCpt {

	private String nom;

    public ServiceCpt(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt, String nom1) {
        super(nom, serviceCS, portCpt);
        this.nom = nom1;
    }

}
