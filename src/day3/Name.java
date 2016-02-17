package day3;

import javax.swing.JOptionPane;

public class Name {
public static void main(String[] args) {
String name = "RJ";
String age = "13";
name = JOptionPane.showInputDialog(null, "what is your name?");
JOptionPane.showMessageDialog(null, "I didn't know your name was "+name);
JOptionPane.showMessageDialog(null, "that a pretty cool name "+name);
JOptionPane.showMessageDialog(null, " My name is Robert the Robot");
age =JOptionPane.showInputDialog(null, "What is your age?");
JOptionPane.showMessageDialog(null, "My pet Dinosaur is "+age);
JOptionPane.showMessageDialog(null, "nice meeting you "+name);
}
}
