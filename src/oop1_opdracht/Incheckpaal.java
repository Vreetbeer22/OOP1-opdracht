package oop1_opdracht;

public class Incheckpaal {
    private double instaptarief;

    public Incheckpaal(double instaptarief) {
        this.instaptarief = instaptarief;
    }
    
    public void inchecken(OVChipKaart kaart) {
        if (kaart.isingecheckt()) {
            System.out.println("Je bent al ingecheckt!");
            return;
        }

        if (kaart.getsaldo() >= instaptarief) {
            kaart.setsaldo(kaart.getsaldo() - instaptarief);
            kaart.setingecheckt(true);
            System.out.println("Succesvol ingecheckt! Nieuw saldo: €" + kaart.getsaldo());
        } else {
            System.out.println("Niet genoeg saldo om in te checken!");
        }
    }
    
}
