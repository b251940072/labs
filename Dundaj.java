package Lab2;
import java.util.Scanner;

public class Dundaj {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ehnii utgiig oruulna uu. ");
		double n1 = input.nextDouble();
		
		System.out.print("Daraagiin utgiig oruulna uu. ");
		double n2 = input.nextDouble();
		
		double dundaj=(n1 + n2)/2;
		
		System.out.println("Dundaj utga= " + dundaj);
		
		input.close();	
	}
	
}
