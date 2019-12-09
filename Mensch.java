public abstract class Mensch
{
    // instance variables - replace the example below with your own
    private String name;
    private String vorname;
    private int alter;
    private Kunde kunde;
    private Mitarbeiter mitarbeiter;
    
    
    public Mensch(String name, String vorname, int alter)
    {
        setName(name);
        setVorname(vorname);
        setAlter(alter);
    }
    
    private void setName(String name)
    {
        this.name = name;
    }
    private void setVorname(String vorname)
    {
        this.vorname = vorname;
    }
    private void setAlter(int alter)
    {
        this.alter = alter;
    }
    
    
    public String getName()
    {
        return this.name;
    }
    public String getVorname()
    {
        return this.vorname;
    }
    public int getAlter()
    {
        return this.alter;
    }
}
