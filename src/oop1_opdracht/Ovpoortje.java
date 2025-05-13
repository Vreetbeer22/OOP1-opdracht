package oop1_opdracht;

public class Ovpoortje{
    private static double instaptarief = 2.00;
    private Station station;

    public Ovpoortje(Station station) {
        this.station = station;
    }
    
    public void inchecken(OVChipKaart kaart) {
        if (kaart.isingecheckt()) {
            System.out.println("Je bent al ingecheckt!");
            return;
        }

        if (kaart.getsaldo() >= instaptarief) {
            kaart.setsaldo(kaart.getsaldo() - instaptarief);
            kaart.sethuidigelocatie(station.getstationnaam());
            kaart.setingecheckt(true);
            kaart.setincheckstation(station);	
            System.out.println("Je bent nu ingecheckt op station: "+kaart.gethuidigelocatie());
        } else {
            System.out.println("Niet genoeg saldo om in te checken!");
        }
    }
    
    public void uitchecken(OVChipKaart kaart) {        
    	if (!kaart.isingecheckt()) {
    		System.out.println("Je bent nog niet ingecheckt.");
    		return;
    	}
    	
    	Station incheckStation = kaart.getincheckstation();
        if (incheckStation == null) {
            System.out.println("Geen incheckstation gevonden!");
            return;
        }
    	
        double afstand = incheckStation.afstandberekenen(station);
        double kosten = afstand * 1.25;
        
        kosten = Math.round(kosten * 100.0) / 100.0;
    
    	kaart.setsaldo(kaart.getsaldo() + instaptarief);
    	System.out.println("Je bent nu uitgecheckt op station: "+station.getstationnaam());
    	kaart.setsaldo(kaart.getsaldo() - kosten);
    	kaart.setsaldo(Math.round(kaart.getsaldo() * 100.0) / 100.0);
    	
    	System.out.println("Nieuw saldo: €"+String.format("%.2f", kaart.getsaldo()));
    	kaart.sethuidigelocatie(null);
    	kaart.setingecheckt(false);
    	kaart.setincheckstation(null);
    	
    }
    
}
