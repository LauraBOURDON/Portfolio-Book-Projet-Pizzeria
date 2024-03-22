package view;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Pizza {
    public String name;
    public String ingredients;
    public double price;

    public Pizza(String name, String ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }
}

public class Example {
    public Example() {
        // Créer un Vector de pizzas
        Vector<Pizza> pizzaCatalog = new Vector<Pizza>();
        pizzaCatalog.add(new Pizza("Pizza Margherita", "Tomato sauce, Mozzarella cheese, Basil", 8.99));
        pizzaCatalog.add(new Pizza("Pizza Pepperoni", "Tomato sauce, Mozzarella cheese, Pepperoni", 10.99));
        pizzaCatalog.add(new Pizza("Pizza Hawaiian", "Tomato sauce, Mozzarella cheese, Ham, Pineapple", 11.99));

        // Créer un modèle de table avec trois colonnes
        String[] columnNames = {"Nom", "Ingrédients", "Prix"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Ajouter les données du Vector au modèle de table
        for (Pizza pizza : pizzaCatalog) {
            String name = pizza.name;
            String ingredients = pizza.ingredients;
            double price = pizza.price;
            Object[] rowData = {name, ingredients, price};
            model.addRow(rowData);
        }

        // Créer un JTable avec le modèle de table
        JTable table = new JTable(model);

        // Ajouter le JTable à un conteneur Swing pour l'afficher
        JFrame frame = new JFrame("Catalogue de pizzas");
        frame.getContentPane().add(new JScrollPane(table));
        frame.pack();
        frame.setVisible(true);
    }
}