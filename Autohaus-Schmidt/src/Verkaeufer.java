public class Verkaeufer {
    
    
    String _vorname;
    String _nachname;
    int _personalnummer;

    // Constructor --> wird aufgerufen, wenn man eine neue Instanz eines Objektes erstellt
    // alles was in diesem Constructor steht muss auch in App java bei der Bezeichnung des Verkäufers stehen, sonst kommt ein Fehler
    public Verkaeufer(String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);
        
    }


    public String getVorname() {
        return _vorname;
    }
    
    public void setVorname(String _vorname) {
        this._vorname = _vorname;
    }

    public String getNachname() {
        return _nachname;
    }
    
    public void setNachname(String _nachname) {
        this._nachname = _nachname;
    }

    public int getPersonalnummer() {
        return _personalnummer;
    }
    
    public void setPersonalnummer(int _personalnummer) {
        this._personalnummer = _personalnummer;
    }
}
