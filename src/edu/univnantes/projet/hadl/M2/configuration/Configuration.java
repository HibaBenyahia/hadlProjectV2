package edu.univnantes.projet.hadl.M2.configuration;



import edu.univnantes.projet.hadl.M2.composant.Composant;
import edu.univnantes.projet.hadl.M2.connecteur.Connecteur;
import edu.univnantes.projet.hadl.M2.lien.Attachement;
import edu.univnantes.projet.hadl.M2.lien.Binding;
import edu.univnantes.projet.hadl.M2.ElementArchitecturale;

import javax.sound.sampled.Port;
import java.util.ArrayList;

public class Configuration extends ElementArchitecturale {
	

	private ArrayList<Composant> composant;
	private ArrayList<Connecteur> connecteur;
	private ArrayList<Port> port;
	private ArrayList<Attachement> attachement;
	private ArrayList<Binding> binding;

	public ArrayList<Attachement> getAttachement() {
		return attachement;
	}

	public void setAttachement(ArrayList<Attachement> attachement) {
		this.attachement = attachement;
	}

	public ArrayList<Binding> getBinding() {
		return binding;
	}

	public void setBinding(ArrayList<Binding> binding) {
		this.binding = binding;
	}

	public Configuration(String name, ArrayList<Composant> composant, ArrayList<Connecteur> connecteur, ArrayList<Port> port, ArrayList<Attachement> attachement, ArrayList<Binding> binding) {

        super(name);
		this.composant = composant;
		this.connecteur = connecteur;
		this.port = port;
		this.attachement = attachement;
		this.binding = binding;
	}

	public ArrayList<Composant> getComposant() {
		return composant;
	}

	public void setComposant(ArrayList<Composant> composant) {
		this.composant = composant;
	}

	public ArrayList<Connecteur> getConnecteur() {
		return connecteur;
	}

	public void setConnecteur(ArrayList<Connecteur> connecteur) {
		this.connecteur = connecteur;
	}

	public ArrayList<Port> getPort() {
		return port;
	}

	public void setPort(ArrayList<Port> port) {
		this.port = port;
	}


}
