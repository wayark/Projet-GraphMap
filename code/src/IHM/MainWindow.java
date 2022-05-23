package IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class MainWindow extends JFrame {
    public MainWindow() throws HeadlessException {
        setup();
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(150, 150, 100, 100);

    }

    public void setup(){
        setTitle("Graph Map Analysis");
        setSize(1000,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(constrPan());
        setVisible(true);
    }

    public JPanel constrPan(){

        JPanel main = new JPanel();
        JButton affichage0Distance = new JButton("Affichage d'un élément");
        main.add(affichage0Distance);
        affichage0Distance.addActionListener();
        JButton affichageVoisinDirect = new JButton("Affichage des voisins");
        main.add(affichageVoisinDirect);
        JButton affichageVoisin2Distance = new JButton("Affichage des voisins : Distance 2");
        main.add(affichageVoisin2Distance);
        JButton Comparer2Villes = new JButton("Comparer des villes");
        main.add(Comparer2Villes);
        JButton Distance = new JButton("distance entre deux sites");
        main.add(Distance);

        return main;

    }
}
