package view;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.table.*;
import controler.AjtPizzaAction;
import controler.SupprPizzaAction;
import model.Entreprise;
import model.Pizza;

public class Catalogue extends JFrame {
	
    JPanel conteneur = new JPanel();
    JLabel titre = new JLabel("Rapizz");
    //ImageIcon im = new ImageIcon("C:\\Users\\Laura\\Pictures\\dessin enfant\\pizza.png");
    JButton ajtPizza = new JButton("Ajouter");
    JTextField nomPizza = new JTextField(20);
    JTextField ingPizza = new JTextField(20);
    JTextField prixPizza = new JTextField(5);
    JButton delPizza = new JButton("Supprimer");
    String[] columnNames = { "Nom", "Ingrédients", "Prix" };
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    JTable table = new JTable(model);
    JPanel Sconteneur = new JPanel();
    
    public Catalogue() {
    	
        // Si le catalogue est vide on add() les pizzas préfaites, sinon on ajoute rien.
        if (Entreprise.catalogue.isEmpty()) {
            Entreprise.catalogue.add(new Pizza("Maguerita", "Sauce tomate, Mozzarella, Basilique", 10.0));
            Entreprise.catalogue.add(new Pizza("Reine", "Sauce tomate, Mozzarella, Jambon, Champignons, Olives", 12.0));
            Entreprise.catalogue.add(new Pizza("4 fromages", "Sauce tomate, Mozzarella, Chèvre, Gorgonzola, Parmesan", 12.0));
        }

        // Pour chaque Pizza dans le catalogue, on utilise Object[] pour les insérer dans le JTable.
        for (Pizza pizza : Entreprise.catalogue) {
            String nom = pizza.nom;
            String ingrédients = pizza.ingrédients;
            double prix = pizza.prix;
            Object[] rowData = { nom, ingrédients, prix };
            model.addRow(rowData);
        }
        
        // Ajout des éléments pour l'ajout de pizza
        Sconteneur.add(new JLabel("Nom:"));
        Sconteneur.add(nomPizza);
        Sconteneur.add(new JLabel("Ingrédients:"));
        Sconteneur.add(ingPizza);
        Sconteneur.add(new JLabel("Prix:"));
        Sconteneur.add(prixPizza);
        Sconteneur.add(ajtPizza);
        Sconteneur.add(delPizza);
        conteneur.add(Sconteneur);
        
        BorderLayout layout = new BorderLayout();
        getContentPane().setLayout(layout);
        getContentPane().add(titre,BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        getContentPane().add(Sconteneur, BorderLayout.SOUTH);
        
        // Création de l'instance de AjoutPizzaAction
        AjtPizzaAction ajoutPizzaAction = new AjtPizzaAction(nomPizza, ingPizza, prixPizza, model);
        ajtPizza.addActionListener(e -> ajoutPizzaAction.actionPerformed(e));
        
        //création de l'instance de SupprPizzaAction
        SupprPizzaAction suppPizzaAction = new SupprPizzaAction(table, model);
        delPizza.addActionListener(e -> suppPizzaAction.actionPerformed(e));
        
        // Affichage du résultat
        this.getContentPane().add(conteneur);
        this.getContentPane().add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);   
    }

}