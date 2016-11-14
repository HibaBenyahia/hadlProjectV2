package edu.univnantes.projet.hadl.M2.configuration;



import edu.univnantes.projet.hadl.M2.lien.Binding;
import edu.univnantes.projet.hadl.M2.lien.BindingFourni;

import java.util.ArrayList;

public class PortCfgFourni extends PortCfg {

    public PortCfgFourni(ArrayList<PortCfg> portConfig, String nom, Binding binding) {
        super(portConfig, nom, binding);
    }
}
