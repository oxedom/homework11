package homework11;

import java.util.Scanner;

public class Triangle1 {

	public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			System.out.println ("This program calculates the area "
					 + "and the perimeter of a given triangle. ");
					 System.out.println ("Please enter the three lengths"
					 + " of the triangle's sides");	
			
		
//			Takes 3 parameters from users
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
//			declaring perimeter by adding all three parameters together
			int perimeter = (a+b+c);
			
			int s = (perimeter/2);
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			

			System.out.println("The lengths of the triangle sides are: "+a+","+b+","+c+".");
			System.out.println("The perimeter of the triangle is: "+perimeter);
			System.out.println("The area of the triangle is: "+area);
	}

}
