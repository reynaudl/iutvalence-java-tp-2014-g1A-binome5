

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

import java.awt.Dimension;

public class AffichagePlateau extends JPanel {
    
    public AffichagePlateau()
    {
	
        JPanel north = new JPanel();
        north.setBackground(Color.WHITE);
        north.setPreferredSize(new Dimension(90,50));
        
        JLabel blanc = new JLabel("Blanc"), noir = new JLabel("Noir");
        
        blanc.setPreferredSize(new Dimension(150, 30));
        blanc.setForeground(Color.BLACK);
        north.add(blanc);
        
        
        JPanel center = new JPanel();
        center.setBackground(Color.LIGHT_GRAY);
        
        
        JPanel south = new JPanel();
        south.setBackground(Color.BLACK);
        south.setPreferredSize(new Dimension(40,50));
        
  
        noir.setPreferredSize(new Dimension(150, 30));
        noir.setForeground(Color.WHITE);
        south.add(noir);
        
        
       

        this.setLayout(new BorderLayout());

        this.add(north, BorderLayout.NORTH);

        this.add(center, BorderLayout.CENTER);

        this.add(south, BorderLayout.SOUTH);
        
        
        
	center.setLayout(new GridLayout(8,8));
	center.add(new Bouton("Tour"));
        center.add(new Bouton("Cavalier"));
        center.add(new Bouton("Fou"));
        center.add(new Bouton("Roi"));
        center.add(new Bouton("Dame"));
        center.add(new Bouton("Fou"));
        center.add(new Bouton("Cavalier"));
        center.add(new Bouton("Tour"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton(""));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Pion"));
        center.add(new Bouton("Tour"));
        center.add(new Bouton("Cavalier"));
        center.add(new Bouton("Fou"));
        center.add(new Bouton("Roi"));
        center.add(new Bouton("Dame"));
        center.add(new Bouton("Fou"));
        center.add(new Bouton("Cavalier"));
        center.add(new Bouton("Tour"));
    }

 
}
 
