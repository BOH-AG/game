package src;
import ea.*;
import ea.edu.AnzeigeE;
import ea.internal.gui.Fenster;

class game {
    static AnzeigeE window;
    static DREIECK player;
    public static void main(String[] args) {
        window = new AnzeigeE(1280, 720);
        player = new DREIECK();
        player.setzeSichtbar(true);
        tick();

    }

    static void tick(){
        player.verschiebenUm(10,0);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tick();
    }
}