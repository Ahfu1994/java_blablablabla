import java.awt.*;

public class Star extends Ball
{
    public void draw(Graphics g)
    {
        int n = 5;
        int[] x = new int[n*2];
        int[] y = new int[n*2];
        for (int i = 0; i <n*2 ; i++)
        {
            x[i] = (int)(pos.x + Size*Math.cos(Math.PI*i/n));
            y[i] = (int)(pos.x + Size*Math.sin(Math.PI*i/n));
            i++;
            x[i] = (int)(pos.x + Size/2*Math.cos(Math.PI*i/n));
            y[i] = (int)(pos.x + Size/2*Math.sin(Math.PI*i/n));
        }
        g.setColor(new Color(R, G, B));
        g.fillPolygon(x, y, n*2);
    }
}
