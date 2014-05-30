



    import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

import java.awt.Dimension;

/**
 * Classe Fenetre
 * 
 * @author HENROT/REYNAUD
 * @version v1.0
 */

    public class FenetreIHM extends JFrame
    {
        public JPanel panelPlateau = new JPanel();
        public JPanel panelD = new JPanel();

        public FenetreIHM(ControleurEchec partie)
        {
            int i, j;
            this.setTitle("Echecs");
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            this.setSize(1000, 700);
            this.setResizable(false);
            
            
            JOptionPane nomJoueur1 = new JOptionPane(), nomJoueur2 = new JOptionPane();
            String nom1 = nomJoueur1.showInputDialog(null, "Entrez le nom du joueur 1", "User Name", JOptionPane.QUESTION_MESSAGE);
            String nom2 = nomJoueur2.showInputDialog(null, "Entrez le nom du joueur 2", "User Name", JOptionPane.QUESTION_MESSAGE);

            panelPlateau.setPreferredSize(new Dimension(700, 700));

            panelD.setPreferredSize(new Dimension(300, 700));
            panelD.setBackground(Color.GRAY);
    

           
            panelPlateau.setLayout(new GridLayout(8, 8));
            for (j = 1; j < 9; j++)
                for (i = 1; i < 9; i++)
                {
                    if (j == 1 || j == 8)
                    {
                    	panelPlateau.add(new Bouton("TOUR", i, j, partie));
                        i++;
                        panelPlateau.add(new Bouton("FOU", i, j, partie));
                        i++;
                        panelPlateau.add(new Bouton("CAVALIER", i, j, partie));
                        i++;
                        panelPlateau.add(new Bouton("ROI", i, j, partie));
                        i++;
                        panelPlateau.add(new Bouton("DAME", i, j, partie));
                        i++;
                        panelPlateau.add(new Bouton("CAVALIER", i, j, partie));
                        i++;
                        panelPlateau.add(new Bouton("FOU", i, j, partie));
                        i++;
                        panelPlateau.add(new Bouton("TOUR", i, j, partie));
                        i++;
                    } 
                    
                    else if (j == 2 || j == 7)
                    {
                        panelPlateau.add(new Bouton("SOLDAT", i, j,partie));

                    } else
                        panelPlateau.add(new Bouton("", i, j,partie));
                }
           
            


            this.getContentPane().setLayout(new BorderLayout());

            this.getContentPane().add(panelPlateau, BorderLayout.WEST);
            this.getContentPane().add(panelD, BorderLayout.EAST);

            this.setVisible(true);
        }

  
        public void desactivationBouton()
        {
            for (int i=0;i<64;i++)
                panelPlateau.getComponent(i).setEnabled(false);
            
        }

        public void modificationPanelDroit(String text)
        {
        	panelD.setBackground(Color.RED);
            panelD.setPreferredSize(new Dimension(300,500));
            
        }

        public void deplacement()
        {
            // TODO Auto-generated method stub
            
        }

     
    
}
