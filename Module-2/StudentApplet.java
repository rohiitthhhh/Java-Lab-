import java.applet.Applet;
import java.awt.Graphics;

public class StudentApplet extends Applet
{
    String name, reg, course, semester;

    public void init()
    {
        name = getParameter("name");
        reg = getParameter("reg");
        course = getParameter("course");
        semester = getParameter("semester");
    }

    public void paint(Graphics g)
    {
        g.drawString("Name: " + name, 50, 50);
        g.drawString("Register No: " + reg, 50, 70);
        g.drawString("Course: " + course, 50, 90);
        g.drawString("Semester: " + semester, 50, 110);
    }
}
