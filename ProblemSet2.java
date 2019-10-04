/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

        System.out.println("Enter your first name: ");
		String FirstName = in.next();
		System.out.println("Enter your last name: ");
		String LastName = in.next();
		System.out.println("Enter your grade: ");
		int Grade = in.nextInt();
		System.out.println("Enter your age: ");
		int Age = in.nextInt();
		System.out.println("Enter your hometown: ");
		String Hometown = in.next();

		System.out.println("\nNAME     : " + FirstName + " " + LastName);
		System.out.println("GRADE    : " + Grade);
		System.out.println("AGE      : " + Age);
		System.out.println("HOMETOWN : " + Hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         final int DOLLAR = 100;
         final int QUARTER = 25;
         final int DIME = 10;
         final int NICKEL = 5;
         final int PENNY = 1;

         System.out.print("\nEnter a dollar amount: ");
         double totalExTwo = in.nextDouble() * 100;

         int ad = (int) (totalExTwo / DOLLAR);
         totalExTwo = totalExTwo % DOLLAR;
         int aq = (int) (totalExTwo / QUARTER);
         totalExTwo = totalExTwo % QUARTER;
         int adi = (int) (totalExTwo / DIME);
         totalExTwo = totalExTwo % DIME;
         int an = (int) (totalExTwo / NICKEL);
         totalExTwo = totalExTwo % NICKEL;
         int ape = (int) (totalExTwo / PENNY);

         System.out.println("\nDOLLARS  : " + ad);
         System.out.println("QUARTERS : " + aq);
         System.out.println("DIMES    : " + adi);
         System.out.println("NICKELS  : " + an);
         System.out.println("PENNIES  : " + ape);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         final int DOLLAR_TEN = 1000;
         final int DOLLAR_FIVE = 500;

         System.out.print("\nEnter a dollar amount: ");
         double totalExThree = in.nextDouble() * 100;

         int amountBills = (int) (totalExThree / DOLLAR_TEN);
         totalExThree = totalExThree % DOLLAR_TEN;
         amountBills = (int) (amountBills + (totalExThree / DOLLAR_FIVE));
         totalExThree = totalExThree % DOLLAR_FIVE;
         amountBills = (int) (amountBills + (totalExThree / DOLLAR));
         totalExThree = totalExThree % DOLLAR;

         int amountCoins = (int) (totalExThree / QUARTER);
         totalExThree = totalExThree % QUARTER;
         amountCoins = (int) (amountCoins + (totalExThree / DIME));
         totalExThree = totalExThree % DIME;
         amountCoins = (int) (amountCoins + (totalExThree / NICKEL));
         totalExThree = totalExThree % NICKEL;
         amountCoins = (int) (amountCoins + (totalExThree / PENNY));

         System.out.println("\nBILLS : " + amountBills);
         System.out.println("COINS : " + amountCoins);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

         final int inchesMile = 63360;
         final int inchesYard = 36;
         final int inchesFeet = 12;

         System.out.print("\nEnter a number of inches: ");
         double inches = in.nextInt();

         int amountMiles = (int) (inches / inchesMile);
         inches = inches % inchesMile;
         int amountYards = (int) (inches / inchesYard);
         inches = inches % inchesYard;
         int amountFeet = (int) (inches / inchesFeet);
         inches = inches % inchesFeet;
         int amountInches = (int) (inches);

         System.out.println("\nMILES  : " + amountMiles);
         System.out.println("YARDS  : " + amountYards);
         System.out.println("FEET   : " + amountFeet);
         System.out.println("INCHES : " + amountInches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

         final int CENTIMETER_KILOMETER = 100000;
         final int CENTIMETER_METER = 100;

         System.out.print("\nEnter a number of centimeters: ");
         int centimeters = in.nextInt();

         int amountKilometer = (centimeters / CENTIMETER_KILOMETER);
         centimeters = centimeters % CENTIMETER_KILOMETER;
         int amountMeter = (centimeters / CENTIMETER_METER);
         centimeters = centimeters % CENTIMETER_METER;

         System.out.println("\nKILOMETERS  : " + amountKilometer);
         System.out.println("METERS      : " + amountMeter);
         System.out.println("CENTIMETERS : " + centimeters);


        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

         System.out.print("\nEnter a diameter: ");
         double diameter = in.nextDouble();

         double circleArea = Math.PI * Math.pow((diameter / 2), 2);
         double circumference = 2 * Math.PI * (diameter / 2);

         System.out.printf("\nAREA          : %.2f", circleArea);
         System.out.printf("\nCIRCUMFERENCE : %.2f", circumference);

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

         System.out.print("\n\nEnter a length: ");
         int length = in.nextInt();
         System.out.print("Enter a width: ");
         int width = in.nextInt();

         double rectangleArea = length * width;
         double rectanglePerimeter = (length * 2) + (width * 2);
         double diagonal = java.lang.Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

         System.out.printf("\nAREA      : %.2f", rectangleArea);
         System.out.printf("\nPERIMETER : %.2f", rectanglePerimeter);
         System.out.printf("\nDIAGONAL  : %.2f", diagonal);

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

         System.out.print("\n\nEnter a side length: ");
         int side = in.nextInt();
         in.nextLine();

         double hexagonArea = ((3 * java.lang.Math.sqrt(3)) / 2) * Math.pow(side, 2);
         double hexagonPerimeter = 6 * side;

         System.out.printf("\nAREA      : %.2f", hexagonArea);
         System.out.printf("\nPERIMETER : %.2f", hexagonPerimeter);


        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

         System.out.print("\n\nEnter a String: ");
         String course = in.nextLine();

         int halfCourse = (int) (Math.round(course.length() / 2));
         String halfFirst = course.substring(0, halfCourse);
         String halfSecond = course.substring(halfCourse);

         System.out.println("\n" + halfSecond + halfFirst);

        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

         System.out.print("\nEnter your first name: ");
         String nameFirstExTen = in.nextLine();
         System.out.print("\nEnter your middle name: ");
         String nameMiddleExTen = in.nextLine();
         System.out.print("\nEnter your last name: ");
         String nameLastExTen = in.nextLine();

         String initialFirst = String.valueOf(nameFirstExTen.charAt(0));
         String initialMiddle = String.valueOf(nameMiddleExTen.charAt(0));
         String initialLast = String.valueOf(nameLastExTen.charAt(0));
         String initials = (initialFirst + initialMiddle + initialLast);

         System.out.println("\n" + initials);

        in.close();
    }
}
