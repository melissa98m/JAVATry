public class HelloUniverse {
    public static void main(String... args) {

        Planete jupiter = new Planete("Jupiter");
        jupiter.matiere = "Gazeuse";
        jupiter.diameter = 142984;

        Planete Mercure = new Planete("Mercure");
        Mercure.matiere = "Telurique";
        Mercure.diameter = 4880;

        Planete Venus = new Planete("Venus");
        Venus.matiere = "Telurique";
        Venus.diameter = 12100;
        Venus.rotation(1380);

        Planete Terre = new Planete("Terre");
        Terre.matiere = "Telurique";
        Terre.diameter = 12756;

        Planete Mars = new Planete("Mars");
        Mars.matiere = "Telurique";
        Mars.diameter = 6792;
        Mars.rotation(-684);

        Planete Saturne = new Planete("Saturne");
        Saturne.matiere = "Gazeuse";
        Saturne.diameter = 120536;

        Planete Uranus = new Planete("Uranus");
        Uranus.matiere = "Gazeuse";
        Uranus.diameter = 120536;

        Planete Neptune = new Planete("Neptune");
        Neptune.matiere = "Gazeuse";
        Neptune.diameter = 49532;
        Neptune.revolution(-3543);

        System.out.printf("%s est une planete %s avec un diametre de %d", jupiter.name, jupiter.matiere, jupiter.diameter);
        Planete Sedna = new Planete("Sedna");
        System.out.printf("%s est une planete %s avec un diametre de %d", Sedna.name, Sedna.matiere, Sedna.diameter);
        System.out.println("Neptune a effectué " + Neptune.revolution(-3442) + " tours autour de son étoile");
        System.out.println("Mars a effectué " + Mars.rotation(-684) + " tours sur elle même");
        System.out.println("Vénus a effectué " + Venus.rotation(1250) + " tours sur elle même");
        System.out.println("Le nombre d'être humains a avoir sejournés sur Mars est de:" + Mars.totalVisiteur);

        Atmosphere atmosphere = new Atmosphere();
        atmosphere.TauxHydrogen = 83F;
        atmosphere.TauxHelium = 15F;
        atmosphere.TauxMethane = 2.5F;
        Uranus.atmosphere = atmosphere;
        System.out.println("L'atmosphere d'Uranus est composée: " + "A " + Uranus.atmosphere.TauxHydrogen + " % d'hydrogéne " +
                "A " + Uranus.atmosphere.TauxHelium + "% d'Helium" + "A " + Uranus.atmosphere.TauxMethane + "% de méthane");

        Vaisseau newVaisseau = new Vaisseau();
        newVaisseau.type = "Fregate";
        newVaisseau.nbPassager = 9;
        Mars.accueillirVaisseau(newVaisseau);

        Vaisseau croisseur = new Vaisseau();
        croisseur.type = "Croisseur";
        croisseur.nbPassager = 42;
        Mars.accueillirVaisseau(croisseur);

        System.out.println("Le nombre d'être humains a avoir sejournés sur Mars est de:" + Mars.totalVisiteur);

        System.out.println(" La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de" + Mars.name + "est :" + Mars.forme);

        System.out.println(Planete.expension(10.5));
        System.out.println(Planete.expension(14.5));
        System.out.println(Planete.nbPlanetesDecouvertes);


        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.type = "Chasseur";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier=2;
        chasseur.activerBouclier();

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "Vaisseau-Monde";
        vaisseauMonde.blindage= 4784;
        vaisseauMonde.resistanceDuBouclier=30;
        vaisseauMonde.activerBouclier();

        chasseur.attaquer(vaisseauMonde,"lasers photoniques" , 30 );

        vaisseauMonde.desactiverBouclier();
        System.out.println("Resistance du boublier du VM est " + vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du VM est "+ vaisseauMonde.blindage);
    }

}