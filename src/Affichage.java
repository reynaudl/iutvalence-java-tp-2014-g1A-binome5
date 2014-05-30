



import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Affichage
{

    
    public static void main(String[] args)
    {
        final ControleurEchec partie = new ControleurEchec();
        SwingUtilities.invokeLater(new Runnable()
        {
          
           public void run() {
                new FenetreIHM(partie);
            }
            
            
        }
       );
    }

}