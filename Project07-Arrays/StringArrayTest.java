// Created by Kristie Nguyen on 10/18/2014.
// StringArrayTest - main class to test StringArray class.

public class StringArrayTest 
{
	public static void main( String[] args )
	{
		final int ARRAY_LENGTH = 4;
		String[] stringArray = new String[ ARRAY_LENGTH ];
		
		StringArray myStringArray = new StringArray( suits );
		myStringArray.setArray();
		myStringArray.displayArray();
	}
}