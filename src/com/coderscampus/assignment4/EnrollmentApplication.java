package com.coderscampus.assignment4;

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
		file.readLine((FileService.standardFile));		
		
		ArrayServiceImpl array = new ArrayServiceImpl();
		array.fillStudentArray();
		array.splitStudentArray();
		
		//for (int i = 0; i < 101; i++) {
			//System.out.println("appStart studentArray output: " + array.studentArray[i]);
			//34 COMPSCI //33 STAT  //33 APMTH											
		//}
		
		//for (int i = 0; i < array.apmthArray.length; i++) {
			//System.out.println("apmthArray at : " + i + "\n" + array.apmthArray[i]);
//			System.out.println("statArray at : " + i + "\n" + array.statArray[i]);			
		//}
		//for (int i = 0; i < array.compsciArray.length; i++) {
//			System.out.println("compsciArray at : " + i + "\n" + array.compsciArray[i]);
		//}
		
		System.out.println(array.readStudentArray(array.statArray));
		
		for (int i = 0; i < array.compsciArray.length; i++) {
			
			file.createCsv(array.compsciArray, file.compsciFile.toString());
			file.createCsv(array.apmthArray, file.apmthFile.toString());
			file.createCsv(array.statArray, file.statFile.toString());
			array.orderArray(array.compsciArray);
			array.orderArray(array.apmthArray);
			array.orderArray(array.statArray);
		}	
			
						
		//populate array -done
		//StudentRecord enrollRecord = new StudentRecord(null, null, null, null);
		
		//trim the first record, since the header is not important -nope nvm
		//or keep the header, and work starting at index 1, then -done
		//hardcode the header into index 0 -done					
		
		//split into 3 arrays by Course -done
		
		//sort each array descending order by Course Grade -done
		
		//copy each array into 3 separate files	 -done	
		//file.writeLine(new File(file.standardFileName), "test");
		
		
	}
	
	

}
