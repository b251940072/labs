package Lab4;
import java.util.Scanner;

public class Datetime {
	 private int year;
	 private int month;
	 private int day; 
	 
	  public Datetime(String dt){ 
		  String [] values = dt.split("[-./]");
		  year = Integer.parseInt(values[0]);
		  month = Integer.parseInt(values[1]);
		  day = Integer.parseInt(values[2]);
	  }
	  
	  private int getyearcode(int year) {
		  return (year%100 + (year%100)/4)%7;
	  }
	  
	  private int getmonthcode(int month){
		  switch(month) {
		  case 1:
			  return 0;
		  case 2:
			  return 3;
		  case 3:
			  return 3;
		  case 4:
			  return 6;
		  case 5:
			  return 1;
		  case 6:
			  return 4;
		  case 7:
			  return 6;
		  case 8:
			  return 2;
		  case 9:
			  return 5;
		  case 10:
			  return 0;
		  case 11:
			  return 3;
		  case 12:
			  return 5;
		  default:
			  System.out.print("Ta buruu utga oruulsn tul shalgaj dahin oroldono uu.");
			  return 0;}			  
		  }
		  
	  private int getcenturycode(int century) {
		    switch(century) {
		        case 17: return 4;
		        case 18: return 2;
		        case 19: return 0;
		        case 20: return 6;
		        case 21: return 4;
		        case 22: return 2;
		        case 23: return 0;
		        default:
		            System.out.println("Tanii on buruu baina.");
		            return 0;
		    }
			  }
			  
			  private int getleapyearcode(int year, int month) { 
				  boolean leapYear = false;
				  
					    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					        leapYear = true;
					    }

					    if (leapYear && (month == 1 || month == 2)) {
					        return 1;
					    } else {
					        return 0;
					    }
					}
			  
			  private int dayofweek() {

				    int century = year / 100;

				    return (day + getmonthcode(month) + getyearcode(year) + getcenturycode(century) - getleapyearcode(year, month)) % 7;
				}
			  private String getDayName() {
				   
				 int d = dayofweek();
				  
				 switch(d) {
				 case 0: return "Sunday";
				 case 1: return "Monday";
				 case 2: return "Tuesday";
				 case 3: return "Wednesday";
				 case 4: return "Thursday";
				 case 5: return "Friday";
				 case 6: return "Saturday";
				 default: return "aldaa garlaa";
				 }
			  }
			  
			 public static void main(String[] args) {
				  Scanner input = new Scanner(System.in);
				  
				  System.out.print("Ognoog oruulna uu(YYYY-MM-DD): ");
				  String date = input.nextLine();
				  
				  Datetime d = new Datetime(date);
				 
				  System.out.println("Tanii oruulsan ognoonii garig: " + d.getDayName());

			        input.close();
			 }
}
