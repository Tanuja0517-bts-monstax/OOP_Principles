package file_Pgm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadAlphaNumData {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the data:");
		String str=sc.nextLine();
		
		//File creation
		File f=new File("E:/Jmeter_projects/ExcelSheets/JavaFies/AlphaNumaricData.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		else
			System.out.println("File already exist");
		
		//Writing in file
		FileOutputStream fos=new FileOutputStream(f);
		fos.write(str.getBytes());
		
		//Reading from file
		FileInputStream fis=new FileInputStream(f);
		int data=fis.read();
		
		while(data!=-1) {
			System.out.print((char)data);
			data=fis.read();
		}
	}
}
