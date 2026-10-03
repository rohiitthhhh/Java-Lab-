import java.awt.*;
import java.awt.event.*;

class Events extends Frame
{
    String message = "";

    Events()
    {
        addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseMoved(MouseEvent e)
            {
                message = "X = " + e.getX() + " Y = " + e.getY();
                repaint();
            }
        });

        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                message = "Mouse Clicked";
                repaint();
            }
        });

        addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                message = "Key: " + e.getKeyChar();
                repaint();
            }
        });

        setSize(400, 300);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.drawString(message, 100, 100);
    }

    public static void main(String[] args)
    {
        new Events();
    }
}
