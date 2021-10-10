package Week3;

import java.util.Scanner;

public class TravelCost {

        public static void main(String[] args) {

            double distance;
            double mpg;
            double pricePerGallon;
            double totalCost;

            String location;
            //scanner class reads input from the console;
            Scanner sc= new Scanner(System.in);

            System.out.print("Enter the location");

            location=sc.next();

            System.out.print("Enter the total distance in miles");
            distance=sc.nextDouble();

            System.out.print("Enter the MPG for the vehicle");
            mpg=sc.nextDouble();

            System.out.print("Enter the price of one gallon of gas");
            pricePerGallon=sc.nextDouble();

            totalCost=(distance/mpg)*pricePerGallon;

            System.out.printf("The trip "+ location +" going to cost $ %1.3f",totalCost);
            System.out.println ();
        }


}
