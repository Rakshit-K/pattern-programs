
import java.util.Scanner;

public class kohli2 {

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
							
							
						
							|| i == 3 && j >=35  && j <= 37 
							|| i == 4 && j >= 21 && j <= 23 || i == 4 && j >= 29 && j <= 42
							|| i == 5 && j >= 20 && j <= 25 || i == 5 && j >= 28 && j <= 43
							|| i == 6 && j >= 18 && j <= 43 
							|| i == 7 && j >= 16 && j <= 47
							|| i == 8 && j >= 16 && j <= 47 
							|| i == 9 && j >= 15 && j <= 48 
							|| i == 10 && j >= 15 && j <= 48 
							|| i == 11 && j >= 14 && j <= 48 
							|| i == 12 && j >= 14 && j <= 49
							|| i == 13 && j >= 14 && j <= 49
							|| i == 14 && j >= 15 && j <= 51 
							|| i == 15 && j >= 15 && j <= 53 
							|| i == 16 && j >= 15 && j <= 53 
							|| i == 17 && j >= 15 && j <= 54 
							|| i == 18 && j >= 16 && j <= 34 || i == 18 && j >= 36 && j <= 54 
							|| i == 19 && j >= 17 && j <= 26 || i == 19 && j >= 28 && j <= 28 
							|| i == 19 && j >= 30 && j <= 30 || i == 19 && j >= 36 && j <= 54 
							|| i == 20 && j >= 17 && j <= 18 || i == 20 && j >= 36 && j <= 54 
							|| i == 21 && j >= 17 && j <= 17 || i == 21 && j >= 36 && j <= 54
							|| i == 22 && j >= 36 && j <= 54 
							|| i == 23 && j >= 36 && j <= 54 
							|| i == 24 && j >= 36 && j <= 54 
							|| i == 25 && j >= 36 && j <= 54 
							|| i == 26 && j >= 36 && j <= 54 
							|| i == 27 && j >= 36 && j <= 54 
							|| i == 28 && j >= 36 && j <= 54 
							|| i == 29 && j >= 40 && j <= 54 
							|| i == 30 && j >= 41 && j <= 54 
							|| i == 31 && j >= 41 && j <= 53
							|| i == 32 && j >= 41 && j <= 48 || i == 32 && j >= 52 && j <= 53
							
							|| i == 33 && j >= 41 && j <= 47 || i == 33 && j >= 53 && j <= 53
							|| i == 34 && j >= 41 && j <= 46 || i == 34 && j >= 53 && j <= 53
							|| i == 35 && j >= 42 && j <= 44 || i == 35 && j >= 53 && j <= 53
							|| i == 36 && j >= 42 && j <= 44 || i == 36 && j >= 53 && j <= 53						
							|| i == 37 && j >= 42 && j <= 43 || i == 37 && j >= 53 && j <= 53 
							|| i == 38 && j >= 41 && j <= 43 
							|| i == 39 && j >= 41 && j <= 43 || i == 39 && j >= 52 && j <= 52
							|| i == 40 && j >= 41 && j <= 43 || i == 40 && j >= 52 && j <= 52
							|| i == 41 && j >= 41 && j <= 43 || i == 41 && j >= 52 && j <= 52
							|| i == 42 && j >= 40 && j <= 43 
							|| i == 43 && j >= 40 && j <= 43 
							|| i == 44 && j >= 39 && j <= 43 
							|| i == 45 && j >= 39 && j <= 43 
							|| i == 46 && j >= 18 && j <= 21 || i == 46 && j >= 38 && j <= 43
							|| i == 47 && j >= 18 && j <= 24 || i == 47 && j >= 37 && j <= 44
							|| i == 48 && j >= 17 && j <= 26 || i == 48 && j >= 36 && j <= 44
							|| i == 49 && j >= 17 && j <= 28 || i == 49 && j >= 35 && j <= 43 
							|| i == 50 && j >= 17 && j <= 17 || i == 50 && j >= 23 && j <= 28 || i == 50 && j >= 33 && j <= 43
							|| i == 51 && j >= 26 && j <= 28 || i == 51 && j >= 32 && j <= 42
							|| i == 52 && j >= 27 && j <= 28 || i == 52 && j >= 31 && j <= 42
							|| i == 53 && j >= 18 && j <= 18 || i == 53 && j >= 27 && j <= 41
							|| i == 54 && j >= 18 && j <= 18 || i == 54 && j >= 20 && j <= 21 || i == 54 && j >= 26 && j <= 41
							|| i == 55 && j >= 17 && j <= 40 
							|| i == 56 && j >= 17 && j <= 38  
							|| i == 57 && j >= 17 && j <= 36 
							|| i == 58 && j >= 17 && j <= 34 
							|| i == 59 && j >= 18 && j <= 31 
							|| i == 60 && j >= 18 && j <= 30 
							|| i == 61 && j >= 19 && j <= 29 
							|| i == 62 && j >= 20 && j <= 27 
							 
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
