package src;

import ea.Dreieck;
import ea.Punkt;

public class player extends Dreieck {
    float speed;
    public player(Punkt a , Punkt b, Punkt c) {
        super(a, b, c);
        farbeSetzen("Rot");
        speed = 2;
    }
    
    public void move(boolean[] d) { //d = direction
        if (d[1]) {
            verschieben(-speed, 0);
            drehenAbsolut(270);
        }
        if (d[3]) {
            verschieben(speed, 0);
            drehenAbsolut(90);
        }
        if (d[0]) {
            verschieben(0, -speed);
            drehenAbsolut(0);
            if (d[3]) drehenAbsolut(45);
            if (d[1]) drehenAbsolut(315);
        }
        if (d[2]) {
            verschieben(0, speed);
            drehenAbsolut(180);
            if (d[3]) drehenAbsolut(135);
            if (d[1]) drehenAbsolut(225);
        }
    }

}
