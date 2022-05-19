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
        move();
    }

    public void move(){

        if(tasteGedrueckt(Taste.D)) {
            p1.verschieben(2, 0);
            p1.drehenAbsolut(90);
        }


        if(tasteGedrueckt(Taste.A)) {
            p1.verschieben(-2, 0);
            p1.drehenAbsolut(270);
        }


        if(tasteGedrueckt(Taste.W)) {
            p1.verschieben(0, -2);
            p1.drehenAbsolut(0);
            if (tasteGedrueckt(Taste.D)) p1.drehenAbsolut(45);
            if (tasteGedrueckt(Taste.A)) p1.drehenAbsolut(315);

        }

        
        if(tasteGedrueckt(Taste.S)) {
            p1.verschieben(0, 2);
            p1.drehenAbsolut(180);
            if (tasteGedrueckt(Taste.D)) p1.drehenAbsolut(135);
            if (tasteGedrueckt(Taste.A)) p1.drehenAbsolut(225);
        }

    }
}