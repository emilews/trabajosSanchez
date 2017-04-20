/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocañones;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilio Wong
 */
public class metodos {

    public static double distanciaX(double velocidadInicial, double angulo) {
        double gravedad = 9.81;
        double distanciaX = 0;
        double anguloDoble = angulo * 2;
        double seno = Math.sin(Math.toRadians(anguloDoble));
        double velCuadra = Math.pow(velocidadInicial, 2);
        distanciaX = ((velCuadra * seno) / gravedad);
        return distanciaX;

    }

    public static boolean validacionAngulo(String angulo) {
        boolean flag = false;

        try {
            Double ang = Double.parseDouble(angulo);
            flag = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Introduce un número por favor.");
        }

        return flag;
    }
}
