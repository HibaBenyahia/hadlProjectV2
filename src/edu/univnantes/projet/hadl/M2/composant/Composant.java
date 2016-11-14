package edu.univnantes.projet.hadl.M2.composant;



import edu.univnantes.projet.hadl.M2.ElementArchitecturale;

import java.util.ArrayList;

public class Composant extends ElementArchitecturale {

	//InterfaceCpt[] interfaces;
	private String nom;
	private ArrayList<InterfaceCpt> interfaceCpt;

	public Composant(String nom, String nom1, ArrayList<InterfaceCpt> interfaceCpt) {
		super(nom);
		this.nom = nom1;
		this.interfaceCpt = interfaceCpt;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<InterfaceCpt> getInterfaceCpt() {
		return interfaceCpt;
	}

	public void setInterfaceCpt(ArrayList<InterfaceCpt> interfaceCpt) {
		this.interfaceCpt = interfaceCpt;
	}
}
