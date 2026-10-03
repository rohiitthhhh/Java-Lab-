import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseApplet extends Applet implements MouseListener
{
    String message = "Move the mouse inside the applet";

    public void init()
    {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e)
    {
        message = "X = " + e.getX() + " Y = " + e.getY();
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(message, 50, 50);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
