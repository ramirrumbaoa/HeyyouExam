package main;

import java.util.Scanner;

public class MainClass {

	
	static Scanner scan = new Scanner(System.in);
	
	static int[][] grid;
	static int row,column;
	
	static int x1,y1;
	static String position1;
	static String direction1; 
	
	
	static int x2,y2;
	static String position2;
	static String direction2;
	
	static String NORTH = "N",
				  SOUTH = "S",
				  WEST = "W",
				  EAST = "E";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setGridSize();
		setRobotPosition1();
		setRobotCommand1();
		
		//setRobotPosition2();
		//setRobotCommand2();
	}
	
	//GridSize
	private static void setGridSize() {
		System.out.println("Enter Grid Size \n");
		row = scan.nextInt();
		column = scan.nextInt();
		System.out.println("\nGrid Size is: " + row + " x " + column + "\n");
		
		//Initialize Grid
		grid = new int[row][column];
	}
	
	//1st
	private static void setRobotPosition1() {
		System.out.println("Enter 1st Robot’s initial position:\n");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		position1 = scan.next();
		checkInputDirection(x1, y1, position1);
	}
	
	private static void  setRobotCommand1() {
		System.out.println("Enter 1st Robot’s set of commands:\n");
		direction1 = scan.next();
		checkCommand(direction1);
		System.out.println("\n1st Robot’s set of commands: "+direction1);
	}
	
	//2nd
	private static void setRobotPosition2() {
		System.out.println("Enter 2nd Robot’s initial position:\n");
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		position2 = scan.next();
		checkInputDirection(x2, y2, position1);
	}
	
	private static void  setRobotCommand2() {
		System.out.println("Enter 2nd Robot’s set of commands:\n");
		direction2 = scan.next();
		checkCommand(direction2);
		System.out.println("\n2nd Robot’s set of commands: "+direction2);
	}
	
	//TOOL
	static void checkInputDirection(int x, int y, String input) {
		switch(input) {
			case "N":
				System.out.println("\n1st Robot’s initial position: (" + x + "," + y + ") and heading " + input + " \n");
				break;
			case "S":
				System.out.println("\n1st Robot’s initial position: (" + x + "," + y + ") and heading " + input + " \n");
				break;
			case "W":
				System.out.println("\n1st Robot’s initial position: (" + x + "," + y + ") and heading " + input + " \n");
				break;
			case "E":
				System.out.println("\n1st Robot’s initial position: (" + x + "," + y + ") and heading " + input + " \n");
				break;
			default:
				System.out.println("\nIncorrect Input!! please use N,S,W,E for direction");
			
		}
	}
	
	static void checkCommand(String input) {
		char[] inputArray = input.toCharArray();
		for(char command: inputArray) {
			if(command=='L'||command=='R'||command=='M') {
				System.out.println("Command: "+command);
				//DIRECTION
				
			}
			else {
				System.out.println("Command Error: please put L,R,M");
				break;
			}
		}
		
	}
	
	
	
	
	void gridDisplay() {
//		for(int x = 0; x < row; x++) {
//		//System.out.println("row: "+x);
//		
//		grid[x][column - 1] = x;
//		
//		System.out.println(grid[x][column - 1]);
//		
//		for(int y = 0; y < column; y++) {
//			//System.out.println("column: "+y);
//			
//			grid[row - 1][y] = y;
//			
//			System.out.println(grid[row - 1][y]);
//			
//		}
//	}
	
	}
	
}
