import java.io.*;
import java.util.Scanner;

public class RussiaFinder {
	int count=0;
	String fileWithRussia;
	
	RussiaFinder() {
		fileWithRussia=" ";
	}

boolean findRussia(String currentLine) {
	currentLine.toLowerCase();
	
	if (currentLine.contains("russia")) {
		return true;
	}
	else {
		return false;
	}

}

int countRussia() {
count=count+1;
	return count;
}

void read(String filetoRead) {
	System.out.println("ready to read:"+ filetoRead);
	try {
		FileReader myfileReader=new FileReader(filetoRead);
		BufferedReader myBufferReader= new BufferedReader(myfileReader);
		String line=null;
		while ((line=myBufferReader.readLine())!=null) {
			if (findRussia(line)==true) {
				countRussia();
			}
		}
		
	}
catch (Exception ex)
	{
	System.out.println("Can't read your file");
	
}
}

}
