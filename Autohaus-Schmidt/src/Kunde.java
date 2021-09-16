public class Kunde {
    
    String _vorname;
    String _nachname;

    // Constructor --> wird aufgerufen, wenn man eine neue Instanz eines Objektes erstellt
    // alles was in diesem Constructor steht muss auch in App java bei der Bezeichnung des Kunden stehen, sonst kommt ein Fehler
    // public Kunde() ist eine Methodensigantur
    public Kunde(String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);
    }
    //ist eine Methodensigantur // Public ist ein Sichbarkeitsbereich //String = Rückgabemethode mit Datentyp //Methodenname = getVorame
    public String getVorname() {
        return _vorname;
    }
    
    public void setVorname(String _vorname) {
        this._vorname = _vorname;
    }
    //ist eine Methodensigantur // Public ist ein Sichbarkeitsbereich //String = Rückgabemethode mit Datentyp //Methodenname = getNachame
    public String getNachname() {
        return _nachname;
    }
    
    public void setNachname(String _nachname) {
        this._nachname = _nachname;
    }
}
