


import java.util.Scanner;

public class bob {

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
		
							
							|| i == 4 && j >= 22 && j <= 22
							|| i == 5 && j >= 22 && j <= 22 || i == 5 && j >= 46 && j <= 46
							|| i == 6 && j >= 22 && j <= 24 || i == 6 && j >= 45 && j <= 46 
							|| i == 7 && j >= 22 && j <= 25|| i == 7 && j >= 45 && j <= 46 
							|| i == 8 && j >= 21 && j <= 26|| i == 8 && j >= 29 && j <= 29 || i == 8 && j >= 44 && j <= 46
							|| i == 9 && j >= 22 && j <= 27|| i == 9 && j >= 29 && j <= 30 || i == 9 && j >= 42 && j <= 44
							|| i == 10 && j >= 23 && j <= 31 || i == 10 && j >= 39 && j <= 44
							|| i == 11 && j >= 23 && j <= 33 || i == 11 && j >= 37 && j <= 43
							|| i == 12 && j >= 18 && j <= 22 || i == 12 && j >= 24 && j <= 34 || i == 12 && j >= 36 && j <= 42 || i == 12 && j >= 49 && j <= 49 
							|| i == 13 && j >= 19 && j <= 43 || i == 13 && j >= 45 && j <= 51 
							|| i == 14 && j >= 11 && j <= 16 || i == 14 && j >= 19 && j <= 52
							|| i == 15 && j >= 9 && j <= 53 
							|| i == 16 && j >= 17 && j <= 59 
							|| i == 17 && j >= 11 && j <= 55 
							|| i == 18 && j >= 10 && j <= 55 
							|| i == 19 && j >= 9 && j <= 10 || i == 19 && j >= 15 && j <= 55 
							|| i == 20 && j >= 10 && j <= 11 || i == 20 && j >= 15 && j <= 55 
							|| i == 21 && j >= 13 && j <= 54 
							|| i == 22 && j >= 12 && j <= 55 
							|| i == 23 && j >= 11 && j <= 28 || i == 23 && j >= 35 && j <= 56 
							|| i == 24 && j >= 10 && j <= 27 || i == 24 && j >= 36 && j <= 57 
							|| i == 25 && j >= 10 && j <= 24 || i == 25 && j >= 37 && j <= 53 || i == 25 && j >= 56 && j <= 59
							|| i == 26 && j >= 9 && j <= 22 || i == 26 && j >= 38 && j <= 55 
							|| i == 27 && j >= 7 && j <= 22 || i == 27 && j >= 39 && j <= 54 
							|| i == 28 && j >= 9 && j <= 22 || i == 28 && j >= 39 && j <= 56 
							|| i == 29 && j >= 7 && j <= 21 || i == 29 && j >= 39 && j <= 56 
							|| i == 30 && j >= 6 && j <= 21 || i == 30 && j >= 39 && j <= 57 
							|| i == 31 && j >= 5 && j <= 27 || i == 31 && j >= 33 && j <= 58 
							|| i == 32 && j >= 4 && j <= 4 || i == 32 && j >= 7 && j <= 22 || i == 32 && j >= 26 && j <= 29 || i == 32 && j >= 33 && j <= 34 || i == 32 && j >= 38 && j <= 58 
							
