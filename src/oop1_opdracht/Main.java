package oop1_opdracht;

public class Main {
    public static void main(String[] args) {
        OVChipKaart mijnKaart = new OVChipKaart(5.00);
        Station elst = new Station(1.0 , 1.5, "Elst");
        Incheckpaal paalElst = new Incheckpaal(2.50, elst);
        Station nijmegen = new Station(2.0, 2.0, "Nijmegen");
        Incheckpaal paalNijmegen = new Incheckpaal(2.50, nijmegen);
        
        paalElst.inchecken(mijnKaart);

        paalNijmegen.uitchecken(mijnKaart);
    }
}
