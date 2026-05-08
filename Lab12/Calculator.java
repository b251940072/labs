package Lab12;
import javax.swing.*;

public class Calculator {
	private double number1;
	private double number2;
	
	JFrame f;
	Calculator(){
		f = new JFrame("Toonii mashin");
		
		JLabel n1 = new JLabel("1r operand"); 
		n1.setBounds(35, 10, 100, 20);
		f.add(n1);
		
		JLabel n2 = new JLabel("2r operand"); 
		n2.setBounds(175, 10, 100, 20);
		f.add(n2);
		
		JTextField p1 = new  JTextField(null);
		p1.setBounds(35, 35, 120, 20);
		f.add(p1);
		JTextField p2 = new JTextField(null);
		p2.setBounds(175, 35, 120, 20);
		f.add(p2);
		JTextField p3 = new JTextField("hariu: ");
		p3.setBounds(30, 110, 270, 20);
		f.add(p3);
		
		JButton b = new JButton("+");
		b.setBounds(35, 60, 50,  40);
		JButton a = new JButton("-");
		a.setBounds(105, 60, 50,  40);
		JButton c = new JButton("*");
		c.setBounds(175, 60, 50,  40);
		JButton d = new JButton("/");
		d.setBounds(245, 60, 50,  40);
		f.add(b);
		f.add(a);
		f.add(c);
		f.add(d);
		f.setSize(350, 180);
		f.setLayout(null);
		f.setVisible(true);
	}
	  public static void main(String[] args) {  
		    new Calculator();  
		  }

}
