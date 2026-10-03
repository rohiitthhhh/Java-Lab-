import java.applet.Applet;
import java.awt.Graphics;

public class AnimationApplet extends Applet implements Runnable
{
    int x = 0;
    Thread t;

    public void start()
    {
        t = new Thread(this);
        t.start();
    }

    public void run()
    {
        while(true)
        {
            x = x + 5;

            if(x > 300)
                x = 0;

            repaint();

            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                break;
            }
        }
    }

    public void paint(Graphics g)
    {
        g.fillOval(x, 50, 30, 30);
    }

    public void stop()
    {
        t = null;
    }
}
