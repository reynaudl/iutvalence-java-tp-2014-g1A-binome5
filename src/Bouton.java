import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Classe Bouton
 * 
 * @author HENROT/REYNAUD
 * @version v1.0
 */

public class Bouton extends JButton implements ActionListener {	
	

	
	
    private int x;
    private int y;
    private DeplacementIHM position = new DeplacementIHM(0,0,0,0, null);
    
    public int obtenirX()
    {
        return this.x;
    }



    public int obtenirY()
    {
        return this.y;
    }

    public Bouton(String str/*,int x, int y*/) {
		super(str);
	    //this.x = x;
	    //this.y = y;
	    addActionListener(this);
	}



   
    public synchronized void actionPerformed(ActionEvent e)
    {
        if (position.obtenirDepart() == null)
        {
            int x0=this.obtenirX();
            int y0=this.obtenirY();
            position.setDepart();
        }
        else
        {
            int x1=this.obtenirX();
            int y1=this.obtenirY();
            position.setArrivee();
            
            
        }
	
		
    }
}

