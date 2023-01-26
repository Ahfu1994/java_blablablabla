public class Vector
{
    double x, y;
    //constructor ชื่อเหมือน class จะถูกเรียกใช้ครั้งแรก
    // ครั้งเดียวตอน new Object จาก class ไม่มี return type
    public Vector()
    {
        x = 0;
        y = 0;
    }
    public Vector(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Vector add(Vector v)
    {
        Vector result = new Vector();
        // new สร้าง vector ใหม่ สำหรับเก็บ ผลบวกของ vector
        result.x = x + v.x;
        result.y = y + v.y;
        return result;
    }
    public Vector sub(Vector v)
    {
        Vector result = new Vector();
        // new สร้าง vector ใหม่ สำหรับเก็บ ผลลบของ vector
        result.x = x - v.x;
        result.y = y - v.y;
        return result;
    }
    public Vector mul(double m)
    {
        Vector result = new Vector();
        // new สร้าง vector ใหม่ สำหรับเก็บ ผลคูณของ vector
        result.x = x*m;
        result.y = y*m;
        return result;
    }
    public double dot(Vector v)
    {
        double result = this.x*v.x + this.y*v.y;
        // vector dot vector ผลลัพท์เป็น scalar(double)
        return result;
    }
    public double Size()
    {
        double result = Math.sqrt(x*x+y*y); //
        return result;
    }
    public Vector unit()
    {
        double s = Size();
        return new Vector(x/s, y/s);
    }

    public static void main(String[] args) {
        Vector a, b;
        a = new Vector();
        a.x = 4;
        a.y = 5;

        b = new Vector();
        b.x = 5;
        b.y = 7;

        Vector c;
        c = a.add(b);

        Vector d;
        d = a.sub(b);

        Vector e;
        e = a.mul(10);

        System.out.println(c.x+" "+c.y);
        System.out.println(d.x+" "+d.y);
        System.out.println(e.x+" "+e.y);
    }
}
