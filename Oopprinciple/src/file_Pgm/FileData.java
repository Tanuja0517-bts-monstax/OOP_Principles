package file_Pgm;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileData {
	public static void main(String[] args) throws IOException {
		File f=new File("E:/Jmeter_projects/ExcelSheets/JavaFies/Tanuja.txt");
		if(!f.exists()) {
			f.createNewFile();
			FileOutputStream fos=new FileOutputStream(f);
			String data="I am Tanuja";
			fos.write(data.getBytes());
		}
		else {
			FileOutputStream fos=new FileOutputStream(f);
			String data="I am Tanuja";
			fos.write(data.getBytes());
		}
		
		FileInputStream fis=new FileInputStream(f);
		int num=fis.read();
		while(num!=-1)
		{
			System.out.print((char)num);
			num=fis.read();
		}
	}
}

