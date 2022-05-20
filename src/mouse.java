package src;

import ea.Bild;
import ea.Maus;
import ea.Punkt;

public class mouse extends Maus {

    public boolean actual;
    Punkt clicked;

    public mouse(Bild b, Punkt p) {
        super(b, p);
    }

    @Override
    public void klick(Punkt p, boolean links, boolean losgelassen) {
        super.klick(p, links, losgelassen);
        if (links) {
            if (!losgelassen) {
                //System.out.println("on");
                clicked = p;
                actual = true;
            } else actual = false;
        }
    }


}
