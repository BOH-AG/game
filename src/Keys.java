package src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys implements KeyListener {

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("KeyPressed: "+e.getKeyCode()+", ts="+e.getWhen());
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("KeyReleased: "+e.getKeyCode()+", ts="+e.getWhen());
    }

}