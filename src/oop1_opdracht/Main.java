package oop1_opdracht;

public class Main {
    public static void main(String[] args) {
        OVChipKaart mijnKaart = new OVChipKaart(5.00);
        Station elst = new Station(1.0 , 1.5, "Elst");
        Incheckpaal paal = new Incheckpaal(2.50, elst);
        
        paal.inchecken(mijnKaart);

        paal.inchecken(mijnKaart);
    }
}
