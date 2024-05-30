package com.coderscampus.assignment4;

import java.io.File;
import java.io.IOException;

public interface FileService {

	//file name as variable, referenced later
	File standardFile = new File ("student-master-list.csv");
	
	//Methods for contract
	String[] readLine (File file) throws IOException;	
	void writeLine(File file, String line) throws IOException;
}
