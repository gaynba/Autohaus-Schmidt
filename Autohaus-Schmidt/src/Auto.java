public class Auto {

    String _Marke;
    String _Modell;
    String _Baujahr;
    int _Preis;

    // Constructor ist eine Methode, die aufgerufen wird, wenn man ein neues Objekt/Instanz einer Klasse erstellt
    // alles was in diesem Constructor steht muss auch in App java bei der Bezeichnung des Autos stehen, sonst kommt ein Fehler
    public Auto(String Marke, String Modell, String Baujahr){
        this.setMarke(Marke);
        this.setModell(Modell);
        this.setBaujahr(Baujahr);
        
    }
    
    public String getMarke() {
        return _Marke;
    }

    public void setMarke(String _Marke) {
        this._Marke = _Marke;
    }

    public String getModell() {
        return _Modell;
    }

    public void setModell(String _Modell) {
        this._Modell = _Modell;
    }

    public String getBaujahr() {
        return _Baujahr;
    }

    public void setBaujahr(String _Baujahr) {
        this._Baujahr = _Baujahr;
    }

    public int getPreis() {
        return _Preis;
    }

    public void setPreis(int _Preis) {
        this._Preis = _Preis;
    }
}
