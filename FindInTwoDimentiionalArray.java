package CorePractice;

import java.util.Scanner;

public class FindInTwoDimentiionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of rows :- ");
		int rows = sc.nextInt();
		System.out.print("Enter size of column :- ");
		int column = sc.nextInt();

		int number[][] = new int[rows][column];

		System.out.println("Give the input :- ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				number[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter number you want to find :- ");
		int x = sc.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				if (number[i][j] == x) {
					System.out.println( x+ " found at location (" + i + ", " + j + ")");
					break;
				}
			}
		}
	}
}