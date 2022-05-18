package src;
import ea.TastenLosgelassenReagierbar;
import ea.edu.AnzeigeE;
import ea.edu.FensterE;
import ea.edu.SPIEL;
import ea.Game;
import ea.internal.gui.Fenster;


public class game extends SPIEL {
    FensterE window;
    Keys k = new Keys();
    //DREIECK player;
    void Game() {
        window = new FensterE();
        //player = new DREIECK();
        //player.setzeSichtbar(true);
        //tickerStarten(100);
        window.tastenReagierbarAnmelden(k);
    }

   /*Override
    public void tick() {
        super.tick();

    }*/


    /*@Override
    public void tasteReagieren(int key) {
        super.tasteReagieren(key);
        if (key==22) player.verschiebenUm(0,-10); // w 22
        if (key==3) player.verschiebenUm(10,0); //a 3
        if (key==18) player.verschiebenUm(0, 10); //s 18
        if (key==0) player.verschiebenUm(-10,0); //d 0

    }*/
    





}