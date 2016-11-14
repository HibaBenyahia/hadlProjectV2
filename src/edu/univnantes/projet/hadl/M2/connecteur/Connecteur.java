package edu.univnantes.projet.hadl.M2.connecteur;

import publique.ElementArchitecturale;

public class Connecteur extends ElementArchitecturale{
	
	private Glue glue ;
	private InterfaceCnt interfaceCnt = new InterfaceCnt();

	public Connecteur(String name, Glue glue, InterfaceCnt interfaceCnt) {
		super(name);
		this.glue = glue;
		this.interfaceCnt = interfaceCnt;
	}

	public Glue getGlue() {
		return glue;
	}

	public void setGlue(Glue glue) {
		this.glue = glue;
	}

	public InterfaceCnt getInterfaceCnt() {
		return interfaceCnt;
	}

	public void setInterfaceCnt(InterfaceCnt interfaceCnt) {
		this.interfaceCnt = interfaceCnt;
	}
}

