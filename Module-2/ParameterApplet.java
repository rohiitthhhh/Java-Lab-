import java.applet.Applet;
import java.awt.Graphics;

public class ParameterApplet extends Applet
{
    String message;

    public void init()
    {
        message = getParameter("message");
    }

    public void paint(Graphics g)
    {
        g.drawString(message, 50, 50);
    }
}
