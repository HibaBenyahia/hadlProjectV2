package edu.univnantes.projet.hadl.M2.configuration;


import edu.univnantes.projet.hadl.M2.lien.Binding;
import edu.univnantes.projet.hadl.M2.lien.BindingRequis;

import java.util.ArrayList;

public class PortCfgRequis extends PortCfg {

    private BindingRequis bindingRequis;

    public PortCfgRequis(ArrayList<PortCfg> portConfig, String nom, Binding binding, BindingRequis bindingRequis) {
        super(portConfig, nom, binding);
        this.bindingRequis = bindingRequis;
    }

    public BindingRequis getBindingRequis() {
        return bindingRequis;
    }

    public void setBindingRequis(BindingRequis bindingRequis) {
        this.bindingRequis = bindingRequis;
    }
}
