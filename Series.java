package arr;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {

		int num, z;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			
			for (int s = i; s <= num; s++) {
				System.out.print("  ");
				if (s == 1 && i == 1)
					System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			for (z = i; z >= 1; z--) {

				if (i == 1 && z == 1)
					continue;

				System.out.print(z + " ");
			}
			System.out.println();
		}

		for (int i = 1, r = num - 1; i <= num - 1; i++, r--) {

			for (int j = 1; j < (2 * i) + 1; j++) {
				System.out.print(" ");
				if (j == 1)
					System.out.print("  ");

			}

			for (int j = 1; j <= r; j++) {
				System.out.print(j + " ");
			}

			for (int k = r; k >= 1; k--) {

				if (i == num - 1 && k == 1)
					continue;

				System.out.print(k + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}