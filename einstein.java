import java.util.Scanner;

public class einstein {

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

					if (
							
							   i == 3 && j >= 29 && j <= 32 
							|| i == 4 && j >= 20 && j <= 20 || i == 4 && j >= 23 && j <= 35 
							|| i == 5 && j >= 19 && j <= 37 
							|| i == 6 && j >= 17 && j <= 39 || i == 6 && j >= 43 && j <= 43
							|| i == 7 && j >= 15 && j <= 43 || i == 7 && j >= 46 && j <= 48
							|| i == 8 && j >= 14 && j <= 48 
							|| i == 9 && j >= 12 && j <= 12 || i == 9 && j >= 14 && j <= 47 
							|| i == 10 && j >= 15 && j <= 48 
							|| i == 11 && j >= 12 && j <= 49 
							|| i == 12 && j >= 10 && j <= 49 
							|| i == 13 && j >= 10 && j <= 51 
							|| i == 14 && j >= 12 && j <= 51 
							|| i == 15 && j >= 10 && j <= 51 
							|| i == 16 && j >= 10 && j <= 10 || i == 16 && j >= 12 && j <= 52 
							|| i == 17 && j >= 11 && j <= 53 
							|| i == 18 && j >= 11 && j <= 54 
							|| i == 19 && j >= 8 && j <= 8 || i == 19 && j >= 11 && j <= 22 || i == 19 && j >= 27 && j <= 55
							|| i == 20 && j >= 6 && j <= 6 || i == 20 && j >= 9 && j <= 21 || i == 20 && j >= 28 && j <= 55 
							|| i == 21 && j >= 5 && j <= 5 || i == 21 && j >= 9 && j <= 21 || i == 21 && j >= 29 && j <= 56
							|| i == 22 && j >= 4 && j <= 4 || i == 22 && j >= 7 && j <= 22 || i == 22 && j >= 28 && j <= 57
							|| i == 23 && j >= 4 && j <= 4 || i == 23 && j >= 6 && j <= 22 || i == 23 && j >= 29 && j <= 29 || i == 23 && j >= 31 && j <= 57
							|| i == 24 && j >= 6 && j <= 9 || i == 24 && j >= 11 && j <= 21 || i == 24 && j >= 30 && j <= 57 
							|| i == 25 && j >= 7 && j <= 7 || i == 25 && j >= 10 && j <= 22 || i == 25 && j >= 31 && j <= 58
							|| i == 26 && j >= 7 && j <= 7 || i == 26 && j >= 10 && j <= 10 || i == 26 && j >= 12 && j <= 21 || i == 26 && j >= 30 && j <= 58							
							|| i == 27 && j >= 6 && j <= 7 || i == 27 && j >= 11 && j <= 15 || i == 27 && j >= 19 && j <= 21 || i == 27 && j >= 29 && j <= 58
							|| i == 28 && j >= 5 && j <= 5 || i == 28 && j >= 7 && j <= 16 || i == 28 && j >= 19 && j <= 21 || i == 28 && j >= 28 && j <= 57 
							|| i == 29 && j >= 9 && j <= 13 || i == 29 && j >= 20 && j <= 20 || i == 29 && j >= 28 && j <= 30 || i == 29 && j >= 33 && j <= 58
							|| i == 30 && j >= 7 && j <= 15 || i == 30 && j >= 20 && j <= 21 || i == 30 && j >= 28 && j <= 29 || i == 30 && j >= 36 && j <= 58
							|| i == 31 && j >= 6 && j <= 13 || i == 31 && j >= 15 && j <= 16 || i == 31 && j >= 20 && j <= 21 || i == 31 && j >= 28 && j <= 28 || i == 31 && j >= 37 && j <= 44 || i == 31 && j >= 47 && j <= 61						
							|| i == 32 && j >= 4 && j <= 4 || i == 32 && j >= 6 && j <= 12 || i == 32 && j >= 19 && j <= 20 || i == 32 && j >= 22 && j <= 22 || i == 32 && j >= 28 && j <= 31 || i == 32 && j >= 38 && j <= 43 || i == 32 && j >= 49 && j <= 59 || i == 32 && j >= 61 && j <= 61							 
							|| i == 33 && j >= 4 && j <= 11 || i == 33 && j >= 20 && j <= 21 || i == 33 && j >= 28 && j <= 30 || i == 33 && j >= 39 && j <= 42 || i == 33 && j >= 50 && j <= 59	 
							|| i == 34 && j >= 5 && j <= 12 || i == 34 && j >= 20 && j <= 21 || i == 34 && j >= 29 && j <= 29 || i == 34 && j >= 31 && j <= 35 || i == 34 && j >= 39 && j <= 41 || i == 34 && j >= 50 && j <= 53 || i == 34 && j >= 55 && j <= 56
							|| i == 35 && j >= 2 && j <= 12 || i == 35 && j >= 20 && j <= 21 || i == 35 && j >= 29 && j <= 29 || i == 35 && j >= 34 && j <= 34 || i == 35 && j >= 36 && j <= 36 || i == 35 && j >= 39 && j <= 41 || i == 35 && j >= 47 && j <= 47 || i == 35 && j >= 49 && j <= 54 || i == 35 && j >= 56 && j <= 57 || i == 35 && j >= 59 && j <= 59
							|| i == 36 && j >= 5 && j <= 11 || i == 36 && j >= 13 && j <= 13 || i == 36 && j >= 20 && j <= 21 || i == 36 && j >= 28 && j <= 28 || i == 36 && j >= 33 && j <= 34 || i == 36 && j >= 39 && j <= 41 || i == 36 && j >= 48 && j <= 48 || i == 36 && j >= 50 && j <= 54 || i == 36 && j >= 56 && j <= 57 || i == 36 && j >= 59 && j <= 59 
							|| i == 37 && j >= 5 && j <= 13 || i == 37 && j >= 26 && j <= 27 || i == 37 && j >= 33 && j <= 36 || i == 37 && j >= 39 && j <= 43 || i == 37 && j >= 46 && j <= 47 || i == 37 && j >= 50 && j <= 52 || i == 37 && j >= 54 && j <= 58							
							|| i == 38 && j >= 5 && j <= 12 || i == 38 && j >= 25 && j <= 28 || i == 38 && j >= 32 && j <= 36 || i == 38 && j >= 40 && j <= 51 || i == 38 && j >= 56 && j <= 57 || i == 38 && j >= 59 && j <= 59							
							|| i == 39 && j >= 4 && j <= 12 || i == 39 && j >= 27 && j <= 27 || i == 39 && j >= 29 && j <= 30 || i == 39 && j >= 33 && j <= 37 || i == 39 && j >= 40 && j <= 48 || i == 39 && j >= 51 && j <= 51 || i == 39 && j >= 55 && j <= 58
							|| i == 40 && j >= 3 && j <= 4  || i == 40 && j >= 8 && j <= 12 || i == 40 && j >= 25 && j <= 29 || i == 40 && j >= 33 && j <= 36  || i == 40 && j >= 40 && j <= 44 || i == 40 && j >= 47 && j <= 51 || i == 40 && j >= 56 && j <= 58							 
							|| i == 41 && j >= 8 && j <= 12 || i == 41 && j >= 25 && j <= 36 || i == 41 && j >= 40 && j <= 47 || i == 41 && j >= 49 && j <= 51 || i == 41 && j >= 56 && j <= 58
							|| i == 42 && j >= 9 && j <= 12 || i == 42 && j >= 26 && j <= 36 || i == 42 && j >= 41 && j <= 50 || i == 42 && j >= 56 && j <= 57							
							|| i == 43 && j >= 7 && j <= 12 || i == 43 && j >= 26 && j <= 36 || i == 43 && j >= 41 && j <= 50 || i == 43 && j >= 56 && j <= 58
							|| i == 44 && j >= 6 && j <= 11 || i == 44 && j >= 27 && j <= 35 || i == 44 && j >= 41 && j <= 50 || i == 44 && j >= 56 && j <= 58
							|| i == 45 && j >= 7 && j <= 11 || i == 45 && j >= 27 && j <= 35 || i == 45 && j >= 37 && j <= 37 || i == 45 && j >= 41 && j <= 50 || i == 45 && j >= 58 && j <= 59					
							|| i == 46 && j >= 7 && j <= 11 || i == 46 && j >= 27 && j <= 34 || i == 46 && j >= 37 && j <= 37 || i == 46 && j >= 41 && j <= 50 || i == 46 && j >= 58 && j <= 59							
							|| i == 47 && j >= 8 && j <= 8 || i == 47 && j >= 10 && j <= 11 || i == 47 && j >= 28 && j <= 33 || i == 47 && j >= 37 && j <= 37 || i == 47 && j >= 42 && j <= 43 || i == 47 && j >= 46 && j <= 50 || i == 47 && j >= 55 && j <= 57
							|| i == 48 && j >= 9 && j <= 11 || i == 48 && j >= 29 && j <= 32 || i == 48 && j >= 34 && j <= 34 || i == 48 && j >= 44 && j <= 45 || i == 48 && j >= 47 && j <= 50 || i == 48 && j >= 55 && j <= 57							 
							|| i == 49 && j >= 9 && j <= 9 || i == 49 && j >= 11 && j <= 12 || i == 49 && j >= 29 && j <= 34 || i == 49 && j >= 42 && j <= 45 || i == 49 && j >= 47 && j <= 50 || i == 49 && j >= 55 && j <= 55  || i == 49 && j >= 58 && j <= 59   							
							|| i == 50 && j >= 11 && j <= 11 || i == 50 && j >= 30 && j <= 33 || i == 50 && j >= 36 && j <= 36 || i == 50 && j >= 41 && j <= 49 || i == 50 && j >= 54 && j <= 56 || i == 50 && j >= 58 && j <= 59							
							|| i == 51 && j >= 14 && j <= 14 || i == 51 && j >= 30 && j <= 36 || i == 51 && j >= 39 && j <= 49 || i == 51 && j >= 55 && j <= 56 || i == 51 && j >= 59 && j <= 59
							|| i == 52 && j >= 30 && j <= 33 || i == 52 && j >= 35 && j <= 36 || i == 52 && j >= 39 && j <= 49
							|| i == 53 && j >= 30 && j <= 32 || i == 53 && j >= 34 && j <= 34 || i == 53 && j >= 36 && j <= 37 || i == 53 && j >= 39 && j <= 39 || i == 53 && j >= 41 && j <= 42 || i == 53 && j >= 44 && j <= 49
							|| i == 54 && j >= 32 && j <= 32 || i == 54 && j >= 45 && j <= 49
							|| i == 55 && j >= 46 && j <= 48 
							|| i == 56 && j >= 44 && j <= 44 || i == 56 && j >= 46 && j <= 48
							|| i == 57 && j >= 42 && j <= 48 
							|| i == 58 && j >= 41 && j <= 47 
							|| i == 59 && j >= 35 && j <= 46 
							|| i == 60 && j >= 35 && j <= 45 
							|| i == 61 && j >= 36 && j <= 44 
							|| i == 62 && j >= 39 && j <= 43 
							
							
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
