package model;
import java.util.*;

public class Client {

	public String num;
    public int compteSolde;
    public Vector<Commande> listCommande = new Vector<Commande>();
    public Vector<Entreprise> listEntreprise = new Vector<Entreprise>();
    
    //constructeur
    public Client(String n, int cS) {
    	num = n;
    	compteSolde = cS;
    }
    
    public String getNum() {
        return num;
    }
    
    public void addCommand(Commande c){
    	listCommande.add(c);
    }
    public void removeCommand(Commande c){
    	listCommande.remove(c);
    }
    public static void crediter(Client c, int x) {
    	c.compteSolde = c.compteSolde + x;
    }
    public static void debiter(Client c, int x) {
    	c.compteSolde = c.compteSolde - x;
    }
}