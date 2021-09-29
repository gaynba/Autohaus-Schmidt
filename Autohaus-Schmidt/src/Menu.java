import java.util.Scanner;

public class Menu {
    //Scanner kann etwas, dass wir schreiben zwischenspeichern
    Scanner _scanner;

    public Menu(){
        setScanner(new Scanner(System.in));
    }


    public void startMenu(){
        // TODO: StartMenu
        System.out.println("Bitte wähle aus");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde");
        System.out.println("(3) Neues Auto");
        System.out.println("(4) Neuer Verkäufer");
        System.out.println("(5) Neues Autohaus");
        System.out.println("(6) Neue Autoliste");
        System.out.println("(7) Neue Kundenliste");
        System.out.println("(8) Neue Verkaeuferliste");
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);
    
        if(choice.equals("1")){
            createVerkaeufeMenu();
        }
        else if(choice.equals("2")){
            createKundeMenu();
        }
        else if(choice.equals("3")){
            createAutoMenu();
        }
        /* Nur so lange noch nicht implementiert, so lange man noch kein create Verkäufer erstellt hat
        // Dann würde unter else if(choice.equals("4")){
        // System.out.println("Verkaeufer nocht nicht implementiert...");   
        }
        */

        else if(choice.equals("4")){
            createVerkaeuferMenu();
        }

        else if(choice.equals("5")){
            createAutohausMenu();
        }

        else if(choice.equals("6")){
            showAutos();
        }

        else if(choice.equals("7")){
            showKunden();
        }

        else if(choice.equals("8")){
            showVerkaeufer();
        }

