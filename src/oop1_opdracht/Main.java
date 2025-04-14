package oop1_opdracht;

public class Main {
    public static void main(String[] args) {
    	
    	Station elst = new Station(1.0 , 1.5, "Elst");
        Station nijmegen = new Station(2.0, 2.0, "Nijmegen");
        
        Ovpaaltje paalElst = new Ovpaaltje(elst);
        Ovpaaltje paalNijmegen = new Ovpaaltje(nijmegen);
        
        OVChipKaart mijnKaart = new OVChipKaart(10.00);
        
        Opwaardeerpaal Main = new Opwaardeerpaal();
        
        paalElst.inchecken(mijnKaart);

        paalNijmegen.uitchecken(mijnKaart);
        
        Main.kaartmeegeven(mijnKaart);
        
        Main.opwaarderenmet();
        
        Main.kaartvergeten();
        
        Main.opwaarderentot();
        
        Main.kaartmeegeven(mijnKaart);
        
        Main.opwaarderentot();
    }
}
