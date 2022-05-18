package src;
import ea.edu.AnzeigeE;
import ea.edu.SPIEL;

class game extends SPIEL {
    AnzeigeE window;
    DREIECK player;
    void Game() {
        window = new AnzeigeE(1280, 720);
        player = new DREIECK();
        player.setzeSichtbar(true);
        tickerStarten(17);
    }


    void tick() {
        player.verschiebenUm(200,0);
    }
}