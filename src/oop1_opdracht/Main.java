package oop1_opdracht;

public class Main {
    public static void main(String[] args) {
        OVChipKaart mijnKaart = new OVChipKaart(5.00);
        Incheckpaal paal = new Incheckpaal(2.50);
        
        paal.inchecken(mijnKaart);

        paal.inchecken(mijnKaart);
    }
}
