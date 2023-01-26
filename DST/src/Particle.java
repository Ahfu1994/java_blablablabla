import java.awt.*;

public class Particle
{
    private double x, y;
    private double vx, vy;
    private double ax, ay;
    private boolean isAlive;
    private int age;
    private Color color;

    public Particle()
    {
        x = 250;
        y = 250;
        vx = (int)(Math.random()*20-10);
        vy = (int)(Math.random()*20-10);
        ax = 0;
        ay = 0.5;
        color = new Color(
                (int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        age = 1;
    }
    public void move()
    {
        age++;
        if(age>200) isAlive = false;

        x = x+vx;
        y = y+vy;

        vx = vx+ax;
        vy = vy+ay;
    }
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval((int)x, (int)y, 10, 10);
    }

    public boolean isAlive()
    {
        return isAlive;
    }
}
