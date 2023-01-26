import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class Rect extends Ball
{

    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(new Color(R,G,G));
        g.clearRect((int)(pos.x), (int)(pos.y), Size, Size);
    }
}
