
import java.util.Scanner;

public class chaplin2 {

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
							
							
						
							|| i == 3 && j >= 27 && j <= 40 
							|| i == 4 && j >= 23 && j <= 43 
							|| i == 5 && j >= 21 && j <= 44
							|| i == 6 && j >= 19 && j <= 45 
							|| i == 7 && j >= 18 && j <= 46
							|| i == 8 && j >= 17 && j <= 47 
							|| i == 9 && j >= 16 && j <= 48 
							|| i == 10 && j >= 15 && j <= 48 
							|| i == 11 && j >= 15 && j <= 48 
							|| i == 12 && j >= 14 && j <= 48
							|| i == 13 && j >= 14 && j <= 49
							|| i == 14 && j >= 13 && j <= 49 
							|| i == 15 && j >= 13 && j <= 50 
							|| i == 16 && j >= 13 && j <= 50 
							|| i == 17 && j >= 13 && j <= 50 
							|| i == 18 && j >= 13 && j <= 50 
							|| i == 19 && j >= 13 && j <= 50 
							|| i == 20 && j >= 13 && j <= 50  
							|| i == 21 && j >= 13 && j <= 51 
							|| i == 22 && j >= 13 && j <= 51 
							|| i == 23 && j >= 13 && j <= 51 
							|| i == 24 && j >= 13 && j <= 51 
							|| i == 25 && j >= 13 && j <= 59 
							|| i == 26 && j >= 13 && j <= 60 
							|| i == 27 && j >= 13 && j <= 60 
							|| i == 28 && j >= 13 && j <= 59 
							|| i == 29 && j >= 11 && j <= 57 
							|| i == 30 && j >= 9 && j <= 31 || i == 30 && j >= 38 && j <= 55
							|| i == 31 && j >= 7 && j <= 22 || i == 31 && j >= 40 && j <= 54
							|| i == 32 && j >= 6 && j <= 20 || i == 32 && j >= 43 && j <= 54
							
							|| i == 33 && j >= 5 && j <= 19 || i == 33 && j >= 45 && j <= 54
							|| i == 34 && j >= 5 && j <= 18 || i == 34 && j >= 46 && j <= 54
							|| i == 35 && j >= 6 && j <= 17 || i == 35 && j >= 46 && j <= 54
							|| i == 36 && j >= 8 && j <= 17 || i == 36 && j >= 46 && j <= 55						
							|| i == 37 && j >= 8 && j <= 16 || i == 37 && j >= 47 && j <= 55 
							|| i == 38 && j >= 6 && j <= 16 || i == 38 && j >= 51 && j <= 55
							|| i == 39 && j >= 6 && j <= 16 || i == 39 && j >= 52 && j <= 55
							|| i == 40 && j >= 6 && j <= 16 || i == 40 && j >= 42 && j <= 45
							|| i == 40 && j >= 52 && j <= 54 
							|| i == 41 && j >= 6 && j <= 17 || i == 41 && j >= 40 && j <= 46
							|| i == 41 && j >= 53 && j <= 53 
							|| i == 42 && j >= 7 && j <= 17 || i == 42 && j >= 39 && j <= 42
							|| i == 42 && j >= 53 && j <= 53 
							|| i == 43 && j >= 10 && j <= 18 || i == 43 && j >= 24 && j <= 25
							|| i == 43 && j >= 38 && j <= 45 || i == 43 && j >= 53 && j <= 53
							|| i == 44 && j >= 11 && j <= 18 || i == 44 && j >= 22 && j <= 27
							|| i == 44 && j >= 38 && j <= 45 || i == 44 && j >= 53 && j <= 53
							|| i == 45 && j >= 11 && j <= 18 || i == 45 && j >= 21 && j <= 28
							|| i == 45 && j >= 38 && j <= 42 || i == 45 && j >= 53 && j <= 53
							|| i == 46 && j >= 12 && j <= 17 || i == 46 && j >= 20 && j <= 23
							|| i == 46 && j >= 26 && j <= 29 || i == 46 && j >= 53 && j <= 53
							|| i == 47 && j >= 12 && j <= 16 || i == 47 && j >= 20 && j <= 20
							|| i == 47 && j >= 24 && j <= 29 
							|| i == 48 && j >= 13 && j <= 16 || i == 48 && j >= 22 && j <= 28
							|| i == 49 && j >= 15 && j <= 16 || i == 49 && j >= 22 && j <= 23 
							|| i == 50 && j >= 15 && j <= 16 
							|| i == 51 && j >= 16 && j <= 16 
							|| i == 55 && j >= 40 && j <= 41 
							|| i == 56 && j >= 38 && j <= 42  
							|| i == 57 && j >= 31 && j <= 42 
							|| i == 58 && j >= 31 && j <= 45 
							|| i == 59 && j >= 30 && j <= 39 || i == 59 && j >= 44 && j <= 44
							|| i == 60 && j >= 30 && j <= 30 || i == 60 && j >= 32 && j <= 36 || i == 60 && j >= 43 && j <= 43 
							|| i == 61 && j >= 30 && j <= 30 
							|| i == 62 && j >= 30 && j <= 30 
							 
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
