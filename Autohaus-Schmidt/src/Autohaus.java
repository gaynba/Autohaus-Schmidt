public class Autohaus {
    
    
    // VARIABLEN --> String = Text in " " und int = Nummern, mit denen man rechnen kann (Strings und integer sind Datentypen)
    String _name;
    String _adresse;
    String _telefon;

    // Constructor --> wird aufgerufen, wenn man eine neue Instanz (Objekt) einer Klasse erstellt
    // alles, was in diesem Constructor steht muss auch in App.java bei der Bezeichnung des Autohauses stehen, sonst kommt ein Fehler
    public Autohaus(String name, String adresse, String telefon){
        this.setName(name);
        this.setAdresse(adresse);
        this.setTelefon(telefon);
    }

    // Ist eine Methodensignatur // Public ist ein Sichtbarkeitsbereich // String = Rückgabemethode mit Datentyp // Methodenname = getName()
    public String getName() {
        // Return gibt den Wert der Variable zurück
        return _name;
    }
    // void = Dienstleistungsmethode // _name dient als Zwischenspeicher (Es ist egal, was da steht)
    public void setName(String _name) {
        this._name = _name;
    }

    public String getAdresse() {
        return _adresse;
    }

    public void setAdresse(String _adresse) {
        this._adresse = _adresse;
    }

    public String getTelefon() {
        return _telefon;
    }
    
    public void setTelefon(String _telefon) {
        this._telefon = _telefon;
    }
}
