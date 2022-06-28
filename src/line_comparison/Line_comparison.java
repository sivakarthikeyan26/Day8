package line_comparison;

import java.util.Scanner;

public class Line_comparison {
	
	public static final Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag=false;
		int choice;
		Computation comp = new Computation();
		comp.welcome();
		while(flag!=true) {
			System.out.println("enter the choice : \n1.Enter the inputs\n2.compute only distance of two lines\n3.compare two lines\n4.exit the program");
		    choice=sc1.nextInt();
			switch(choice) {
			case 1:
				comp.input();
				break;
			case 2:
				comp.distance();
				break;
			case 3:
				comp.compare();
				break;
			case 4:
				sc1.close();
				System.exit(0);
			default :
				System.out.println("enter the correct choice");
			}
		}

	}

}
