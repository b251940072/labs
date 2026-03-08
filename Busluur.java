package Lab2;
import java.util.Scanner;

public class Busluur {
    public static void main(String[] args){
    	
        Scanner input = new Scanner(System.in); 

        System.out.print("Гэрийн радиус R = ");
        double R = input.nextDouble();

        double busluur = 2 * Math.PI * R;

        System.out.println("Хэрэгтэй бүслүүрийн урт = " + busluur);

        input.close();
    }
}