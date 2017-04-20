/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocañones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JuegoCañones extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        JuegoCañones frame = new JuegoCañones();
        frame.setVisible(true);
        String angulo = JOptionPane.showInputDialog("Introduce un ángulo (puede ser con decimal): ");
        while (true) {
            if (metodos.validacionAngulo(angulo)) {
                break;
            }
            else{
            JuegoCañones.main(null);
            
            }
            
        }
        String velocidad = JOptionPane.showInputDialog("Introduce una velocidad (puede ser con decimal): ");
        while (true) {
            if (metodos.validacionAngulo(velocidad)) {
                break;
            }
            else{
                JuegoCañones.main(null);
            }
            
        }
    }

    public JuegoCañones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 15, 15, 15));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 1280, 720);
        setResizable(false);
    }

    @Override
    public void paint(Graphics g) {
        int posX, posY;
        posX = 10;
        posY = 710;
        int distanciaX = (int) (metodos.distanciaX(30, 30));
        String linea = Double.toString(metodos.distanciaX(30, 30));
        ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/cannon.png"));
        Image img = icono.getImage();
        super.paint(g);

        for (int i = posX; i < distanciaX; i++) {
            g.setColor(Color.black);
            g.drawString(linea, posX, 650);
            g.drawOval(i, 700, 15, 15);
            repaint();

        }

    }
}
