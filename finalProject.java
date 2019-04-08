import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class finalProject extends JFrame implements ActionListener{

    private Container container;
    private JButton start;
    private String student;

    private Color paleGold = new Color(246, 189, 96);
    private Color offWhite = new Color(247, 237, 226);
    private Color lightPink = new Color(245, 202, 195);
    private Color turtleGreen = new Color(132, 165, 157);
    private Color watermelon = new Color(242, 132, 130);

    public finalProject()
    {
        super("From 2019's Advanced Programming Class With Love");
        container = getContentPane();
        container.setLayout(new FlowLayout());
        container.setBackground(lightPink);
        start = new JButton("Click here when you wish to begin");
        start.addActionListener(this);
        setSize(1000,700);
        setVisible(true);
        container.add(start);
    }

    public void actionPerformed(ActionEvent e)
    {
        student = JOptionPane.showInputDialog("Enter the name of a student in your advanced programming class:");
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.drawOval(100,100,200,200);
    }
    public static void main(String[] args)
    {
        System.out.println("yeehaw");
        finalProject application = new finalProject();
    }
}
