/**
 * Created by Peter.Barron on 20/06/2016.
 */

import java.util.Scanner;

public class HomeWork01 {

    public static void task01() {
        FlowerBed flowerBed = new FlowerBed();
        System.out.println("Please enter radius");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double result = flowerBed.calcCircumference(radius);
        System.out.println("Perimiter is: " + result);
    }

    public static void task02() {
        String userName;
        String userHome;

        System.out.println("What is your name?");
        Scanner sc_userName = new Scanner(System.in);
        userName = sc_userName.nextLine();
        System.out.println("Where are you from," + userName + " ?");
        Scanner sc_userHome = new Scanner(System.in);
        userHome = sc_userHome.nextLine();
        System.out.println("Welcome: " + userName + " from " + userHome );
    }

    public static void task03() {
        // TODO
        System.out.println("Enter CostPerMin1");
        Scanner sc_costPerMin1 = new Scanner(System.in);
        double costPerMin1 = sc_costPerMin1.nextDouble();

        System.out.println("Enter CostPerMin2");
        Scanner sc_costPerMin2 = new Scanner(System.in);
        double costPerMin2 = sc_costPerMin2.nextDouble();

        System.out.println("Enter CostPerMin3");
        Scanner sc_costPerMin3 = new Scanner(System.in);
        double costPerMin3 = sc_costPerMin3.nextDouble();

        System.out.println("Enter Time1");
        Scanner sc_timeMins1 = new Scanner(System.in);
        double timeMins1 = sc_timeMins1.nextDouble();

        System.out.println("Enter Time2");
        Scanner sc_timeMins2 = new Scanner(System.in);
        double timeMins2 = sc_timeMins2.nextDouble();

        System.out.println("Enter Time3");
        Scanner sc_timeMins3 = new Scanner(System.in);
        double timeMins3 = sc_timeMins3.nextDouble();

        double costCall1 = costPerMin1 * timeMins1;
        double costCall2 = costPerMin2 * timeMins2;
        double costCall3 = costPerMin3 * timeMins3;

        System.out.println("cost of call 1: " + costCall1);
        System.out.println("cost of call 2: " + costCall2);
        System.out.println("cost of call 3: " + costCall3);
        System.out.println("Total cost of calls: " + (costCall1+costCall2+costCall3));
    }

    public static void main(String[] args) {
        System.out.println("Please choose an option");
        System.out.println("1: Flower bed");
        System.out.println("2: What is your name?");
        System.out.println("3: Phone calls");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1: task01();
                break;
            case 2: task02();
                break;
            case 3: task03();
                break;
            default: break;
        }
    }

}
