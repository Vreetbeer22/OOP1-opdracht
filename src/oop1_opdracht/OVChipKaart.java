package oop1_opdracht;

public class OVChipKaart {

	private double saldo;
	private boolean ingecheckt;
	private String huidigelocatie;
	
	public OVChipKaart(double saldo){
		this.saldo = saldo;
        this.ingecheckt = false;
        this.huidigelocatie = null;
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
	
	public String gethuidigelocatie() {
		return huidigelocatie;
	}
	
	public void sethuidigelocatie(String huidigelocatie) {
		this.huidigelocatie = huidigelocatie;
	}
		
	
}
