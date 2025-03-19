package oop1_opdracht;

public class Incheckpaal {
    private double instaptarief;

    public Incheckpaal(double instaptarief) {
        this.instaptarief = instaptarief;
    }

    public void inchecken(OVChipKaart kaart) {
        kaart.inchecken(instaptarief);
    }

}
