import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class HelloWorldGUI 
{
	//main
	public static void main(String[] args)
	{
		JFrame window = new JFrame("Hello World");

		window.pack();

		//set visible to true
		window.setVisible(true);

		//set default close operation so window closes when x is clicked
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
