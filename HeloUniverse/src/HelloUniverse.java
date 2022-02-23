import static java.lang.System.out;

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

        out.printf("%s est une planete  avec un diametre de %d", jupiter.name,jupiter.diameter);
        PlaneteTellurique Sedna = new PlaneteTellurique("Sedna");
        out.printf("%s est une planete  avec un diametre de %d", Sedna.name,Sedna.diameter);
        out.println("Neptune a effectué " + Neptune.revolution(-3442) + " tours autour de son étoile");
        out.println("Mars a effectué " + Mars.rotation(-684) + " tours sur elle même");
        out.println("Vénus a effectué " + Venus.rotation(1250) + " tours sur elle même");


        Atmosphere atmosphere = new Atmosphere();
        atmosphere.TauxHydrogen = 83F;
        atmosphere.TauxHelium = 15F;
        atmosphere.TauxMethane = 2.5F;
        Uranus.atmosphere = atmosphere;
        out.println("L'atmosphere d'Uranus est composée: " + "A " + Uranus.atmosphere.TauxHydrogen + " % d'hydrogéne " +
                "A " + Uranus.atmosphere.TauxHelium + "% d'Helium" + "A " + Uranus.atmosphere.TauxMethane + "% de méthane");

        VaisseauDeGuerre newVaisseau = new VaisseauDeGuerre("Fregate");
        newVaisseau.type = "Fregate";
        newVaisseau.nbPassager = 9;
        //Mars.accueillirVaisseau(newVaisseau);

        VaisseauDeGuerre croisseur = new VaisseauDeGuerre("Croiser");
        croisseur.type = "Croiseur";
        croisseur.nbPassager = 42;
        //Mars.accueillirVaisseau(croisseur);


        out.println(" La forme d'une planète est : " + Planete.forme);
        out.println("La forme de" + Mars.name + "est :" + Mars.forme);

        out.println(Planete.expension(10.5));
        out.println(Planete.expension(14.5));
        out.println(Planete.nbPlanetesDecouvertes);


        Vaisseau chasseur = new VaisseauDeGuerre("Chasseur");  //polymorphysme
        chasseur.type = "Chasseur";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier=2;


        Vaisseau vaisseauMonde = new VaisseauCivil("Vaisseau-Monde");
        vaisseauMonde.blindage= 4784;
        vaisseauMonde.resistanceDuBouclier=30;
        vaisseauMonde.activerBouclier();

        chasseur.activerBouclier();
        ((VaisseauDeGuerre) chasseur).attaquer(vaisseauMonde,"lasers photoniques" , 30 );

        //exemple de transtypage
        Vaisseau croiser = new VaisseauDeGuerre("Croiser");
        croiser.type = "Croiser";
        ((VaisseauDeGuerre)croiser).attaquer(chasseur , "Lasers violet" , 5);


        vaisseauMonde.desactiverBouclier();
        out.println("Resistance du boublier du VM est " + vaisseauMonde.resistanceDuBouclier);
        out.println("Le blindage du VM est "+ vaisseauMonde.blindage);
        Mars.accueillirVaisseau(vaisseauMonde);
       Mars.accueillirVaisseau(chasseur);


       VaisseauDeGuerre newChasseur = new VaisseauDeGuerre("Chasseur");
       Terre.accueillirVaisseau(newChasseur);
       System.out.println("Le chasseur a réjetté" + newChasseur.emporterCargaison(20)
        + "tonnes");
    }

}