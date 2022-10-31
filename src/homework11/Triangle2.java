package homework11;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		Takes 3 parameters from users
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
	

		if(x + y <= z || x + z <= y || y + z <= x ) {
			System.out.println("The numbers: "+x+", "+y+" and "+z+" cannot repersent a triangle");
		}
		
		if(x == y && y == z && x == z) {
			System.out.println("The numbers: "+x+", "+y+" and "+z+" represent an equilateral triangle");
		}
	
		if(Math.pow(x, 2)+ Math.pow(y, 2) == Math.pow(z, 2) || Math.pow(z, 2)+Math.pow(y, 2)==Math.pow(y, 2) || Math.pow(y, 2)+Math.pow(z, 2) == Math.pow(y, 2) ) {
			System.out.println("The numbers: "+x+", "+y+" and "+z+" represent an right-angle triangle");
		}
		
		if(x != y && x != z || y != x && y!= z ) {
			System.out.println("The numbers: "+x+", "+y+" and "+z+" represent an common triangle");
		}
		
		if(x == y || y == z || z == x ) {
			System.out.println("The numbers: "+x+", "+y+" and "+z+" represent an isosceles triangle");
		}

		
	
		
		
		
		
		
		
		
	}

}
