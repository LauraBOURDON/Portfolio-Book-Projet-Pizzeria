package controler;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.Client;
import view.Catalogue;
import view.GestionCommandes;
import view.Info;
import view.Accueil;
import view.BaseClients;

public class Click extends Accueil{
	
	Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
    
	public Click() {
		Action click= new Action();
		cat.addActionListener(click);
		cc.addActionListener(click);
		info.addActionListener(click);
		gcommand.addActionListener(click);
		
	}
    
	
	public class Action implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == cat){
				new Catalogue();
			}
			if (e.getSource() == cc){
				//new BaseClients();
				new Click2();
				

				
			}
			if (e.getSource() == info){
				new Info();
			}
			if (e.getSource() == gcommand){
				new GestionCommandes();
			}
			
		} 
			
	}
}