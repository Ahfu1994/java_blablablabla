import javax.swing.*;
import java.awt.*;

public class GUI_LinkedList extends JPanel
{
    LinkedList ll;
    public GUI_LinkedList()
    {
        ll = new LinkedList();
        ll.addFirst(5);
        for (int i = 0; i < 5; i++)
        {
            ll.addLast((int)(Math.random()*100));
        }
        ll.addLast(99);
        for (int i = 0; i < 5; i++)
        {
            ll.addLast((int)(Math.random()*100));
        }
        ll.removeAt(0);

        JFrame f = new JFrame();
        f.add(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        ll.draw(g);
    }

    public static void main(String[] args)
    {
        new GUI_LinkedList();
    }
}
