package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Entreprise;
import view.BaseClients;
import view.NewClient;

public class Click2 extends BaseClients{
	 
	public Click2() {
		
		Action click2= new Action();
		deb.addActionListener(click2);
		cred.addActionListener(click2);
		newClient.addActionListener(click2);
		suppClient.addActionListener(click2);
		
	}
	
	public class Action implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == deb) {
				new Debiter();	
			}else if(e.getSource() == cred){
				new Crediter();
			}

			
			if (e.getSource() == newClient){
				new AjtC(NewClient.newNum, NewClient.newCS, model);
			}
			if (e.getSource() == suppClient){
				new SuppC(BaseClients.tableau,BaseClients.model);
			}
		}
	}
}