import java.text.DecimalFormat;

public class Car
{
    private final String model;
    private double fuel;
    private double speed ;
    private double distanceTotal;

    public Car(String model)
    {
        this.model = model;
        this.fuel = fuel;
         fuel = Double.parseDouble(model.substring(1,3));
        System.out.println("Create Car model "+model);
    }
    public void addFuel(double addfuel)
    {
        this.fuel = fuel+addfuel;
        DecimalFormat df = new DecimalFormat("#####0.00");
        System.out.println("Add fuel "+df.format(addfuel)+" total "+df.format(this.fuel)+" liter");
    }
    public void setSpeed(double speed)
    {
        this.speed = speed;
        DecimalFormat df = new DecimalFormat("#####0.00");
        System.out.println("Set speed "+df.format(speed) +" km/h");
    }
    public double calculateDistance()
    {
        double distance = 1;
        char m = model.charAt(0);
        DecimalFormat df = new DecimalFormat("#####0.00");
        if (m =='A')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 10*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
            else
            {
                distance = 8*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
        }
        else if (m =='B')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 12*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
            else
            {
                distance = 10*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
        }
        else if (m =='C')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 15*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
            else
            {
                distance = 12*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
        }
        else if (m =='D')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 20*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
            else
            {
                distance = 16*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
        }
        else if (m =='E')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 25*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
            else
            {
                distance = 21*fuel;
                System.out.println("Max distance is " + df.format(distance) + " km");
            }
        }
        return distance;
    }
    public void startEngine(double dis)
    {
        DecimalFormat df = new DecimalFormat("##0000.00");
        double distance;
        char m = model.charAt(0);
        if (m =='A')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 10*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+(int)((dis-distance)/10+1)+" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
            else
            {
                distance = 8*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+(int)((dis-distance)/8+1)+" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
        }
        else if (m =='B')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 12*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+(int)((dis-distance)/12+1)+" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
            else
            {
                distance = 10*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+(int)((dis-distance)/10+1)+" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
        }
        else if (m =='C')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 15*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+(int)((dis-distance)/15+1)+" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
            else
            {
                distance = 12*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+(int)((dis-distance)/12+1)+" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
        }
        else if (m =='D')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 20*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+(int)((dis-distance)/20+1)+" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
            else
            {
                distance = 16*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+(int)((dis-distance)/16+1)+" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
        }
        else if (m =='E')
        {
            if (speed >= 45 && speed <= 80 )
            {
                distance = 25*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+(int)((dis-distance)/25+1)+" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
            else
            {
                distance = 21*fuel;
                if (dis > distance)
                {
                    System.out.println("Please add fuel "+ (int)((dis-distance)/21+1) +" liter");
                }
                else
                {
                    for (int i = 0; i <= dis; i++)
                    {
                        System.out.println(df.format(i));
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
         Car a = new Car("A10H25");
         a.addFuel(10);
         a.setSpeed(60);
//         a.calculateDistance();
         a.startEngine(12);
    }
}
