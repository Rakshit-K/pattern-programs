
import java.util.Scanner;

public class yash {

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
							
							
							|| i == 2 && j >= 23 && j <= 29 
							|| i == 3 && j >= 22 && j <= 32 
							|| i == 4 && j >= 20 && j <= 33 
							|| i == 5 && j >= 19 && j <= 34 
							|| i == 6 && j >= 16 && j <= 35 
							|| i == 7 && j >= 15 && j <= 36
							|| i == 8 && j >= 13 && j <= 37 
							|| i == 9 && j >= 12 && j <= 37 
							|| i == 10 && j >= 12 && j <= 38 
							|| i == 11 && j >= 11 && j <= 39 
							|| i == 12 && j >= 10 && j <= 40 
							|| i == 13 && j >= 10 && j <= 41
							|| i == 14 && j >= 10 && j <= 41 
							|| i == 15 && j >= 10 && j <= 43 
							|| i == 16 && j >= 9 && j <= 43 
							|| i == 17 && j >= 9 && j <= 43 
							|| i == 18 && j >= 9 && j <= 44 
							|| i == 19 && j >= 9 && j <= 44 
							|| i == 20 && j >= 9 && j <= 45 
							|| i == 21 && j >= 9 && j <= 43 || i == 21 && j >= 45 && j <= 45
							|| i == 22 && j >= 9 && j <= 44 
							|| i == 23 && j >= 9 && j <= 44 
							|| i == 24 && j >= 9 && j <= 41 
							|| i == 25 && j >= 9 && j <= 15 || i == 25 && j >= 17 && j <= 39
							|| i == 26 && j >= 9 && j <= 15 || i == 26 && j >= 18 && j <= 39
							|| i == 26 && j >= 44 && j <= 44 
							|| i == 27 && j >= 10 && j <= 16 || i == 27 && j >= 22 && j <= 26
							|| i == 27 && j >= 31 && j <= 36 || i == 27 && j >= 39 && j <= 40 || i == 27 && j >= 44 && j <= 44
							|| i == 28 && j >= 10 && j <= 16 || i == 28 && j >= 23 && j <= 23 
							|| i == 28 && j >= 25 && j <= 27 || i == 28 && j >= 33 && j <= 37 
							|| i == 28 && j >= 39 && j <= 39 || i == 28 && j >= 43 && j <= 45
							|| i == 29 && j >= 10 && j <= 15
							|| i == 29 && j >= 17 && j <= 17 || i == 29 && j >= 24 && j <= 24
							|| i == 29 && j >= 26 && j <= 28 || i == 29 && j >= 36 && j <= 36
							|| i == 29 && j >= 40 && j <= 40 || i == 29 && j >= 43 && j <= 46
							|| i == 30 && j >= 10 && j <= 15 || i == 30 && j >= 17 && j <= 17
							|| i == 30 && j >= 25 && j <= 25 || i == 30 && j >= 27 && j <= 28
							|| i == 30 && j >= 40 && j <= 40 || i == 30 && j >= 43 && j <= 47
							|| i == 31 && j >= 10 && j <= 15 || i == 31 && j >= 18 && j <= 18
							|| i == 31 && j >= 26 && j <= 26 || i == 31 && j >= 28 && j <= 29
							|| i == 31 && j >= 40 && j <= 49 
							|| i == 32 && j >= 11 && j <= 15 || i == 32 && j >= 18 && j <= 18
							|| i == 32 && j >= 27 && j <= 27 || i == 32 && j >= 29 && j <= 30
							|| i == 32 && j >= 40 && j <= 50 
							|| i == 33 && j >= 11 && j <= 16 || i == 33 && j >= 19 && j <= 19
							|| i == 33 && j >= 29 && j <= 30 || i == 33 && j >= 40 && j <= 51
							|| i == 34 && j >= 12 && j <= 12 || i == 34 && j >= 14 && j <= 16
							|| i == 34 && j >= 20 && j <= 20 || i == 34 && j >= 30 && j <= 31
							|| i == 34 && j >= 39 && j <= 52 
							|| i == 35 && j >= 12 && j <= 13
							|| i == 35 && j >= 15 && j <= 16 || i == 35 && j >= 20 && j <= 20
							|| i == 35 && j >= 31 && j <= 32 || i == 35 && j >= 39 && j <= 53
							|| i == 36 && j >= 13 && j <= 13 || i == 36 && j >= 17 && j <= 17
							|| i == 36 && j >= 21 && j <= 21 || i == 36 && j >= 39 && j <= 54
							|| i == 37 && j >= 13 && j <= 14 || i == 37 && j >= 18 && j <= 18
							|| i == 37 && j >= 21 && j <= 22 
							|| i == 37 && j >= 39 && j <= 56 
							|| i == 38 && j >= 14 && j <= 15 || i == 38 && j >= 22 && j <= 22 || i == 38 && j >= 50 && j <= 59
							|| i == 38 && j >= 32 && j <= 33 || i == 38 && j >= 38 && j <= 43 || i == 38 && j >= 45 && j <= 48
							|| i == 39 && j >= 15 && j <= 15 || i == 39 && j >= 23 && j <= 23
							|| i == 39 && j >= 28 && j <= 35 || i == 39 && j >= 38 && j <= 43
							|| i == 39 && j >= 46 && j <= 47 || i == 39 && j >= 51 && j <= 61
							|| i == 40 && j >= 16 && j <= 17
							|| i == 40 && j >= 20 && j <= 20 || i == 40 && j >= 25 && j <= 43
							|| i == 40 && j >= 46 && j <= 46 || i == 40 && j >= 51 && j <= 64
							|| i == 41 && j >= 20 && j <= 20 || i == 41 && j >= 23 && j <= 43
							|| i == 41 && j >= 46 && j <= 46 || i == 41 && j >= 52 && j <= 64
							|| i == 42 && j >= 20 && j <= 30 || i == 42 && j >= 35 && j <= 43
							|| i == 42 && j >= 52 && j <= 64 
							|| i == 43 && j >= 21 && j <= 27 || i == 43 && j >= 35 && j <= 42
							|| i == 43 && j >= 52 && j <= 60 || i == 43 && j >= 62 && j <= 64
							|| i == 44 && j >= 21 && j <= 26 || i == 44 && j >= 30 && j <= 42
							|| i == 44 && j >= 52 && j <= 60 || i == 44 && j >= 63 && j <= 64
							|| i == 45 && j >= 19 && j <= 26 || i == 45 && j >= 29 && j <= 42
							|| i == 45 && j >= 52 && j <= 52 || i == 45 && j >= 54 && j <= 60 
							|| i == 46 && j >= 18 && j <= 41 || i == 46 && j >= 51 && j <= 51
							|| i == 46 && j >= 54 && j <= 60
							|| i == 47 && j >= 16 && j <= 41 || i == 47 && j >= 51 && j <= 59
							|| i == 48 && j >= 14 && j <= 40 || i == 48 && j >= 50 && j <= 50
							|| i == 48 && j >= 53 && j <= 58 
							|| i == 49 && j >= 13 && j <= 39 || i == 49 && j >= 50 && j <= 50
							|| i == 49 && j >= 53 && j <= 58 
							|| i == 50 && j >= 12 && j <= 39 || i == 50 && j >= 49 && j <= 50
							|| i == 50 && j >= 53 && j <= 58 
							|| i == 51 && j >= 10 && j <= 39 || i == 51 && j >= 49 && j <= 49
							|| i == 51 && j >= 52 && j <= 56 
							|| i == 52 && j >= 8 && j <= 38
							|| i == 52 && j >= 48 && j <= 49 || i == 52 && j >= 51 && j <= 55
							|| i == 53 && j >= 6 && j <= 37 || i == 53 && j >= 78 && j <= 48
							|| i == 53 && j >= 50 && j <= 54 
							|| i == 54 && j >= 7 && j <= 35 || i == 54 && j >= 48 && j <= 48
							|| i == 54 && j >= 50 && j <= 53 
							|| i == 55 && j >= 12 && j <= 14
							|| i == 55 && j >= 18 && j <= 32 || i == 55 && j >= 47 && j <= 47
							|| i == 55 && j >= 50 && j <= 52 
							|| i == 56 && j >= 19 && j <= 32
							|| i == 56 && j >= 46 && j <= 47 || i == 56 && j >= 50 && j <= 52
							|| i == 57 && j >= 20 && j <= 32 || i == 57 && j >= 46 && j <= 46
							|| i == 57 && j >= 49 && j <= 52 
							|| i == 58 && j >= 20 && j <= 30 || i == 58 && j >= 32 && j <= 32
							|| i == 58 && j >= 45 && j <= 45 || i == 58 && j >= 49 && j <= 51
							|| i == 59 && j >= 21 && j <= 30 || i == 59 && j >= 32 && j <= 33
							|| i == 59 && j >= 44 && j <= 45 || i == 59 && j >= 49 && j <= 51
							|| i == 60 && j >= 21 && j <= 30 || i == 60 && j >= 33 && j <= 34
							|| i == 60 && j >= 44 && j <= 44 || i == 60 && j >= 49 && j <= 50
							|| i == 61 && j >= 22 && j <= 31 || i == 61 && j >= 34 && j <= 34 
							|| i == 61 && j >= 43 && j <= 43 || i == 61 && j >= 49 && j <= 50 
							|| i == 62 && j >= 23 && j <= 31 || i == 62 && j >= 34 && j <= 35
							|| i == 62 && j >= 43 && j <= 43 || i == 62 && j >= 48 && j <= 50 
							|| i == 63 && j >= 23 && j <= 31 || i == 63 && j >= 35 && j <= 36
							|| i == 63 && j >= 42 && j <= 42 || i == 63 && j >= 48 && j <= 49
							|| i == 64 && j >= 24 && j <= 32 || i == 64 && j >= 36 && j <= 36
							|| i == 64 && j >= 41 && j <= 41 || i == 64 && j >= 48 && j <= 49) {
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
