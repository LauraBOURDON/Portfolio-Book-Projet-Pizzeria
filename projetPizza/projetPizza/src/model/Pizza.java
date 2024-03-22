package model;

import java.util.*;

public class Pizza {
    public String nom = new String();
    public String ingrédients = new String();
    public double prix;
    public Vector<LigneCommand> listCom = new Vector<LigneCommand>();
    
	//constructeur
    public Pizza(String n, String i, double p) {
    	this.nom = n;
    	this.ingrédients = i;
    	this.prix = p;
    }
    
    public void setNom(String n) {
        this.nom = n;
    }
    
    public void setIngredients(String i) {
        this.ingrédients = i;
    }
    
    public void setPrix(double p) {
        this.prix = p;
    }
    
    public void addPizza(LigneCommand p) {
    	//ajoute une pizza dans la ligne de commande
    	listCom.add(p);
    }
    public void removePizza(LigneCommand p) {
    	//enleve une pizza dans la ligne de commande
    	listCom.remove(p);
    }
}