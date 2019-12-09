import java.util.ArrayList;

public abstract class Main
{
    // instance variables - replace the example below with your own
    private Kunde kunde;
    private Feld feld;
    private Verwalter verwalter;
    private Tageskraft tageskraft;
    private Buchung buchung;
    private ArrayList<Buchung> buchungen;
    public ArrayList<Tageskraft> alleMitarbeiter;
      
    public Main()
    {
        this.buchungen = new ArrayList<Buchung>();
        this.alleMitarbeiter = new ArrayList<Tageskraft>();
    }
    
    private void setBuchungen(ArrayList<Buchung> buchungen)
    {
        this.buchungen = buchungen;
    }
    
    private ArrayList<Buchung> getBuchungen()
    {
        return this.buchungen;
    }
    
    private void setAlleMitarbeiter(ArrayList<Tageskraft> alleMitarbeiter)
    {
        this.alleMitarbeiter = alleMitarbeiter;
    }
    
    public ArrayList<Tageskraft> getAlleMitarbeiter()
    {
        return this.alleMitarbeiter;
    }
    
    public void printMitarbeiter() //Methode um alle Methoden auszugeben
    {
        if(getAlleMitarbeiter().size() != 0)
        {
            System.out.println("Du hast momentan folgende Mitarbeiter:");
            for(int i =0; i < getAlleMitarbeiter().size(); i++)
            {
                System.out.println(i +". " +getAlleMitarbeiter().get(i).getName() + ", " + getAlleMitarbeiter().get(i).getVorname());
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Du hast momentan keine Mitarbeiter.");
        }
    }
    
}
