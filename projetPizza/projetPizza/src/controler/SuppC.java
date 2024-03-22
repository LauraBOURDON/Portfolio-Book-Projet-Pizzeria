package controler;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Entreprise;
import view.BaseClients;

public class SuppC {
	private JTable tableau;
	private DefaultTableModel model;
	
	public SuppC(JTable tableau, DefaultTableModel model) {
		this.tableau = tableau;
		this.model = model;
		
		Action click5 = new Action();
		BaseClients.suppClient.addActionListener(click5);
	}
public class Action implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {

			int ligne = BaseClients.tableau.getSelectedRow();
			if (ligne !=-1) {
				BaseClients.model.removeRow(ligne);
				Entreprise.listClient.remove(ligne);
			}
		} 
	}
}