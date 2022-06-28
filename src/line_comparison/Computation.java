package line_comparison;

import java.util.Scanner;

public class Computation {
	int x1,y1,x2,y2,x3,y3,x4,y4;
	float line1_distance,line2_distance;
	public void welcome() {
		System.out.println("Welcome to line comparison program");
	}
	public void input() {
		System.out.println("Enter x1,y1,x2 and y2 for line 1");
		Scanner sc = new Scanner(System.in);
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("Enter x3,y3,x4 and y4 for line 2");
		x3=sc.nextInt();
		y3=sc.nextInt();
		x4=sc.nextInt();
		y4=sc.nextInt();
		sc.close();
	}
	public void distance() {
		line1_distance = (float) Math.sqrt(((x2 - x1) * (x2 - x1) ) + ((y2 - y1) *(y2 - y1)));
		line2_distance= (float) Math.sqrt(((x4 - x3) * (x4 - x3) ) + ((y4 - y3) *(y4 - y3)));
		System.out.println("the length of line 1 is "+line1_distance+" and line 2 is "+line2_distance);
	}
	public void compare() {
		if(line1_distance == line2_distance) {
			System.out.println("the two lines are equal");
		}
		else {
			System.out.println("they are not equal");
		}
	}

}
