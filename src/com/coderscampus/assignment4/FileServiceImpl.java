package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileServiceImpl implements FileService{

	@Override
	public String[] readLine(File file) throws IOException {

		BufferedReader reader = null; 
		int i = 0;
			
		String aLine = "";
		String[] stringArray = new String[101];
		
		
		try {
			reader = new BufferedReader(new FileReader(FileServiceImpl.standardFile));
			System.out.println("reading from file."); //feedback
			
			while((aLine = reader.readLine()) != null) {	
												
			stringArray[i] = aLine;					
			System.out.println("Inside READLINE method: record at: " + i + ": " + stringArray[i] + "\n");
			i++;
			}
			return stringArray;				
		} finally {
			if (reader != null) reader.close(); 	
			System.out.println("file read complete.");//feedback
		}

	}
	
	//this method will receive the file and String to write into file
	@Override
	public void writeLine(File file, String line) throws IOException {
		
		BufferedWriter writer = null;
		
		try {
			System.out.println("writing to file.");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(line); //take input "line" and write it to the file
		}finally {
			if (writer == null) writer.close();
			System.out.println("file write complete.");
		}
		
	}
	/*
	public void writeLine2() throws IOException{
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("data.txt"));
			writer.write("This is a test string that will be output into a file.\n");
			writer.write("Is this line of text on a new line?");			
		} finally {
			if (writer != null) writer.close();
		}
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("data.txt"));
			System.out.println(reader.readLine());
		} finally {
			if (reader != null) reader.close();
		}
	}*/

}
