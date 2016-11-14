package edu.univnantes.projet.hadl.M2.composant;


import edu.univnantes.projet.hadl.M2.lien.Attachement;
import edu.univnantes.projet.hadl.M2.lien.BindingRequis;

import java.util.ArrayList;

public class PortCptRequis extends PortCpt {
	private Attachement attachement;

	public PortCptRequis(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt, String nom1, Attachement attachement) {
		super(nom, serviceCS, portCpt, nom1);
		this.attachement = attachement;
	}

	public Attachement getAttachement() {
		return attachement;
	}

	public void setAttachement(Attachement attachement) {
		this.attachement = attachement;
	}
}
