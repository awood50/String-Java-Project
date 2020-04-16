import java.util.*;
/**
 * This driver class calls the methods from the MyString class to use the mehtods that are contained in it and print out the results.
 * 
 * @author Andrew Wood 
 * @version 3/25/17
 */
public class Driver
{   
    public static void main(String[]args){
        MyString yes; //Creating an object from the MyString class
        int choice = 0;
        
        String sentence;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: "); //Asks for input
        yes = new MyString(input.nextLine());
        System.out.print("\nOriginal string: " + yes);
        
        while(choice !=19) //WHile loop to keep the menu appearing
        {
        System.out.println("\nEnter 19 to quit");
        System.out.println("1)length()");
		System.out.println("2)toLowerCase()");
		System.out.println("3)toUpperCase()");
		System.out.println("4)toString()");
		System.out.println("5)charAt(int index)");
		System.out.println("6)compareTo(MyString anotherMyString)");
		System.out.println("7)compareToIgnoreCase(MyString anotherMyString)");
		System.out.println("8)concat(MyString str)");
		System.out.println("9)endsWith(MyString suffix)");
		System.out.println("10)equals(Object anotherMyString)");
		System.out.println("11)equalsIgnoreCase(String anotherMyString)");
		System.out.println("12)indexOf(char ch)");
		System.out.println("13)indexOf(char ch, int fromIndex)");
		System.out.println("14)lastIndexOf(char ch)");
		System.out.println("15)replace(char oldChar, char newChar)");
		System.out.println("16)startsWithString(MyString prefix)");
		System.out.println("17)substring(int beginIndex)");
		System.out.println("18)substring(int beginIndex, int endIndex)");
		choice= input.nextInt();
        
		switch(choice) { //Switch statement calling all methods
        
		    case 1: 
		    System.out.println("\nLength: " + yes.length());
		    break;
            
		    case 2:
            System.out.println("\nLowercase: " + yes.toLowerCase());
            break;
        
            case 3:
            System.out.println("\nUppercasae: " + yes.toUpperCase());
            break;
        
            case 4:
            System.out.println("\nTo string: " + yes.toString());
            break;
            
            case 5:
            System.out.println("\nEnter an index: ");
            System.out.println("\nThat character is: " + yes.charAt(input.nextInt()));
            break;
            
            case 6:
            System.out.println("\nEnter another string: ");
            MyString anotherMyString = new MyString(input.next());
            System.out.println("\nComparison: " + yes.compareTo(anotherMyString));
            break;
            
            case 7:
            System.out.println("\nEnter another String: ");
            MyString anotherMyString1 = new MyString(input.next());
            System.out.println("\nComparison: " + yes.compareToIgnoreCase(anotherMyString1));
            break;
            
            case 8:
            System.out.print("\nEnter another string: ");
            MyString concatenation = new MyString(input.next());
            System.out.println("\nConcatenation: " + yes.concat(concatenation));
            break;
		
            case 9:
            System.out.print("\nEnter another string: ");
            MyString ends1 = new MyString(input.next());
            System.out.print("Ends with: " + yes.endsWith(ends1));
            break;
		
            case 10:
            System.out.print("\nEnter another string: ");
            MyString anotherMyString2 = new MyString(input.next());
            System.out.println("\nEquals result: " + yes.equals(anotherMyString2));
            break;
            
            case 11:
            System.out.print("\nEnter another string: ");
            MyString anotherMyString3 = new MyString(input.next());
            System.out.println("\nEquals result: " + yes.equalsIgnoreCase(anotherMyString3));
            break;
        
            case 12:
            System.out.print("Enter a character: ");
            System.out.println("Index of the character: " + yes.indexOf(input.next().charAt(0)));
            break;
            
            case 13:
            System.out.print("\nEnter a character: ");
            char the = input.next().charAt(0);
            System.out.print("\nFrom index position number: ");
            int fromIndex = input.nextInt();
            System.out.println("\nThe index of the character is " + yes.indexOf(the, fromIndex));
            break;
            
            case 14:
            System.out.print("\nEnter a character: ");
            System.out.println("\nThe last index of the character: " + yes.lastIndexOf(input.next().charAt(0)));
            break;
            
            case 15:
            System.out.println("\nEnter the character you want to replace: ");
            char replaced = input.next().charAt(0);
            System.out.print("\nEnter the chacter you want to replace it with: ");
            char replacer = input.next().charAt(0);
            System.out.println("\nYour new string: " + yes.replace(replaced, replacer).toString());
            break;
            
            case 16:
            System.out.print("\nEnter a prefix: ");
            MyString prefix = new MyString(input.next());
            System.out.println("\nYour result: " + yes.startsWithString(prefix));
            break;
   
            case 17:
            System.out.println("\nEnter beginning index: ");
            System.out.println("\nYour new substring: " + yes.substring(input.nextInt()).toString());
            break;
            
            case 18:
            System.out.println("Enter beginning index: ");
            int first = input.nextInt();
            System.out.println("Enter ending index: ");
            int last = input.nextInt();
            System.out.println("Your new substring: " + yes.substring(first, last).toString());
            break;
            
            case 19:
            System.out.println("Thanks, bye");
        
      }
    }
    
    } 
}
