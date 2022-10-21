//Created by 21343043_Fadhil Nugraha Wikarya

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Baris: ");
		int x = input.nextInt();

		for (int a = 0; a<=x - 1; a++) {
			for (int b = 0; b< a; b++) {
				System.out.print(" ");
			}
			for (int c = a; c <=x - 1; c++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		for (int a = x; a>=0; a--) {
			for (int b = 0; b<a ; b++) {
				System.out.print(" ");
			}
			for (int c = a; c<=x -1; c++) {
				System.out.print("* ");	
			}	
			System.out.println();
		}
	}
}