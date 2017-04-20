/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game21;

public class Baraja {

    int num = 1;
    int numCartas = 11;
    Carta[] cartas;
    String barajaComp = "";

    public Baraja() {
        for (int i = 0; i >= numCartas; i++) {
            cartas[i] = new Carta(num);
            num++;
        }
    }
}
