package es.iestriana.ejerciciocasa2.datos;
import java.util.Scanner;
public class Ejerciciocasa2 {
	/*
	 * You are asked to read a positive whole number
	 * and determine if it is a 1,2,3 or 4-digit number. 
	 */
	private static Scanner nu = new Scanner(System.in);
	
	public static void main(String[]args) {

		System.out.println("Número: ");
		int nume = nu.nextInt();
		
		if (nume > 0 && nume<=9) {
			System.out.println("El numero " + nume + " tiene 1 digito.");
		} else if (nume >=10 && nume <=99) {
			System.out.println("El numero " + nume + " tiene 2 digitos.");
		} else if (nume >=100 && nume <=999){
			System.out.println("El numero " + nume + " tiene 3 digitos");
	    } else if (nume >=1000 && nume <=9999){
	    	System.out.println("El numero " + nume + " tiene 4 digitos");
	    }
	    
	}

}   