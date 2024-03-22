package view;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Connexion {
	 JFrame nomPage = new JFrame("Connexion");
	 JPanel conteneur = new JPanel();
	 JLabel titre = new JLabel("Rapizz", SwingConstants.CENTER);
	 JTextField num = new JTextField("Numero de téléphone :");
	 JTextField mdp = new JTextField("Mot de passe :");
	 
	 public Connexion() {
		 //nomPage.setLayout(new GridLayout(4,1));
		 titre.setFont(new Font("Serif",Font.BOLD,90));
		 nomPage.add(conteneur);
		 conteneur.add(titre);
		 conteneur.add(num);
		 conteneur.add(mdp);
		 nomPage.setVisible(true);
	 }
}