        else {
            System.out.println("Bitte nur 1-8 eingeben!");
        }
        startMenu();
    }

    public void createVerkaeufeMenu(){
        //Auswahl des Preises
        System.out.println("Bitte wähle einen Preis aus: ");
        String preis = getScanner().next();
        int preis = Integer.valueOf(preis);
        
        
        // Autos
        //Index für Auswahl des richtigen Autos
        int i = 0;
        System.out.println("Bitte wählen sie ein Auto aus: ");
        // Index atrtet bei null und wird dann um einen erhöht
        for(Auto auto : App.getAllAutos()){
            if(auto != null){
                System.out.println(i + " - " + auto.getMarke() + " " + auto.getModell() + " " + auto.getBaujahr());
                i++;
            }
        }
        
        String car_choice = getScanner().next();
        int car_index = Integer.valueOf(car_choice);

        System.out.println(App.getAllAutos() [car_index]);

        i = 0;
        System.out.println("Bitte wählen sie einen Käufer aus: ");
        for(Kunde kunde : App.getAllKunden()){
            if(kunde != null){
                System.out.println(i + " " + kunde.getVorname() + " " + kunde.getNachname());
                i++;
            }
        }
        String kunde_choice = getScanner().next();
        int kunde_index = Integer.valueOf(kunde_choice);

        System.out.println(App.getAllKunden() [kunde_index]);
        
        i = 0;
        System.out.println("Bitte wählen sie einen Verkäufer aus: ");
        for(Verkaeufer verkaeufer : App.getAllVerkaeufer()){
            if(verkaeufer != null){
                System.out.println(i + " " + verkaeufer.getVorname() + " " + verkaeufer.getNachname());
                i++;
            }
        }
        String verkaeufer_choice = getScanner().next();
        int verkaeufer_index = Integer.valueOf(verkaeufer_choice);

        System.out.println(App.getAllVerkaeufer() [verkaeufer_index]);




        //Hinzufügen in Array
        App.addVerkauf(new Verkauf(App.getAllAutos()[car_index], App.getAllKunden()[kunde_index], App.getAllVerkaeufer()[verkaeufer_index]);

        // Verkauf v = Verkauf(App.getAllAutos() [car_index]);
        // HA: Das alles auf Verkäufer und Kunde übertragen, einem Verkauf final erstellen und einen Menüpunkt erstellen
        // um alle Verkäufe auszugeben :) ! Achtung: Bei Verkauf muss auch ein int umgewandelt werden, damit wir einen Preis
        // speichern können! "int _preis"?
    }

    public void showVerkaeufe(){
        // TODO: Verkaufsliste
        for(Verkauf verkauf : App.getAllVerkaeufe()){
            if(verkauf != null){
                System.out.println(verkauf);
            }
        }
    }

    /*Methodensigantur der Dienstlesitungsmethode public void showKunden --> Unterschied zum Constructor es fehlt das
    void im Constructor */
    public void showKunden(){
        // TODO: Kundenliste
        //Foreach Schleife
        for(Kunde kunde : App.getAllKunden()){
            // Wenn dieser Kunde nicht null ist geben wir den Vornamen aus
            if(kunde != null){
                System.out.println(kunde.getVorname() + " " + kunde.getNachname());
            }
        }
    }

    public void createKundeMenu(){
        // TODO: Kunde
        System.out.println("Create new Kunde");
        System.out.println("Vorname: ");
        String vorname = getScanner().nextLine();
        System.out.println("Nachname: ");
        String nachname = getScanner().nextLine();


        // Erstellter Kunde mit den Strings aus App.java
        App.addKunde(new Kunde(vorname, nachname));

        System.out.println(App.getAllKunden());

        // Nach Ende der Erstellung des Kunden soll einfach wieder an den Anfang gegangen werden
        startMenu();
        
    }

    public void showAutos(){
        // TODO: Autoliste
        //Foreach Schleife
        for(Auto auto : App.getAllAutos()){
            // Wenn dieses Auto nicht null ist geben wir die Marke aus
            if(auto != null){
                System.out.println(auto.getMarke() + " " + auto.getModell() + " " + auto.getBaujahr());
            }
        }        
    }
    
    public void createAutoMenu(){
        // TODO: Auto
        System.out.println("Create new Auto");
        System.out.print("Marke: ");
        // Man ruft einfach immer wieder den Scanner auf
        String marke = getScanner().nextLine();
        System.out.println("Modell: ");
        String modell = getScanner().nextLine();
        System.out.println("Baujahr: ");
        String baujahr = getScanner().nextLine();

        

        // Erstelltes Auto mit den Strings aus App.java
        App.addAuto(new Auto(marke, modell, baujahr));

        System.out.println(App.getAllAutos());

        // Nach Ende der Erstellung des Autos soll einfach wieder an den Anfang gegangen werden
        startMenu();
    }

    public void showVerkaeufer(){
        // TODO: Verkaeuferliste
        //Foreach Schleife
        for(Verkaeufer verkaeufer : App.getAllVerkaeufer()){
            // Wenn dieser Verkaeufer nicht null ist geben wir den Vornamen aus
            if(verkaeufer != null){
                System.out.println(verkaeufer.getVorname() + " " + verkaeufer.getNachname());
            }
        }        
    }

    public void createVerkaeuferMenu(){
        // TODO: Verkaeufer
        System.out.println("Create new Verkäufer");
        System.out.println("Vorname: ");
        String vorname = getScanner().nextLine();
        System.out.println("Nachname: ");
        String nachname = getScanner().nextLine();
        
        // Erstellter Verkaeufer mit den Strings aus App.java
        App.addVerkaeufer(new Verkaeufer(vorname, nachname));

        System.out.println(App.getAllVerkaeufer());

        // Nach Ende der Erstellung des Verkaeufers soll einfach wieder an den Anfang gegangen werden
        startMenu();
        
    }

    public void createAutohausMenu(){
        // TODO: Autohaus
        System.out.println("Create new Autohaus");
        System.out.println("Name: ");
        String name = getScanner().nextLine();
        System.out.println("Adresse: ");
        String adresse = getScanner().nextLine();
        System.out.println("Telefon");
        String telefon = getScanner().nextLine();

        Autohaus ah = new Autohaus(name, adresse, telefon);

        startMenu();
    }
    

    public Scanner getScanner() {
        return _scanner;
    }

    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }
}
