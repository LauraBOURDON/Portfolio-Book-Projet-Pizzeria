package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Entreprise;

public class SupprCommande implements ActionListener {
	
	private JTable table;
	private DefaultTableModel model;
	
	public SupprCommande(JTable table, DefaultTableModel model) {
		this.table = table;
		this.model = model;
	}

	public void actionPerformed(ActionEvent e) {
		int rowIndex = table.getSelectedRow();
		if (rowIndex == -1) {
			JOptionPane.showMessageDialog(null, "Veuillez sélectionner une pizza à supprimer.");
		} else {
			model.removeRow(rowIndex);
			Entreprise.listCommande.remove(rowIndex);
		}
	}
	
}
