package com.coderscampus.assignment4;

import java.io.File;
import java.io.IOException;

public class ArrayServiceImpl implements ArrayService{

	@Override
	public StudentRecord[] fillStudentArray() {

		String aLine = "";
		String stringArray[]= new String[100]; //101 records in csv file
		//StudentRecord[] recordsArray = null;
		
		FileServiceImpl file = new FileServiceImpl();
		int i = 0;
		
		try {
			//while (aLine != null) {
				
				while (i < stringArray.length) {
					
					aLine = file.readLine(new File(file.standardFileName)).toString();
					//aLine = file.toString();				
					stringArray[i] = aLine;
					System.out.println("filling array \n");
					System.out.println("record at: " + i + ": " + stringArray[i].toString() + "\n");
					i++;
				}
				//file.readLine(new File(file.standardFileName));
				
			//}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("appStart read output: " + file.toString());			
		
		
		
		
		return null;
	}

	@Override
	public StudentRecord[] readStudentArray() {
		//final method to call all 3 arrays and display them.
		return null;
	}

	@Override
	public StudentRecord[] splitStudentArray() {
		//split the array into 3 separate ones by 
		return null;
	}

	@Override
	public StudentRecord[] orderArray() {
		// TODO Auto-generated method stub
		return null;
	}

}
