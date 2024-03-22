package controler;

import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.Client;
import model.Entreprise;
import view.NewClient;

public class AjtC extends NewClient{
	  private JTextField newNum;
	    private JTextField newCS;
	    private DefaultTableModel model;
	    static JRadioButton newB;
	    static Client c;
	    
	public AjtC(JTextField num, JTextField solde, DefaultTableModel model) {
		this.newNum = num;
        this.newCS = solde;
        this.model = model;
		
		Action click4 = new Action();
		val.addActionListener(click4);
		newNum.addActionListener(click4);
		newCS.addActionListener(click4);

	}
	
	public class Action implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String num = newNum.getText();
			int solde = Integer.parseInt(newCS.getText());
		
			if(e.getSource()==val) {
				c = new Client(num,solde);
				Entreprise.listClient.addElement(c);
				Object[] clients = {num, solde};
				model.addRow(clients);
			}
		}	
	}
}