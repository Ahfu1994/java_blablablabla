import java.util.Scanner;

public class Account
{
 private String id ;
 private String name;
 private String surname;
 private double balance;
 public Account()
 {
 }

 public Account(String id, String name, String surname, double balance)
 {
   this.id = id;
   this.name = name;
   this.surname = surname;
   this.balance = balance;
 }
 public String getFullname()
 {
  String fullname = name+" "+surname;
  return fullname;
 }
 public void setBalance(double balance)
 {
  this.balance = balance ;
 }
 public double getBalance()
 {
  return this.balance;
 }
 public void deposit(double d)
 {
  double money = d+this.balance;
  System.out.println(money);
 }

 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  Account a = new Account();
  a.id = sc.nextLine();
  a.name = sc.nextLine();
  a.surname = sc.nextLine();
//  a.deposit(500);
  a.setBalance(500);
  a.deposit(500);
  System.out.println(a.getFullname());
  System.out.println(a.getBalance());

 }
}
