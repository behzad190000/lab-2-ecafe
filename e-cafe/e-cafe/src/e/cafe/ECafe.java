package e.cafe;

import java.time.LocalTime;
import java.util.Scanner;

public class ECafe {

    public void show_menu()
    {
        System.out.println("\t!!!!.......Appetizers.....!!!!");
    System.out.println(" 1)  Blue Chesse Ball : Rs/-350");
    System.out.println(" 2)  Polenta Squares with Gorgonzola : Rs/-250");
    System.out.println(" 3)  Apple-Blue Cheese Chutney : Rs/-300");
    System.out.println(" 4)  Caramelized Onion, Gruyère, and Bacon Spread  :  Rs/-550");
   
    System.out.println("\t!!!!.......Soup.....!!!!");
    System.out.println(" 5)  chicken Soup : Rs/-380");
    System.out.println(" 6)  Mushroom  Soup : Rs/-320");
     
     System.out.println("\t!!!!.......Main Course Dishes.....!!!!");
    System.out.println(" 7)  Curried Chicken and Broccoli Casserole : Rs/-550");
    System.out.println(" 8)  Simple Baked Chicken Breasts : Rs/-450");
    System.out.println(" 9)  Crispy and Tender Baked Chicken Thighs : Rs/-650");
    System.out.println(" 10)  Homemade Mac and Cheese : Rs/-390");
    System.out.println(" 11)  Roasted Pork Loin : Rs/-470");
    System.out.println(" 12)  pesto Pasta with chicken : Rs/-500");
    
    System.out.println("\t!!!!.......Side Dishes.....!!!!");
    System.out.println(" 13)  Potato, Squash & Goat Cheese Gratin : Rs/-530");
    System.out.println(" 14)  Garlicky Roasted Broccoli : Rs/-690");
    System.out.println(" 15)  Hasselback Tater Tots : Rs/-420");
    }
    
    public static void main(String[] args) {

LocalTime now = LocalTime.now();
LocalTime limit1 = LocalTime.parse( "11:00" );
LocalTime limit2 = LocalTime.parse( "10:00" );
Boolean isBefore = now.isBefore(limit1 );
Boolean isLate = now.isAfter(limit2 );

if(isBefore==false && isLate==true)
{
  ECafe list=new ECafe();
  list.show_menu();
  
    System.out.println("DO YOU WANT TO PALCE AN ORDER ?? Press 1 for yes and 0 for No");
     Scanner option=new Scanner(System.in);
     int opt=option.nextInt();
     if(opt==1)
     {
         int bill=0;
         int x=1;
         do{
          System.out.println("\n\n Choose any of the above dish from the menu. Use index number for selecting thaat item :");
         Scanner order=new Scanner(System.in);
         int ord=order.nextInt();
         switch(ord)
         {
             
             case 1:
                  System.out.println(" Select item is  1) Blue Chesse Ball");
                  bill+=350;
                  break;
             case 2:
                  System.out.println(" Select item is  2)  Polenta Squares with Gorgonzola");
                  bill+=250;
                  break;
            case 3:
                  System.out.println(" Select item is  3)  Apple-Blue Cheese Chutney");
                  bill+=300;
                  break;
            case 4:
                  System.out.println(" Select item is  4)  Caramelized Onion, Gruyère, and Bacon Spread");
                  bill+=550;
                  break;
            case 5:
                  System.out.println(" Select item is  5)  chicken Soup");
                  bill+=380;
                  break;
            case 6:
                  System.out.println(" Select item is  6)  Mushroom  Soup");
                  bill+=320;
                  break;
            case 7:
                  System.out.println(" Select item is  Curried Chicken and Broccoli Casserole");
                  bill+=550;
                  break;
            case 8:
                  System.out.println(" Select item is  8)  Simple Baked Chicken Breasts");
                  bill+=450;
                  break;
             case 9:
                  System.out.println(" Select item is  9)  Crispy and Tender Baked Chicken Thighs");
                  bill+=380;
                  break;
            case 10:
                  System.out.println(" Select item is  10) Homemade Mac and Cheese");
                  bill+=390;
                  break;
            case 11:
                  System.out.println(" Select item is  11)   Roasted Pork Loin");
                  bill+=470;
                  break;
             case 12:
                  System.out.println(" Select item is  12)   pesto Pasta with chicken");
                  bill+=500;
                  break;
            case 13:
                  System.out.println(" Select item is  13) Potato, Squash & Goat Cheese Gratin");
                  bill+=530;
                  break;      
             case 14:
                  System.out.println(" Select item is  14)  Garlicky Roasted Broccoli");
                  bill+=690;
                  break;
             case 15:
                  System.out.println(" Select item is  Hasselback Tater Tots");
                  bill+=420;
                  break;
             default:
                  System.out.println(" !!!...invalid menu item,please select again");
                  break;
                 
         }
             System.out.println("Your bill is : "+bill);
             System.out.println("if you want to add more item to menu ,Press '1' to continue or press '0' to exit");
          Scanner continue_this=new Scanner(System.in);
         int cont=continue_this.nextInt();
         if(cont==0)
         {
             x=0;
             System.out.println("\nNow you are going to exit the menu \n");
         }
         else
         {
             x=1;
         }
         }while(x==1);
     }
     
      
     else
     {
     
     }
     
     System.out.println("You have 2 options : ");
       System.out.println(" 1) for Pickup");
            System.out.println(" 2)for deliver");
                 System.out.println("Enter any of the option options");
     Scanner del=new Scanner(System.in);
     int delivery=del.nextInt();
         if(delivery==1)
         {
             System.out.println("enter you home adress : ");
             Scanner adr=new Scanner(System.in);
             String adress=adr.next();
             
             
         }
         else
         {
           
         }
         
}
else
{
    System.out.println("out of time");

}
    }
}
        
