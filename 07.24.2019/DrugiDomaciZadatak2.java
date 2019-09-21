package drugipaket;

import java.util.Scanner;

public class DrugiDomaciZadatak2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int g;
		System.out.println("Unesi godinu: ");
		g=sc.nextInt();
		
		if (g%400==0) {
			System.out.println(+ g +". jeste prestupna godina");
		}
		else System.out.println(+ g +". nije prestupna godina");

	}

}
