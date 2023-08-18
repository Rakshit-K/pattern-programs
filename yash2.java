
import java.util.Scanner;

public class yash2 {

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
							
							
							|| i == 2 && j >=29  && j <= 36 
							|| i == 3 && j >=27  && j <= 37 
							|| i == 4 && j >= 25 && j <= 40 
							|| i == 5 && j >= 24 && j <= 42 
							|| i == 6 && j >= 23 && j <= 43 
							|| i == 7 && j >= 22 && j <= 44
							|| i == 8 && j >= 21 && j <= 45 
							|| i == 9 && j >= 20 && j <= 45 
							|| i == 10 && j >= 20 && j <= 46 
							|| i == 11 && j >= 19 && j <= 46 
							|| i == 12 && j >= 19 && j <= 46
							|| i == 13 && j >= 19 && j <= 45
							|| i == 14 && j >= 19 && j <= 46 
							|| i == 15 && j >= 19 && j <= 47
							|| i == 16 && j >= 20 && j <= 23 || i == 16 && j >= 33 && j <= 49 
							|| i == 17 && j >= 18 && j <= 19 || i == 17 && j >= 34 && j <= 51
							|| i == 18 && j >= 18 && j <= 20 || i == 18 && j >= 35 && j <= 50 
							|| i == 19 && j >= 18 && j <= 20 || i == 19 && j >= 36 && j <= 50  
							|| i == 20 && j >= 18 && j <= 20 || i == 20 && j >= 37 && j <= 49 
							|| i == 21 && j >= 19 && j <= 20 || i == 21 && j >= 38 && j <= 49
							|| i == 22 && j >= 19 && j <= 20 || i == 22 && j >= 39 && j <= 48
							|| i == 23 && j >= 19 && j <= 20 || i == 23 && j >= 42 && j <= 46 
							|| i == 24 && j >= 19 && j <= 20 || i == 24 && j >= 43 && j <= 44
							|| i == 25 && j >= 19 && j <= 20 || i == 25 && j >= 43 && j <= 44 
							|| i == 26 && j >= 19 && j <= 20 || i == 26 && j >= 44 && j <= 44
							|| i == 27 && j >= 19 && j <= 19 || i == 27 && j >= 44 && j <= 44 
							|| i == 28 && j >= 19 && j <= 19 || i == 28 && j >= 44 && j <= 44 
							
							|| i == 31 && j >= 20 && j <= 20 || i == 31 && j >= 44 && j <= 44
							|| i == 32 && j >= 20 && j <= 20 || i == 32 && j >= 44 && j <= 44
							
							|| i == 33 && j >= 19 && j <= 20 || i == 33 && j >= 27 && j <= 31 || i == 33 && j >= 33 && j <= 37 || i == 33 && j >= 44 && j <= 45
							|| i == 34 && j >= 19 && j <= 20 || i == 34 && j >= 25 && j <= 39 || i == 34 && j >= 44 && j <= 45
							|| i == 35 && j >= 18 && j <= 21 || i == 35 && j >= 24 && j <= 40 || i == 35 && j >= 43 && j <= 46
							|| i == 36 && j >= 18 && j <= 29 || i == 36 && j >= 36 && j <= 46						
							|| i == 37 && j >= 18 && j <= 27 || i == 37 && j >= 37 && j <= 46 
							|| i == 38 && j >= 18 && j <= 25 || i == 38 && j >= 39 && j <= 46 
							|| i == 39 && j >= 19 && j <= 23 || i == 39 && j >= 32 && j <= 33 || i == 39 && j >= 41 && j <= 45
							|| i == 40 && j >= 17 && j <= 18 || i == 40 && j >= 23 && j <= 25 || i == 40 && j >= 32 && j <= 33
							|| i == 40 && j >= 39 && j <= 41 || i == 40 && j >= 46 && j <= 47
							|| i == 41 && j >= 17 && j <= 26 || i == 41 && j >= 31 && j <= 34 || i == 41 && j >= 38 && j <= 47
							|| i == 42 && j >= 17 && j <= 47 
							|| i == 43 && j >= 17 && j <= 47 
							|| i == 44 && j >= 17 && j <= 47 
							|| i == 45 && j >= 17 && j <= 47 
							|| i == 46 && j >= 17 && j <= 47 
							|| i == 47 && j >= 17 && j <= 47 
							|| i == 48 && j >= 18 && j <= 47 
							|| i == 49 && j >= 18 && j <= 46 
							|| i == 50 && j >= 18 && j <= 46 
							|| i == 51 && j >= 18 && j <= 45 
							|| i == 52 && j >= 19 && j <= 45 
							|| i == 53 && j >= 20 && j <= 45 
							|| i == 54 && j >= 20 && j <= 44 
							|| i == 55 && j >= 21 && j <= 44 
							|| i == 56 && j >= 22 && j <= 43 
							|| i == 57 && j >= 23 && j <= 42 
							|| i == 58 && j >= 24 && j <= 41 
							|| i == 59 && j >= 25 && j <= 39 
							|| i == 60 && j >= 27 && j <= 37 
							|| i == 61 && j >= 29 && j <= 36 
							|| i == 62 && j >= 31 && j <= 34 
							 
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
