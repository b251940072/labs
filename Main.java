package Lab5;
import java.util.Scanner;

public class Main {
		  public static void main(String[] args) {
			  Scanner too = new Scanner(System.in);
			  
			  System.out.print("heden too oruulah ve(1-5): ");
			  int n = too.nextInt();
			  
			  double a[] = new double[n];
			  
			  for(int i = 0; i<n; i++) {
				  System.out.printf("%d-r toog oruul: ", i + 1);
				  a[i] = too.nextDouble();
			  }
			  
			  Statistics st = new Statistics();
			  
			  System.out.println("arifdundajiin utga: " + st.arifdundaj(a));
			  
			  if(n == 1)
				  System.out.println("dundaj utga = " + Statistics.dundaj(a[0]));
			  
			  else if(n == 2)
				  System.out.println("dundaj utga = " + Statistics.dundaj(a[0],a[1]));
			  
			  else if(n == 3)
		            System.out.println("dundaj utga = " + Statistics.dundaj(a[0],a[1],a[2]));

		        else if(n == 4)
		            System.out.println("dundaj utga = " + Statistics.dundaj(a[0],a[1],a[2],a[3]));

		        else if(n == 5)
		            System.out.println("dundaj utga = " + Statistics.dundaj(a[0],a[1],a[2],a[3],a[4]));
		       too.close();
		  }		  			  
		  }


