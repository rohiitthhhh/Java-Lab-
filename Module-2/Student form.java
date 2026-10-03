import java.awt.*;
import java.awt.event.*;

class StudentForm extends Frame implements ActionListener
{
    TextField name;
    Choice course;
    Checkbox male, female;
    Button submit, clear;

    StudentForm()
    {
        setLayout(new FlowLayout());

        add(new Label("Name"));
        name = new TextField(20);
        add(name);

        add(new Label("Course"));
        course = new Choice();
        course.add("MSc");
        course.add("BSc");
        add(course);

        male = new Checkbox("Male");
        female = new Checkbox("Female");

        add(male);
        add(female);

        submit = new Button("Submit");
        clear = new Button("Clear");

        add(submit);
        add(clear);

        submit.addActionListener(this);
        clear.addActionListener(this);

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == submit)
            System.out.println(name.getText() + " " + course.getSelectedItem());
        else
            name.setText("");
    }

    public static void main(String[] args)
    {
        new StudentForm();
    }
}
