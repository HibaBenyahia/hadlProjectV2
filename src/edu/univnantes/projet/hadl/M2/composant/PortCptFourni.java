package edu.univnantes.projet.hadl.M2.composant;


import edu.univnantes.projet.hadl.M2.lien.Attachement;
import edu.univnantes.projet.hadl.M2.lien.Binding;
import edu.univnantes.projet.hadl.M2.lien.BindingFourni;

import java.util.ArrayList;

public class PortCptFourni extends PortCpt{
	private Attachement attachement = new Attachement();
	private BindingFourni bindingFourni = null;

	public PortCptFourni(String nom, ArrayList<ServiceCpt> serviceCS, ArrayList<PortCpt> portCpt, String nom1, Attachement attachement) {
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
