package edu;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println("La cadena tiene: "+s.length()+" carácteres.");
		
		int medio = s.length()/2;
		
		System.out.println("El carácter del centro es: "+s.charAt(medio));
		
		System.out.println("La cadena izquierda es: "+s.substring(0, medio));
		
		System.out.println("La cadena derecha es: "+s.substring(medio, s.length()));
	}
}
