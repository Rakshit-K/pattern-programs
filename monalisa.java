
import java.util.Scanner;

public class monalisa {

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
							
							
							|| i == 3 && j >= 29 && j <= 38 
							|| i == 4 && j >= 27 && j <= 40
							|| i == 5 && j >= 26 && j <= 42
							|| i == 6 && j >= 24 && j <= 44
							|| i == 7 && j >= 24 && j <= 45
							|| i == 8 && j >= 23 && j <= 45 
							|| i == 9 && j >= 22 && j <= 24 || i == 9 && j >= 34 && j <= 46 
							|| i == 10 && j >= 21 && j <= 23 || i == 10 && j >= 34 && j <= 47 
							|| i == 11 && j >= 21 && j <= 22 || i == 11 && j >= 35 && j <= 47 
							|| i == 12 && j >= 20 && j <= 22 || i == 12 && j >= 36 && j <= 48
							|| i == 13 && j >= 20 && j <= 21 || i == 13 && j >= 36 && j <= 48
							|| i == 14 && j >= 19 && j <= 21 || i == 14 && j >= 36 && j <= 49  
							|| i == 15 && j >= 18 && j <= 21 || i == 15 && j >= 37 && j <= 49
							|| i == 16 && j >= 17 && j <= 20 || i == 16 && j >= 39 && j <= 49 
							|| i == 17 && j >= 17 && j <= 20 || i == 17 && j >= 39 && j <= 50 
							|| i == 18 && j >= 17 && j <= 20 || i == 18 && j >= 40 && j <= 50
							|| i == 19 && j >= 17 && j <= 20 || i == 19 && j >= 38 && j <= 50
							|| i == 20 && j >= 17 && j <= 25 || i == 20 && j >= 30 && j <= 50 
							|| i == 21 && j >= 17 && j <= 22 || i == 21 && j >= 24 && j <= 26 || i == 21 && j >= 29 && j <= 31 || i == 21 && j >= 33 && j <= 50
							|| i == 22 && j >= 17 && j <= 22 || i == 22 && j >= 24 && j <= 26 || i == 22 && j >= 29 && j <= 30 || i == 22 && j >= 33 && j <= 37 || i == 22 && j >= 40 && j <= 50
							|| i == 23 && j >= 17 && j <= 20 || i == 23 && j >= 29 && j <= 30 || i == 23 && j >= 40 && j <= 50
							|| i == 24 && j >= 16 && j <= 20 || i == 24 && j >= 29 && j <= 30 || i == 24 && j >= 40 && j <= 50
							|| i == 25 && j >= 16 && j <= 20 || i == 25 && j >= 40 && j <= 50  
							|| i == 26 && j >= 16 && j <= 20 || i == 26 && j >= 39 && j <= 50 
							|| i == 27 && j >= 15 && j <= 20 || i == 27 && j >= 38 && j <= 50 
							|| i == 28 && j >= 15 && j <= 20 || i == 28 && j >= 30 && j <= 30 || i == 28 && j >= 38 && j <= 51
							|| i == 29 && j >= 15 && j <= 21 || i == 29 && j >= 29 && j <= 29 || i == 29 && j >= 37 && j <= 51
							|| i == 30 && j >= 15 && j <= 21 || i == 30 && j >= 26 && j <= 26 || i == 30 && j >= 28 && j <= 30 || i == 30 && j >= 37 && j <= 51
							|| i == 30 && j >= 42 && j <= 43 || i == 30 && j >= 45 && j <= 47 || i == 30 && j >= 50 && j <= 51
							|| i == 31 && j >= 15 && j <= 22 || i == 31 && j >= 28 && j <= 30 || i == 31 && j >= 36 && j <= 51
							|| i == 32 && j >= 15 && j <= 22 || i == 32 && j >= 29 && j <= 33 || i == 32 && j >= 36 && j <= 51
							
							|| i == 33 && j >= 15 && j <= 22 || i == 33 && j >= 26 && j <= 32 || i == 33 && j >= 36 && j <= 51 
							|| i == 34 && j >= 15 && j <= 23 || i == 34 && j >= 30 && j <= 30 || i == 34 && j >= 36 && j <= 52 
							|| i == 35 && j >= 15 && j <= 23 || i == 35 && j >= 28 && j <= 31 || i == 35 && j >= 35 && j <= 52
							|| i == 36 && j >= 15 && j <= 24 || i == 36 && j >= 34 && j <= 52 						
							|| i == 37 && j >= 16 && j <= 25 || i == 37 && j >= 33 && j <= 52 
							|| i == 38 && j >= 16 && j <= 26 || i == 38 && j >= 31 && j <= 52 
							|| i == 39 && j >= 16 && j <= 52 
							|| i == 40 && j >= 16 && j <= 52 
							|| i == 41 && j >= 16 && j <= 52 
							|| i == 42 && j >= 17 && j <= 53 
							|| i == 43 && j >= 17 && j <= 53 
							|| i == 44 && j >= 17 && j <= 28 || i == 44 && j >= 31 && j <= 54
							|| i == 45 && j >= 18 && j <= 28 || i == 45 && j >= 31 && j <= 54 
							|| i == 46 && j >= 18 && j <= 28 || i == 46 && j >= 36 && j <= 55 
							|| i == 47 && j >= 19 && j <= 21 || i == 47 && j >= 25 && j <= 26 || i == 47 && j >= 37 && j <= 55 
							|| i == 48 && j >= 20 && j <= 21 || i == 48 && j >= 41 && j <= 55
							|| i == 49 && j >= 41 && j <= 55 
							|| i == 50 && j >= 17 && j <= 19 || i == 50 && j >= 41 && j <= 55
							|| i == 51 && j >= 16 && j <= 20 || i == 51 && j >= 42 && j <= 55 
							|| i == 52 && j >= 15 && j <= 21 || i == 52 && j >= 42 && j <= 54 
							|| i == 53 && j >= 14 && j <= 21 || i == 53 && j >= 43 && j <= 53 || i == 53 && j >= 57 && j <= 58 
							|| i == 54 && j >= 13 && j <= 21 || i == 54 && j >= 43 && j <= 52 || i == 54 && j >= 56 && j <= 59
							|| i == 55 && j >= 12 && j <= 21 || i == 55 && j >= 43 && j <= 50 || i == 55 && j >= 55 && j <= 60
							|| i == 56 && j >= 11 && j <= 20 || i == 56 && j >= 43 && j <= 48 || i == 56 && j >= 55 && j <= 61  
							|| i == 57 && j >= 10 && j <= 18 || i == 57 && j >= 43 && j <= 46 || i == 57 && j >= 54 && j <= 62
							|| i == 58 && j >= 9 && j <= 18 || i == 58 && j >= 43 && j <= 44 || i == 58 && j >= 51 && j <= 63
							|| i == 59 && j >= 9 && j <= 17 || i == 59 && j >= 43 && j <= 43 || i == 59 && j >= 49 && j <= 63  
							|| i == 60 && j >= 8 && j <= 17 || i == 60 && j >= 46 && j <= 63 
							|| i == 61 && j >= 7 && j <= 18 || i == 61 && j >= 44 && j <= 63
							|| i == 62 && j >= 6 && j <= 19 || i == 62 && j >= 41 && j <= 63
							|| i == 63 && j >= 5 && j <= 22 || i == 63 && j >= 40 && j <= 63
							|| i == 64 && j >= 4 && j <= 25 || i == 63 && j >= 39 && j <= 63
							 
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
