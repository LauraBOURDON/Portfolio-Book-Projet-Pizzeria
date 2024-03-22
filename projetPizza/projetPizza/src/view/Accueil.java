package view;

import java.awt.*;

import javax.swing.*;

public class Accueil extends JFrame{

     JLabel titre = new JLabel ("Rapizz");
     public JButton cat = new JButton("Catalogue");
     public JButton cc = new JButton("Compte Client");
     public JButton info = new JButton("Informations");
     public JButton gcommand = new JButton("Gestion des Commandes");
     JPanel conteneur = new JPanel();
     
     Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
     
     public Accueil() {
        this.setVisible(true);
        conteneur.setLayout(new GridLayout(5,1));
        conteneur.setOpaque(true);
        conteneur.setBackground(Color.red);
         
        this.add(conteneur);
        conteneur.add(titre);
        
        titre.setForeground(Color.orange);
        titre.setFont(new Font("Serif",Font.BOLD,115));
        titre.setHorizontalAlignment(SwingConstants.CENTER); 
         
        conteneur.add(cat);
        conteneur.add(cc);
        conteneur.add(info);
        conteneur.add(gcommand);
        
        cat.setFont(new Font("Serif",Font.PLAIN,30));
        cc.setFont(new Font("Serif",Font.PLAIN,30));
        info.setFont(new Font("Serif",Font.PLAIN,30));
        gcommand.setFont(new Font("Serif",Font.PLAIN,30));
        
        this.setTitle("Accueil");
        this.setSize(tailleEcran);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
     
     