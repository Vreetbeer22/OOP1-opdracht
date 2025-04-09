package oop1_opdracht;

public class Main {
    public static void main(String[] args) {
    	
    	Station elst = new Station(1.0 , 1.5, "Elst");
        Station nijmegen = new Station(2.0, 2.0, "Nijmegen");
        
        Ovpaaltje paalElst = new Ovpaaltje(2.00, elst);
        Ovpaaltje paalNijmegen = new Ovpaaltje(2.00, nijmegen);
        
        OVChipKaart mijnKaart = new OVChipKaart(10.00);
        
        Opwaardeerpaal Main = new Opwaardeerpaal();
        
        paalElst.inchecken(mijnKaart);

        paalNijmegen.uitchecken(mijnKaart);
        
        Main.kaartmeegeven(mijnKaart);
        
        Main.opwaarderentot();
        
        Main.kaartvergeten();
        
        Main.opwaarderentot();
    }
}
