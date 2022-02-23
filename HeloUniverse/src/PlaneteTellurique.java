public class PlaneteTellurique extends  Planete implements Habitable{
    int totalVisiteur;
    Vaisseau vaisseauAccoster;

    PlaneteTellurique(String name) {
        super(name);
    }

    public Vaisseau accueillirVaisseau(Vaisseau newVaisseau) {
        totalVisiteur = totalVisiteur + newVaisseau.nbPassager;
        if (vaisseauAccoster == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("un vaisseau de type " + vaisseauAccoster.type + " doit partir");
        }
        Vaisseau vaisseauPrecedent = vaisseauAccoster;
        vaisseauAccoster = newVaisseau;
        return vaisseauPrecedent;
    }
}
