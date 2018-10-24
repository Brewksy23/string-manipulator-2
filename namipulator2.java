import java.util.Scanner;

/**
 * 
 * @author Ewan Brooks
 *
 */
public class namipulator2 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name;
		name = keyboard.nextLine();
		System.out.println("Hello " + name + " and welcome to the String Manipulator.");
		System.out.println("Please click enter to continue...");
		keyboard.nextLine();
		System.out.println("Please enter any string: "); 
		
		String str = keyboard.nextLine();
		int strLength = str.length();
		System.out.print("The string is " + strLength + " characters and the first character is ");
		System.out.print(str.charAt(0));
		System.out.print(" and the last character is ");
		System.out.print(str.charAt(str.length()-1));
		
		System.out.print("\nThe first half of the string is " + str.substring(0, strLength/2));
		System.out.print("\nPlease enter a character to search for in the string: ");
		String character;
		character = keyboard.nextLine();
		System.out.print(str.indexOf(character));
		
		
		
		
		

	}

}
