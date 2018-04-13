import java.util.Scanner;
import java.util.Calendar;

public class DateTime {

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Please enter your birthday,  \nWhat is your birth year?");
      double year = sc.nextInt();

      System.out.println("What is your birth month?");
      double month = sc.nextInt();

      System.out.println("What is your birth day?");
      double day = sc.nextInt();

      Calendar now = Calendar.getInstance();
      double yearAge = (now.get(Calendar.YEAR)) - year;
      double monthAge = (now.get(Calendar.MONTH)+1)-month;
      double dayAge = (now.get(Calendar.DATE)) - day;
      if(monthAge < 0){
      	yearAge --;
      	monthAge += 12;
      }
      if (dayAge < 0){
            monthAge--;
            dayAge += (30.6667);
      }

      
      double monthTime = monthAge + (yearAge * 12) + (dayAge/30.6667);
      double dayTime = dayAge + (monthAge * 30.6667) + (yearAge * 365);
      double yearTime = dayTime/365;
      double mil = yearTime/1000;
      double cent = yearTime/100;
      double dec = yearTime/10;
      double hour = dayTime * 24;
      double min = hour * 60;
      double sec = min * 60;

      System.out.println("You are: \n" + yearAge + " years " + monthAge + " months and " + dayAge + " days old, and:");
      System.out.println(sec + " seconds, \n" + min + " minutes, \n" + hour + " hours, \n" + dayTime + " days, \n" + monthTime + " months, \n" + yearTime + " years, \n" + dec + " decades, \n" + cent + " centuries, \nand " + mil + " millenniums.");
   }
}
