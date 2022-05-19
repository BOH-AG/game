package src;
import ea.*;
import ea.Maus;

public class game extends Game implements TastenLosgelassenReagierbar, Ticker {
    player p1;
    Bild icon;
    mouse diesendungmitder;
    Strich tracer;

    public game() {
        super(1280, 720, "Neu Köln Simulator");
        icon = new Bild("rsc/disc.png");
        Bild mice1;
        Punkt mice;
        diesendungmitder = new mouse(
                mice1 = new Bild("rsc/crosshair2.png"),
                mice = new Punkt(16, 16)
        );
        Punkt top;
        Punkt bl;
        Punkt br;
        p1 = new player(
                top = new Punkt(100f, 100f),
                bl = new Punkt(75f, 150f),
                br = new Punkt(125f, 150f)
        );
        wurzel.add(p1);
        iconSetzen(icon);
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
        if (diesendungmitder.actual) {
            Punkt pnt = p1.mittelPunkt();
            shoot(p1.mittelPunkt(), diesendungmitder.clicked);
        }
    }

    public void pmove(player p) {
        boolean[] direction = new boolean[4];

        if (tasteGedrueckt(Taste.W)) direction[0] = true;
        else direction[0] = false;

        if (tasteGedrueckt(Taste.A)) direction[1] = true;
        else direction[1] = false;

        if (tasteGedrueckt(Taste.S)) direction[2] = true;
        else direction[2] = false;

        if (tasteGedrueckt(Taste.D)) direction[3] = true;
        else direction[3] = false;

        p.move(direction);
    }

    public Punkt test() {
        return p1.mittelPunkt();
    }

    void shoot(Punkt pp, Punkt ppp) {
        tracer = new Strich(pp, ppp);
        tracer.farbeSetzen("Gelb");
        warten(17);
        tracer.loeschen();
    }

}