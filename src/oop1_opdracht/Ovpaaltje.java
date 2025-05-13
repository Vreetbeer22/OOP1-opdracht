package oop1_opdracht; 

public class Ovpaaltje extends Ovpoortje{

	public Ovpaaltje(Station station) {
        super(station);
    }

    public void scannen(OVChipKaart kaart) {
        if (kaart.isingecheckt()) {
            uitchecken(kaart);
        } else {
            inchecken(kaart);
        }
    }
	
}

