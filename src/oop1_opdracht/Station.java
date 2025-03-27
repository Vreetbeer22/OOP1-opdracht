package oop1_opdracht;

public class Station{

	private double cordx;
	private double cordy;
	private String stationnaam;
	private double afstand;
	
	public Station(double cordx, double cordy, String stationnaam) {
		this.cordx = cordx;
		this.cordy = cordy;
		this.stationnaam = stationnaam;
	}
	
	public String getstationnaam() {
        return stationnaam;
    }
	
	public double afstandberekenen(){
		
		return afstand;
	}
}
