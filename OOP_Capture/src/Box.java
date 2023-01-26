public class Box
{
    public Box()
    {
    }

    public Box(double w, double h, double d)
    {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    private double w, h, d;

    public double getW()
    {
        return w;
    }

    public void setW(double w)
    {
        this.w = w;
    }

    public double getH()
    {
        return h;
    }

    public void setH(double h)
    {
        this.h = h;
    }

    public double getD()
    {
        return d;
    }

    public void setD(double d)
    {
        this.d = d;
    }
}
