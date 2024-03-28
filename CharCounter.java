/*
 *CharCounter.java
 *author E. Krasovski
 *28/03/24
 */

 public class CharCounter{
	 private int vowels;
	 private int spaces;
	 private int numbers;
	 private String sentence;

	 public CharCounter(){
		 vowels = 0;
		 spaces = 0;
		 numbers = 0;
		 sentence = "";
	 }

	 public void setSentence(String sentence){
		 this.sentence = sentence;
	 }

	 public void compute(){
		 sentence = sentence.toLowerCase();
		 for (int i = 0; i < sentence.length(); i++){
			 char charac = sentence.charAt(i);
			 if (charac == 'a' || charac == 'e' || charac == 'i' || charac == 'o' || charac == 'u'){
				 vowels = vowels + 1;
			 }
			 else if (Character.isDigit(charac)){
				 numbers = numbers + 1;
			 }
			 else if (charac == ' '){
				 spaces = spaces + 1;
			 }
		 }
	 }

	 public int getVowels(){
		 return vowels;
	 }
	 public int getSpaces(){
		 return spaces;
	 }
	 public int getNumbers(){
		 return numbers;
	 }
 }




