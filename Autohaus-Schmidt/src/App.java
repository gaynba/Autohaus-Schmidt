public class App {
   
    // HA das gleiche mit den Verkaeufern und Kunden machen
   
    // Variablen mit einem Unterstrich sind Klassenvariablen

   // Eckige Klammern stehen für ein Array
    static Auto[] _autos;
    static Kunde[] _kunden;
    static Verkaeufer[] _verkaeufer;
    static Verkauf[] _verkaeufe;

    public static void main(String[] args) throws Exception {
        
        //Initialisieren von _autos
        _autos = new Auto[8];


        //Demodaten für Autos
        _autos[0] = new Auto("Ford", "Mustang", "1967");
        _autos[1] = new Auto("Ford", "Mustang Fastback", " 1968");
        _autos[2] = new Auto("Nissan", "Skyline GTR R34", "1999");
        _autos[3] = new Auto("Madza", "RX-7", "2002");
        _autos[4] = new Auto("Dodge", "Charger S/RT", "1970");
        _autos[5] = new Auto("Toyota", "Supra Mk.4", "2001");
        _autos[6] = new Auto("Porsche", "911 Spyder", "2012");
        _autos[7] = new Auto("Lincoln", "Continental", "1968");

        //Initialisieren von _kunden
        _kunden = new Kunde[6];

        //Demodaten für Kunden
        _kunden[0] = new Kunde("Brian", "O´Connor");
        _kunden[1] = new Kunde("Candice", "D.");
        _kunden[2] = new Kunde("Joe", "M.");
        _kunden[3] = new Kunde("Harry", "Schotter");
        _kunden[4] = new Kunde("John", "Cena");


        //Initialisieren von _verkaeufer
        _verkaeufer = new Verkaeufer[3];

        //Demodaten für Verkaeufer
        _verkaeufer[0] = new Verkaeufer("Bernd", "Schmidt");
        _verkaeufer[1] = new Verkaeufer("Ernst", "Müller");
        _verkaeufer[2] = new Verkaeufer("Harald", "Maier");


        // Wechselt in der Konsole wieder zum Startmenü
        Menu menu = new Menu();
        menu.startMenu();

    }

    // Funktion mit der man alle Objekte zählen kann
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for(Object a : array){
            if(a == null){
                array[i] = ele;
                break;
            }
            i++;
        }

    }

    public static void addAuto(Auto autos){
        addObject(autos, getAllAutos());
        
        //Andere Möglichkeit, die aber komplizierter ist

        // Integer deklarieren, damit man so die Anzahl der Autos abfragen kann, solange bis ein Element des Arrays null ist
        /*int i = 0;
        _autos[0] = autos;
        // Foreach Schleife, die durch break beendet wird, wenn ein Element des Arrays null ist
        for(Auto a : App.getAllAutos()){
            if(a == null){
                _autos[i] = autos;
                break;
            }
            // Wenn i = 0 ist plus 1 rechnen
            i = i + 1;
            // Damit dem Verkaeufer gesagt wird, dass der Autohof voll ist nach 8 Autos
            if(i > 7){
                System.out.println("Kein Platz mehr für mehr auf dem Hof vom Schmidt...");
            }
        }*/
    }

    public static void addKunde(Kunde kunden){
        addObject(kunden, getAllKunden());
        
    }

    public static void addVerkaeufer(Verkaeufer verkaeufer){
        addObject(verkaeufer, getAllVerkaeufer());
        
    }


    public static Auto[] getAllAutos(){
        return _autos;
    } 
    
    //public static void addKunde(Kunde kunden){
       //_kunden[0] = kunde;
    //}

    public static Kunde[] getAllKunden(){
        return _kunden;
    }

    //public static void addVerkaeufer(Verkaeufer verkaeufer){
        //_verkaeufer[0] = verkaeufer;
    //}

    // Man bekommt ein Array vom Typ Verkaeufer zurück
    public static Verkaeufer[] getAllVerkaeufer(){
        return _verkaeufer;
    }
}