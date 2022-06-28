package line_comparison;


public class Computation {
	int x1,y1,x2,y2,x3,y3,x4,y4;
	float line1_distance,line2_distance;
	public void welcome() {
		System.out.println("Welcome to line comparison program");
	}
	public void input() {
		System.out.println("Enter x1,y1,x2 and y2 for line 1");
		x1=Line_comparison.sc1.nextInt();
		y1=Line_comparison.sc1.nextInt();
		x2=Line_comparison.sc1.nextInt();
		y2=Line_comparison.sc1.nextInt();
		System.out.println("Enter x3,y3,x4 and y4 for line 2");
		x3=Line_comparison.sc1.nextInt();
		y3=Line_comparison.sc1.nextInt();
		x4=Line_comparison.sc1.nextInt();
		y4=Line_comparison.sc1.nextInt();
	}
	public void distance() {
		line1_distance = (float) Math.sqrt(((x2 - x1) * (x2 - x1) ) + ((y2 - y1) *(y2 - y1)));
		line2_distance= (float) Math.sqrt(((x4 - x3) * (x4 - x3) ) + ((y4 - y3) *(y4 - y3)));
		System.out.println("the length of line 1 is "+line1_distance+" and line 2 is "+line2_distance);
	}
	public void compare() {
		if(line1_distance > line2_distance) {
			System.out.println("line1 is greater");
		}
		else if(line1_distance < line2_distance) {
			System.out.println("line2 is greater");
		}
		else {
			System.out.println("the two lines are equal");
		}
	}

}
