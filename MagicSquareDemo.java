package magicSquarePackage;
import java.io.*;
import java.util.*;

public class MagicSquareDemo {

	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(new FileReader("infile.txt"));
		
		//first test is the 3x3 identity matrix, which is not a magic square
		MagicSquareClass tester = new MagicSquareClass();
		tester.readMatrix(input);
		tester.printSquare();
		tester.findStandardTotal();
		tester.sumRows();
		tester.sumColumns();
		tester.sumDiagonal();
		tester.sumOffDiagonal();
		tester.isItMagic();
		System.out.println();
		
		//the rest of the testers come from the sheet that was given out
		//in class
		Scanner input2 = new Scanner(new FileReader("infile2.txt"));
		
		MagicSquareClass tester2 = new MagicSquareClass();
		tester2.readMatrix(input2);
		tester2.printSquare();
		tester2.findStandardTotal();
		tester2.sumRows();
		tester2.sumColumns();
		tester2.sumDiagonal();
		tester2.sumOffDiagonal();
		tester2.isItMagic();
		System.out.println();
		
		Scanner input3 = new Scanner(new FileReader("infile3.txt"));
		
		MagicSquareClass tester3 = new MagicSquareClass();
		tester3.readMatrix(input3);
		tester3.printSquare();
		tester3.findStandardTotal();
		tester3.sumRows();
		tester3.sumColumns();
		tester3.sumDiagonal();
		tester3.sumOffDiagonal();
		tester3.isItMagic();
		System.out.println();
		
		Scanner input4 = new Scanner(new FileReader("infile4.txt"));
		MagicSquareClass tester4 = new MagicSquareClass();
		tester4.readMatrix(input4);
		tester4.printSquare();
		tester4.findStandardTotal();
		tester4.sumRows();
		tester4.sumColumns();
		tester4.sumDiagonal();
		tester4.sumOffDiagonal();
		tester4.isItMagic();
		System.out.println();
	
	}//end of main method

}//end of MagicSquareDemo
