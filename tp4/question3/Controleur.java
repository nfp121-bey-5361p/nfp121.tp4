package question3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import question3.tp3.PileI;
import question3.tp3.PilePleineException;

/**
 * Décrivez votre classe Controleur ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Controleur extends JPanel {

    private JButton push, add, sub, mul, div, clear;
    private PileModele<Integer> pile;
    private JTextField donnee;

    public Controleur(PileModele<Integer> pile) {
        super();
        this.pile = pile;
        this.donnee = new JTextField(8);

        this.push = new JButton("push");
        this.add = new JButton("+");
        this.sub = new JButton("-");
        this.mul = new JButton("*");
        this.div = new JButton("/");
        this.clear = new JButton("[]");

        setLayout(new GridLayout(2, 1));
        add(donnee);
        ActionListener pushListener = new PushOperationListener(pile);
        donnee.addActionListener(pushListener);
        JPanel boutons = new JPanel();
        boutons.setLayout(new FlowLayout());
        boutons.add(push);  push.addActionListener(pushListener);
        boutons.add(add);   add.addActionListener(new AddOperationListener(pile));
        boutons.add(sub);   sub.addActionListener(new SubstractOperationListener(pile));
        boutons.add(mul);   mul.addActionListener(new MultiplyOperationListener(pile));
        boutons.add(div);   div.addActionListener(new DivideOperationListener(pile));
        boutons.add(clear); clear.addActionListener(new ClearOperationListener(pile));
        add(boutons);
        boutons.setBackground(Color.red);
        actualiserInterface();
    }

    public void actualiserInterface() {
        if (pile.estVide()) {
            add.setEnabled(false);
            sub.setEnabled(false);
            mul.setEnabled(false);
            div.setEnabled(false);
            clear.setEnabled(false);
            push.setEnabled(true);
            donnee.requestFocus();
        } else if (pile.taille() == 1) {
            add.setEnabled(false);
            sub.setEnabled(false);
            mul.setEnabled(false);
            div.setEnabled(false);
            clear.setEnabled(true);
            push.setEnabled(true);
        } else if (pile.estPleine()) {
            push.setEnabled(false);
        } else {
            add.setEnabled(true);
            sub.setEnabled(true);
            mul.setEnabled(true);
            div.setEnabled(true);
            clear.setEnabled(true);
            push.setEnabled(true);
        }
    }

    private Integer operande() throws NumberFormatException {
        return Integer.parseInt(donnee.getText());
    }

    public class PushOperationListener implements ActionListener {

        PileI<Integer> pile;

        public PushOperationListener(PileI<Integer> pile) {
            this.pile = pile;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                pile.empiler(operande());
                actualiserInterface();
            } catch (NumberFormatException e) {
                // e.printStackTrace();
            } catch (PilePleineException e) {
                // e.printStackTrace();
            }
        }
    }

    public class AddOperationListener implements ActionListener {

        PileI<Integer> pile;

        public AddOperationListener(PileI<Integer> pile) {
            this.pile = pile;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                pile.empiler(pile.depiler() + pile.depiler());
                actualiserInterface();
            } catch (Exception e) { 
                e.printStackTrace();
            }
        }
    }

    private class SubstractOperationListener implements ActionListener {

        PileI<Integer> pile;

        public SubstractOperationListener(PileI<Integer> pile) {
            this.pile = pile;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                Integer i1 = pile.depiler();
                Integer i2 = pile.depiler(); 
                pile.empiler(i2 - i1);
                actualiserInterface();
            } catch (Exception e) { 
                e.printStackTrace();
            }
        }
    }

    private class MultiplyOperationListener implements ActionListener {

        PileI<Integer> pile;

        public MultiplyOperationListener(PileI<Integer> pile) {
            this.pile = pile;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                pile.empiler(pile.depiler() * pile.depiler());
                actualiserInterface();
            } catch (Exception e) { 
                e.printStackTrace();
            }
        }
    }

    private class DivideOperationListener implements ActionListener {

        PileI<Integer> pile;

        public DivideOperationListener(PileI<Integer> pile) {
            this.pile = pile;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                if (pile.sommet() != 0) {
                    Integer i1 = pile.depiler();
                    Integer i2 = pile.depiler(); 
                    pile.empiler(i2 / i1);
                    actualiserInterface();
                }
            } catch (Exception e) { 
                //e.printStackTrace();
            }
        }
    }

    private class ClearOperationListener implements ActionListener {

        PileI<Integer> pile;

        public ClearOperationListener(PileI<Integer> pile) {
            this.pile = pile;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {   
                while (!pile.estVide()) {
                    pile.depiler();
                }
                actualiserInterface();
            } catch (Exception e) { 
               // e.printStackTrace();
            }
        }
    }

}
