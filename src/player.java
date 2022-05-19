package src;

import ea.Dreieck;
import ea.Punkt;

public class player extends Dreieck {
    public player(Punkt a , Punkt b, Punkt c) {
        super(a, b, c);
        farbeSetzen("Rot");
    }

}
