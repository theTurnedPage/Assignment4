package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayServiceImpl implements ArrayService{
	
	public String[] studentArray = new String[101];
	
	//1 extra index for the "headers" 
	public String[] compsciArray = new String[35];
	public String[] statArray = new String[34];
	public String[] apmthArray = new String[34];
	//=========================================================
	@Override
	public String[] fillStudentArray() {

		//String aLine = "";
		String[] stringArray = new String[100]; //101 records in csv file
		//StudentRecord[] recordsArray = null;
		
		FileServiceImpl file = new FileServiceImpl();
		int i = 0;
		
		try {
				
			System.out.println("filling stringArray \n");
			stringArray = file.readLine(FileService.standardFile); 
			
					//check contents of stringArray
					while (i < stringArray.length){
						
						System.out.println("record at: " + i + ": " + stringArray[i] + "\n");
						i++;
					}
					
					System.out.println("fill studentArray");
					studentArray = stringArray;
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("appStart read output: " + file.toString());			
						
		return null;
	}
	//=========================================================
	@Override
	public String readStudentArray(String[] someArray) {
		//method to receive array and read them.
		String[] array = someArray;
		String concatString = "";
		
		for (int i = 0; i < array.length; i++) {
			concatString += someArray[i];
			concatString += " \n ";
		}					
		
		return concatString;
	}
	//=========================================================
	@Override
	public void splitStudentArray() {
		//34 COMPSCI //33 STAT  //33 APMTH
		int i = 0;		
		int k = 0; 	
		int j = 1;//start at index 1 to avoid overwriting the header assigned to index 0		
		int l = 1;
		int m = 1;
		String copyString = "";
		
		//copy the header from studentArray to the 3 other arrays
		compsciArray[0] = studentArray[0];
		statArray[0] = studentArray[0];
		apmthArray[0] = studentArray[0];
					
		//copy from studentArray
		while (i < 101) {		
			if(studentArray[i].contains("APMTH")) {
				copyString = studentArray[i];
				
				if (j < 34 && k <= i) {
					apmthArray[j] = copyString;
					j++; //counter for when we get to the split array's length
					k++; //counter for when we find contains is true
				}								
			}
			
			else if(studentArray[i].contains("STAT")){
				copyString = studentArray[i];
				
				if (l < 34 && k <= i) {
					statArray[l] = copyString;
					l++; //counter for when we get to the split array's length
					k++; //counter for when we find contains is true
				}										
			}
			
			else if (studentArray[i].contains("COMPSCI")) {
				copyString = studentArray[i];
				
				if (m < 35 && k <= i) {
					compsciArray[m] = copyString;
					m++; //counter for when we get to the split array's length
					k++; //counter for when we find contains is true
				}		
			}		
				i++;
		}						
				
	}	
	//=========================================================
	@Override
	public void orderArray(String[] someArray) {		
					
		//StudentRecord theRecords = new StudentRecord(null, null, null, null);	
		
        //Sort the array based on the last 2 characters parsed as integers
        Arrays.sort(someArray, Comparator.comparing(someString -> getIntegers(someString), Comparator.reverseOrder()));        

        //Print the sorted array
        System.out.print("Sorted array (by last integers): ");
        for (String aString : someArray) {
            System.out.print("sorted array: " + aString.concat("\n"));
        }						
	}
	//========================================================
    public static int getIntegers(String aString) {
        //get the last 2 characters from the string
        String lastTwo = aString.substring(aString.length() - 2);

        //Parse the last 2 characters as integers
        try {
            return Integer.parseInt(lastTwo);
        } catch (NumberFormatException e) {
        	System.out.println("Oops! A Number Fortmat Exception has occurred!");
            //Handle invalid input
            return 9001;//default value upon exception
        }
    }

}
