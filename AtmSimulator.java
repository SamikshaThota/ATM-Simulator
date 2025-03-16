import java.util.Scanner;
class atm{
   private String name="Samiksha";
   private int pin=1234;
   private double balance=10000;
   private boolean isauthenticated=false;
   Scanner sc=new Scanner(System.in);

   public void checkpin(){
       System.out.println("enter the pin number: ");
       int pincode=sc.nextInt();
       if(pincode==pin){
           isauthenticated=true;
           System.out.println("pin is correct.welcome to the atm "+name+"!");
           displaymenu();
       }
       else{
           System.out.println("Incorrect Pincode,try later");
       }
   }

   public void displaymenu(){
       System.out.println("choose a number from the available options");
       System.out.println("1.Check Balance\t2.Deposit Money\t3.Withdraw Money\t4.Exit");
       int number=sc.nextInt();
       switch (number){
           case 1:
               checkbalance();
               break;
           case 2:
               adddeposit();
               break;
           case 3:
               withdrawmoney();
               break;
           case 4:
               exit();
               break;
           default:
               System.out.println("invalid number try again");
       }
   }

   public void checkbalance(){
       System.out.println("The Balance in your account is : "+balance);
       displaymenu();

   }
   public void adddeposit(){
       System.out.println("enter the money ypu want to add: ");
       int a=sc.nextInt();
       //int deposit=a;
       balance+=a;
      displaymenu();
   }
   public void withdrawmoney(){
       System.out.println("enter the amount you want to withdraw: ");
       int b=sc.nextInt();
       if(b<balance){
           balance-=b;
       }
       else{
           System.out.println("no sufficient money");
       }
      displaymenu();
   }
   public void exit(){
       System.out.println("thank you for visiting!come again.");
   }
}
public class AtmSimulator{
    public static void main(String[] args) {
        atm obj=new atm();
        obj.checkpin();
    }
}

