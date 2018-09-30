import java.util.Scanner;

public class Triangles {
  public static void main(String[] args) {
 
	//triangle 1
	for (int column = 0; column <= 10; column++) {
	for (int row = 1; row <= column; row++) {
		System.out.print("*");
	}
	System.out.println();
	}	
 
	System.out.println();
 
 
	//triangle 2
	for (int column = 10; column >= 0; column--) {
	for (int row = 1; row <= column; row++) {
		System.out.print("*");
	}
	System.out.println();
	}
 
	//triangle 3
	for (int column = 0; column <= 10; column++) {
	for (int row = 1; row <= 10; row++) {	
		if(row > column) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}	
	}	
		System.out.println();
}
 
	//traingle 4
	for (int column = 10; column >= 0; column--) {
	for (int row = 1; row <= 10; row++) {	
		if(row > column) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}	
	}	
		System.out.println();
}
}
}
