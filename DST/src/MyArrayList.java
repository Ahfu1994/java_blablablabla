import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList
{
    private int[] data;
    private int size;
    public MyArrayList()
    {
        size = 0;
        data = new int[10];
    }
    //method add การเพิ่มข้อมูลลงใน ArrayList
    public void add(int x)
    {
        if(size >= data.length)
        {
            int[]data2 = new int [data.length*2];
            for(int i = 0; i < data.length; i++)
            {
                data2[i] = data[i];
            }
            data = data2;
        }
        data[size] = x;
        size++;
    }
    //   method get การส่งข้อมูล ArrayList ออกมาแสดงผล
    public int get(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new InvalidParameterException("index out of range : "+index);
        }
        return data[index];
    }
    //   method set กำหนดค่าลงไปใน ArrayList ใน index ที่กำหนด
    public void set(int x, int index)
    {
        if(index < 0 || index >= size)
        {
            throw new InvalidParameterException("index out of range : "+index);
        }
        data[index] = x;
    }
    public int[] toArray()
    {
        int[]x = new int[size];
        for(int i = 0; i<size; i++)
        {
            x[i] = data[i];
        }
        return x;
    }
    public String toString()
    {
        int[]x = toArray();
        return Arrays.toString(x);
    }
}
