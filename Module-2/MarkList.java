import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MarkList extends JFrame implements ActionListener
{
    JTextField name, reg, m1, m2, m3;
    JTextArea result;
    JButton calculate, clear, exit;

    MarkList()
    {
        setLayout(new FlowLayout());

        name = new JTextField(15);
        reg = new JTextField(15);
        m1 = new JTextField(5);
        m2 = new JTextField(5);
        m3 = new JTextField(5);

        calculate = new JButton("Calculate");
        clear = new JButton("Clear");
        exit = new JButton("Exit");

        result = new JTextArea(5, 25);

        add(new JLabel("Name"));
        add(name);
        add(new JLabel("Register"));
        add(reg);
        add(m1);
        add(m2);
        add(m3);
        add(calculate);
        add(clear);
        add(exit);
        add(result);

        calculate.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);

        setSize(400, 350);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == exit)
        {
            System.exit(0);
        }
        else if(e.getSource() == clear)
        {
            name.setText("");
            reg.setText("");
            m1.setText("");
            m2.setText("");
            m3.setText("");
            result.setText("");
        }
        else
        {
            int a = Integer.parseInt(m1.getText());
            int b = Integer.parseInt(m2.getText());
            int c = Integer.parseInt(m3.getText());

            if(a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100)
            {
                result.setText("Invalid marks");
                return;
            }

            int total = a + b + c;
            double avg = total / 3.0;
            String grade;

            if(avg >= 90)
                grade = "A";
            else if(avg >= 75)
                grade = "B";
            else if(avg >= 50)
                grade = "C";
            else
                grade = "F";

            result.setText("Total = " + total + "\nAverage = " + avg + "\nGrade = " + grade);
        }
    }

    public static void main(String[] args)
    {
        new MarkList();
    }
}
