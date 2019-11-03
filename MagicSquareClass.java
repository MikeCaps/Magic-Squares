package magicSquarePackage;
import java.io.*;
import java.util.*;

public class MagicSquareClass {
	
	private int [][] magicSquare;
	private int row, column, size, standardTotal;
	
	public MagicSquareClass() {
		
	}
	
	//creates possible magic square
	//input is called in MagicSquareDemo
	public void readMatrix(Scanner input)throws IOException {
		int value;
		
		size = input.nextInt();
		
		System.out.println("The size of this square is: " + size + " x " + size);
		
		magicSquare = new int [size][size];
		
		for(row = 0; row < size; row++) {
			for(column = 0; column < size; column++) {
				value = input.nextInt();
				magicSquare[row][column] = value;
				
			}//end inner for loop
		}//end outer for loop
	}//end readMatrix()
	
	//prints matrix to standard output
	public void printSquare() {
		
		for(row = 0; row < size; row ++) {
			for(column = 0; column < size; column++) {
				System.out.print(magicSquare[row][column] + "   ");
			}//end of inner loop
			System.out.println();
		}//end of outer loop
	}//end of printSquare()
	
	/*checks column 0 and assigns the sum of all entries to standardTotal.
	standardTotal is the value that will be compared to the sums of the other
	rows, columns and diagonals to determine if array is a magic square
	*/
	public void findStandardTotal() {
		int total = 0;
		for(row = 0; row < size; row++) {
			total = total + magicSquare[row][0];
			standardTotal = total;
		}
		
		System.out.println("Standard Total: " + standardTotal);
		
	}//end of findStandardTotal()
	
	public void printStandardTotal() {
		System.out.println("Standard Total: " + standardTotal);
	
	}//end of printStandardTotal()
	
	//checks sum of all rows and makes sure it matches standard total
	public boolean sumRows() {
		int sum = 0;
		boolean rowAnswer = true;
		
		while(rowAnswer == true && row < size) {
			for (column = 0; column < size; column++) {
				sum = sum + magicSquare[row][column];
			}//end for
			
			if(sum != standardTotal) 
				rowAnswer = false;
		}//end while
		
		//System.out.println(sum + " " + rowAnswer); //debug
		return rowAnswer;
		
	}//end of sumRows()
	
	//sums all columns and checks against standardTotal
	public boolean sumColumns() {
		int sum = 0;
		boolean columnAnswer = true;
		
		while(columnAnswer == true && column < size) {
			for (row = 0; row < size; row++) {
				sum = sum + magicSquare[row][column];
			}//end for
			
			if(sum != standardTotal) 
				columnAnswer = false;
		}//end while
		
		//System.out.println(sum + " " + columnAnswer); //debug
		return columnAnswer;
		
	}//end of sumColumns()
	
	/**At this point it should be noted that I chose to handle the diagonal
	 * and the off-diagonal with two separate methods. I felt that this was
	 * easier because of both the difference in how you calculate the indices
	 * of the diagonal vs. the off-diagonal, and just to make the methods shorter
	 * and more concise. I chose to use i and j as my int varible names. While not
	 * very specific, they were easy to work with due to my familiarity w/ matrices. 
	 * */
	
	//sums the diagonal entries and checks vs standardTotal
	public boolean sumDiagonal() {
		int sum, i, j;
		boolean diagonalAnswer = true;
		sum = 0;
		
		//first for loop checks the diagonal
		for(i = 0; i < size; i++) {
			sum = sum + magicSquare[i][i];
		}
		
		if(sum != standardTotal)
			diagonalAnswer = false;
		
		//System.out.println(sum + " " + diagonalAnswer); //debug
		return diagonalAnswer;
		
	}// end of sumDiagonal()
	
	public boolean sumOffDiagonal() {
		int sum, i, j;
		boolean offDiagonalAnswer = true;
		sum = 0;
		
		for(i = 0; i < size; i++) {
			sum = sum + magicSquare[size - 1 - i][i];
		}
		
		if(sum != standardTotal)
			offDiagonalAnswer = false;
		
		//System.out.println(sum + " " + offDiagonalAnswer); //debug
		return offDiagonalAnswer;
		
	}//end of sumOffDiagonal()
	
	/** I also chose to create a method to check if a given array was
	 * a magic square, as opposed to using nested if statements in the demo class.
	 * It seemed more efficient to have a method to check, rather than have to
	 * write the if statements several times in the demo class for each square */
	
	//checks to see if a given array is a magic square
	public void isItMagic() {
		if(this.sumRows() && this.sumColumns() && this.sumDiagonal()
				&& this.sumOffDiagonal()) {
			System.out.println("THIS IS A MAGIC SQUARE DUDE!");
		}
		else {
			System.out.println("This is NOT a magic square :(");
		}
			
	}//end of isItMagic()

}//end of MagicSquareClass
