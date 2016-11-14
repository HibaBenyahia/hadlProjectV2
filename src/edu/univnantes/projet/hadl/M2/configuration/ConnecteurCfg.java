package edu.univnantes.projet.hadl.M2.configuration;

import edu.univnantes.projet.hadl.M2.composant.Composant;
import edu.univnantes.projet.hadl.M2.connecteur.Connecteur;
import edu.univnantes.projet.hadl.M2.lien.Attachement;
import edu.univnantes.projet.hadl.M2.lien.Binding;

import javax.sound.sampled.Port;
import java.util.ArrayList;

/**
 * Created by hiba on 07/11/2016.
 */
public class ConnecteurCfg extends Configuration {
    public ConnecteurCfg(String name, ArrayList<Composant> composant, ArrayList<Connecteur> connecteur, ArrayList<Port> port, ArrayList<Attachement> attachement, ArrayList<Binding> binding) {
        super(name, composant, connecteur, port, attachement, binding);
    }
}
