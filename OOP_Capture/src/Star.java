import java.awt.*;

public class Star extends Ball
{
//    public int R, G, B, Size;
//    public Vector vel, pos;
//
//    public Star()
//    {
//        R = (int)(Math.random()*255);
//        G = (int)(Math.random()*255);
//        B = (int)(Math.random()*255);
//        Size = (int)(Math.random()*150);
//
//        pos = new Vector((int)(Math.random()*255),
//                (int)(Math.random()*255));
//
//        vel = new Vector((int)(Math.random()*10-5),
//                (int)(Math.random()*10-5));
//    }
//    public void move()
//    {
//        pos = pos.add(vel);
//        if (pos.x+Size>500)
//        {
//            pos.x = 500 - Size;
//            vel.x *= -1;
//        }
//        if (pos.x<0)
//        {
//            pos.x = 0;
//            vel.x *= -1;
//        }
//        if (pos.y+Size>500)
//        {
//            pos.y = 500 - Size;
//            vel.y *= -1;
//        }
//        if (pos.y<0)
//        {
//            pos.y = 0;
//            vel.y *= -1;
//        }
//    }

    public void draw(Graphics g)
    {
        g.setColor(new Color(R,G,B));
        int n =5;
        int []x = new int[n*2];
        int []y = new int[n*2];
        for (int i = 0; i <n*2 ; i++) {
            x[i] = (int)(pos.x+Size*Math.cos(Math.PI*i/n));
            y[i] = (int)(pos.y+Size*Math.sin(Math.PI*i/n));
            i++;
            x[i] = (int)(pos.x+Size/2*Math.cos(Math.PI*i/n));
            y[i] = (int)(pos.y+Size/2*Math.sin(Math.PI*i/n));

        }
        g.fillPolygon(x, y, n*2);
    }
}
