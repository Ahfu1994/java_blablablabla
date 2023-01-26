public class Vector
{
    double x, y;
    public Vector add(Vector v)
    {
        Vector result = new Vector();
        result.x = x+v.x;
        result.y = y+v.y;
        return result;
    }
    public Vector sub(Vector v)
    {
        Vector result = new Vector();
        result.x = x-v.x;
        result.y = y-v.y;
        return result;
    }
//    public Vector dot(Vector v)
//    {
//        Vector result = new Vector();
//        result.= x*v.x+y*v.y;
//        return result;
//    }
}
