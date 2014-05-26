



    import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import java.awt.Dimension;

    public class Fenetre extends JFrame
    {
        
        public Fenetre(){
            
            this.setTitle("Jeu d'échecs");
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(780, 640);
            
           
            AffichagePlateau gauche = new AffichagePlateau();
            gauche.setPreferredSize(new Dimension(600,600));
            
            
            JPanel droite = new JPanel();
            droite.setBackground(Color.GREEN);
            droite.setPreferredSize(new Dimension(400,600));
            JOptionPane nomJoueur1 = new JOptionPane(), nomJoueur2 = new JOptionPane();
            String nom1 = nomJoueur1.showInputDialog(null, "Entrez le nom du joueur 1", "User Name", JOptionPane.QUESTION_MESSAGE);
            String nom2 = nomJoueur2.showInputDialog(null, "Entrez le nom du joueur 2", "User Name", JOptionPane.QUESTION_MESSAGE);

            
            this.getContentPane().setLayout(new BorderLayout());

            this.getContentPane().add(gauche, BorderLayout.WEST);
            
            
            this.getContentPane().add(droite, BorderLayout.EAST);

            this.setVisible(true);
            
            
	         
	         
	         
	
        
        
        }   
    
}
