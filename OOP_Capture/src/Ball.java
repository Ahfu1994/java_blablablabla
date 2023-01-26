import java.awt.Color;
import java.awt.Graphics;

public class Ball
{
    public int R, G, B, Size;
    public Vector vel, pos, acc;

    public Ball()
    {
        R = (int)(Math.random()*255);
        G = (int)(Math.random()*255);
        B = (int)(Math.random()*255);
        Size = (int)(Math.random()*150);

        acc = new Vector();
        acc.x = 0;
        acc.y = 0.1;

        pos = new Vector((int)(Math.random()*255),
                (int)(Math.random()*255));

        vel = new Vector((int)(Math.random()*10-5),
                (int)(Math.random()*10-5));
    }
    public void move()
    {
        pos = pos.add(vel);
        if (pos.x+Size>500)
        {
            pos.x = 500 - Size;
            vel.x *= -1;
            B +=100;
            if (B>255) B = 255;
        }
        if (pos.x<0)
        {
            pos.x = 0;
            vel.x *= -1;
            B +=100;
            if (B>255) B = 255;
        }
        if (pos.y+Size>500)
        {
            pos.y = 500 - Size;
            vel.y *= -1;
            B -=100;
            if (B<=0) B = 0;
        }
        if (pos.y<0)
        {
            pos.y = 0;
            vel.y *= -1;
            B -=100;
            if (B<=255) B = 0;
        }
    }

    public void draw(Graphics g)
    {
        g.setColor(new Color(R,G,B));
        g.fillOval((int)pos.x, (int)pos.y, Size ,Size);
    }
}

//import java.awt.Graphics;
//import java.awt.Color;
//public class Ball
//{
//    public Vector pos, vel;
//    public int R, G, B, Size;
//
//    public Ball()
//    {
//        R = (int)(Math.random()*255);
//        G = (int)(Math.random()*255);
//        B = (int)(Math.random()*255);
//        Size = (int)(Math.random()*255);
//
//        pos = new Vector();
//        pos.x = (int)(Math.random()*500);
//        pos.y = (int)(Math.random()*500);
//
//        vel = new Vector();
//        vel.x = (int)(Math.random()*10-5);
//        vel.y = (int)(Math.random()*10-5);
//    }
//    public void move()
//    {
//        pos = pos.add(vel);
//        if(pos.x<0)
//        {
//            pos.x = 0;
//            vel.x *= -1;
//        }
//        if(pos.x>500)
//        {
//            pos.x = 500;
//            vel.x *=-1;
//        }
//        if(pos.y<0)
//        {
//            pos.y = 0;
//            vel.y *=-1;
//        }
//        if(pos.y>500)
//        {
//            pos.y =500;
//            vel.y *=-1;
//        }
//    }
//
//    public void draw(Graphics g)
//    {
//        g.setColor(new Color(R, G, B));
//        g.fillOval((int)(pos.x), (int)(pos.y), Size, Size);
//    }
//}