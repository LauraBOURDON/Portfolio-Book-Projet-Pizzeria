package view;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controler.SupprCommande;
import controler.SupprPizzaAction;
import model.Entreprise;
import model.LigneCommand;
import model.Livreur;
import model.Client;
import model.Commande;

public class GestionCommandes extends JFrame {
	
	JPanel conteneur = new JPanel();
    JLabel titre = new JLabel("Rapizz");
    //ImageIcon im = new ImageIcon("C:\\Users\\Laura\\Pictures\\dessin enfant\\pizza.png");
    JButton CommandReady = new JButton ("Préparer la commande");
    JButton CancelCommand = new JButton ("Annuler la commande");
    String[] columnNames = { "Numéro de commande","Date", "Clients", "Livreurs" };
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    JTable table = new JTable(model);
    JPanel Sconteneur = new JPanel();
    public GestionCommandes() {
    	if (Entreprise.listCommande.isEmpty()) {
    		Entreprise.listCommande.add(new Commande("16/05/2023", new Client("0679804532",130), new Livreur ("Voiture")));
    		Entreprise.listCommande.add(new Commande("16/05/2023", new Client("0642689514",143), new Livreur ("Moto")));
    		Entreprise.listCommande.add(new Commande("16/05/2023", new Client("0790453268",135), new Livreur ("Voiture")));
        }
    	
    	int i = 1;
    	for (Commande commande : Entreprise.listCommande) {
    		String ncommand = "Commande " + i;
    		String date = commande.getDate();
            String numClient = commande.getClient().getNum();
            String livreur = commande.getLivreur().getVehicule();
            Object[] rowData = { ncommand, date, numClient, livreur };
            model.addRow(rowData);
            i++;
        }
    	
    	BorderLayout layout = new BorderLayout();
        getContentPane().setLayout(layout);
        getContentPane().add(titre,BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        getContentPane().add(Sconteneur, BorderLayout.SOUTH);
        Sconteneur.add(CancelCommand);
        Sconteneur.add(CommandReady);
        
        SupprCommande delCommand = new SupprCommande(table, model);
        CancelCommand.addActionListener(e -> delCommand.actionPerformed(e));
    	
    	this.getContentPane().add(conteneur);
        this.getContentPane().add(new JScrollPane(table));
        this.pack();
        this.setVisible(true); 
    }
}
