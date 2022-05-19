package src;
import ea.*;

public class game extends Game implements TastenLosgelassenReagierbar, Ticker {
    int degMain = 0;
    Dreieck player;
    Bild sussyicon;
    Maus diesendungmitder;

    public game() {
        super(1280, 720, "Neu Köln Simulator");
        Punkt top = new Punkt(100f, 100f);
        Punkt bl = new Punkt(75f, 150f);
        Punkt br = new Punkt(125f, 150f);
        sussyicon = new Bild("rsc/disc.png");
        diesendungmitder = new Maus(Maus.TYPE_FADENKREUZ);
        player = new Dreieck(top, bl, br);
        player.farbeSetzen("Rot");
        wurzel.add(player);
        iconSetzen(sussyicon);
        mausAnmelden(diesendungmitder);
        tastenReagierbarAnmelden(this);
        tastenLosgelassenReagierbarAnmelden(this);
        tickerAnmelden(this, 17);
    }

    @Override
    public void tasteReagieren(int code) {}
    @Override
    public void tasteLosgelassen(int code) {}

    public void tick() {
        move();
    }

    public void move(){

        if(tasteGedrueckt(Taste.D)) {
            player.verschieben(4, 0);
            player.drehenAbsolut(90);
        }


        if(tasteGedrueckt(Taste.A)) {
            player.verschieben(-4, 0);
            player.drehenAbsolut(270);
        }


        if(tasteGedrueckt(Taste.W)) {
            player.verschieben(0, -4);
            player.drehenAbsolut(0);
            if (tasteGedrueckt(Taste.D)){
                player.drehenAbsolut(45);
            }if (tasteGedrueckt(Taste.A)) {
                player.drehenAbsolut(315);
            }
        }



        if(tasteGedrueckt(Taste.S)) {
            player.verschieben(0, 4);
            player.drehenAbsolut(180);
            if (tasteGedrueckt(Taste.D)){
                player.drehenAbsolut(135);
            }if (tasteGedrueckt(Taste.A)) {
                player.drehenAbsolut(225);
            }
        }

    }
}