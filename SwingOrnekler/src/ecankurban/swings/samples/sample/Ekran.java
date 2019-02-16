package ecankurban.swings.samples.sample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ekran extends JFrame {
	JRadioButton rdbtnFemale;
	JRadioButton rdbtnMale;
	
	public Ekran() {
		setTitle("Btn Ornek");
		setBounds(150, 250, 662, 486);
		getContentPane().setLayout(null);
		
		JLabel lblSwingLabel = new JLabel("Swing Label");
		lblSwingLabel.setBounds(118, 48, 104, 27);
		getContentPane().add(lblSwingLabel);
		
		
		Genisletme lblbenim = new Genisletme();
		lblbenim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(Ekran.this, lblbenim.getAdi()+" "+lblbenim.getSoyadi());
				
				
			}
		});
		lblbenim.setBounds(118, 138, 91, 33);
		lblbenim.setAdi("Ezgi");
		lblbenim.setSoyadi("Cankurban");
		getContentPane().add(lblbenim);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(429, 81, 91, 23);
		getContentPane().add(btnNewButton);
		
		
		
		
		 rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				stateChangedEventForRdBtnMale(e);
				
			}

			
		});
		
		
		rdbtnMale.setBounds(118, 238, 109, 23);
		getContentPane().add(rdbtnMale);
		
		 rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				stateChangedEventForRdBtnFemale(e);
				
			}

			
		});
		
		
		rdbtnFemale.setBounds(371, 238, 109, 23);
		getContentPane().add(rdbtnFemale);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	protected void stateChangedEventForRdBtnMale(ItemEvent e) {// itemevet e'yi gönder ki özellikleri gelsin.Bu þekilde getclass ile tüm componentlere ulaþýyorsun.
		
				if(rdbtnMale!=null && rdbtnFemale != null) {
					if(rdbtnMale.isSelected()) {
						rdbtnFemale.setSelected(false);
					}
						
				}
			}
	protected void stateChangedEventForRdBtnFemale(ItemEvent e) {
		
		if(rdbtnFemale!=null && rdbtnMale != null) {
			
			if(rdbtnFemale.isSelected()) {
				rdbtnMale.setSelected(false);
			}
				
		}
		
		
	}
	
	
}
