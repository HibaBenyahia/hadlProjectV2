package edu.univnantes.projet.hadl.M2.lien;


import edu.univnantes.projet.hadl.M2.composant.PortCptFourni;
import edu.univnantes.projet.hadl.M2.configuration.PortCfgFourni;

public class BindingFourni extends Binding {
    //port cmp fourni
protected PortCfgFourni portCptFourni;

    public BindingFourni(PortCfgFourni portCptFourni) {
        this.portCptFourni = portCptFourni;
    }

    public PortCfgFourni getPortCptFourni() {
        return portCptFourni;
    }

    public void setPortCptFourni(PortCfgFourni portCptFourni) {
        this.portCptFourni = portCptFourni;
    }
}

