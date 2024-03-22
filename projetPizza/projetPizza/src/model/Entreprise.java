package model;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Entreprise {
	
    public String nom;
    public static Vector<Commande> listCommande = new Vector<Commande>();
    public static Vector<Livreur> listLivreur = new Vector<Livreur>();
    public static Vector<Client> listClient = new Vector<Client>();
    public static Vector<Pizza> catalogue = new Vector<Pizza>();
    
	//constructeur
    public Entreprise(String n) {
    	n = nom;
    }
    
    //vérif si le compte existe dans la base de donnée
    public static Client rechercherClient(String numeroTelephone) {
        for (Client client : listClient) {
            if (client.getNum().equals(numeroTelephone)) {
                return client;
            }
        }
        return null;
    }
    public void addClient(Client c){
    	listClient.add(c);
    }
    public void removeClient(Client c){
    	listClient.remove(c);
    }
    public void addCatalogue(Pizza p){
    	catalogue.add(p);
    }
    public void removeCatalogue(Pizza p){
    	catalogue.remove(p);
    }
    
    /*public double chiffreAffaire() {
    	//calcule l'argent total généré par les ventes de pizzas
    	return 0;
    }
    public String[] ingredients() {
        // verif si l'entreprise a les ingredients necessaire pr la pizza commandée
    }
    }*/
    
    public float offrePizza(float p, String t) throws ParseException {
        // reduction de -20% chaque 20 du mois
    	 DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	 
    	 Date date = new Date();
    	 Date date2 = format.parse("2023-07-14");
    	 if(format.format(date).equals(format.format(date2))) {
	    	 if(t == "naine") {
	    	        p = p - p*1/3 - p*50/100;
	    	 } else if (t == "ogresse"){
	    	        p = p + p*1/3 - p*50/100;
	    	 }else if(t == "humaine"){
	    		 p = p - p*50/100;
	    	 }
    	}
    	 return p;
    }
    
    /* public int pizzasRentables() {
        // parcours la base de données et renvoie les pizzas les + rentables (par ordre decroissants ?)
        return 0;
    }*/
}


