import java.util.Scanner;

public class kohli {

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
							
							 i == 6 && j >= 24 && j <= 34
							|| i == 7 && j >= 23 && j <= 40 || i == 7 && j >= 53 && j <= 56
							|| i == 8 && j >= 22 && j <= 43 || i == 8 && j >= 49 && j <= 57
							|| i == 9 && j >= 21 && j <= 58 
							|| i == 10 && j >= 21 && j <= 59 
							|| i == 11 && j >= 20 && j <= 59 
							|| i == 12 && j >= 20 && j <= 59 
							|| i == 13 && j >= 20 && j <= 59 
							|| i == 14 && j >= 21 && j <= 59 
							|| i == 15 && j >= 20 && j <= 59 
							|| i == 16 && j >= 17 && j <= 59 || i == 16 && j >= 7 && j <= 9
							|| i == 17 && j >= 6 && j <= 10 || i == 17 && j >= 16 && j <= 59
							|| i == 18 && j >= 5 && j <= 10 || i == 18 && j >= 16 && j <= 60
							|| i == 19 && j >= 5 && j <= 11 || i == 19 && j >= 16 && j <= 26
							|| i == 19 && j >= 29 && j <= 60 || i == 20 && j >= 5 && j <= 6
							|| i == 20 && j >= 8 && j <= 11 || i == 20 && j >= 16 && j <= 21 || i == 20 && j >= 32 && j <= 60
							|| i == 21 && j >= 5 && j <= 6 || i == 21 && j >= 9 && j <= 11
							|| i == 21 && j >= 16 && j <= 20 || i == 21 && j == 22  || i == 21 && j == 25|| i == 21 && j >= 34 && j <= 60
							|| i == 22 && j >= 4 && j <= 5 || i == 22 && j >= 9 && j <= 12
							|| i == 22 && j >= 15 && j <= 28 || i == 22 && j >= 36 && j <= 60
							|| i == 23 && j >= 4 && j <= 5 || i == 23 && j >= 8 && j <= 12
							|| i == 23 && j >= 15 && j <= 30 || i == 23 && j >= 37 && j <= 60
							|| i == 24 && j >= 4 && j <= 4 || i == 24 && j >= 8 && j <= 12 || i == 24 && j >= 15 && j <= 22 
							|| i == 24 && j >= 28 && j <= 29 || i == 24 && j >= 37 && j <= 59
							|| i == 25 && j >= 4 && j <= 4 || i == 25 && j >= 7 && j <= 12
							|| i == 25 && j >= 14 && j <= 22 || i == 25 && j >= 31 && j <= 32
							|| i == 25 && j >= 38 && j <= 54 || i == 25 && j >= 56 && j <= 59
							|| i == 26 && j >= 4 && j <= 5 || i == 26 && j >= 7 && j <= 12
							|| i == 26 && j >= 14 && j <= 22 || i == 26 && j >= 26 && j <= 26
							|| i == 26 && j >= 31 && j <= 31 || i == 26 && j >= 33 && j <= 33
							|| i == 26 && j >= 38 && j <= 46 || i == 26 && j >= 57 && j <= 59
							|| i == 27 && j >= 5 && j <= 5 || i == 27 && j >= 7 && j <= 8
							|| i == 27 && j >= 14 && j <= 26 || i == 27 && j >= 31 && j <= 32
							|| i == 27 && j >= 34 && j <= 34 || i == 27 && j >= 39 && j <= 45 || i == 27 && j >= 59 && j <= 59
							|| i == 28 && j >= 5 && j <= 5 || i == 28 && j >= 7 && j <= 7 || i == 28 && j == 12
							|| i == 28 && j >= 14 && j <= 27 || i == 28 && j >= 30 && j <= 33 || i == 28 && j == 35
							|| i == 28 && j >= 38 && j <= 45 || i == 28 && j >= 51 && j <= 56 || i == 28 && j >= 59 && j <= 59
							|| i == 29 && j >= 5 && j <= 6 || i == 29 && j >= 11 && j <= 12
							|| i == 29 && j >= 14 && j <= 25 || i == 29 && j >= 29 && j <= 35
							|| i == 29 && j >= 38 && j <= 44 || i == 29 && j >= 50 && j <= 50
							|| i == 29 && j >= 52 && j <= 57 || i == 29 && j >= 59 && j <= 59
							|| i == 30 && j >= 5 && j <= 6 || i == 30 && j >= 11 && j <= 11
							|| i == 30 && j >= 13 && j <= 26 || i == 30 && j >= 29 && j <= 29
							|| i == 30 && j >= 31 && j <= 35 || i == 30 && j >= 38 && j <= 43
							|| i == 30 && j >= 51 && j <= 52 || i == 30 && j >= 54 && j <= 58
							|| i == 31 && j >= 10 && j <= 11 || i == 31 && j == 7 || i == 31 && j == 5
							|| i == 31 && j >= 13 && j <= 28 || i == 31 && j >= 30 && j <= 35
							|| i == 31 && j >= 37 && j <= 44 || i == 31 && j >= 51 && j <= 51
							|| i == 31 && j >= 53 && j <= 53 || i == 31 && j >= 55 && j <= 58 
							|| i == 32 && j == 5
							|| i == 32 && j >= 7 && j <= 9 || i == 32 && j >= 13 && j <= 46
							|| i == 32 && j >= 51 && j <= 52 || i == 32 && j >= 54 && j <= 54
							|| i == 32 && j >= 56 && j <= 58 
							|| i == 33 && j >= 5 && j <= 5 || i == 33 && j >= 7 && j <= 9
							|| i == 33 && j >= 13 && j <= 44 || i == 33 && j >= 47 && j <= 47
							|| i == 33 && j >= 50 && j <= 53 || i == 33 && j >= 55 && j <= 58
							|| i == 34 && j >= 6 && j <= 11 || i == 34 && j >= 13 && j <= 58
							|| i == 35 && j >= 6 && j <= 8 || i == 35 && j >= 13 && j <= 58
							|| i == 36 && j >= 6 && j <= 8 || i == 36 && j >= 10 && j <= 10
							|| i == 36 && j >= 14 && j <= 47 || i == 36 && j >= 50 && j <= 57
							|| i == 37 && j >= 7 && j <= 10 || i == 37 && j >= 14 && j <= 57
							|| i == 38 && j >= 8 && j <= 9 || i == 38 && j >= 14 && j <= 57
							|| i == 39 && j >= 15 && j <= 57 
							|| i == 40 && j >= 15 && j <= 34  || i == 40 && j >= 38 && j <= 56
							|| i == 41 && j >= 16 && j <= 34 || i == 41 && j >= 39 && j <= 56
							|| i == 42 && j >= 16 && j <= 35 || i == 42 && j >= 37 && j <= 37
							|| i == 42 && j >= 40 && j <= 40 || i == 42 && j >= 44 && j <= 56
							|| i == 43 && j >= 17 && j <= 32 || i == 43 && j >= 38 && j <= 56
							|| i == 44 && j >= 18 && j <= 23 || i == 44 && j >= 43 && j <= 55
							|| i == 45 && j >= 19 && j <= 21 || i == 45 && j >= 43 && j <= 55
							|| i == 46 && j == 20 || i == 46 && j >= 43 && j <= 55 
							|| i == 47 && j >= 35 && j <= 35 || i == 47 && j >= 44 && j <= 54
							|| i == 48 && j >= 25 && j <= 25 || i == 48 && j >= 36 && j <= 36
							|| i == 48 && j >= 39 && j <= 39 || i == 48 && j >= 45 && j <= 54
							|| i == 49 && j >= 25 && j <= 32 || i == 49 && j >= 37 && j <= 40
							|| i == 49 && j >= 47 && j <= 53 
							|| i == 50 && j >= 26 && j <= 35 || i == 50 && j >= 48 && j <= 53
							|| i == 51 && j >= 26 && j <= 39 || i == 51 && j >= 48 && j <= 52
							|| i == 52 && j >= 28 && j <= 29 || i == 52 && j >= 33 && j <= 42
							|| i == 52 && j >= 48 && j <= 51 
							|| i == 53 && j >= 37 && j <= 44 || i == 53 && j >= 48 && j <= 50
							|| i == 54 && j >= 38 && j <= 44 
							|| i == 55 && j >= 39 && j <= 42 
							
							
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