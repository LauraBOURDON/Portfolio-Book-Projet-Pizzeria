package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VerifClient implements ActionListener {
	
	private JTable table;
	private DefaultTableModel model;
	
	public VerifClient(JTable table, DefaultTableModel model) {
		this.table = table;
		this.model = model;
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}