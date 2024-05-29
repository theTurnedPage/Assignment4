package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EnrollmentApplication {

	public static void main(String[] args) {
		
		try {
			appStart();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	public static void appStart() throws IOException {
		//read file
		FileServiceImpl file = new FileServiceImpl();		
		file.readLine(new File(file.standardFileName));
		System.out.println("appStart file output: " + file.toString());
		
		ArrayServiceImpl array = new ArrayServiceImpl();
		array.fillStudentArray();
		System.out.println("appStart array output: " + array.toString());
		
		
		
		
		//populate array
		//StudentRecord enrollRecord = new StudentRecord(null, null, null, null);
		
		//trim the first record, since the header is not important
		//or keep the header, and work starting at index 1, then
		//hardcode the header into index 0
		
		//sort the arrays by Course
		
		//split into 3 arrays by Course
		
		//sort each array descending order by Course Grade
		
		//copy each array into 3 separate files		
		//file.writeLine(new File(file.standardFileName), "test");
		
		
	}
	
	

}
