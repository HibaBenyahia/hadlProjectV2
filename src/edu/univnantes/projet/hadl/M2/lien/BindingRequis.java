package edu.univnantes.projet.hadl.M2.lien;


import edu.univnantes.projet.hadl.M2.composant.PortCptFourni;
import edu.univnantes.projet.hadl.M2.configuration.PortCfgRequis;

public class BindingRequis extends Binding {

    private PortCptFourni portCptFourni;

    public BindingRequis(PortCptFourni portCptFourni) {
        this.portCptFourni = portCptFourni;
    }

    public PortCptFourni getPortCptFourni() {
        return portCptFourni;
    }

    public void setPortCptFourni(PortCptFourni portCptFourni) {
        this.portCptFourni = portCptFourni;
    }
}
