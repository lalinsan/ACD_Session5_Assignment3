/*
 * Student: Eduardo Aguirre
 * Session 5
 * Assignment 3
 * Java Programs that Handle ArrayIndexOutOfBounds Exception. For example if array is having only 5 elements and
 * we are trying to display 7th element then it should throw exception.
 * 
 */

public class ExceptionHandling {

	public static void main(String[] args) { //Main Method to run the Program
		
		try //Try code below
		{
			int a[] =new int[5];
			a[0]=1;
			a[1]=2;
			a[2]=3;
			a[3]=4;
			a[4]=5;
			a[7]=10;	
		}
		
		catch (ArrayIndexOutOfBoundsException e) //Catch unexpected exception
		{
			System.out.println("Array Out of Bounds"); //Displays error message when the Array Exception Out of Bonds is caught
		}	
	}
}
