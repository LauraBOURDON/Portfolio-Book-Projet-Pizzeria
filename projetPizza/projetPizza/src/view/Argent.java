package view;

import java.awt.*;

import javax.swing.*;

public class Argent {
	
	Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
	ImageIcon im = new ImageIcon("C:\\Users\\Laura\\Pictures\\dessin enfant\\pizza.png");
	
	public static JDialog choixC = new JDialog(BaseClients.nomPage,"Choix du client",true);
	public JPanel conteneur = new JPanel();
	JLabel titre = new JLabel("Choissisez votre compte : \n");
	public static JButton val = new JButton("VALIDER MON CHOIX");
	
	public static JRadioButton choix1 = new JRadioButton("Client_1 : 0679804532");
	public static JRadioButton choix2 = new JRadioButton("Client_2 : 0679804532");
	public static JRadioButton choix3 = new JRadioButton("Client_3 : 0679804532");
	public static JRadioButton choix4 = new JRadioButton("Client_4 : 0679804532");
	
	public Argent() {
		
		choixC.setLayout(new BorderLayout());
		choixC.setSize(300,240);
		choixC.setLocationRelativeTo(null);
		
		titre.setFont(new Font("Serif",Font.BOLD,17));
		titre.setHorizontalAlignment(SwingConstants.LEFT);
		
		choixC.add(conteneur);
		conteneur.add(titre);
		conteneur.add(choix1);
		conteneur.add(choix2);
		conteneur.add(choix3);
		conteneur.add(choix4);
		conteneur.add(val, BorderLayout.SOUTH);
		
		choixC.setVisible(true);
		choixC.setIconImage(im.getImage());
		
	}
}