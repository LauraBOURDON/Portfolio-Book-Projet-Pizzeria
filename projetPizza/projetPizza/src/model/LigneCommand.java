package model;


public class LigneCommand {
	
    public int qt;
    public String taille;
    public Pizza pizza;
    
	//constructeur
    public LigneCommand(int q, String t, Pizza p) {
    	q = qt;
    	t = taille;
    	pizza = p;
    }
    
    public double PrixTotalCommande(Pizza p, int qt) {
    	double totalPrice;
    	if(qt>=11) { // une pizza gratuite à partir de 10 pizzas
    		totalPrice = p.prix * (qt-1);
    	} else {
    		totalPrice = p.prix * qt ;
    	}
    	return totalPrice;
    }
    
    public double PrixPizz(Pizza p, String t){
        if(t.equalsIgnoreCase("naine")) {
        p.prix = p.prix - p.prix*1/3;
        } else if (t.equalsIgnoreCase("ogresse")){
        p.prix = p.prix + p.prix*1/3;
        }
        return p.prix;
    }
}



