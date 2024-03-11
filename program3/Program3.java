import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in);
        System.out.println("\n\tWelcome to Program 3");
        System.out.println("===================================");
        System.out.println("\nProgram Options");
        System.out.println("===================================");
        boolean loop = true;
        while (loop) {
            System.out.println("\t1. Fat Gram Calculator\n" + //
                    "\t2. Speed of Sound\n" + //
                    "\t3. ISP\n" + //
                    "\t4. ISP Part 2\n" + //
                    "");
            System.out.print("Enter the number of the program you want to run: ");
            int program = Userinput.nextInt();
            switch (program) {
                case 1:
                    System.out.println("Executing Program 1: Fat Gram Calculator");
                    System.out.print("Please Enter The Number of Calories In Your Food:");
                    int calories = Userinput.nextInt();
                    System.out.print("Please Enter The Number of Fat Grams In Your Food:");
                    int fatGrams = Userinput.nextInt();
                    double fatCalories = fatGrams * 9;
                    double fatPer = fatCalories / (fatCalories + calories);

                    if (fatPer < 30) {
                        System.out.println("The Food Is Low In Fat Calories");
                    } else {
                        System.out.println("The Food Is High In Fat Calories");
                    }
                    continue;
                case 2:
                    // int again = Userinput.nextInt();
                    // System.out.println(again);
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;

                case 5:
                    System.out.println("Exiting Program 3");
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid program number. Please try again.");
                    continue;
            }
        }
        Userinput.close();
    }
}