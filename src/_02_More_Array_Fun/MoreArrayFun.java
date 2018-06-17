package _02_More_Array_Fun;

import java.util.Random;
import java.util.Stack;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	static int limit = 0;
	
	public static void main(String[] args) {
		
		String[] testArray = {"Hi", "Java", "Christian Minecraft Server", "heck", "This is a string", "Robby is a really thicc boi", "succ", "zucc", 
				"n0 sw3aringg", "free robux", "shrek is the best anime", "dab on hatorz", "download some free ram", "Naruto", "here come dat boi"};
		
		printArrInRandomOrder(testArray);
		
		
		
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	private static void printStringArr(String[] s) 
	{
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + "\n");
		}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	public static void printStringArrBackwards(String[] s) 
	{
		Stack<String> reverserStack = new Stack<String>();
		for (int i = 0; i < s.length; i++) {
			reverserStack.push(s[i]);
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(reverserStack.pop() + "\n");
		}
		
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	public static void printOtherStringArr(String[] s) 
	{
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + "\n");
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	public static void printArrInRandomOrder(String[] s) 
	{
		
		int randomIndex = new Random().nextInt(s.length);
		
		String[] newArray = new String[s.length];
		
		int[] alreadyPrinted = new int[newArray.length];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = "0";
			alreadyPrinted[i] = -1;
		}
		
		String randomWord = s[randomIndex];

		newArray[0] = randomWord;
	
		for (int i = 0; i < newArray.length; i++) {
			if(s[i].equals(randomWord)) {
				alreadyPrinted[0] = i;
			}
		}
		
		for (int i = 1; i < s.length; i++) {
			
			randomIndex = new Random().nextInt(s.length-1);
		
			if(alreadyPrinted[i] == i) {
				i--;
			}else {
				alreadyPrinted[i] = i;
				newArray[i] = s[i];
			}
			
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
	}
}

