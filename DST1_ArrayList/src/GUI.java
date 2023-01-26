import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel
{
    MyArrayListT<Particle> list = new MyArrayListT<Particle>();
    public GUI()
    {
        Thread t = new Thread(new Runnable()
        {
            public void run()
            {
                while(true)
                {
                    try
                    {
                        Thread.sleep(50);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    
                    int n = (int)(Math.random()*50);
                    for (int i = 0; i <n ; i++)
                    {
                        list.add(new Particle());
                    }

                    for (int i = 0; i <list.size() ; i++)
                    {
                        list.get(i).move();
                    }
                    for (int i = 0; i < list.size(); i++)
                    {
                        if (list.get(i).isAlive())
                        {
                            list.removeAt(i);
                            i--;
                        }
                    }

                    repaint();
                }
            }
        });
        t.start();

        JFrame f = new JFrame();
        f.add(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        for (int i = 0; i < list.size(); i++)
        {
            list.get(i).draw(g);
        }
    }

    public static void main(String[] args)
    {
        new GUI();
    }
}
