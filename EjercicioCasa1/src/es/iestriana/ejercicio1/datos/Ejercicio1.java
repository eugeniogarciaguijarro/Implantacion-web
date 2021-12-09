package es.iestriana.ejercicio1.datos;

import java.util.Scanner;

public class Ejercicio1 {
	  /* The user must enter the price of a product (it can be with decimals). 
     * The price of the product must be shown applying a previously stored VAT with
     *  a value of 21%, 18% and 9%.
     */

	private static Scanner iv = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Precio final: ");
		double precio = iv.nextDouble();
		double IVA21 = (precio * 0.21) + precio;
		double IVA18 = (precio * 0.18) + precio;
		double IVA9 = (precio * 0.09) + precio;
		
		System.out.println("21%: " + IVA21 + "\n" + "18%: " + IVA18 + "\n" + "9%: " + IVA9 );
}
}