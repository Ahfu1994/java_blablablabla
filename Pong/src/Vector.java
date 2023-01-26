public class Vector
{
    double x, y;
    public Vector add(Vector v)
    {
        Vector result = new Vector();
        result.x = this.x+v.x;
        result.y = this.y+v.y;
        return result;
    }

    public static void main(String[] args) {
        int[][] x = new int[][]{new int[]{1,2,3},
                new int[]{4,5,6,7}
        };
        System.out.println(x[0].length);
    }
}
