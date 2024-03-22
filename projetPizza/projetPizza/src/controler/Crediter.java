package controler;

import java.awt.event.*;
import model.Client;
import view.Argent;
import view.BaseClients;


public class Crediter extends Argent{

	public Crediter() {
		
		Action click3 = new Action();
		
		choix1.addActionListener(click3);
		choix2.addActionListener(click3);
		choix3.addActionListener(click3);
		choix4.addActionListener(click3);
		val.addActionListener(click3);
		Argent.choixC.dispose();
	}
	
	public class Action implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			int arg = Integer.parseInt((BaseClients.montant).getText());
			
			if((choix1.isSelected()) && (e.getSource()==val)) {
				Client.crediter(BaseClients.c1,arg);	
				BaseClients.tableau.setValueAt(BaseClients.c1.compteSolde,0,1);
			} else if((choix2.isSelected()) && (e.getSource()==val)) {
				Client.crediter(BaseClients.c2,arg);
				BaseClients.tableau.setValueAt(BaseClients.c2.compteSolde,1,1);
			} else if((choix3.isSelected()) && (e.getSource()==val)) {
				Client.crediter(BaseClients.c3,arg);
				BaseClients.tableau.setValueAt(BaseClients.c1.compteSolde,2,1);
			} else if((choix4.isSelected()) && (e.getSource()==val)) {
				Client.crediter(BaseClients.c4,arg);
				BaseClients.tableau.setValueAt(BaseClients.c1.compteSolde,3,1);
			}
		}
	}
}