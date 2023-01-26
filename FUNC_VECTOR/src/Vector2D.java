import java.util.Scanner;

public class Vector2D
{
    double X, Y;
    public Vector2D()
    {
    }
    public Vector2D add(Vector2D V)
    {
        Vector2D result = new Vector2D();
        result.X = X+V.X;
        result.Y = Y+V.Y;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector2D a = new Vector2D();
        a.X = sc.nextDouble();
        a.Y = sc.nextDouble();

        Vector2D b = new Vector2D();
        b.X = sc.nextDouble();
        b.Y = sc.nextDouble();

        Vector2D c;
        c = a.add(b);
        System.out.println(c.X+"\n"+c.Y);

    }
}
