package src;
import ea.TastenLosgelassenReagierbar;
import ea.edu.AnzeigeE;
import ea.edu.SPIEL;

public class game extends SPIEL {
    AnzeigeE window;
    DREIECK player;
    void Game() {
        window = new AnzeigeE(1280, 720);
        player = new DREIECK();
        player.setzeSichtbar(true);
        tickerStarten(100);
    }

    @Override
    public void tick() {
        super.tick();

    }


    @Override
    public void tasteReagieren(int key) {
        super.tasteReagieren(key);
        if (key==22) player.verschiebenUm(0,-10); // w 22
        if (key==3) player.verschiebenUm(10,0); //a 3
        if (key==18) player.verschiebenUm(0, 10); //s 18
        if (key==0) player.verschiebenUm(-10,0); //d 0

    }


}