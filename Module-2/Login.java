import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener
{
    JTextField username;
    JPasswordField password;
    JButton login, reset, exit;

    Login()
    {
        setLayout(new FlowLayout());

        username = new JTextField(15);
        password = new JPasswordField(15);

        login = new JButton("Login");
        reset = new JButton("Reset");
        exit = new JButton("Exit");

        add(new JLabel("Username"));
        add(username);
        add(new JLabel("Password"));
        add(password);
        add(login);
        add(reset);
        add(exit);

        login.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);

        setSize(300, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == login)
        {
            String user = username.getText();
            String pass = new String(password.getPassword());

            if(user.equals("admin") && pass.equals("1234"))
                JOptionPane.showMessageDialog(this, "Login successful");
            else
                JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
        else if(e.getSource() == reset)
        {
            username.setText("");
            password.setText("");
        }
        else
        {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        new Login();
    }
}
