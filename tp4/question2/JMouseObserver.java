package question2;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.TextArea;

/**
 * D�crivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class JMouseObserver implements MouseListener { 

    private String nom;
    private TextArea contenu;

    /**
     * Constructeur d'objets de classe JButtonObserver
     */
    public JMouseObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    public void mouseClicked(MouseEvent e) {
    }

    /**
     * affichage d'un message dans la zone de texte ce message est de la forme
     * observateur this.nom : souris entrée en (X,Y) exemple : observateur jmo1
     * : souris entrée en (15,20)
     * 
     * @param e
     *      MouseEvent contenant les coordonnees du curseur par rapport au bouton
     */
    public void mouseEntered(MouseEvent e) {
        String message = "observateur " + nom + ": souris entr\u00E9e en (" + e.getX() + "," + e.getY() + ")";
	contenu.append(message + "\n");
    }

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

}
