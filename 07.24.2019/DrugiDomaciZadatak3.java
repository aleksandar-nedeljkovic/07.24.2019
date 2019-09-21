package drugipaket;

import java.util.Scanner;

public class DrugiDomaciZadatak3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String figura;
		System.out.println("Unesi figuru: ");
		figura=sc.nextLine();
		
		switch(figura) {
		case "kvadrat": System.out.println("Unesi stranicu a: ");
		double a,pk,ok;
		a=sc.nextDouble();
		pk=a*a;
		ok=4*a;
		System.out.println("Povrsina kvadrata je " + pk + "a obim je " +ok);break;
		
		case "pravougaonik": 
	    double b,pp,op;
		System.out.println("Unesi stranicu a: ");
		a=sc.nextDouble();
		System.out.println("Unesi stranicu b: ");
		b=sc.nextDouble();
		pp=a*b;
		op=2*(a+b);
		System.out.println("Povrsina pravougaonika je " + pp + "a obim je " +op);break;
		
		case "krug": 
		double r,p,o;
	    System.out.println("Unesi poluprecnik r: ");
		r=sc.nextDouble();
		p=r*r*Math.PI;
		o=2*r*Math.PI;
		System.out.println("Povrsina kruga je " + p + "a obim je " +o);break;
		}
		
		/*Prvi pokusaj rada domaceg zadatka
		 * 
		 * System.out.println("a: ");
		a=sc.nextDouble();
		System.out.println("b: ");
		b=sc.nextDouble();
		System.out.println("r: ");
		r=sc.nextDouble();
		pk=a*a;
		ok=4*a;
		pp=a*b;
		op=2*(a+b);
		p=r*r*Math.PI;
		o=2*r*Math.PI;
		
		
		
		switch(s) {
		case "kvadrat":System.out.println("Povrsina figure je "+pk+", a obim je " +ok);break;
		case "pravougaonik":System.out.println("Povrsina figure je "+pp+", a obim je " +op);break;
		case "krug":System.out.println("Povrsina figure je "+p+", a obim je " +o);break;
		default: System.out.println("Los unos");break;
		}*/

	}

}
