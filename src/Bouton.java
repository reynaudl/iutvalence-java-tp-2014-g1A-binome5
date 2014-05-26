import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Bouton extends JButton implements ActionListener {	
	
	private String nom;

	
	public Bouton(String str) {
		this.nom=str;
	}


	public void actionListner() {
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==this){
			
		}
		
	}
	
}
