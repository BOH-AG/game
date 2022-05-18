package src;
import ea.*;

public class game extends Game implements TastenLosgelassenReagierbar, Ticker {

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
        if(tasteGedrueckt(Taste.W)) {
            player.verschieben(0, -4);
        }
        if(tasteGedrueckt(Taste.D)) {
            player.verschieben(4, 0);
        }
        if(tasteGedrueckt(Taste.S)) {
            player.verschieben(0, 4);
        }
        if(tasteGedrueckt(Taste.A)) {
            player.verschieben(-4, 0);
        }
    }
}