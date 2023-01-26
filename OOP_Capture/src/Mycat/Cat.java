package Mycat;

public class Cat
{
    public Cat(String name, String sex, String color, int age)
    {
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.age =  age;
        System.out.println("A Cat was born");
    }

    String name;
    String sex;
    String color;
    int age;

    public void eat()
    {
        System.out.println("A Cat is eating ");
    }

    public  void run()
    {
        System.out.println("A Cat is running ");
    }

    public void makeVioc()
    {
        System.out.println("Maow Maow Maow");
    }

    public  void catchRat()
    {
        System.out.println("A Cat is catching a Rat");
    }

}
