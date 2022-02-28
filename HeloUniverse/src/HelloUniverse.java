import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {

        Planete jupiter = new PlaneteGazeuse("Jupiter");
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        Planete saturne = new PlaneteGazeuse("Saturne");
        Planete uranus = new PlaneteGazeuse("Uranus");
        Planete neptune = new PlaneteGazeuse("Neptune");

        Vaisseau fregate = new VaisseauDeGuerre("Fregate");
        fregate.nbPassager = 24;
        fregate.tonnageMax=50;

        Vaisseau croiser = new VaisseauDeGuerre("Croiser");
        croiser.nbPassager = 42;

        Vaisseau chasseur = new VaisseauDeGuerre("Chasseur");

        Vaisseau vaisseauMonde = new VaisseauCivil("Vaisseau-Monde");
        Vaisseau cargo = new VaisseauCivil("Cargo");

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel vaiseaau souhaitez vous sélectionné?");
        String vaisseauSlected = sc.nextLine();
        System.out.println("Sur quelles planete voulez vous vous poser? Mercure , Vénus , Terre ou Mars");
        String planeteSelected = sc.nextLine();
        System.out.println("Quel tonnage souahitez vous emporter?");
        int tonnage = sc.nextInt();
        Vaisseau vaisseau = null;
        switch (vaisseauSlected) {
            case "Chasseur":
                vaisseau = chasseur;
                break;
            case "Fregate":
                vaisseau = fregate;
                break;
            case "Croiser":
                vaisseau = croiser;
                break;
            case "Vaisseau-Monde":
                vaisseau = vaisseauMonde;
                break;
            case "Cargo":
                vaisseau = cargo;
                break;
        }

        PlaneteTellurique planete = null;
        switch (planeteSelected) {
            case "Mercure":
                planete = mercure;
                break;
            case "Terre":
                planete = terre;
                break;
            case "Mars":
                planete = mars;
                break;
            case "Venus":
                planete = venus;
                break;

        }
        if (planete != null) {
            planete.accueillirVaisseau(vaisseau);
        }
        int rejet = 0;
        if (vaisseau != null) {
            rejet = vaisseau.emporterCargaison(tonnage);
        }
        System.out.println("Le rejet est de " + rejet);
    }
}