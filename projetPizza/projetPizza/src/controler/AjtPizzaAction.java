package controler;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import javax.swing.*;
import model.Entreprise;
import model.Pizza;

public class AjtPizzaAction implements ActionListener {
    private JTextField nomPizza;
    private JTextField ingPizza;
    private JTextField prixPizza;
    private DefaultTableModel model;

    public AjtPizzaAction(JTextField nomPizza, JTextField ingPizza, JTextField prixPizza, DefaultTableModel model) {
        this.nomPizza = nomPizza;
        this.ingPizza = ingPizza;
        this.prixPizza = prixPizza;
        this.model = model;
    }

    public void actionPerformed(ActionEvent e) {
    	//on récupère les valeurs saisies
        String nom = nomPizza.getText();
        String ingrédients = ingPizza.getText();
        double prix = Double.parseDouble(prixPizza.getText());
        
        //on crée la nouvelle Pizza avec les valeurs saisies
        Pizza nouvellePizza = new Pizza(nom, ingrédients, prix);
        Entreprise.catalogue.add(nouvellePizza);
        Object[] rowData = { nom, ingrédients, prix };
        model.addRow(rowData);
        
        //confirmation de la création de la Pizza !
        JOptionPane.showMessageDialog(null, "Pizza ajoutée avec succès !");
        //on reset les textes de saisie
        nomPizza.setText("");
        ingPizza.setText("");
        prixPizza.setText("");
    }
}
