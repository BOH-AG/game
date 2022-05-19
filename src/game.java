package src;
import ea.*;

public class game extends Game implements TastenLosgelassenReagierbar, Ticker {
    player p1;
    Bild sussyicon;
    Maus diesendungmitder;

    public game() {
        super(1280, 720, "Neu Köln Simulator");
        sussyicon = new Bild("rsc/disc.png");
        diesendungmitder = new Maus(Maus.TYPE_FADENKREUZ);
        Punkt top;
        Punkt bl;
        Punkt br;
        p1 = new player(
                top = new Punkt(100f, 100f),
                bl = new Punkt(75f, 150f),
                br = new Punkt(125f, 150f)
        );
        wurzel.add(p1);
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
        pmove(p1);
    }



    public void pmove(player p) {
        boolean[] direction = new boolean[4];

        if (tasteGedrueckt(Taste.W)) {
            direction[0] = true;
        } else {direction[0] = false;}

        if (tasteGedrueckt(Taste.A)) {
            direction[1] = true;
        } else {direction[1] = false;}

        if (tasteGedrueckt(Taste.S)) {
            direction[2] = true;
        } else {direction[2] = false;}

        if (tasteGedrueckt(Taste.D)) {
            direction[3] = true;
        } else {direction[3] = false;}

        p.move(direction);
    }

}