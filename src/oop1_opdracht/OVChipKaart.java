package oop1_opdracht;

public class OVChipKaart {

	private double saldo;
	private boolean ingecheckt;		
	
	public OVChipKaart(double saldo){
		this.saldo = saldo;
        this.ingecheckt = false;
	}
	
	public double getsaldo() {
        return saldo;
    }
	
	public void setsaldo(double saldo) {
        this.saldo = saldo;
    }
	
	public boolean isingecheckt() {
        return ingecheckt;
    }
	
	public void setingecheckt(boolean ingecheckt) {
        this.ingecheckt = ingecheckt;
    }
		
	
}
