import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Stove
{
    private int isPlug;
    private int hasPan;
    private int Time;
    private String mode;

    public Stove()
    {
        System.out.println("Create Electric Stove!");
    }
    public Stove(int isPlug)
    {
        this.isPlug = isPlug;
        if(isPlug == 0)
        {
            System.out.println("Create Electric Stove!");
        }
        else if (isPlug == 1)
        {
            System.out.println("Create Electric Stove and put the plug in");
        }
    }
    public void putPan(int pp)
    {
        this.hasPan = pp;
        if (hasPan == 0)
        {
            System.out.println("Remove the pan from a Stove");
        }
        else if (hasPan == 1)
        {
            System.out.println("Put the pan on a Stove");
        }
    }
    public void setTime(int min, int sec)
    {
        this.Time = min*60+sec;
        if ( isPlug != 1)
        {
            System.out.println("Please plug in!");
        }
        else if (isPlug == 1)
        {
            System.out.println("Set time "+Time+" seconds");
        }
    }
    public void selectMode(String mode)
    {
        if (isPlug != 1)
        {
            System.out.println("Please plug in!");
        }
        else
        {
            this.mode = mode;
            if (mode.equals("low"))
            {
                System.out.println("Select low mode 500 watt");
            } else if (mode.equals("warm"))
            {
                System.out.println("Select warm mode 800 watt");
            } else if (mode.equals("steam"))
            {
                System.out.println("Select steam mode 1000 watt");
            } else if (mode.equals("boil"))
            {
                System.out.println("Select boil mode 1200 watt");
            } else if (mode.equals("fry"))
            {
                System.out.println("Select fry mode 1600 watt");
            } else
            {
                System.out.println("Wrong mode!");
            }
        }
    }
    public void cook()
    {

        if (isPlug != 1)
        {
            System.out.println("Please plug in!");
            return;
        }
        if (hasPan != 1)
        {
            System.out.println("Please put the pan to a stove!");
            return;
        }
        if (Time == 0)
        {
            System.out.println("Please set time!");
            return;
        }
        if (!mode.equals("low")&&!mode.equals("warm")&&!mode.equals("steam")&&!mode.equals("boil")&&!mode.equals("fry"))
        {
            System.out.println("Please select mode!");
            return;
        }
        if (isPlug == 1 && hasPan == 1 && Time != 0 && mode.equals("low")||mode.equals("warm")||mode.equals("steam")||mode.equals("boil")||mode.equals("fry"))
        {
            int min = Time/60;
            int sec = Time%60;
            DecimalFormat df = new DecimalFormat("00");
            DecimalFormat df2 = new DecimalFormat("0000");
            for (int i = min; i >=0 ; i--)
            {
                for (int j = sec; j >=0 ; j--)
                {
                    System.out.format(df2.format(i)+":"+df.format(j));
                    System.out.println();
                }
                sec = 59;
            }
        }
    }
    public void unplug()
    {
        if (isPlug == 1)
        {
            System.out.println("Unplug a stove!");
            return;
        }
        else if (isPlug == 0)
        {
            System.out.println("Please plug in!");
            return;
        }
    }

    public static void main(String[] args)
    {
        Stove a = new Stove(1);
        a.putPan(1);
        a.setTime(0, 10);
        a.selectMode("boil");
        a.cook();
        a.unplug();
    }
}
