import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycleApplet extends Applet
{
    public void init()
    {
        System.out.println("init");
    }

    public void start()
    {
        System.out.println("start");
    }

    public void paint(Graphics g)
    {
        g.drawString("paint", 50, 50);
    }

    public void stop()
    {
        System.out.println("stop");
    }

    public void destroy()
    {
        System.out.println("destroy");
    }
}
