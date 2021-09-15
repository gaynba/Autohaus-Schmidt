public class Verkauf {
    
    Auto _auto;
    Kunde _kunde;
    Verkaeufer _verkaeufer;
    int _preis;
    Autohaus _autohaus;

    // Constructor --> wird aufgerufen, wenn man eine neue Instanz eines Objektes erstellt
    // alles was in diesem Constructor steht muss auch in App java bei der Bezeichnung des Verkaufs stehen, sonst kommt ein Fehler
    public Verkauf(Autohaus autohaus, Auto auto, Kunde kunde, Verkaeufer verkaeufer){
        this.setAutohaus(autohaus);
        this.setAuto(auto);
        this.setKunde(kunde);
        this.setVerkaeufer(verkaeufer);
        
    }

    public int getPreis() {
        return _preis;
    }
    //void = Dienstleistungsmethode //_preis dient als Zwischenspeicher (es ist egal, was da steht)
    public void setPreis(int _preis) {
        this._preis = _preis;
    }

    public Auto getAuto() {
        return _auto;
    }
    
    public void setAuto(Auto _auto) {
        this._auto = _auto;
    }

    public Kunde getKunde() {
        return _kunde;
    }

    public void setKunde(Kunde _kunde) {
        this._kunde = _kunde;
    }

    public Verkaeufer getVerkaeufer() {
        return _verkaeufer;
    }

    public void setVerkaeufer(Verkaeufer _verkaeufer) {
        this._verkaeufer = _verkaeufer;
    }

    public Autohaus getAutohaus() {
        return _autohaus;
    }

    public void setAutohaus(Autohaus _autohaus) {
        this._autohaus = _autohaus;
    }
}