							|| i == 33 && j >= 6 && j <= 7 || i == 33 && j >= 10 && j <= 21 || i == 33 && j >= 24 && j <= 24 || i == 33 && j >= 27 && j <= 28 || i == 33 && j >= 31 && j <= 34|| i == 33 && j >= 36 && j <= 57     
							|| i == 34 && j >= 6 && j <= 6 || i == 34 && j >= 9 && j <= 23  || i == 34 && j >= 25 && j <= 28 || i == 34 && j >= 31 && j <= 58
							|| i == 35 && j >= 5 && j <= 5 || i == 35 && j >= 9 && j <= 24 || i == 35 && j >= 31 && j <= 32 || i == 35 && j >= 38 && j <= 59 
							|| i == 36 && j >= 9 && j <= 20 || i == 36 && j >= 22 && j <= 22 || i == 36 && j >= 32 && j <= 32 || i == 36 && j >= 40 && j <= 59
							|| i == 37 && j >= 8 && j <= 20 || i == 37 && j >= 32 && j <= 32 || i == 37 && j >= 41 && j <= 60
							|| i == 38 && j >= 8 && j <= 19 || i == 38 && j >= 33 && j <= 33 || i == 38 && j >= 41 && j <= 61
							|| i == 39 && j >= 7 && j <= 19 || i == 39 && j >= 27 && j <= 28 || i == 39 && j >= 31 && j <= 32 || i == 39 && j >= 34 && j <= 34 || i == 39 && j >= 41 && j <= 61
							|| i == 40 && j >= 6 && j <= 19 || i == 40 && j >= 27 && j <= 34 || i == 40 && j >= 40 && j <= 62 
							|| i == 41 && j >= 7 && j <= 19 || i == 41 && j >= 31 && j <= 32 || i == 41 && j >= 39 && j <= 59 || i == 41 && j >= 61 && j <= 62  
							|| i == 42 && j >= 7 && j <= 20 || i == 42 && j >= 32 && j <= 32 || i == 42 && j >= 38 && j <= 58 || i == 42 && j >= 61 && j <= 61 
							|| i == 43 && j >= 5 && j <= 21 || i == 43 && j >= 27 && j <= 27 || i == 43 && j >= 31 && j <= 31 || i == 43 && j >= 33 && j <= 34 || i == 43 && j >= 37 && j <= 56  
							|| i == 44 && j >= 5 && j <= 22 || i == 44 && j >= 26 && j <= 56 
							|| i == 45 && j >= 5 && j <= 22 || i == 45 && j >= 24 && j <= 56 
							|| i == 46 && j >= 4 && j <= 22 || i == 46 && j >= 24 && j <= 28 || i == 46 && j >= 33 && j <= 56
							|| i == 47 && j >= 4 && j <= 4 || i == 47 && j >= 6 && j <= 23 || i == 47 && j >= 34 && j <= 54  
							|| i == 48 && j >= 6 && j <= 24 || i == 48 && j >= 27 && j <= 28 || i == 48 && j >= 32 && j <= 54 
							|| i == 49 && j >= 5 && j <= 24 || i == 49 && j >= 28 && j <= 52
							|| i == 50 && j >= 5 && j <= 8 || i == 50 && j >= 11 && j <= 24 || i == 50 && j >= 33 && j <= 33 || i == 50 && j >= 35 && j <= 50   
							|| i == 51 && j >= 5 && j <= 7 || i == 51 && j >= 10 && j <= 26 || i == 51 && j >= 35 && j <= 51  
							|| i == 52 && j >= 5 && j <= 6 || i == 52 && j >= 10 && j <= 25 || i == 52 && j >= 34 && j <= 51 
							|| i == 53 && j >= 9 && j <= 10 || i == 53 && j >= 12 && j <= 26 || i == 53 && j >= 30 && j <= 47 || i == 53 && j >= 49 && j <= 50   
							|| i == 54 && j >= 7 && j <= 9 || i == 54 && j >= 12 && j <= 47 || i == 54 && j >= 50 && j <= 50  
							|| i == 55 && j >= 12 && j <= 45 || i == 55 && j >= 47 && j <= 47 || i == 55 && j >= 52 && j <= 52    
							|| i == 56 && j >= 11 && j <= 45   
							|| i == 57 && j >= 11 && j <= 48 
							|| i == 58 && j >= 11 && j <= 11 || i == 58 && j >= 13 && j <= 39 || i == 58 && j >= 42 && j <= 48   
							|| i == 59 && j >= 15 && j <= 16 || i == 59 && j >= 19 && j <= 38 || i == 59 && j >= 45 && j <= 45
							|| i == 60 && j >= 15 && j <= 15 || i == 60 && j >= 20 && j <= 38   
							|| i == 61 && j >= 25 && j <= 31 
							|| i == 62 && j >= 26 && j <= 29 
							 
							
							
							
							
							 
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



