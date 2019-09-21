package drugipaket;

import java.util.Scanner;

public class DrugiDomaciZadatak1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Unesi dan u nedelji: ");
		n=sc.nextInt();
		
		switch(n) {
		case 1:System.out.println("Ponedeljak, do vikenda je ostalo jos 5 dana ;(");break;
		case 2:System.out.println("Utorak, do vikenda je ostalo jos 4 dana ");break;
		case 3:System.out.println("Sreda, do vikenda je ostalo jos 4 dana ");break;
		case 4:System.out.println("Cetvrtak, do vikenda je ostalo jos 4 dana ");break;
		case 5:System.out.println("Petak, do vikenda je ostao jos 1 dan :) ");break;
		case 6:System.out.println("Subotaaaa :D ");break;
		case 7:System.out.println("Nedelja :| ");break;
		default:System.out.println("Vikend je GOTOV!! ");break;
		}

	}

}
