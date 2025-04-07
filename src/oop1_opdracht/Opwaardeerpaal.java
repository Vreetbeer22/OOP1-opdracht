package oop1_opdracht;

import java.util.Scanner;

public class Opwaardeerpaal {
	
	Scanner sc = new Scanner(System.in);
	
	public void opwaarderentot (OVChipKaart kaart){
		System.out.println("Je saldo is nu: €"+String.format("%.2f", kaart.getsaldo()));
		System.out.println("Tot hoeveel wil je je saldo opwaarderen?");
		System.out.print("€");
		double opwaardeer = sc.nextDouble();
		double verschil = opwaardeer - kaart.getsaldo();
		if (verschil >= 0) {
			kaart.setsaldo(kaart.getsaldo() + verschil);
			System.out.println("Je nieuwe saldo is nu €"+String.format("%.2f", kaart.getsaldo()));
		}
		else {
			System.out.println("Het bedrag waar je naar probeert op te waarderen is kleiner dan het saldo wat je nu al hebt.");
			System.out.println("Probeer een ander bedrag.");
		}
	}
	
	public void opwaarderenmet (OVChipKaart kaart) {
		System.out.println("Je saldo is nu: €"+String.format("%.2f", kaart.getsaldo()));
		System.out.println("Met hoeveel wil je je saldo opwaarderen?");
		System.out.print("€");
		double opwaardeer = sc.nextDouble();
		kaart.setsaldo(kaart.getsaldo() + opwaardeer);
		System.out.println("Je nieuwe saldo is nu €"+String.format("%.2f", kaart.getsaldo()));
	}
	
}
