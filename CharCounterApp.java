/*
 *CharCounterApp.java
 *author E. Krasovski
 *28/03/24
 */

 import javax.swing.JOptionPane;

 public class CharCounterApp{
	 public static void main(String args[]){
		 //declare variables
		 int vowels, spaces, numbers;
		 String sentence;

		 //declare and create objects
		 CharCounter myCounter = new CharCounter();

		 //input
		 sentence = JOptionPane.showInputDialog(null, "enter a sentence");
		 myCounter.setSentence(sentence);

		 //process
		 myCounter.compute();

		 //output
		 vowels = myCounter.getVowels();
		 spaces = myCounter.getSpaces();
		 numbers = myCounter.getNumbers();

		 JOptionPane.showMessageDialog(null, "the sentence contains " + vowels + " vowels " + spaces + " spaces and " + numbers + " numbers");




	 }
 }
