package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Inserisci il numero di Km da percorrere: ");
			int distanza = sc.nextInt();
			
		 System.out.print("Inserisci la tua età: ");
			int eta = sc.nextInt();
			
			sc.close();
			
			double prezzoBiglietto = 0;
			
			if(eta < 18) {
			
			prezzoBiglietto= distanza * 0.21 * 0.80;
			} else if (eta >= 65) {
			 prezzoBiglietto = distanza * 0.21 * 0.60;
			} else {
			prezzoBiglietto = distanza * 0.21;
			}
			
			System.out.printf("Il prezzo del tuo biglietto è: €%.2f", prezzoBiglietto);
			
	}
}
