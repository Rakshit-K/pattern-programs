package jackSparrowPattern;

import java.util.Scanner;

public class jackSparrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns");
		int columns = scanner.nextInt();
		System.out.println("jack sparrow pattern using java");
		int n = rows - 62;
		int m = columns - 62;
		if (rows < 62 || columns < 62) {
			System.out.println("Number of rows and columns must be more than 62");
			System.exit(0);
		} else {

			for (int i = -n / 2; i <= 62 + n / 2; i++) {
				for (int j = -1 - m / 2; j <= 62 + m / 2; j++) {

					if (i == -1 && j >= -1 && j <= 62 || i == 62 && j >= -1 && j <= 62 || j == -1 && i > -1 && i < 62 || j == 62 && i > -1 && i < 62 || i == 1 && j >= 16 && j <= 37 || i == 2 && j >= 15 && j <= 21 || i == 2 && j >= 29 && j <= 39 || i == 3 && j >= 14 && j <= 18 || i == 3 && j >= 32 && j <= 41 || i == 4 && j >= 12 && j <= 14 || i == 4 && j >= 16 && j <= 17 || i == 4 && j >= 31 && j <= 33 || i == 4 && j >= 36 && j <= 42 || i == 5 && j >= 11 && j <= 14 || i == 5 && j == 16 || i == 5 && j >= 33 && j <= 34 || i == 5 && j >= 38 && j <= 43 || i == 6 && j >= 10 && j <= 13 || i == 6 && j >= 15 && j <= 16 || i == 6 && j >= 28 && j <= 34 || i == 6 && j >= 37 && j <= 38 || i == 6 && j >= 40 && j <= 44 || i == 7 && j >= 9 && j <= 13 || i == 7 && j >= 15 && j <= 16 || i == 7 && j >= 26 && j <= 29 || i == 7 && j >= 31 && j <= 36 || i == 7 && j >= 37 && j <= 38 || i == 7 && j >= 41 && j <= 44 || i == 8 && j >= 9 && j <= 16 || i == 8 && j >= 32 && j <= 45 || i == 9 && j >= 9 && j <= 11 || i == 9 && j >= 13 && j <= 15 || i == 9 && j >= 36 && j <= 46 || i == 10 && j >= 9 && j <= 11 || i == 10 && j >= 13 && j <= 16 || i == 10 && j >= 37 && j <= 46 || i == 11 && j >= 8 && j <= 10 || i == 11 && j >= 13 && j <= 14 || i == 11 && j >= 39 && j <= 46 || i == 12 && j >= 8 && j <= 10 || i == 12 && j >= 13 && j <= 14 || i == 12 && j >= 34 && j <= 47 || i == 13 && j >= 8 && j <= 10 || i == 13 && j >= 12 && j <= 15 || i == 13 && j >= 33 && j <= 48 || i == 14 && j >= 8 && j <= 14 || i == 14 && j >= 27 && j <= 31 || i == 14 && j >= 35 && j <= 48 || i == 15 && j >= 8 && j <= 14 || i == 15 && j >= 24 && j <= 34 || i == 15 && j >= 39 && j <= 49 || i == 16 && j >= 8 && j <= 11 || i == 16 && j >= 13 && j <= 15 || i == 16 && j >= 22 && j <= 25 || i == 16 && j >= 28 && j <= 38 || i == 16 && j >= 42 && j <= 49 || i == 17 && j >= 7 && j <= 11 || i == 17 && j >= 14 && j <= 17 || i == 17 && j >= 37 && j <= 49 || i == 18 && j >= 7 && j <= 16 || i == 18 && j >= 35 && j <= 49 || i == 19 && j >= 7 && j <= 11 || i == 19 && j >= 13 && j <= 19 || i == 19 && j >= 40 && j <= 41 || i == 19 && j >= 45 && j <= 49 || i == 20 && j >= 7 && j <= 11 || i == 20 && j >= 13 && j <= 18 || i == 20 && j >= 37 && j <= 49 || i == 21 && j >= 7 && j <= 9 || i == 21 && j >= 14 && j <= 20 || i == 21 && j >= 35 && j <= 38 || i == 21 && j == 11 || i == 21 && j >= 44 && j <= 49 || i == 22 && j >= 7 && j <= 9 || i == 22 && j >= 11 && j <= 12 || i == 22 && j >= 14 && j <= 19 || i == 22 && j >= 32 && j <= 49 || i == 23 && j >= 7 && j <= 8 || i == 23 && j >= 10 && j <= 15 || i == 23 && j >= 39 && j <= 50 || i == 24 && j >= 7 && j <= 8 || i == 24 && j >= 10 && j <= 12 || i == 24 && j >= 29 && j <= 50 || i == 25 && j >= 7 && j <= 8 || i == 25 && j >= 11 && j <= 12 || i == 25 && j >= 14 && j <= 15 || i == 25 && j >= 23 && j <= 31 || i == 25 && j >= 36 && j <= 50 || i == 26 && j >= 7 && j <= 9 || i == 26 && j >= 11 && j <= 14 || i == 26 && j >= 18 && j <= 20 || i == 26 && j >= 25 && j <= 28 || i == 26 && j >= 32 && j <= 33 || i == 26 && j >= 35 && j <= 39 || i == 26 && j >= 42 && j <= 50 || i == 27 && j >= 7 && j <= 9 || i == 27 && j >= 11 && j <= 18 || i == 27 && j >= 23 && j <= 50 || i == 28 && j >= 7 && j <= 8 || i == 28 && j >= 12 && j <= 19 || i == 28 && j >= 23 && j <= 30 || i == 28 && j == 38 || i == 28 && j >= 32 && j <= 36 || i == 28 && j >= 40 && j <= 51 || i == 29 && j == 11 || i == 29 && j == 13 || i == 29 && j == 37 || i == 29 && j >= 6 && j <= 8 || i == 29 && j >= 16 && j <= 19 || i == 29 && j >= 23 && j <= 27 || i == 29 && j >= 29 && j <= 32 || i == 29 && j >= 34 && j <= 35 || i == 29 && j >= 39 && j <= 46 || i == 29 && j >= 48 && j <= 51 || i == 30 && j >= 6 && j <= 8 || i == 30 && j >= 10 && j <= 11 || i == 30 && j >= 13 && j <= 17 || i == 30 && j >= 19 && j <= 20 || i == 30 && j >= 24 && j <= 28 || i == 30 && j >= 30 && j <= 31 || i == 30 && j >= 33 && j <= 34 || i == 30 && j >= 37 && j <= 46 || i == 30 && j >= 49 && j <= 52 || i == 31 && j == 15 || i == 31 && j == 24 || i == 31 && j >= 6 && j <= 8 || i == 31 && j >= 10 && j <= 13 || i == 31 && j >= 17 && j <= 20 || i == 31 && j >= 27 && j <= 32 || i == 31 && j >= 37 && j <= 47 || i == 31 && j >= 49 && j <= 52 || i == 32 && j == 20 || i == 32 && j >= 6 && j <= 8 || i == 32 && j >= 11 && j <= 13 || i == 32 && j >= 15 && j <= 18 || i == 32 && j >= 24 && j <= 25 || i == 32 && j >= 37 && j <= 43 || i == 32 && j >= 45 && j <= 52 || i == 33 && j >= 6 && j <= 9 || i == 33 && j >= 11 && j <= 13 || i == 33 && j >= 16 && j <= 18 || i == 33 && j >= 38 && j <= 45 || i == 33 && j >= 47 && j <= 51 || i == 33 && j == 20 || i == 33 && j == 25 || i == 34 && j >= 5 && j <= 10 || i == 34 && j >= 12 && j <= 13 || i == 34 && j >= 25 && j <= 26 || i == 34 && j >= 37 && j <= 46 || i == 34 && j >= 49 && j <= 51 || i == 35 && j >= 7 && j <= 9 || i == 35 && j >= 26 && j <= 29 || i == 35 && j >= 37 && j <= 48 || i == 35 && j >= 50 && j <= 52 || i == 35 && j == 5 || i == 35 && j == 11 || i == 35 && j == 13 || i == 36 && j >= 7 && j <= 8 || i == 36 && j >= 10 && j <= 12 || i == 36 && j == 5 || i == 36 && j >= 27 && j <= 28 || i == 36 && j >= 37 && j <= 46 || i == 36 && j >= 49 && j <= 53 || i == 36 && j == 21 || i == 36 && j == 25 || i == 37 && j >= 7 && j <= 8 || i == 37 && j >= 10 && j <= 12 || i == 37 && j >= 27 && j <= 28 || i == 37 && j == 5 || i == 37 && j == 14 || i == 37 && j == 25 || i == 37 && j >= 36 && j <= 47 || i == 37 && j >= 50 && j <= 53 || i == 38 && j >= 6 && j <= 7 || i == 38 && j >= 13 && j <= 14 || i == 38 && j >= 28 && j <= 29 || i == 38 && j == 9 || i == 38 && j == 11 || i == 38 && j >= 36 && j <= 40 || i == 38 && j >= 42 && j <= 54 || i == 39 && j >= 5 && j <= 6 || i == 39 && j >= 9 && j <= 10 || i == 39 && j >= 13 && j <= 15 || i == 39 && j >= 21 && j <= 22 || i == 39 && j >= 24 && j <= 29 || i == 39 && j >= 37 && j <= 41 || i == 39 && j >= 43 && j <= 54 || i == 40 && j >= 8 && j <= 10 || i == 40 && j >= 13 && j <= 15 || i == 40 && j == 5 || i == 40 && j >= 23 && j <= 28 || i == 40 && j >= 36 && j <= 41 || i == 40 && j >= 43 && j <= 47 || i == 40 && j >= 49 && j <= 54 || i == 41 && j >= 4 && j <= 5 || i == 41 && j >= 7 && j <= 10 || i == 41 && j >= 13 && j <= 16 || i == 41 && j >= 24 && j <= 27 || i == 41 && j >= 35 && j <= 48 || i == 41 && j >= 51 && j <= 54 || i == 42 && j >= 4 && j <= 5 || i == 42 && j >= 7 && j <= 10 || i == 42 && j >= 12 && j <= 16 || i == 42 && j >= 22 && j <= 24 || i == 42 && j >= 26 && j <= 29 || i == 42 && j >= 35 && j <= 40 || i == 42 && j >= 43 && j <= 49 || i == 42 && j >= 51 && j <= 54 || i == 43 && j >= 6 && j <= 10 || i == 43 && j == 4 || i == 43 && j >= 12 && j <= 17 || i == 43 && j >= 22 && j <= 23 || i == 43 && j >= 27 && j <= 30 || i == 43 && j >= 34 && j <= 40 || i == 43 && j >= 42 && j <= 46 || i == 43 && j >= 48 && j <= 54 || i == 44 && j >= 3 && j <= 4 || i == 44 && j >= 6 && j <= 10 || i == 44 && j >= 12 && j <= 18 || i == 44 && j >= 21 && j <= 22 || i == 44 && j >= 25 && j <= 26 || i == 44 && j >= 28 && j <= 32 || i == 44 && j >= 35 && j <= 47 || i == 44 && j >= 49 && j <= 55 || i == 45 && j == 3 || i == 45 && j >= 5 && j <= 11 || i == 45 && j >= 13 && j <= 18 || i == 45 && j >= 20 && j <= 47 || i == 45 && j >= 51 && j <= 55 || i == 46 && j == 3 || i == 46 && j == 55 || i == 46 && j >= 5 && j <= 11 || i == 46 && j >= 13 && j <= 23 || i == 46 && j >= 27 && j <= 28 || i == 46 && j >= 30 && j <= 39 || i == 46 && j >= 42 && j <= 49 || i == 46 && j >= 52 && j <= 53 || i == 47 && j >= 6 && j <= 10 || i == 47 && j >= 12 && j <= 22 || i == 47 && j >= 29 && j <= 39 || i == 47 && j >= 41 && j <= 50 || i == 47 && j >= 52 && j <= 54 || i == 47 && j == 4 || i == 47 && j == 56 || i == 48 && j >= 4 && j <= 10 || i == 48 && j >= 12 && j <= 19 || i == 48 && j >= 21 && j <= 22 || i == 48 && j >= 26 && j <= 27 || i == 48 && j >= 33 && j <= 55 || i == 48 && j == 57 || i == 49 && j >= 5 && j <= 11 || i == 49 && j >= 13 && j <= 20 || i == 49 && j >= 22 && j <= 23 || i == 49 && j >= 25 && j <= 27 || i == 49 && j >= 29 && j <= 30 || i == 49 && j >= 32 && j <= 39 || i == 49 && j >= 42 && j <= 57 || i == 50 && j >= 4 && j <= 11 || i == 50 && j >= 13 && j <= 21 || i == 50 && j >= 26 && j <= 27 || i == 50 && j >= 32 && j <= 39 || i == 50 && j >= 41 && j <= 56 || i == 50 && j == 23 || i == 50 && j == 30 || i == 51 && j >= 4 && j <= 7 || i == 51 && j >= 9 && j <= 21 || i == 51 && j >= 32 && j <= 38 || i == 51 && j >= 41 && j <= 45 || i == 51 && j >= 47 && j <= 57 || i == 52 && j >= 4 && j <= 7 || i == 52 && j >= 9 && j <= 11 || i == 52 && j >= 13 && j <= 22 || i == 52 && j >= 31 && j <= 38 || i == 52 && j >= 40 && j <= 44 || i == 52 && j >= 46 && j <= 59 || i == 53 && j >= 3 && j <= 6 || i == 53 && j >= 9 && j <= 11 || i == 53 && j >= 14 && j <= 23 || i == 53 && j >= 28 && j <= 60 || i == 53 && j == 25 || i == 54 && j >= 2 && j <= 3 || i == 54 && j >= 5 && j <= 6 || i == 54 && j >= 9 && j <= 11 || i == 54 && j >= 13 && j <= 25 || i == 54 && j >= 27 && j <= 42 || i == 54 && j >= 44 && j <= 59 || i == 55 && j >= 4 && j <= 6 || i == 55 && j >= 8 && j <= 12 || i == 55 && j >= 14 && j <= 24 || i == 55 && j >= 26 && j <= 38 || i == 55 && j >= 40 && j <= 41 || i == 55 && j >= 43 && j <= 59 || i == 56 && j >= 4 && j <= 12 || i == 56 && j >= 15 && j <= 24 || i == 56 && j >= 28 && j <= 29 || i == 56 && j >= 31 && j <= 37 || i == 56 && j >= 40 && j <= 60 || i == 56 && j == 26 || i == 57 && j >= 3 && j <= 10 || i == 57 && j >= 12 && j <= 13 || i == 57 && j >= 15 && j <= 25 || i == 57 && j >= 27 && j <= 28 || i == 57 && j >= 33 && j <= 37 || i == 57 && j >= 39 && j <= 60 || i == 57 && j == 31 || i == 58 && j >= 2 && j <= 10 || i == 58 && j >= 12 && j <= 13 || i == 58 && j >= 15 && j <= 25 || i == 58 && j >= 27 && j <= 28 || i == 58 && j >= 33 && j <= 38 || i == 58 && j >= 40 && j <= 45 || i == 58 && j >= 48 && j <= 57 || i == 58 && j == 60 || i == 59 && j >= 1 && j <= 2 || i == 59 && j >= 5 && j <= 12 || i == 59 && j >= 15 && j <= 25 || i == 59 && j >= 27 && j <= 28 || i == 59 && j >= 33 && j <= 36 || i == 59 && j >= 40 && j <= 42 || i == 59 && j >= 46 && j <= 54 || i == 59 && j >= 56 && j <= 57 || i == 59 && j >= 59 && j <= 60 || i == 60 && j >= 1 && j <= 2 || i == 60 && j >= 4 && j <= 7 || i == 60 && j >= 9 && j <= 12 || i == 60 && j >= 16 && j <= 21 || i == 60 && j >= 23 && j <= 24 || i == 60 && j >= 33 && j <= 36 || i == 60 && j >= 38 && j <= 41 || i == 60 && j >= 45 && j <= 55 || i == 60 && j >= 58 && j <= 59 || i == 60 && j == 27) {
						try {
								System.out.print("  ");
								Thread.sleep(20);							
						} catch (Exception e) {}
					} else if (i < -1 || j < -1 || i > 62 || j > 62) {
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
