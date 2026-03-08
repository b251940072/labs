package Lab2;
import java.util.Scanner;

public class Talbai {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ax = ");
		double ax = input.nextDouble();
		System.out.print("ay = ");
		double ay = input.nextDouble();
		
		System.out.print("bx = ");
		double bx = input.nextDouble();
		System.out.print("by = ");
		double by = input.nextDouble();
		
		System.out.print("cx = ");
		double cx = input.nextDouble();
		System.out.print("cy = ");
		double cy = input.nextDouble();
		
		double AB = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
		double BC = Math.sqrt(Math.pow(bx - cx, 2) + Math.pow(by - cy, 2));
		double CA = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));
		
		double p=(AB + BC + CA)/2;
		
		double S = Math.sqrt(p*(p - AB)*(p - BC)*(p-CA));
		
		System.out.println("Talbai = " + S);
		
		input.close();
	}

}
