package model;

import java.util.*;

public class Commande {
	
	public String date;
    public Client numClient;
    public Livreur livreur;
    public static Vector<LigneCommand> listLigne = new Vector<LigneCommand>();
    
    //constructeur
    public Commande(String d, Client c, Livreur l) {
    	this.date = d;
    	this.numClient = c;
    	this.livreur = l;
    }
    public String getDate() {
    	return date;
    }
    public Client getClient() {
    	return numClient;
    }
    public Livreur getLivreur() {
    	return livreur;
    }
    public void addLC(LigneCommand c){
    	listLigne.add(c);
    }
    public void removeLC(LigneCommand c){
    	listLigne.remove(c);
    }
}