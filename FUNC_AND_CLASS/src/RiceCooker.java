import org.w3c.dom.ls.LSOutput;

import java.sql.Time;
import java.util.Objects;
import java.util.Scanner;

public class RiceCooker
{

    private int rice;
    private int water;
    private String mode;
    private  int time;

    public RiceCooker()
    {
        System.out.println("Create Rice Cooker!");
    }
    public void addRice(int rice)
    {
        this.rice = rice;
        System.out.println("Add the rice "+rice+" g");
    }public void addWater(int water)
    {
    this.water = water;
    System.out.println("Add the water "+water+" g");
    }
    public int getRice()
    {
        return this.rice;
    }

    public int getWater()
    {
        return this.water;
    }

    public void selectMode(String mode)
    {
        this.mode = mode;
        if (rice == 0 && water > 0)
        {
            System.out.println("Please add rice");
            return;
        } else if (rice > 0 && water == 0)
        {
            System.out.println("Please add water");
            return;
        } else if (rice == 0 && water == 0)
        {
            System.out.println("Please add rice and water");
            return;
        }
        else if (rice != 0 && water != 0)
        {
            if (!mode.equals("white") && !mode.equals("brown")&&
                    !mode.equals("sticky")&& !mode.equals("mixed")
                    && !mode.equals("japanese"))
            {
                System.out.println("Cannot cook");
                return;
            }
            else
            {
                double r = rice / rice;
                double w = (double) water / rice;
                if (mode.equals("white"))
                {
                    if (w != 1.25)
                    {
                        System.out.print("Ratio not correct, the water should be" + "\n" + 1.25 * rice + "\n");
                        return;
                    } else
                    {
                        System.out.print("Good, this is white mode" + "\n");
                    }
                } else if (this.mode.equals("brown"))
                {
                    if (w != 2)
                    {
                        System.out.print("Ratio not correct, the water should be" + "\n" + 2 * rice + "\n");
                    } else
                    {
                        System.out.print("Good, this is brown mode" + "\n");
                    }
                } else if (this.mode.equals("sticky"))
                {
                    if (w != 1)
                    {
                        System.out.print("Ratio not correct, the water should be" + "\n" + rice + "\n");
                    } else
                    {
                        System.out.print("Good, this is sticky mode" + "\n");
                    }
                }
                if (this.mode.equals("japanese"))
                {
                    if (w != 1.2)
                    {
                        System.out.print("Ratio not correct, the water should be" + "\n" + 1.2 * rice + "\n");
                    } else
                    {
                        System.out.print("Good, this is japanese mode" + "\n");
                    }
                }
                if (this.mode.equals("mixed"))
                {
                    if (w != 1.5)
                    {
                        System.out.print("Ratio not correct, the water should be " + "\n" + 1.5 * r + "\n");
                    } else
                    {
                        System.out.print("Good, this is mixed mode" + "\n");
                    }
                }
            }
        }
    }
    public void cook()
    {
        this.mode = mode;
        if (rice == 0 && water > 0)
        {
            System.out.println("Cannot cook");
            return;
        } else if (rice > 0 && water == 0)
        {
            System.out.println("Cannot cook");
            return;
        } else if (rice == 0 && water == 0)
        {
            System.out.println("Cannot cook");
            return;
        }
        else if (rice != 0 && water != 0)
        {
            double r  = rice/rice;
            double w = (double) water/rice;
            if (mode.equals("white"))
            {
                if ( w != 1.25)
                {
                    System.out.println("Cannot cook");
                    return;
                }
                else
                {
                    timecounting(35);
                }
            }
            else if (mode.equals("brown"))
            {
                if ( w != 2)
                {
                    System.out.println("Cannot cook");
                    return;
                }
                else
                {
                    timecounting(50);
                }
            }
            else if (mode.equals("sticky"))
            {
                if ( w != 1)
                {
                System.out.println("Cannot cook");
                return;
                }
                else
                {
                timecounting(55);
                }
            }
            else if (mode.equals("japanese"))
            {
                if ( w != 1.2)
                {
                    System.out.println("Cannot cook");
                    return;
                }
                else
                {
                    timecounting(45);
                }
            }
            if (mode.equals("mixed"))
            {
                if ( w != 1.5)
                {
                    System.out.println("Cannot cook");
                    return;
                }
                else
                {
                    timecounting(60);
                }
            }
        }
    }
    public void timecounting(int time)
    {
        this.time = time;
        for (int i = time; i >=0 ; i--)
        {
            System.out.println(i);
        }
//        for (int i = time; i >= 0 ; i--)
//        {
//            System.out.print(i+"\n");
//            try
//            {
//                Thread.sleep(100);
//            } catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//        }
    }
    public void cookWithTimer(int h)
    {
        this.time = h;
        this.mode = mode;
        if (rice == 0 && water > 0)
        {
            System.out.println("Cannot cook");
            return;
        } else if (rice > 0 && water == 0)
        {
            System.out.println("Cannot cook");
            return;
        } else if (rice == 0 && water == 0)
        {
            System.out.println("Cannot cook");
            return;
        }
        else if (rice != 0 && water != 0)
        {
            double r  = rice/rice;
            double w = (double) water/rice;
            if (mode.equals("white"))
            {
                if ( w != 1.25)
                {
                    System.out.println("Cannot cook");
                    return;
                }
                else
                {
                    Timer(h);
                    timecounting(35);
                }
            }
            else if (mode.equals("brown"))
            {
                if ( w != 2)
                {
                    System.out.println("Cannot cook");
                    return;
                }
                else
                {
                    Timer(h);
                    timecounting(50);
                }
            }
            else if (mode.equals("sticky"))
            {
                if ( w != 1)
                {
                    System.out.println("Cannot cook");
                    return;
                }
                else
                {
                    Timer(h);
                    timecounting(55);
                }
            }
            else if (mode.equals("japanese"))
            {
                if ( w != 1.2)
                {
                    System.out.println("Cannot cook");
                    return;
                }
                else
                {
                    Timer(h);
                    timecounting(45);
                }
            }
            if (mode.equals("mixed"))
            {
                if ( w != 1.5)
                {
                    System.out.println("Cannot cook");
                    return;
                }
                else
                {
                    Timer(h);
                    timecounting(60);
                }
            }
        }
    }
    public void Timer(int h)
    {
        this.time = h;
        for (int i = h; i >=0 ; i--)
        {
            System.out.println(i);
        }
        System.out.println("start cook");
    }
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        RiceCooker a = new RiceCooker();
        a.addRice(10);
        a.addWater(20);
        a.selectMode("white");
//        a.cook();
        a.cookWithTimer(3);
    }
}
