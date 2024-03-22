package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.Entreprise;

public class BaseClients{
	
	public static JFrame nomPage = new JFrame("Base Clients");
	public static JPanel conteneur = new JPanel();
	JPanel conteneur0 = new JPanel();
	JPanel Sconteneur = new JPanel();
	
	JLabel titre = new JLabel("Rapizz");
	ImageIcon im = new ImageIcon("C:\\Users\\Laura\\Pictures\\dessin enfant\\pizza.png");
	
	 //tableau clients
	public static Client c1 = new Client("0679804532", 97);
	public static Client c2 = new Client("0707154123", 54);
	public static Client c3 = new Client("0790453268", 128);
	public static Client c4 = new Client("0682673161", 13);
	
	public static String[]  entetes = {"Numero", "Solde"};
	public static DefaultTableModel model = new DefaultTableModel(entetes, 0);
	public static JTable tableau = new JTable(model);
			 
	Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
	public static JButton deb = new JButton("Débiter");
	public static JButton cred = new JButton("Créditer");
	public static JButton newClient = new JButton("AJOUTER UN NOUVEAU CLIENT");
	public static JButton suppClient = new JButton("SUPPRIMER UN CLIENT");
	public static JTextField montant = new JTextField("Vous ne pouvez effectuer plusieurs opérations sur un seul compte à la fois");
	 
	 
	public BaseClients() {
		
		if(Entreprise.listClient.isEmpty()) {
			Entreprise.listClient.add(c1);
			Entreprise.listClient.add(c2);
			Entreprise.listClient.add(c3);
			Entreprise.listClient.add(c4);
		}
		
		for(Client client : Entreprise.listClient) {
			String num = client.num;
			int CS = client.compteSolde;
			Object[] clients = {num, CS};
			model.addRow(clients);
		}
		
		
		 nomPage.setVisible(true);
		 conteneur0.setBackground(Color.red);
		 conteneur0.setLayout(new BorderLayout());
		 conteneur.setLayout(new BorderLayout());
		 Sconteneur.setLayout(new GridLayout(11,1));
		 
		 titre.setForeground(Color.orange);
		 titre.setFont(new Font("Serif",Font.BOLD,115));
		 titre.setHorizontalAlignment(SwingConstants.CENTER); 
		 
		 nomPage.add(conteneur0);
		 conteneur0.add(titre, BorderLayout.NORTH);
		 conteneur0.add(conteneur,BorderLayout.CENTER);
		 conteneur.add(Sconteneur,BorderLayout.SOUTH);

		 tableau.setRowHeight(30);
		 conteneur.add(new JScrollPane(tableau), BorderLayout.NORTH);
		
		 conteneur.add(deb, BorderLayout.WEST);
		 conteneur.add(montant, BorderLayout.CENTER );
		 conteneur.add(cred, BorderLayout.EAST);
		 Sconteneur.add(newClient);
		 Sconteneur.add(suppClient);

		 deb.setFont(new Font("Serif",Font.BOLD,18));
	     cred.setFont(new Font("Serif",Font.BOLD,18));
	     newClient.setFont(new Font("Serif",Font.PLAIN,20));
	     suppClient.setFont(new Font("Serif",Font.PLAIN,20));
	     montant.setFont(new Font("Serif",Font.PLAIN,20));
	     montant.setHorizontalAlignment(JTextField.CENTER); 
		 
		 nomPage.setIconImage(im.getImage());
		 nomPage.setSize(tailleEcran);
		 nomPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
	}
	
}