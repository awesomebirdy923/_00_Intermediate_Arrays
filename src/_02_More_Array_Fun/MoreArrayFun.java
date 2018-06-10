package _02_More_Array_Fun;

import java.util.Random;
import java.util.Stack;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	static int limit = 0;
	
	public static void main(String[] args) {
		
		String[] testArray = {"Hi", "Java", "Christian Minecraft Server", "heck", "This is a string", "Robby is a really thicc boi", "succ", "zucc", 
				"n0 sw3aringg", "robux", "shrek is the best anime", "dab on hatorz"};
		
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
		
		int randomIndex = new Random().nextInt(s.length-1);
		
		String[] newArray = new String[s.length-1];
		
		String[] alreadyPrinted = new String[newArray.length];
		
		for (int i = 0; i < newArray.length; i++) {
			if(i != randomIndex) {
				newArray[i] = s[i];
				alreadyPrinted[i] = newArray[i];
			}
		}
		
		limit++;	

		if(limit != s.length) {
		printArrInRandomOrder(s);
		}
		
	}
}

