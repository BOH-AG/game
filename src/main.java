package src;
import ea.*;
import ea.internal.gui.Fenster;

class main {
    static DREIECK player;
    static Fenster window;
    public static void main(String[] args) {
        window = new Fenster(1280, 720, "Bohline Detroit", false, 20, 20);
        player = new DREIECK();
        player.setzeSichtbar(true);
    }
}