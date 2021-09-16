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
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);
    
        if(choice.equals("1")){
            System.out.println("Verkauf noch nicht implementiert...");
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
        else {
            System.out.println("Bitte nur 1,2,3,4,5 eingeben!");
        }
        startMenu();
    }

    public void createVerkaufMenu(){
        System.out.println("Create new Verkauf");
        System.out.println("Autohaus");
        
    }

    public void createKundeMenu(){
        // TODO: Kunde
        System.out.println("Create new Kunde");
        System.out.println("Vorname: ");
        String vorname = getScanner().nextLine();
        System.out.println("Nachname: ");
        String nachname = getScanner().nextLine();

        Kunde k = new Kunde(vorname, nachname);

        System.out.println("Der neue Kunde heißt" + k.getVorname() + "Walker" + k.getNachname());

        startMenu();
    }

    public void createAutoMenu(){
        // TODO: Auto
        System.out.println("Create new Auto");
        System.out.print("Marke: ");
        // Man ruft einfach immer wieder den Scanner auf
        String marke = getScanner().nextLine();
        System.out.println("Modell: ");
        String modell = getScanner().nextLine();
        System.out.println("Baujahr");
        String baujahr = getScanner().nextLine();

        

        // Erstelltes Auto mit den Strings
        Auto a = new Auto(marke, modell, baujahr);

        // Nach Ende der Erstellung des Autos soll einfach wieder an den Anfang gegangen werden
        startMenu();
    }


    public void createVerkaeuferMenu(){
        // TODO: Verkaeufer
        System.out.println("Create new Verkäufer");
        System.out.println("Vorname: ");
        String vorname = getScanner().nextLine();
        System.out.println("Nachname: ");
        String nachname = getScanner().nextLine();
        
        
        Verkaeufer v = new Verkaeufer(vorname, nachname);

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
