
import java.util.Scanner;

public class shankarNag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns");
		int columns = scanner.nextInt();
		System.out.println("jack sparrow pattern using java");
		int n = rows - 65;
		int m = columns - 65;
		if (rows < 66 || columns < 66) {
			System.out.println("Number of rows and columns must be more than 66");
			System.exit(0);
		} else {

			for (int i = -n / 2; i <= 66 + n / 2; i++) {
				for (int j = -1 - m / 2; j <= 66 + m / 2; j++) {

					if (i == -1 && j >= -1 && j <= 66 || i == 66 && j >= -1 && j <= 66 || j == -1 && i > -1 && i < 66
							|| j == 66 && i > -1 && i < 66 
							
							
							|| i == 2 && j >= 25 && j <= 39 
							|| i == 3 && j >= 22 && j <= 41 
							|| i == 4 && j >= 20 && j <= 42 
							|| i == 5 && j >= 18 && j <= 44
							|| i == 6 && j >= 17 && j <= 46 
							|| i == 7 && j >= 16 && j <= 47
							|| i == 8 && j >= 15 && j <= 47 
							|| i == 9 && j >= 15 && j <= 47 
							|| i == 10 && j >= 14 && j <= 47 
							|| i == 11 && j >= 13 && j <= 48 
							|| i == 12 && j >= 12 && j <= 48 
							|| i == 13 && j >= 12 && j <= 50
							|| i == 14 && j >= 12 && j <= 51 
							|| i == 15 && j >= 11 && j <= 52 
							|| i == 16 && j >= 11 && j <= 52 
							|| i == 17 && j >= 11 && j <= 52 
							|| i == 18 && j >= 11 && j <= 52 
							|| i == 19 && j >= 10 && j <= 39 || i == 19 && j >= 45 && j <= 52
							|| i == 20 && j >= 10 && j <= 27 || i == 20 && j >= 31 && j <= 38 || i == 20 && j >= 47 && j <= 52
							|| i == 21 && j >= 10 && j <= 25 || i == 21 && j >= 31 && j <= 35 || i == 21 && j >= 48 && j <= 52
							|| i == 22 && j >= 10 && j <= 21 || i == 22 && j >= 48 && j <= 52 
							|| i == 23 && j >= 10 && j <= 20 || i == 23 && j >= 48 && j <= 52 
							|| i == 24 && j >= 10 && j <= 20 || i == 24 && j >= 48 && j <= 52 
							|| i == 25 && j >= 10 && j <= 20 || i == 25 && j >= 48 && j <= 52
							|| i == 26 && j >= 10 && j <= 20 || i == 26 && j >= 49 && j <= 52 
							|| i == 27 && j >= 10 && j <= 20 || i == 27 && j >= 49 && j <= 52 
							|| i == 28 && j >= 10 && j <= 19 || i == 28 && j >= 28 && j <= 28 
							|| i == 28 && j >= 42 && j <= 47 || i == 28 && j >= 49 && j <= 51  
							|| i == 29 && j >= 10 && j <= 19 || i == 29 && j >= 26 && j <= 32
							|| i == 29 && j >= 41 && j <= 45 || i == 29 && j >= 47 && j <= 48 || i == 29 && j >= 50 && j <= 51
							|| i == 30 && j >= 10 && j <= 18 || i == 30 && j >= 25 && j <= 25
							|| i == 30 && j >= 30 && j <= 35 || i == 30 && j >= 39 && j <= 44
							|| i == 30 && j >= 50 && j <= 51 
							|| i == 31 && j >= 11 && j <= 18 || i == 31 && j >= 26 && j <= 35
							|| i == 31 && j >= 39 && j <= 46 || i == 31 && j >= 50 && j <= 51 
							|| i == 32 && j >= 11 && j <= 17 || i == 32 && j >= 25 && j <= 30
							|| i == 32 && j >= 32 && j <= 35 || i == 32 && j >= 39 && j <= 40
							|| i == 32 && j >= 42 && j <= 44 || i == 32 && j >= 47 && j <= 47 || i == 32 && j >= 50 && j <= 51 
							|| i == 33 && j >= 11 && j <= 11 || i == 33 && j >= 14 && j <= 17
							|| i == 33 && j >= 24 && j <= 24 || i == 33 && j >= 28 && j <= 29
							|| i == 33 && j >= 32 && j <= 32 || i == 33 && j >= 34 && j <= 34
							|| i == 33 && j >= 40 && j <= 40 || i == 33 && j >= 50 && j <= 51
							|| i == 34 && j >= 11 && j <= 11 || i == 34 && j >= 14 && j <= 17
							|| i == 34 && j >= 31 && j <= 31 || i == 34 && j >= 33 && j <= 33 
							|| i == 34 && j >= 40 && j <= 40 || i == 34 && j >= 50 && j <= 51
							|| i == 35 && j >= 11 && j <= 11
							|| i == 35 && j >= 15 && j <= 16 || i == 35 && j >= 41 && j <= 41 || i == 35 && j >= 50 && j <= 50
							|| i == 36 && j >= 15 && j <= 16 || i == 36 && j >= 50 && j <= 50
							|| i == 37 && j >= 15 && j <= 16 
							|| i == 38 && j >= 16 && j <= 16 
							|| i == 39 && j >= 16 && j <= 16 
							
							|| i == 41 && j >= 35 && j <= 36 || i == 41 && j >= 44 && j <= 44
							|| i == 42 && j >= 29 && j <= 29 || i == 42 && j >= 37 && j <= 38 || i == 42 && j >= 40 && j <= 45 
							|| i == 43 && j >= 17 && j <= 17 || i == 43 && j >= 28 && j <= 29
							|| i == 43 && j >= 34 && j <= 46 
							|| i == 44 && j >= 17 && j <= 17 || i == 44 && j >= 27 && j <= 29
							|| i == 44 && j >= 32 && j <= 46 
							|| i == 45 && j >= 17 && j <= 18 || i == 45 && j >= 26 && j <= 35
							|| i == 45 && j >= 40 && j <= 46 
							|| i == 46 && j >= 17 && j <= 18 || i == 46 && j >= 21 && j <= 21
							|| i == 46 && j >= 26 && j <= 33 || i == 46 && j >= 42 && j <= 46 || i == 46 && j >= 49 && j <= 49
							|| i == 47 && j >= 17 && j <= 19 || i == 47 && j >= 21 && j <= 22
							|| i == 47 && j >= 26 && j <= 32 || i == 47 && j >= 41 && j <= 43
							|| i == 47 && j >= 45 && j <= 46 || i == 47 && j >= 48 && j <= 49
							|| i == 48 && j >= 17 && j <= 22 || i == 48 && j >= 27 && j <= 28
							|| i == 48 && j >= 32 && j <= 34 || i == 48 && j >= 37 && j <= 42 || i == 48 && j >= 45 && j <= 49 
							|| i == 49 && j >= 18 && j <= 23 || i == 49 && j >= 27 && j <= 28
							|| i == 49 && j >= 44 && j <= 49 
							|| i == 50 && j >= 18 && j <= 24 || i == 50 && j >= 27 && j <= 27
							|| i == 50 && j >= 45 && j <= 48 
							|| i == 51 && j >= 18 && j <= 25 || i == 51 && j >= 27 && j <= 27
							|| i == 51 && j >= 44 && j <= 48  
							|| i == 52 && j >= 18 && j <= 27 || i == 52 && j >= 38 && j <= 40
							|| i == 52 && j >= 45 && j <= 47 
							|| i == 53 && j >= 19 && j <= 27 || i == 53 && j >= 36 && j <= 39
							|| i == 53 && j >= 44 && j <= 47 
							|| i == 54 && j >= 19 && j <= 28 || i == 54 && j >= 36 && j <= 37
							|| i == 54 && j >= 44 && j <= 46 
							|| i == 55 && j >= 19 && j <= 28 || i == 55 && j >= 42 && j <= 46
							|| i == 56 && j >= 21 && j <= 29 || i == 56 && j >= 42 && j <= 45
							|| i == 57 && j >= 22 && j <= 30 || i == 57 && j >= 40 && j <= 44
							|| i == 58 && j >= 23 && j <= 33 || i == 58 && j >= 35 && j <= 35 || i == 58 && j >= 37 && j <= 43
							|| i == 59 && j >= 24 && j <= 43 
							|| i == 60 && j >= 25 && j <= 42 
							|| i == 61 && j >= 25 && j <= 41 
							|| i == 62 && j >= 27 && j <= 40 
							|| i == 63 && j >= 28 && j <= 39 
							 ) {
						try {
							System.out.print("  ");
							Thread.sleep(20);
						} catch (Exception e) {
						}
					} else if (i < -1 || j < -1 || i > 66 || j > 66) {
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