import java.util.ArrayList;
public class Buchung
{
    // instance variables - replace the example below with your own
    public double dauer;
    public double preis;
    public double restpreis;

    
    public Buchung(double dauer, double preis, double restpreis)
    {
        // initialise instance variables
        setDauer(dauer);
        setPreis(preis);
        setRestpreis(restpreis);
    }
    
    public void setRestpreis(double restpreis)
    {
        this.restpreis = restpreis;
    }
    public double getRestpreis()
    {
        return this.restpreis;
    }
     
    public void setPreis(double preis)
    {
        this.preis = preis;
    }
    public double getPreis()
    {
        return this.preis;
    } 
    
    public void setDauer(double dauer)
    {
        this.dauer = dauer;
    }
    public double getDauer()
    {
        return this.dauer;
    }

}
