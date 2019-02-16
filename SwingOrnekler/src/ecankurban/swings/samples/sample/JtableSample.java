package ecankurban.swings.samples.sample;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JtableSample extends JFrame {
	private JTable table;
	JButton btnNewButton;
	protected String adi;

	public JtableSample() {
		initialize();
	}

	private void initialize() {
		setTitle("Btn Ornek");
		setBounds(150, 250, 662, 486);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{41, 435, 0, 0};
		gridBagLayout.rowHeights = new int[]{251, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		String [][] data=new String[3][5];
		String [] columnNames= {"Adi","Soyadi","Tc","No","Email"};
		
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;
		getContentPane().add(scrollPane, gbc_scrollPane);
		
		data[0][0]="Ezgi";
		data[0][1]="Ezgi";
		data[0][3]="Ezgi";
		data[0][4]="Ezgi";
		data[1][2]="Ezgi";
		data[1][3]="Ezgi";
		
		DefaultTableModel model=new DefaultTableModel(data, columnNames);
		
		table = new JTable();
		table.setModel(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row=table.getSelectedRow();
				//String adi=(String)table.getModel().getValueAt(row, 0);
				DefaultTableModel m=(DefaultTableModel)table.getModel();
				Object o=m.getDataVector().elementAt(row);
				
				adi = (String)o.toString();
			}
		});
		scrollPane.setViewportView(table);
		
	     btnNewButton = new JButton("New button");
	     btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(JtableSample.this, adi);
			}
		});
	     
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 0;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
	}
}
