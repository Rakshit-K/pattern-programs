
import java.util.Scanner;

public class abdulKalam {

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
							
							|| i == 2 && j >= 26 && j <= 40  
							|| i == 3 && j >= 23 && j <= 35 || i == 3 && j >= 37 && j <= 42
							|| i == 4 && j >= 21 && j <= 36 || i == 4 && j >= 38 && j <= 44
							|| i == 5 && j >= 20 && j <= 36 || i == 5 && j >= 38 && j <= 45
							|| i == 6 && j >= 18 && j <= 37 || i == 6 && j >= 39 && j <= 46
							|| i == 7 && j >= 17 && j <= 38 || i == 7 && j >= 41 && j <= 47
							|| i == 8 && j >= 17 && j <= 38 || i == 8 && j >= 42 && j <= 48
							|| i == 9 && j >= 16 && j <= 38 || i == 9 && j >= 42 && j <= 49
							|| i == 10 && j >= 16 && j <= 30 || i == 10 && j >= 37 && j <= 38 || i == 10 && j >= 40 && j <= 50  
							|| i == 11 && j >= 15 && j <= 28 || i == 11 && j >= 43 && j <= 50
							|| i == 12 && j >= 15 && j <= 27 || i == 12 && j >= 45 && j <= 51 
							|| i == 13 && j >= 15 && j <= 25 || i == 13 && j >= 38 && j <= 38 || i == 13 && j >= 46 && j <= 51
							|| i == 14 && j >= 15 && j <= 25 || i == 14 && j >= 28 && j <= 33 || i == 14 && j >= 38 && j <= 43 || i == 14 && j >= 46 && j <= 52
							|| i == 15 && j >= 14 && j <= 24 || i == 15 && j >= 28 && j <= 28 || i == 15 && j >= 31 && j <= 34 || i == 15 && j >= 37 && j <= 43 || i == 15 && j >= 46 && j <= 52   
							|| i == 16 && j >= 14 && j <= 23 || i == 16 && j >= 30 && j <= 32 || i == 16 && j >= 36 && j <= 44 || i == 16 && j >= 46 && j <= 52 
							|| i == 17 && j >= 13 && j <= 23 || i == 17 && j >= 28 && j <= 31 || i == 17 && j >= 37 && j <= 44 || i == 17 && j >= 46 && j <= 53
							|| i == 18 && j >= 13 && j <= 23 || i == 18 && j >= 26 && j <= 30 || i == 18 && j >= 38 && j <= 44 || i == 18 && j >= 46 && j <= 53 
							|| i == 19 && j >= 13 && j <= 22 || i == 19 && j >= 26 && j <= 28 || i == 19 && j >= 38 && j <= 44 || i == 19 && j >= 46 && j <= 54
							|| i == 20 && j >= 12 && j <= 22 || i == 20 && j >= 25 && j <= 27 || i == 20 && j >= 38 && j <= 44 || i == 20 && j >= 46 && j <= 54 
							|| i == 21 && j >= 12 && j <= 22 || i == 21 && j >= 25 && j <= 27 || i == 21 && j >= 38 && j <= 44 || i == 21 && j >= 46 && j <= 54
							|| i == 22 && j >= 11 && j <= 22 || i == 22 && j >= 24 && j <= 27 || i == 22 && j >= 38 && j <= 44 || i == 22 && j >= 46 && j <= 55
							|| i == 23 && j >= 11 && j <= 22 || i == 23 && j >= 24 && j <= 27 || i == 23 && j >= 38 && j <= 44 || i == 23 && j >= 46 && j <= 55 
							|| i == 24 && j >= 10 && j <= 22 || i == 24 && j >= 24 && j <= 27 || i == 24 && j >= 38 && j <= 44 || i == 24 && j >= 46 && j <= 55
							|| i == 25 && j >= 9 && j <= 22 || i == 25 && j >= 24 && j <= 27 || i == 25 && j >= 38 && j <= 45 || i == 25 && j >= 48 && j <= 56 
							|| i == 26 && j >= 9 && j <= 22 || i == 26 && j >= 24 && j <= 27 || i == 26 && j >= 39 && j <= 56
							|| i == 27 && j >= 9 && j <= 22 || i == 27 && j >= 24 && j <= 27 || i == 27 && j >= 39 && j <= 56 
							|| i == 28 && j >= 8 && j <= 27 || i == 28 && j >= 41 && j <= 43 || i == 28 && j >= 45 && j <= 56 
							|| i == 29 && j >= 8 && j <= 26 || i == 29 && j >= 45 && j <= 57
							|| i == 30 && j >= 8 && j <= 20 || i == 30 && j >= 22 && j <= 25 || i == 30 && j >= 39 && j <= 57 
							|| i == 31 && j >= 8 && j <= 19 || i == 31 && j >= 35 && j <= 57 
							|| i == 32 && j >= 8 && j <= 28 || i == 32 && j >= 33 && j <= 57 
							
