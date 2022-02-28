import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {

        Planete jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diameter = 142984;

        PlaneteTellurique Mercure = new PlaneteTellurique("Mercure");
        Mercure.diameter = 4880;
        PlaneteTellurique Venus = new PlaneteTellurique("Venus");
        Venus.diameter = 12100;
        Venus.rotation(1380);
        PlaneteTellurique Terre = new PlaneteTellurique("Terre");
        Terre.diameter = 12756;
        PlaneteTellurique Mars = new PlaneteTellurique("Mars");
        Mars.diameter = 6792;
        Mars.rotation(-684);
        Planete Saturne = new PlaneteGazeuse("Saturne");
        Saturne.diameter = 120536;
        Planete Uranus = new PlaneteGazeuse("Uranus");
        Uranus.diameter = 120536;
        Planete Neptune = new PlaneteGazeuse("Neptune");
        Neptune.diameter = 49532;
        Neptune.revolution(-3543);

        System.out.printf("%s est une planete  avec un diametre de %d", jupiter.name, jupiter.diameter);
        PlaneteTellurique Sedna = new PlaneteTellurique("Sedna");
        System.out.printf("%s est une planete  avec un diametre de %d", Sedna.name, Sedna.diameter);
        System.out.println("Neptune a effectué " + Neptune.revolution(-3442) + " tours autour de son étoile");
        System.out.println("Mars a effectué " + Mars.rotation(-684) + " tours sur elle même");
        System.out.println("Vénus a effectué " + Venus.rotation(1250) + " tours sur elle même");


        Atmosphere atmosphere = new Atmosphere();
        atmosphere.TauxHydrogen = 83F;
        atmosphere.TauxHelium = 15F;
        atmosphere.TauxMethane = 2.5F;
        Uranus.atmosphere = atmosphere;
        System.out.println("L'atmosphere d'Uranus est composée: " + "A " + Uranus.atmosphere.TauxHydrogen + " % d'hydrogéne " +
                "A " + Uranus.atmosphere.TauxHelium + "% d'Helium" + "A " + Uranus.atmosphere.TauxMethane + "% de méthane");

        VaisseauDeGuerre newVaisseau = new VaisseauDeGuerre("Fregate");
        newVaisseau.type = "Fregate";
        newVaisseau.nbPassager = 9;
        //Mars.accueillirVaisseau(newVaisseau);

        VaisseauDeGuerre croisseur = new VaisseauDeGuerre("Croiser");
        croisseur.type = "Croiseur";
        croisseur.nbPassager = 42;
        //Mars.accueillirVaisseau(croisseur);


        System.out.println(" La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de" + Mars.name + "est :" + Mars.forme);

        System.out.println(Planete.expension(10.5));
        System.out.println(Planete.expension(14.5));
        System.out.println(Planete.nbPlanetesDecouvertes);


        Vaisseau chasseur = new VaisseauDeGuerre("Chasseur");  //polymorphysme
        chasseur.type = "Chasseur";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;


        Vaisseau vaisseauMonde = new VaisseauCivil("Vaisseau-Monde");
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;
        vaisseauMonde.activerBouclier();

        chasseur.activerBouclier();
        ((VaisseauDeGuerre) chasseur).attaquer(vaisseauMonde, "lasers photoniques", 30);

        //exemple de transtypage
        Vaisseau croiser = new VaisseauDeGuerre("Croiser");
        croiser.type = "Croiser";
        ((VaisseauDeGuerre) croiser).attaquer(chasseur, "Lasers violet", 5);


        vaisseauMonde.desactiverBouclier();
        System.out.println("Resistance du boublier du VM est " + vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du VM est " + vaisseauMonde.blindage);
        Mars.accueillirVaisseau(vaisseauMonde);
        Mars.accueillirVaisseau(chasseur);


        VaisseauDeGuerre newChasseur = new VaisseauDeGuerre("Chasseur");
        Terre.accueillirVaisseau(newChasseur);
        System.out.println("Le chasseur a refusée" + newChasseur.emporterCargaison(20) + " tonnes");
      /* System.out.println(System.getProperties()); // permet de connaitre les propriété
         System.err.println("error") //print une erreur
         System.in.println() //permet de savoir ce que l'utilisateur a entrer au clavier
         System.exit(int) // code de retour du programme si normal 0 (met fin a la machine virtuelle) , si 1 code erreur
         long time =System.currentTimeMilis() //permet de retourner le nombre de milliseconde depuis la machine virtuelle
         System.nanoTime() //permet de savoir combien de temps s'execute une commande un System.nanTime avant la commande et une apres
       */

        Scanner sc=new Scanner(System.in);
        String ligneNext= sc.nextLine(); // renvoit la ligne taper dans le terminale
        System.out.println("La ligne suivante est " + ligneNext);

        Scanner nc=new Scanner(System.in);
        int entierSuivant=nc.nextInt();//renvoit l'entier taper
        System.out.println("L' entier suivant est " + entierSuivant);

    }

}