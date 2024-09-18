package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in)){
			
			int multiples;
			System.out.println("Please input a value for n: ");
			int n = in.nextInt();
			int[] allNumbers = new int[n]; // How many??
			
			for (int x = 1; x<=n; x++) {
				allNumbers[x-1] = x;
			}
			
			for (int i = 2; i<=n; i++) {
				if (allNumbers[i-2] != 0) {
					int j = 1;
					while (true) {
						j++;
						multiples = i*j;
						if(multiples>=n+1) {
							break;
						}
						else {
							allNumbers[i*j - 1] = 0;
						}
						
					}
				}
				
				
				
			}
			
			for(int y = 0; y<n; y++) {
				if (allNumbers[y] != 0) {
					System.out.println(allNumbers[y]);
				}
			}
			
		}
	}

}
