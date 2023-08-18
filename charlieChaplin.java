package charlieChaplinPattern;

import java.util.Scanner;

public class charlieChaplin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter no of columns");
		int columns = scanner.nextInt();
		System.out.println("Charlie chaplin pattern using java");
		int n = rows - 36;
		int m = columns - 36;
		if (rows < 36 || columns < 36) {
			System.out.println("Number of rows and columns must be more than 36");
			System.exit(0);
		} else {

			for (int i = -n / 2; i <= 36 + n / 2; i++) {
				for (int j = -1 - m / 2; j <= 36 + m / 2; j++) {

					if (i == -1 && j >= -1 && j <= 36 || i == 36 && j >= -1 && j <= 36 || j == -1 && i > -1 && i < 36 || j == 36 && i > -1 && i < 36 || i == 1 && j >= 6 && j <= 18 || i == 2 && j >= 6 && j <= 19 || i == 3 && j >= 5 && j <= 19 || i == 4 && j >= 5 && j <= 20 || i == 5 && j >= 4 && j <= 20 || i == 6 && j >= 4 && j <= 20 || i == 7 && j >= 4 && j <= 20 || i == 8 && j >= 4 && j <= 20 || i == 9 && j >= 4 && j <= 20 || i == 10 && j >= 4 && j <= 20 || i == 11 && j >= 1 && j <= 4 || i == 11 && j >= 7 && j <= 12 || i == 11 && j >= 22 && j <= 23 || i == 12 && j >= 1 && j <= 8 || i == 12 && j >= 12 && j <= 14 || i == 12 && j >= 22 && j <= 24 || i == 13 && j >= 1 && j <= 11 || i == 13 && j >= 21 && j <= 24 || i == 14 && j >= 2 && j <= 24 || i == 15 && j >= 2 && j <= 18 || i == 15 && j >= 20 && j <= 23 || i == 16 && j >= 3 && j <= 14 || i == 16 && j == 22 || i == 17 && j >= 2 && j <= 8 || i == 17 && j == 22 || i == 18 && j >= 3 && j <= 8 || i == 19 && j >= 3 && j <= 4 || i == 19 && j >= 6 && j <= 7 || i == 19 && j >= 10 && j <= 13 || i == 19 && j >= 19 && j <= 21 || i == 20 && j >= 5 && j <= 6 || i == 20 && j >= 9 && j <= 15 || i == 20 && j >= 18 && j <= 20 || i == 21 && j >= 5 && j <= 6 || i == 21 && j >= 11 && j <= 12 || i == 21 && j >= 14 && j <= 15 || i == 21 && j == 18 || i == 21 && j == 20 || i == 22 && j >= 5 && j <= 6 || i == 23 && j == 6 || i == 24 && j == 6 || i == 25 && j == 14 || i == 25 && j == 19 || i == 26 && j >= 14 && j <= 16 || i == 26 && j == 18 || i == 27 && j == 5 || i == 27 && j >= 13 && j <= 18 || i == 28 && j >= 5 && j <= 6 || i == 28 && j == 8 || i == 28 && j >= 13 && j <= 17 || i == 29 && j >= 5 && j <= 8 || i == 29 && j == 10 || i == 29 && j >= 14 && j <= 15 || i == 30 && j >= 2 && j <= 11 || i == 31 && j >= 1 && j <= 5 || i == 31 && j >= 7 && j <= 8 || i == 31 && j >= 10 && j <= 11 || i == 32 && j >= 1 && j <= 6 || i == 32 && j >= 8 && j <= 9 || i == 32 && j >= 11 && j <= 12 || i == 32 && j >= 19 && j <= 20 || i == 33 && j >= 1 && j <= 7 || i == 33 && j >= 9 && j <= 14 || i == 33 && j >= 19 && j <= 21 || i == 34 && j >= 1 && j <= 7 || i == 34 && j == 11 || i == 34 && j >= 12 && j <= 13 || i == 34 && j >= 20 && j <= 22) {
						try {
								System.out.print("  ");
								Thread.sleep(20);
						} catch (Exception e) {}
					} else if (i < -1 || j < -1 || i > 36 || j > 36) {
						System.out.print("  ");
					} else {
						System.out.print((int)(Math.random()*(1-0+1)+0));
						System.out.print((int)(Math.random()*(1-0+1)+0));
					}
				}
				System.out.println();
			}
		}

	}

}
