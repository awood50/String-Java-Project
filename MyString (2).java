/**
 * This class holds the methods for altering user inputted string that will appear in the driver class, holding all of the processes and information
 * 
 * @author Andrew Wood
 * @version 3/25/17
 */
public class MyString
{
   private String original; //do not use this field
   private char[ ] sequence;
   private int length;
   private String str;
    /**
     * This is the constructor method that will accept a string
     * @param start variable that holds the value of the first string
     */
    
   public MyString(String start)
    {
        original = new String(start);
        sequence = start.toCharArray( );
    }
    /**
     * This is the overloaded constructor that will accept a char array
     * @param inSequence the array that will be set equal to the character array
     */
   public MyString(char[ ] inSequence)
    {
        original = new String(inSequence);
        this.sequence = new char[inSequence.length];
        for(int k= 0; k < sequence.length; k++)
        {
            this.sequence[k] = inSequence[k];
        }
    }
   /**
    * Constructor method that accepts the string object
    * @param other used for creating the string object
    */
    public MyString(MyString other)
    {
         this.original = other.original;
         this.sequence = other.sequence;
        
    }
   /**
    * This method is used for finding a character at a specific index
    * @param index int used to hold the value of a an index
    * @return char the character at the index
    */
    public char charAt(int index)
    {
        
            return sequence[index];
        
    }
   /**
    * This method will test if two obects are the same length and will return a value depending on if the second value matches up
    * @param anotherMyString a string object that is used to compare the length
    * @return a numeric value of 1,0, or -1
    */ 
   public int compareTo(MyString anotherMyString)
    {
        int first = 0;
		int second = 0;
		char[] compare = anotherMyString.toString().toCharArray();
		
		for(int i=0; i < sequence.length; i++)
		{
			first += sequence[i];
        }
		for(int i=0; i < compare.length; i++)
		{
			second += compare[i];
        }
		
		if(first > second)
		  {
		      return 1;
          }
		else if(first < second)
		{
		      return -1;
        }
		else
		{
		      return 0;
        }
    }
    /**
     * This method compares two strings and will return a value if they are same, or unequal
     * @param anotherMyString object to hold the string
     * return a numeric value of 1,0, or -1
     */
   public int compareToIgnoreCase(MyString anotherMyString)
    {
        return this.toLowerCase().compareTo(anotherMyString.toLowerCase());
    }
    /**
     * THis method will add another string object to a string entered by the user
     * @ param str an object to hold the string
     * @return temporary the new string object after concatenation
     */
   public MyString concat(MyString str)
    {
       length = this.sequence.length + str.sequence.length;
       char [] temporary = new char [length];
       for(int i = 0; i < this.sequence.length; i++)
       {
           temporary[i] = this.sequence[i];
       }
        for(int i = 0; i < str.sequence.length; i++)
       {
           temporary[this.sequence.length+i] = str.sequence[i];
       }
        
        return new MyString (temporary);
    }
   /**
    * Checks if the original string ends with what a user will enter
    * @ param suffix the string that the program will search for
    * @return result true or false depending on whether the suffix is there
    */
    public boolean endsWith(MyString suffix)
    {
        boolean result = false;
    	
    	char[] ends1 = suffix.sequence;
    	int q = 0;
    	for(int i=sequence.length - ends1.length; i<sequence.length; i++)
    	{
    		if(sequence[i] == ends1[q])
    		{
    		    result = true;
    		}
    		
    		q++;
    	}
    	
    	return result;
    }
   /**
    * Tests if the strings are equal lengthwise
    * @param anotherMyString string object that will hold a string value
    * @return true or false value depending on the strings length
    */ 
   public boolean equals(MyString anotherMyString)
    {  
       char[] equalArray = anotherMyString.toString().toCharArray();
       int temporary1 = 0;
    	if(sequence.length == equalArray.length)
    	{
    		for(int i=0; i<sequence.length; i++)
    		{
    			if(!(sequence[i] == equalArray[i]))
    				temporary1++;
    		}
    	}
    	else
    	{
    		temporary1 = 1;
        }
    	if(temporary1>0)
    	{
    		return false;
        }
    	else
    	{
    		return true;
        }
    }
   /**
    * Tests if the two objects are equal
    * @param anotherMyString string object that will hold a string value
    * @return true or false if the objects are equal
    */ 
   public boolean equalsIgnoreCase(MyString anotherMyString)
    {
        if (this.length != anotherMyString.length)
            {
            return false;
             }
        return this.toLowerCase().equals(anotherMyString.toLowerCase());
    }
   /**
    * Finds the index of a give character
    * @param findMe value of the character
    * @return index position of the character
    */ 
   public int indexOf(char findMe)
    {
        for(int i = 0; i < sequence.length; i++)
        {
            if (sequence[i] == findMe)
                {
                    return i;
                }    
        }  
        return -1;
    }
   /**
    * Finds the index of a character based upon a given position
    * @param ch the character you are searching 
    * @param fromIndex the position of the index to start
    * @return int the position of the index
    */ 
   public int indexOf(char ch,  int fromIndex)
    {
        for(int i = fromIndex; i < sequence.length; i++)
        {
            if(sequence[i] == ch)
                {
                    return i;
                }   
        }
        return -1;
    }
   /**
    * Finds the last index of a character
    * @param ch the character you are searching for 
    * return int the last found index of the character
    */ 
   public int lastIndexOf(char ch)
    {
        int last = -1;
		
		for(int i=0; i<sequence.length; i++)
		{
			if(sequence[i]==ch)
			{
				last = i;
            }
		}
		
		return last;
    }
   /**
    * Returns the length of a string
    * @return length the length of the sequence
    */ 
   public int length( )
    {
       int length = 0;
		
		for(int i=0; i<sequence.length; i++)
		{
			length++;
        }
		return length;
    }
   /**
    * This method finds the character you search for and replaces it with a new one
    * @param oldChar the character being replaced
    * @param newChar the character you are replacing it with
    * @return the new value of the string
    */ 
   public MyString replace(char oldChar, char newChar)
    {
        
    	
    	for(int i=0; i<sequence.length; i++)
    	{
    		if(sequence[i]==oldChar)
    		{
    			sequence[i] = newChar;
            }
    	}
    	
    	
    	
		return this;
    }
   /**
    * Tests if an object ends with a certain string
    * @param prefix the string that the user is testing to see if it starts with that
    * @return true or false if the prefix is there
    */ 
   public boolean startsWithString(MyString prefix)
    {
        char start[] = prefix.toString().toCharArray();
		int temporary1 = 0;
		
		for(int i=0; i < prefix.length(); i++)
		{
			if(sequence[i] != start[i])
				temporary1++;
		}
		
		if(temporary1 > 0)
			return false;
		else
			return true;
    }
   /**
    * Method that returns the rest of an object after the provided index
    * @param beginindex integer position of the index
    * @return new string after that index
    */ 
   public MyString substring(int beginIndex)
    {
       char[]sub = new char[this.length() - beginIndex];
     
       for(int i = beginIndex;i < this.length();i ++)
       {
          sub[i - beginIndex] = this.charAt(i);
       }
       return new MyString(sub);
    
    }
   /**
    * Method that returns a string between two indexes
    * @param beginIndex the starting place
    * @param endIndex the ending place
    * @return the new string value between those indexes
    */ 
   public MyString substring(int beginIndex, int endIndex)
    {
        String sub = "";
    	
    	for(int i= beginIndex; i< endIndex; i++)
    		sub += sequence[i];
    	
    	MyString anotherMyString = new MyString(sub);
    	
		return anotherMyString;
    }
   /**
    * This method makes all letters of a string lowercase
    * @return the new string after all letters are changed
    */ 
   public MyString toLowerCase( )
    {
       String sentence1 = "";
        
        for(int i = 0; i < sequence.length; i++)
           {
            int character = sequence[i];         
            
             if(character>64 && character<91)
                {
                    character += 32;
                    sentence1 += (char) character;
                }
             else
                 sentence1 += (char) character;
           }
             
        MyString newObject = new MyString(sentence1);
        return newObject;
    }
   /**
    * This method makes all letters of a string uppercase
    * @return the new string after all letters are changed
    */ 
   public MyString toUpperCase()
    {
       String sentence1 = "";
        
        for(int i = 0; i < sequence.length; i++)
           {
            int character = sequence[i];         
            
             if(character>96 && character<123)
                {
                    character = character-32;
                    sentence1 += (char) character;
                }
             else
                 sentence1 += (char) character;
           }
             
        MyString newObject = new MyString(sentence1);
        return newObject;
    }
   /**
    * This method turns sequence into a textual representation
    * @return a textual represenation of the data
    */
    public String toString( )
    {
        return new String(sequence);
    }
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    
}
