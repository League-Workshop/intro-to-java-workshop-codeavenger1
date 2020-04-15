package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	
	System.out.println(" hey! ");
	
	JOptionPane.showMessageDialog(null, "HEY!");
	
	String name = JOptionPane.showInputDialog("What is your name?");
	
	JOptionPane.showMessageDialog(null, "Hello " + name + "!");
	
}
}
