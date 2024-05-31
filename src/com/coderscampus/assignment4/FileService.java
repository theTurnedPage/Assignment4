package com.coderscampus.assignment4;

import java.io.File;
import java.io.IOException;

public interface FileService {

	//file name as variable, referenced later
	File standardFile = new File ("student-master-list.csv");
	File compsciFile = new File ("course1.csv");
	File apmthFile = new File ("course2.csv");
	File statFile = new File ("course3.csv");
	
	//Methods for contract
	String[] readLine (File file) throws IOException;	
	void createCsv(String[] someArray, String filePath) throws IOException;
	//void writeLine(File file, String line) throws IOException;
}
