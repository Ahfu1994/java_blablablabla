package Mycat;

public class CatTest
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Peter","M","Brown",5);
        System.out.println(cat1.name+"\n"+cat1.sex+"\n"+cat1.color+"\n"+cat1.age);
        cat1.eat();
        cat1.run();
        cat1.catchRat();
        cat1.makeVioc();

    }
}
