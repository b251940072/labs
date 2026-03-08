package Lab3;

import java.util.Scanner;

public class Bank {
    
    private static String ner;
    private static String valiut = "$";
    private static double hhuu = 18;
    private static int hhugatsaa;
    private static double ehuldegdel;
    static double hurimthu;
    static double etsuldegdel;

    public static void main(String args[]) {
    	   Scanner input = new Scanner(System.in);
 
    	   System.out.print("Ta hadgalamjiin neree oruulna uu: ");
    	   ner = input.next();
           
    	   System.out.print("Ta hadgalamjiin hugatsaag otuulna uu: ");
    	   hhugatsaa = input.nextInt();
    	   
    	   System.out.print("Ta uldegdelee oruulna uu: ");
    	   ehuldegdel = input.nextDouble();
  
       hurimthu = (ehuldegdel * (hhuu / 12) * hhugatsaa) / 100;
       etsuldegdel = ehuldegdel + hurimthu;
       
       displayMessage();
       input.close();}

    public static void displayMessage() {
    	
        System.out.println("Ta '" + ner + "' -d " + ehuldegdel + " " + valiut +
                "-iig " + hhugatsaa + " sariin hugatsaatai, jiliin " + hhuu +
                "% huutei hadgaluulbal:");
        System.out.println("Hadgalamjiin etsesiin uldegdel: " + etsuldegdel);
        System.out.println("Hurimtlagdsan huu: " + hurimthu);
    }
}