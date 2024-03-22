package view;

import java.awt.*;
import javax.swing.*;

public class Info extends JFrame {

    JLabel titre = new JLabel ("Rapizz");
    JLabel inf = new JLabel ("Informations :");
    JLabel adr = new JLabel("Adresse : 64 rue du General de Gaulle, 91100 Corbeil-Essonnes");
    JLabel num = new JLabel("Numéro de téléphone : 01 69 44 86 26");
    JLabel slogan = new JLabel("La rapidité, c'est notre métier !");
    JPanel conteneur = new JPanel();
    JPanel Sconteneur = new JPanel();
    BorderLayout gp = new BorderLayout();
    GridLayout sgp = new GridLayout(4,1);
    ImageIcon im = new ImageIcon("C:\\Users\\Laura\\Pictures\\dessin enfant\\pizza.png");
    
    Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
    
    public Info() {
    	
        conteneur.setOpaque(true);
        conteneur.setBackground(Color.red);
        conteneur.setLayout(gp);
        Sconteneur.setLayout(sgp);
        conteneur.add(BorderLayout.NORTH,titre);
        
        titre.setForeground(Color.orange);
        titre.setFont(new Font("Serif",Font.BOLD,115));
        titre.setHorizontalAlignment(SwingConstants.CENTER);
        
        conteneur.add(BorderLayout.CENTER,Sconteneur);
        
        Sconteneur.add(slogan);
        Sconteneur.add(inf);
        Sconteneur.add(adr);
        Sconteneur.add(num);
        
        inf.setHorizontalAlignment(SwingConstants.CENTER);
        adr.setHorizontalAlignment(SwingConstants.CENTER);
        num.setHorizontalAlignment(SwingConstants.CENTER);
        slogan.setHorizontalAlignment(SwingConstants.CENTER);
        
        inf.setFont(new Font("Serif", Font.BOLD, 40));
        adr.setFont(new Font("Serif", Font.ROMAN_BASELINE, 30));
        num.setFont(new Font("Serif", Font.ROMAN_BASELINE, 30));
        
        slogan.setFont(new Font("Serif", Font.ITALIC, 35));
        slogan.setForeground(Color.red);
        
        this.setIconImage(im.getImage());
        this.setTitle("Informations");
        this.getContentPane().add(conteneur);
        this.setVisible(true);
        this.setSize(tailleEcran);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}