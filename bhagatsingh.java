
import java.util.Scanner;

public class bhagatsingh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		System.out.println("Enter no of columns");
		int columns = sc.nextInt();
		System.out.println("jack sparrow pattern using java");
		int n = rows - 65;
		int m = columns - 65;
		if (rows < 65 || columns < 65) {
			System.out.println("Number of rows and columns must be more than 65");
			System.exit(0);
		} else {

			for (int i = -n / 2; i <= 65 + n / 2; i++) {
				for (int j = -1 - m / 2; j <= 65 + m / 2; j++) {

					if (	   i == 2 && j >= 27 && j <= 38 
							|| i == 3 && j >= 24 && j <= 26 || i == 3 && j >= 33 && j <= 36 || i == 3 && j >= 39 && j <= 39
							|| i == 4 && j >= 23 && j <= 23 || i == 4 && j >= 26 && j <= 38 || i == 4 && j >= 40 && j <= 40
							|| i == 5 && j >= 22 && j <= 22 || i == 5 && j >= 24 && j <= 39 || i == 5 && j >= 41 && j <= 41
							|| i == 6 && j >= 21 && j <= 21 || i == 6 && j >= 23 && j <= 40 || i == 6 && j >= 42 && j <= 42
							|| i == 7 && j >= 20 && j <= 20 || i == 7 && j >= 22 && j <= 41 || i == 7 && j >= 43 && j <= 43
							|| i == 8 && j >= 19 && j <= 19 || i == 8 && j >= 21 && j <= 42 || i == 8 && j >= 44 && j <= 44 
							|| i == 9 && j >= 18 && j <= 19 || i == 9 && j >= 21 && j <= 43 || i == 9 && j >= 45 && j <= 45
							|| i == 10 && j >= 18 && j <= 18 || i == 10 && j >= 20 && j <= 43 || i == 10 && j >= 45 && j <= 45
							|| i == 11 && j >= 18 && j <= 18 || i == 11 && j >= 20 && j <= 44 || i == 11 && j >= 46 && j <= 46
							|| i == 12 && j >= 18 && j <= 18 || i == 12 && j >= 20 && j <= 44 || i == 12 && j >= 46 && j <= 46 
							|| i == 13 && j >= 18 && j <= 46 
							|| i == 14 && j >= 17 && j <= 29 || i == 14 && j >= 31 && j <= 45 || i == 14 && j >= 47 && j <= 47 
							|| i == 15 && j >= 17 && j <= 17 || i == 15 && j >= 19 && j <= 24 || i == 15 && j >= 27 && j <= 37 || i == 15 && j >= 44 && j <= 45 || i == 15 && j >= 47 && j <= 48
							|| i == 16 && j >= 17 && j <= 17 || i == 16 && j >= 19 && j <= 22 || i == 16 && j >= 24 && j <= 37 || i == 16 && j >= 49 && j <= 57
							|| i == 17 && j >= 17 && j <= 17 || i == 17 && j >= 19 && j <= 20 || i == 17 && j >= 22 && j <= 37 || i == 17 && j >= 48 && j <= 51 || i == 17 && j >= 58 && j <= 58
							|| i == 18 && j >= 17 && j <= 17 || i == 18 && j >= 19 && j <= 19 || i == 18 && j >= 21 && j <= 37 || i == 18 && j >= 44 && j <= 47 || i == 18 && j >= 59 && j <= 59
							|| i == 19 && j >= 17 && j <= 17 || i == 19 && j >= 20 && j <= 37 || i == 19 && j >= 41 && j <= 43 || i == 19 && j >= 60 && j <= 60
							|| i == 20 && j >= 17 && j <= 17 || i == 20 && j >= 19 && j <= 40 || i == 20 && j >= 60 && j <= 60 
							|| i == 21 && j >= 17 && j <= 17 || i == 21 && j >= 19 && j <= 37 || i == 21 && j >= 60 && j <= 60
							|| i == 22 && j >= 17 && j <= 17 || i == 22 && j >= 19 && j <= 35 || i == 22 && j >= 60 && j <= 60
							|| i == 23 && j >= 17 && j <= 17 || i == 23 && j >= 19 && j <= 32 || i == 23 && j >= 60 && j <= 60
							|| i == 24 && j >= 18 && j <= 29 || i == 24 && j >= 60 && j <= 60 
							|| i == 25 && j >= 16 && j <= 16 || i == 25 && j >= 18 && j <= 25 || i == 25 && j >= 59 && j <= 59
							|| i == 26 && j >= 15 && j <= 20 || i == 26 && j >= 59 && j <= 59 
							|| i == 27 && j >= 13 && j <= 14 || i == 27 && j >= 38 && j <= 40 || i == 27 && j >= 58 && j <= 58 
							|| i == 28 && j >= 11 && j <= 12 || i == 28 && j >= 28 && j <= 40 || i == 28 && j >= 57 && j <= 57 
							|| i == 29 && j >= 9 && j <= 10 || i == 29 && j >= 22 && j <= 23 || i == 29 && j >= 32 && j <= 38 || i == 29 && j >= 56 && j <= 56
							|| i == 30 && j >= 8 && j <= 9 || i == 30 && j >= 21 && j <= 22 || i == 30 && j >= 24 && j <= 28 || i == 30 && j >= 32 && j <= 37 || i == 30 && j >= 42 && j <= 44 || i == 30 && j >= 56 && j <= 56 
							|| i == 31 && j >= 8 && j <= 8 || i == 31 && j >= 21 && j <= 36 || i == 31 && j >= 41 && j <= 46 || i == 31 && j >= 54 && j <= 55 
							|| i == 32 && j >= 7 && j <= 7 || i == 32 && j >= 21 && j <= 27 || i == 32 && j >= 31 && j <= 36 || i == 32 && j >= 45 && j <= 46 || i == 32 && j >= 53 && j <= 53 
							
							|| i == 33 && j >= 7 && j <= 7 || i == 33 && j >= 20 && j <= 24 || i == 33 && j >= 32 && j <= 36 || i == 33 && j >= 43 && j <= 47 || i == 33 && j >= 53 && j <= 53 
							|| i == 34 && j >= 7 && j <= 7 || i == 34 && j >= 16 && j <= 17 || i == 34 && j >= 20 && j <= 27 || i == 34 && j >= 33 && j <= 36 || i == 34 && j >= 41 && j <= 48 || i == 34 && j >= 53 && j <= 53 
							|| i == 35 && j >= 7 && j <= 7 || i == 35 && j >= 16 && j <= 18 || i == 35 && j >= 20 && j <= 31 || i == 35 && j >= 33 && j <= 36 || i == 35 && j >= 39 && j <= 48 || i == 35 && j >= 51 && j <= 51 || i == 35 && j >= 53 && j <= 53 
							|| i == 36 && j >= 7 && j <= 7 || i == 36 && j >= 17 && j <= 36 || i == 36 && j >= 38 && j <= 48 || i == 36 && j >= 50 && j <= 51 || i == 36 && j >= 53 && j <= 53 
							|| i == 37 && j >= 8 && j <= 8 || i == 37 && j >= 16 && j <= 51 || i == 37 && j >= 53 && j <= 53 
							|| i == 38 && j >= 8 && j <= 8 || i == 38 && j >= 16 && j <= 17 || i == 38 && j >= 19 && j <= 48 || i == 38 && j >= 50 && j <= 52 
							|| i == 39 && j >= 9 && j <= 10 || i == 39 && j >= 16 && j <= 17|| i == 39 && j >= 19 && j <= 48 || i == 39 && j >= 50 && j <= 52  
							|| i == 40 && j >= 10 && j <= 12 || i == 40 && j >= 16 && j <= 17 || i == 40 && j >= 19 && j <= 48 || i == 40 && j >= 50 && j <= 51 
							|| i == 41 && j >= 13 && j <= 18 || i == 41 && j >= 20 && j <= 31 || i == 41 && j >= 33 && j <= 35 || i == 41 && j >= 38 && j <= 47 || i == 41 && j >= 49 && j <= 51
							|| i == 42 && j >= 16 && j <= 34 || i == 42 && j >= 38 && j <= 50 
							|| i == 43 && j >= 16 && j <= 19 || i == 43 && j >= 21 && j <= 35 || i == 43 && j >= 37 && j <= 46 || i == 43 && j >= 48 && j <= 49 
							|| i == 44 && j >= 17 && j <= 19 || i == 44 && j >= 21 && j <= 31 || i == 44 && j >= 37 && j <= 46 || i == 44 && j >= 48 && j <= 49 
							|| i == 45 && j >= 18 && j <= 19 || i == 45 && j >= 21 && j <= 26 || i == 45 && j >= 28 && j <= 29 || i == 45 && j >= 39 && j <= 40 || i == 45 && j >= 42 && j <= 46 || i == 45 && j >= 48 && j <= 48
							|| i == 46 && j >= 19 && j <= 19 || i == 46 && j >= 21 && j <= 27 || i == 46 && j >= 31 && j <= 37 || i == 46 && j >= 41 && j <= 46 || i == 46 && j >= 48 && j <= 48
							|| i == 47 && j >= 19 && j <= 30 || i == 47 && j >= 34 && j <= 34 || i == 47 && j >= 38 && j <= 46 || i == 47 && j >= 48 && j <= 48 
							|| i == 48 && j >= 20 && j <= 20 || i == 48 && j >= 22 && j <= 29 || i == 48 && j >= 31 && j <= 37 || i == 48 && j >= 39 && j <= 46 || i == 48 && j >= 48 && j <= 48
							|| i == 49 && j >= 20 && j <= 31 || i == 49 && j >= 33 && j <= 35 || i == 49 && j >= 37 && j <= 45  || i == 49 && j >= 47 && j <= 47 
							|| i == 50 && j >= 20 && j <= 21 || i == 50 && j >= 23 && j <= 32 || i == 50 && j >= 36 && j <= 45 || i == 50 && j >= 47 && j <= 47  
							|| i == 51 && j >= 21 && j <= 22 || i == 51 && j >= 24 && j <= 44 || i == 51 && j >= 47 && j <= 47
							|| i == 52 && j >= 21 && j <= 22 || i == 52 && j >= 25 && j <= 43 || i == 52 && j >= 47 && j <= 47
							|| i == 53 && j >= 21 && j <= 22 || i == 53 && j >= 24 && j <= 24 || i == 53 && j >= 26 && j <= 42 || i == 53 && j >= 47 && j <= 47
							|| i == 54 && j >= 21 && j <= 22 || i == 54 && j >= 24 && j <= 25 || i == 54 && j >= 27 && j <= 41 || i == 54 && j >= 47 && j <= 47
							|| i == 55 && j >= 21 && j <= 22 || i == 55 && j >= 24 && j <= 26 || i == 55 && j >= 28 && j <= 40 || i == 55 && j >= 47 && j <= 48
							|| i == 56 && j >= 18 && j <= 22 || i == 56 && j >= 24 && j <= 27 || i == 56 && j >= 29 && j <= 39 || i == 56 && j >= 46 && j <= 50 
							|| i == 57 && j >= 16 && j <= 22 || i == 57 && j >= 24 && j <= 28 || i == 57 && j >= 31 && j <= 37 || i == 57 && j >= 46 && j <= 52
							|| i == 58 && j >= 15 && j <= 22 || i == 58 && j >= 24 && j <= 30 || i == 58 && j >= 44 && j <= 54 
							|| i == 59 && j >= 13 && j <= 22 || i == 59 && j >= 24 && j <= 33 || i == 59 && j >= 43 && j <= 56
							|| i == 60 && j >= 10 && j <= 22 || i == 60 && j >= 24 && j <= 34 || i == 60 && j >= 41 && j <= 57
							|| i == 61 && j >= 8 && j <= 22 || i == 61 && j >= 25 && j <= 34 || i == 61 && j >= 39 && j <= 59
							|| i == 62 && j >= 5 && j <= 23 || i == 62 && j >= 25 && j <= 34 || i == 62 && j >= 36 && j <= 61
							|| i == 63 && j >= 3 && j <= 23 || i == 63 && j >= 25 && j <= 62 
							|| i == 64 && j >= 1 && j <= 23 || i == 64 && j >= 26 && j <= 64 
							
							) {
						try {
							System.out.print((int)(Math.random()*(1-0+1)+0));
							System.out.print((int)(Math.random()*(1-0+1)+0));
							//System.out.print("  ");
							Thread.sleep(20);
						} catch (Exception e) {
						}
					} else {
						System.out.print("  ");
						//Thread.sleep(20);
						//System.out.print((int)(Math.random()*(1-0+1)+0));
						//System.out.print((int)(Math.random()*(1-0+1)+0));
					}
				}
				System.out.println();
			}
		}


	}

}

