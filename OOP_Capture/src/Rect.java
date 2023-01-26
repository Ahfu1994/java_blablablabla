import java.awt.*;

public class Rect extends Ball
{
    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(new Color(R,G,B,200));
        g.fillRect((int)(pos.x), (int)(pos.y), Size, Size);
    }
}
