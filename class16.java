package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
public class class16 {

	public static void main(String[] args)throws IOException
	{
		int[] intArray = (int[]) Array.newInstance(int.class,3);
		Array.set(intArray, 0, 123);
		Array.set(intArray, 1, 456);
		Array.set(intArray, 2, 789);
		
		
		System.out.println("intArray[0]"+Array.get(intArray, 0));
		System.out.println("intArray[1]"+Array.get(intArray, 1));
		System.out.println("intArray[2]"+Array.get(intArray, 2));
	}
}
