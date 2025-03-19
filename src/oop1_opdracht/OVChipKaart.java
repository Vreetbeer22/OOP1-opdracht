package oop1_opdracht;

public class OVChipKaart {

	private double saldo;
	private boolean ingecheckt;
	
	public OVChipKaart(double saldo){
		this.saldo = saldo;
        this.ingecheckt = false;
	}
	
	
	public void inchecken(double instaptarief) {
        if (ingecheckt) {
            System.out.println("Je bent al ingecheckt!");
        } else if (saldo >= instaptarief) {
            saldo = saldo - instaptarief;
            ingecheckt = true;
            System.out.println("Ingecheckt. Nieuw saldo: €" + saldo);
        } else {
            System.out.println("Niet genoeg saldo om in te checken!");
        }
    }
	
	
}
