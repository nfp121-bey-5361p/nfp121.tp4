package question2;

import java.awt.Robot;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Random;


/**
 * The test class IHMQuestion2_2Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IHMQuestion2_2Test extends junit.framework.TestCase
{
    private static Random random= new Random();
    private JFrame f;
    private Robot robot;
    
    public IHMQuestion2_2Test() {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
     protected void setUp() throws java.lang.Exception{
        f = new IHMQuestion2_2();
        f.pack();
        f.setVisible(true);
        while(!(f.isShowing())){}
        f.setAlwaysOnTop(true);
        f.setLocation(random.nextInt(500), random.nextInt(500));
        robot = new Robot();
        robot.delay(100);
    }

    protected void tearDown(){ // throws java.lang.Exception
        f.dispose();
    }
    
    public void test_entree_au_bouton_A() throws Exception{
        Container panel = f.getContentPane();
        Component[] components = panel.getComponents();
        assertEquals("ihm invalide ?, ne pas modifier l'interface", components.length, 2);

        // la bonne IHM
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[0] instanceof JPanel);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[1] instanceof TextArea);

        Component[] subComponents = ((JPanel)components[0]).getComponents();
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[0] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[1] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[2] instanceof JButton);


        Point location = subComponents[0].getLocationOnScreen();
        mouseMove(location.x+(subComponents[0].getWidth()/2),location.y+(subComponents[0].getHeight()/2));
        TextArea sortie = (TextArea)components[1];
        StringTokenizer st = new StringTokenizer(sortie.getText(),"\n");
        assertTrue("  une ligne est attendue !!!", st.countTokens()==1);

    }    
    
    public void test_entree_et_clic_bouton_A() throws Exception{
        Container panel = f.getContentPane();
        Component[] components = panel.getComponents();
        assertEquals("ihm invalide ?, ne pas modifier l'interface", components.length, 2);

        // la bonne IHM
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[0] instanceof JPanel);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[1] instanceof TextArea);

        Component[] subComponents = ((JPanel)components[0]).getComponents();
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[0] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[1] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[2] instanceof JButton);


        Point location = subComponents[0].getLocationOnScreen();
        mouseMoveAndClick(location.x+(subComponents[0].getWidth()/2),location.y+(subComponents[0].getHeight()/2));
        TextArea sortie = (TextArea)components[1];
        StringTokenizer st = new StringTokenizer(sortie.getText(),"\n");
        assertTrue("  4 lignes sont attendues !!!", st.countTokens()==4);

    }    
    
    public void test_entree_au_bouton_B() throws Exception{
        Container panel = f.getContentPane();
        Component[] components = panel.getComponents();
        assertEquals("ihm invalide ?, ne pas modifier l'interface", components.length, 2);

        // la bonne IHM
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[0] instanceof JPanel);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[1] instanceof TextArea);

        Component[] subComponents = ((JPanel)components[0]).getComponents();
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[0] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[1] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[2] instanceof JButton);


        Point location = subComponents[1].getLocationOnScreen();
        mouseMove(location.x+(subComponents[1].getWidth()/2),location.y+(subComponents[1].getHeight()/2));
        TextArea sortie = (TextArea)components[1];
        StringTokenizer st = new StringTokenizer(sortie.getText(),"\n");
        assertTrue("  une ligne est attendue !!!", st.countTokens()==1);

    }    
    
    public void test_entree_et_clic_bouton_B() throws Exception{
        Container panel = f.getContentPane();
        Component[] components = panel.getComponents();
        assertEquals("ihm invalide ?, ne pas modifier l'interface", components.length, 2);

        // la bonne IHM
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[0] instanceof JPanel);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[1] instanceof TextArea);

        Component[] subComponents = ((JPanel)components[0]).getComponents();
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[0] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[1] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[2] instanceof JButton);


        Point location = subComponents[1].getLocationOnScreen();
        mouseMoveAndClick(location.x+(subComponents[1].getWidth()/2),location.y+(subComponents[1].getHeight()/2));
        TextArea sortie = (TextArea)components[1];
        StringTokenizer st = new StringTokenizer(sortie.getText(),"\n");
        assertTrue("  3 lignes sont attendues !!!", st.countTokens()==3);

    }    
    
    public void test_entree_au_bouton_C() throws Exception{
        Container panel = f.getContentPane();
        Component[] components = panel.getComponents();
        assertEquals("ihm invalide ?, ne pas modifier l'interface", components.length, 2);

        // la bonne IHM
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[0] instanceof JPanel);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[1] instanceof TextArea);

        Component[] subComponents = ((JPanel)components[0]).getComponents();
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[0] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[1] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[2] instanceof JButton);


        Point location = subComponents[2].getLocationOnScreen();
        mouseMove(location.x+(subComponents[2].getWidth()/2),location.y+(subComponents[2].getHeight()/2));
        TextArea sortie = (TextArea)components[1];
        StringTokenizer st = new StringTokenizer(sortie.getText(),"\n");
        assertTrue("  une ligne est attendues !!!", st.countTokens()==1);

    }    
    
    public void test_entree_et_clic_bouton_C() throws Exception{
        Container panel = f.getContentPane();
        Component[] components = panel.getComponents();
        assertEquals("ihm invalide ?, ne pas modifier l'interface", components.length, 2);

        // la bonne IHM
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[0] instanceof JPanel);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", components[1] instanceof TextArea);

        Component[] subComponents = ((JPanel)components[0]).getComponents();
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[0] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[1] instanceof JButton);
        assertTrue("ihm invalide ?, ne pas modifier l'interface", subComponents[2] instanceof JButton);


        Point location = subComponents[2].getLocationOnScreen();
        mouseMoveAndClick(location.x+(subComponents[2].getWidth()/2),location.y+(subComponents[2].getHeight()/2));
        TextArea sortie = (TextArea)components[1];
        StringTokenizer st = new StringTokenizer(sortie.getText(),"\n");
        assertTrue("  2 lignes sonts attendues !!!", st.countTokens()==2);

    }    
    
    public void mouseMove(int x, int y){
        robot.mouseMove( x,y);
        robot.delay(60);
    }//end mouseMove
    
    public void mouseMoveAndClick(int x, int y){
        robot.mouseMove( x,y);

        robot.delay(60);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(60);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(60);
    }//end mouseMoveAndClick
}
