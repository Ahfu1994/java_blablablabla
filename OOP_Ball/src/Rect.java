import java.awt.*;

public class Rect extends Ball
{
    public void draw(Graphics g)
    {
        g.setColor(new Color(R, G, B));
        g.drawRect((int) pos.x, (int) pos.y, 2*Size, 2*Size);
    }
}
