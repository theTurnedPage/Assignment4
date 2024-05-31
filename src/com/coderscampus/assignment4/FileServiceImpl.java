package com.coderscampus.assignment4;

import java.io.BufferedReader;
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
				//System.out.println("Inside READLINE method: record at: " + i + ": " + stringArray[i] + "\n");
				i++;
			}
			return stringArray;				
		} finally {
			if (reader != null) reader.close(); 	
			System.out.println("file read complete.");//feedback
		}

	}
	
	@Override
    public void createCsv(String[] someArray, String filePath) throws IOException {
        
		try (FileWriter writer = new FileWriter(filePath)) {
			
            for (int i = 0; i < someArray.length; i++) {
                writer.append(String.valueOf(someArray[i]));
                
                if (i < someArray.length - 1) {
                    writer.append("\n"); //add a line break
                }
            }
        }
    }

}
