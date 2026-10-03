import java.awt.*;
import java.awt.event.*;

class ColorApp extends Frame implements ActionListener
{
    Button red, blue, green;

    ColorApp()
    {
        red = new Button("Red");
        blue = new Button("Blue");
        green = new Button("Green");

        add(red, BorderLayout.NORTH);
        add(blue, BorderLayout.CENTER);
        add(green, BorderLayout.SOUTH);

        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == red)
            setBackground(Color.RED);
        else if(e.getSource() == blue)
            setBackground(Color.BLUE);
        else
            setBackground(Color.GREEN);
    }

    public static void main(String[] args)
    {
        new ColorApp();
    }
}
