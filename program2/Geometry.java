import java.util.Scanner;

public class Geometry {
	private static double PI = 3.14159;

	public static void main(String[] args) {

		System.out.println("\n\t\tWelcome to the Circle Tester");
		System.out.println("============================================================");
		// ask user for input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 integer for radius of the circle:");

		// print the value entered by the user
		System.out.print("Radius 1: ");
		int a = input.nextInt();

		System.out.print("Radius 2: ");
		int b = input.nextInt();

		System.out.print("Radius 3: ");
		int c = input.nextInt();

		System.out.println("You entered " + a + " " + b + " " + c);

		// close the Scanner resource
		input.close();

		// create a circle object
		circle circle1 = new circle(a);
		circle circle2 = new circle(b);
		circle circle3 = new circle(c);

		// print the radius, area, and circumference of the circle
		System.out.println("============================================================");
		System.out.println("\tCircle 1 Using Hardcoded PI");
		System.out.println("The radius of the circle is: " + circle1.radius);
		System.out.println("The circumference of the circle is: " + circle1.circumference);
		System.out.println("The area of the circle is: " + circle1.area);

		System.out.println("============================================================");
		System.out.println("\tCircel 2 Using Math.PI");

		// create a circle object using Math.PI
		System.out.println("The radius of the circle is: " + circle2.radius);
		System.out.println("The circumference of the circle is: " + circle2.getCircumference());
		System.out.println("The area of the circle is: " + circle2.getArea());

		System.out.println("============================================================");
		System.out.println("\tCircel 3");
		System.out.println("The radius of the circle is: " + circle3.radius);
		System.out.println("The circumference of the circle is: " + circle3.circumference);
		System.out.println("The area of the circle is: " + circle3.area);

	}

	static class circle {
		public double radius;
		public double area;
		// public double diameter;
		public double circumference;

		public circle(double radius) {
			this.radius = radius;
			this.area = PI * radius * radius;
			// this.diameter = 2 * radius;
			this.circumference = 2 * PI * radius;
		}

		// Using Math.PI

		public double getCircumference() {
			return 2 * Math.PI * radius;
		}

		public double getArea() {
			return Math.PI * radius * radius;
		}

	}
}