package model;

import java.util.*;

public class Livreur {
	
    private String véhicule;
    public Vector<Commande> listCommande = new Vector<Commande>();
    
	//constructeur
    public Livreur(String v) {
    	if (v.equalsIgnoreCase("Moto")||v.equalsIgnoreCase("Voiture")) {
            véhicule = v;
    	}

    }
    public String getVehicule() {
    	return véhicule;
    }
    
    public void addCommandeL(Commande c) {
    	listCommande.add(c);
    }
    public void removeCommandeL(Commande c) {
    	listCommande.remove(c);
    }
    public double chrono(Pizza p) {
    	int Max = 45, Min=15;
    	double time;
    	time = Min + (Math.random()* (Max-Min));
        if(time>30) {
            p.prix = 0;
        } return p.prix;
    }
}