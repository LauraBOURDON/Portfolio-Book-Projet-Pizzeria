package view;

import java.awt.*;
import javax.swing.*;


public class NewClient {
	Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
	ImageIcon im = new ImageIcon("C:\\Users\\Laura\\Pictures\\dessin enfant\\pizza.png");
	
	protected JFrame choixC = new JFrame("Nouveau client");
	public JPanel conteneur = new JPanel();
	JLabel titre = new JLabel("Mon compte client :");
	JLabel t = new JLabel("-------------------------------");
	public JButton val = new JButton("VALIDER MON CHOIX");
	public static JTextField newNum = new JTextField("Numéro de téléphone :");
	public static JTextField newCS = new JTextField("Solde du compte :");
	
	
	public NewClient() {
		choixC.setLayout(new BorderLayout());
		choixC.setSize(280,180);
		choixC.setLocationRelativeTo(null);
		
		titre.setFont(new Font("Serif",Font.BOLD,19));
		titre.setHorizontalAlignment(SwingConstants.LEFT);
		
		choixC.add(conteneur);
		conteneur.add(titre);
		conteneur.add(t);
		conteneur.add(newNum);
		conteneur.add(newCS);
		conteneur.add(val);
		
		t.setFont(new Font("Serif",Font.PLAIN,20));
		newNum.setFont(new Font("Serif",Font.PLAIN,15));
	    newNum.setHorizontalAlignment(JTextField.CENTER);
	    newCS.setFont(new Font("Serif",Font.PLAIN,15));
	    newCS.setHorizontalAlignment(JTextField.CENTER);
	     
		choixC.setVisible(true);
		choixC.setIconImage(im.getImage());
		choixC.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}