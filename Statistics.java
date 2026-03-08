package Lab5;

public class Statistics {
	
  static double dundaj(double a) {
    return a;
 }
  static double dundaj(double a, double b) {
	return (a+b)/2;
}
  static double dundaj(double a, double b, double c) {
	return (a+b+c)/3;
}
  static double dundaj(double a, double b, double c, double d) {
	return (a+b+c+d)/4;
}
  static double dundaj(double a, double b, double c, double d, double e) {
	return (a+b+c+d+e)/5;
}

  double arifdundaj(double... numbers) {
	  double sum=0;
	  
	  for(double n : numbers) {
		  sum = sum + n;
	  }
	  
	  return sum / numbers.length;
  }
 }
  
  
