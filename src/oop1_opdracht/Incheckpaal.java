package oop1_opdracht;

public class Incheckpaal {
    private double instaptarief;
    private Station station;

    public Incheckpaal(double instaptarief, Station station) {
        this.instaptarief = instaptarief;
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
            System.out.println("Succesvol ingecheckt! Nieuw saldo: €" + kaart.getsaldo());
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
    	else {
    		kaart.setsaldo(kaart.getsaldo() + instaptarief);
    		System.out.println("Je bent nu uitgecheckt op station: "+kaart.gethuidigelocatie());
    		
    		System.out.println("Nieuw saldo: €"+kaart.getsaldo());
    		kaart.sethuidigelocatie(null);
    		kaart.setingecheckt(false);
    	}
    }
    
}
