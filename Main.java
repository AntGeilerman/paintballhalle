import java.util.ArrayList;

public abstract class Main
{
    // instance variables - replace the example below with your own
    private Mitarbeiter mitarbeiter;
    private Kunde kunde;
    private Feld feld;
    private Buchung buchung;
    private ArrayList<Buchung> buchungen;
      
    public Main()
    {
        this.buchungen = new ArrayList<Buchung>();
        
    }
    
    private void setBuchungen(ArrayList<Buchung> buchungen)
    {
        this.buchungen = buchungen;
    }
    
    private ArrayList<Buchung> getBuchungen()
    {
        return this.buchungen;
    }
    
    
}
