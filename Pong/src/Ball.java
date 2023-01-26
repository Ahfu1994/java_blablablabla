import java.awt.*;

public class Ball
{
    public int R, G, B, Size;
    public Vector pos, vel;
    public Ball()
    {
        R = (int)(Math.random()*255);
        G = (int)(Math.random()*255);
        B = (int)(Math.random()*255);
        Size = 20;

        pos = new Vector();
        pos.x = (int)(Math.random()*200+20);
        pos.y = (int)(Math.random()*200+20);

        vel = new Vector();
        vel.x = (int)(Math.random()*200);
    }
    public void draw(Graphics g)
    {
        g.setColor(new Color(R,G,B));
        g.fillOval(20, 20, 20 ,20);
    }
    public void move()
    {
//        pos = pos.add(vel);
//        if (pos.getX()+Size)
//        {
//
//        }
    }
}
