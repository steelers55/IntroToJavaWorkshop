package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		String name;
		// 1. Ask the user if they know how to write code.
name = JOptionPane.showInputDialog(null, "Do you know name?");
if (name.equalsIgnoreCase("yes")){
		JOptionPane.showMessageDialog(null, "good, you have access to the entire world, sir " );
} else{
	JOptionPane.showMessageDialog(null, "you have no access to the world, sir");
}
		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}

