import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
/*=========================================================================
 * Author:      Luis Manuel Campos
 * Course:      CSC 127B (Introduction to computer science II)
 * Assignment:  Program 6 : MazeHolder.java
 * Instructor:  L. McCann 
 * SL:          Greg
 * Due Date:    Ocotober 22nd 2015 
 *
 * Description: Polynomial implements to Quantity interface in order to carry out
 * 				it's 12 methods that are subject to testing. Other than that, this 
 * 			    program represents a polynomial in java code, and the methods operate 
 * 				accoding to logial math.
 *
 * Operation:   Part of three java classes implemented to represent a polynomial
 *=========================================================================*/

public class MazeHolder {
	// Created a new Stack to be used

	// Dimension should be (2*r) +1
	public int r, c;

	// Represents the 2D corn maze r x c;
	public char[][] cornMaze;

	// 2d array of Cells
	private Cell[][] cells;

	// Random Object used for creating the random start location
	private Random rando = new Random();

	public MazeHolder(int r, int c) {
		// Assignments
		this.r = r;
		this.c = c;
		// MazeHolder Dimensions
		r = (2 * r) + 1;
		c = (2 * c) + 1;
		cornMaze = new char[r][c];

	}

	public class ArrayStack<Cell> {
		private int maxR;
		private int maxC;
		public ArrayList<Cell> path;
		public Cell top;

		public ArrayStack(int r, int c) {
			r = maxR;
			c = maxC;
			path = new ArrayList<>();
			top = path.get(path.size() - 1);
		}

		public void push(Cell empuje) {
			path.add(empuje);
			
		}
        public Cell pop() {
			return path.get(path.size() - 1);
		}

		public  Cell peek() {
			return top;
		}

		public boolean isEmpty() {
			return path.isEmpty();
		}
		public boolean isFull(){
			return top == new Cell(maxR, maxC);
		}

		

	}

	private class Cell {
		// X and Y coordinates
		
		int x, y;
		// Array List implmented to be used to store visited cells
		
		ArrayStack nuevoStack = new ArrayStack(r, c);
		
		boolean isWall = false;
		
		boolean visited = false;

		Cell(int x, int y) {
		        this(x, y, true);
		 }
		Cell(int x, int y, boolean isWall) {
			this.x = x;
			this.y = y;
			this.isWall = isWall;
		}
		/*void addNeighbor(Cell other) {
	        if (!n.peek().contains(other)) { // avoid duplicates
	        */
	       

	}

	

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int r = keyboard.nextInt();

		int c = keyboard.nextInt();

		System.out
				.println("Please enter the dimensions of the your desired maze: "
						+ r + c);

	}

	}