							|| i == 33 && j >= 8 && j <= 18 || i == 33 && j >= 20 && j <= 29 || i == 33 && j >= 33 && j <= 57 
							|| i == 34 && j >= 8 && j <= 18 || i == 34 && j >= 20 && j <= 25 || i == 34 && j >= 27 && j <= 29 || i == 34 && j >= 33 && j <= 37 || i == 34 && j >= 39 && j <= 40 || i == 34 && j >= 42 && j <= 57
							|| i == 35 && j >= 8 && j <= 17 || i == 35 && j >= 26 && j <= 27 || i == 35 && j >= 33 && j <= 35 || i == 35 && j >= 38 && j <= 57 
							|| i == 36 && j >= 8 && j <= 17 || i == 36 && j >= 26 && j <= 27 || i == 36 && j >= 33 && j <= 36 || i == 36 && j >= 42 && j <= 57 
							|| i == 37 && j >= 8 && j <= 17 || i == 37 && j >= 29 && j <= 29 || i == 37 && j >= 33 && j <= 36 || i == 37 && j >= 43 && j <= 57 
							|| i == 38 && j >= 8 && j <= 15 || i == 38 && j >= 17 && j <= 17 || i == 38 && j >= 33 && j <= 37 || i == 38 && j >= 44 && j <= 57
							|| i == 39 && j >= 9 && j <= 15 || i == 39 && j >= 33 && j <= 37 || i == 39 && j >= 45 && j <= 56
							|| i == 40 && j >= 11 && j <= 17 || i == 40 && j >= 33 && j <= 37 || i == 40 && j >= 45 && j <= 56 
							|| i == 41 && j >= 14 && j <= 17 || i == 41 && j >= 27 && j <= 27 || i == 41 && j >= 34 && j <= 38 || i == 41 && j >= 44 && j <= 55
							|| i == 42 && j >= 14 && j <= 17 || i == 42 && j >= 26 && j <= 27 || i == 42 && j >= 34 && j <= 39 || i == 42 && j >= 42 && j <= 55
							|| i == 43 && j >= 14 && j <= 17 || i == 43 && j >= 25 && j <= 25 || i == 43 && j >= 27 && j <= 29 || i == 43 && j >= 34 && j <= 54
							|| i == 44 && j >= 15 && j <= 17 || i == 44 && j >= 24 && j <= 24 || i == 44 && j >= 28 && j <= 29 || i == 44 && j >= 34 && j <= 53
							|| i == 45 && j >= 17 && j <= 17 || i == 45 && j >= 23 && j <= 23 || i == 45 && j >= 30 && j <= 30 || i == 45 && j >= 34 && j <= 51
							|| i == 46 && j >= 17 && j <= 17 || i == 46 && j >= 22 && j <= 23 || i == 46 && j >= 30 && j <= 51 
							|| i == 47 && j >= 18 && j <= 18 || i == 47 && j >= 22 && j <= 23 || i == 47 && j >= 34 && j <= 51
							|| i == 48 && j >= 19 && j <= 19 || i == 48 && j >= 26 && j <= 27 || i == 48 && j >= 29 && j <= 51
							|| i == 49 && j >= 20 && j <= 20 || i == 49 && j >= 27 && j <= 28 || i == 49 && j >= 36 && j <= 52 
							|| i == 50 && j >= 20 && j <= 22 || i == 50 && j >= 37 && j <= 53 
							|| i == 51 && j >= 21 && j <= 24 || i == 51 && j >= 37 && j <= 56 
							|| i == 52 && j >= 20 && j <= 25 || i == 52 && j >= 34 && j <= 58
							|| i == 53 && j >= 17 && j <= 25 || i == 53 && j >= 30 && j <= 57 
							|| i == 54 && j >= 16 && j <= 27 || i == 54 && j >= 36 && j <= 37 || i == 54 && j >= 40 && j <= 56
							|| i == 55 && j >= 17 && j <= 28 || i == 55 && j >= 39 && j <= 55 
							|| i == 56 && j >= 18 && j <= 29 || i == 56 && j >= 37 && j <= 54
							|| i == 57 && j >= 19 && j <= 52
							|| i == 58 && j >= 20 && j <= 51 
							|| i == 59 && j >= 21 && j <= 50 
							|| i == 60 && j >= 22 && j <= 49 
							|| i == 61 && j >= 23 && j <= 48 
							|| i == 62 && j >= 24 && j <= 46
							|| i == 63 && j >= 24 && j <= 45
							|| i == 64 && j >= 26 && j <= 44
							
							 
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


