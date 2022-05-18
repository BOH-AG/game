package src;
import ea.*;
import ea.edu.AnzeigeE;
import ea.edu.SPIEL;
import ea.internal.gui.Fenster;

class game extends SPIEL {
    static AnzeigeE window;
    static DREIECK player;
    public static void main(String[] args) {
        window = new AnzeigeE(1280, 720);
        player = new DREIECK();
        player.setzeSichtbar(true);
        game test = new game();
    }


    public void tick() {
        player.verschiebenUm(200,0);
    }
}