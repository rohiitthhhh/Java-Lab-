import java.awt.*;
import java.awt.event.*;

class StudentPerformance extends Frame implements ActionListener
{
    TextField name, mark1, mark2, mark3, result;
    Button calculate;

    StudentPerformance()
    {
        setLayout(new FlowLayout());

        name = new TextField(15);
        mark1 = new TextField(5);
        mark2 = new TextField(5);
        mark3 = new TextField(5);
        result = new TextField(20);

        calculate = new Button("Calculate");

        add(new Label("Name"));
        add(name);
        add(new Label("Mark 1"));
        add(mark1);
        add(new Label("Mark 2"));
        add(mark2);
        add(new Label("Mark 3"));
        add(mark3);
        add(calculate);
        add(result);

        calculate.addActionListener(this);

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(mark1.getText());
        int b = Integer.parseInt(mark2.getText());
        int c = Integer.parseInt(mark3.getText());

        int total = a + b + c;
        double avg = total / 3.0;

        result.setText("Total = " + total + " Average = " + avg);
    }

    public static void main(String[] args)
    {
        new StudentPerformance();
    }
}
