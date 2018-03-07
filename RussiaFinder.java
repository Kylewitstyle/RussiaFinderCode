import java.io.*;
import java.util.Scanner;
public class RussiaFinder {
	Scanner input = new Scanner(System.in);
	
//I set each count initially to negative one because my code was starting from 1 rather than zero because of the program.
	int count1=-1;
	int count2=-1;
	int count3=-1;
	String fileWithRussia;
	String searchWord;
	String input1;
	String input2;
	String input3;

	RussiaFinder() {
		fileWithRussia=" ";
	}

boolean findRussia(String currentLine) {
	currentLine.toLowerCase();
	
	if (currentLine.contains(searchWord)) {
		return true;
	}
	else {
		return false;
	}

}

int countWordOne() {
count1=count1+1;
	return count1;
}

int countWordTwo() {
count2=count2+1;
	return count2;
}

int countWordThree() {
count3=count3+1;
	return count3;
}

void read(String filetoRead) {
	
	System.out.println("Please enter the first word that you would like to search in all lower case");
	input1=input.nextLine();
	
	System.out.println("Please enter the second word that you would like to search in all lower case");
	input2=input.nextLine();
	
	System.out.println("Please enter the third word that you would like to search in all lower case");
	input3=input.nextLine();

	try {
		FileReader myfileReader=new FileReader(filetoRead);
		BufferedReader myBufferReader= new BufferedReader(myfileReader);
		String line=null;
		while ((line=myBufferReader.readLine())!=null) {
			searchWord=input1;
			if (findRussia(line)==true) {
				countWordOne();
			}
			
			searchWord=input2;
			if (findRussia(line)==true) {
				countWordTwo();
			}
			
			searchWord=input3;
			if (findRussia(line)==true) {
				countWordThree();
			}

		}
	System.out.println(input1 + " was said " + countWordOne() + " times");
	System.out.println(input2 + " was said " + countWordTwo() + " times");
	System.out.println(input3 + " was said " + countWordThree() + " times");
	}
catch (Exception ex)
	{
	System.out.println("Can't read your file");
	
}
}
}
