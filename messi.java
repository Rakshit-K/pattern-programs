


import java.util.Scanner;

public class messi {

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
							
						    
							 
							|| i == 3 && j >= 27 && j <= 36
							|| i == 4 && j >= 24 && j <= 38 
							|| i == 5 && j >= 22 && j <= 43
							|| i == 6 && j >= 21 && j <= 46 
							|| i == 7 && j >= 20 && j <= 50 
							|| i == 8 && j >= 19 && j <= 51
							|| i == 9 && j >= 18 && j <= 52
							|| i == 10 && j >= 17 && j <= 53
							|| i == 11 && j >= 17 && j <= 54
							|| i == 12 && j >= 16 && j <= 54 
							|| i == 13 && j >= 16 && j <= 55 
							|| i == 14 && j >= 16 && j <= 55 
							|| i == 15 && j >= 16 && j <= 55 
							|| i == 16 && j >= 16 && j <= 56 
							|| i == 17 && j >= 16 && j <= 25 || i == 17 && j >= 31 && j <= 56
							|| i == 18 && j >= 16 && j <= 20 || i == 18 && j >= 37 && j <= 56 
							|| i == 19 && j >= 17 && j <= 19 || i == 19 && j >= 39 && j <= 56
							|| i == 20 && j >= 18 && j <= 18 || i == 20 && j >= 40 && j <= 56 
							|| i == 21 && j >= 18 && j <= 18 || i == 21 && j >= 40 && j <= 56 
							|| i == 22 && j >= 40 && j <= 56 
							|| i == 23 && j >= 17 && j <= 17 || i == 23 && j >= 39 && j <= 56 
							|| i == 24 && j >= 17 && j <= 17 || i == 24 && j >= 39 && j <= 56 
							|| i == 25 && j >=39 && j <= 56 
							|| i == 26 && j >= 16 && j <= 16 || i == 26 && j >= 39 && j <= 56 
							|| i == 27 && j >= 39 && j <= 56 
							|| i == 28 && j >= 16 && j <= 17 || i == 28 && j >= 41 && j <= 56 
							|| i == 29 && j >= 16 && j <= 19 || i == 29 && j >= 42 && j <= 55 
							|| i == 30 && j >= 18 && j <= 20 || i == 30 && j >= 24 && j <= 24 || i == 30 && j >= 27 && j <= 30 || i == 30 && j >= 42 && j <= 55 
							|| i == 31 && j >= 16 && j <= 20 || i == 31 && j >= 24 && j <= 33 || i == 31 && j >= 43 && j <= 50 || i == 31 && j >= 53 && j <= 54 
							|| i == 32 && j >= 17 && j <= 19 || i == 32 && j >= 25 && j <= 31 || i == 32 && j >= 44 && j <= 47 || i == 32 && j >= 54 && j <= 54
							
							|| i == 33 && j >= 16 && j <= 16 || i == 33 && j >= 19 && j <= 19 || i == 33 && j >= 25 && j <= 25 || i == 33 && j >= 27 && j <= 30 || i == 33 && j >= 44 && j <= 46 
							|| i == 34 && j >= 16 && j <= 16 || i == 34 && j >= 29 && j <= 29 || i == 34 && j >= 44 && j <= 45 
							|| i == 35 && j >= 19 && j <= 19 
							|| i == 36 && j >= 15 && j <= 15 || i == 36 && j >= 19 && j <= 19 
							|| i == 37 && j >= 15 && j <= 15 || i == 37 && j >= 18 && j <= 18 
							|| i == 38 && j >= 15 && j <= 15 || i == 38 && j >= 18 && j <= 18 || i == 38 && j >= 44 && j <= 44 
							|| i == 39 && j >= 15 && j <= 15 || i == 39 && j >= 43 && j <= 44 
							|| i == 40 && j >= 17 && j <= 17 || i == 40 && j >= 42 && j <= 44 || i == 40 && j >= 54 && j <= 54 
							|| i == 41 && j >= 16 && j <= 17 || i == 41 && j >= 22 && j <= 23 || i == 41 && j >= 41 && j <= 44 || i == 41 && j >= 54 && j <= 54 
							|| i == 42 && j >= 16 && j <= 16 || i == 42 && j >= 19 && j <= 24 || i == 42 && j >= 40 && j <= 44 || i == 42 && j >= 46 && j <= 46 || i == 42 && j >= 53 && j <= 53  
							|| i == 43 && j >= 20 && j <= 21 || i == 43 && j >= 39 && j <= 44 || i == 43 && j >= 46 && j <= 46 || i == 43 && j >= 52 && j <= 52 
							|| i == 44 && j >= 17 && j <= 17 || i == 44 && j >= 19 && j <= 24 || i == 44 && j >= 38 && j <= 44 || i == 44 && j >= 46 && j <= 51
							|| i == 45 && j >= 17 && j <= 27 || i == 45 && j >= 37 && j <= 44 || i == 45 && j >= 46 && j <= 50
							|| i == 46 && j >= 17 && j <= 28 || i == 46 && j >= 35 && j <= 44 || i == 46 && j >= 46 && j <= 49
							|| i == 47 && j >= 17 && j <= 20 || i == 47 && j >= 24 && j <= 30 || i == 47 && j >= 35 && j <= 44 || i == 47 && j >= 47 && j <= 48
							|| i == 48 && j >= 17 && j <= 30 || i == 48 && j >= 34 && j <= 44 
							|| i == 49 && j >= 18 && j <= 44 
							|| i == 50 && j >= 18 && j <= 22 || i == 50 && j >= 26 && j <= 43 
							|| i == 51 && j >= 18 && j <= 20 || i == 51 && j >= 24 && j <= 25 || i == 51 && j >= 29 && j <= 42
							|| i == 52 && j >= 18 && j <= 21 || i == 52 && j >= 26 && j <= 27 || i == 52 && j >= 29 && j <= 42 
							|| i == 53 && j >= 18 && j <= 27 || i == 53 && j >= 29 && j <= 41 
							|| i == 54 && j >= 18 && j <= 27 || i == 54 && j >= 29 && j <= 40 
							|| i == 55 && j >= 18 && j <= 25 || i == 55 && j >= 29 && j <= 40 
							|| i == 56 && j >= 18 && j <= 25 || i == 56 && j >= 28 && j <= 39 
							|| i == 57 && j >= 18 && j <= 38 
							|| i == 58 && j >= 18 && j <= 37 
							|| i == 59 && j >= 19 && j <= 36 
							|| i == 60 && j >= 19 && j <= 35 
							|| i == 61 && j >= 20 && j <= 34 
							|| i == 62 && j >= 20 && j <= 33
							|| i == 63 && j >= 22 && j <= 31
							
							
							
							
							 
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



