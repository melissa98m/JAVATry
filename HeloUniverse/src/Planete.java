public class Planete {
    String name;
    String matiere;
    long diameter;
    int totalVisiteur;
    Atmosphere atmosphere;
    Vaisseau vaisseauAccoster;

    int rotation(int angle) {
        return angle / 360;
    }

    int revolution(int angle) {
        return angle / 360;
    }

    Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
        totalVisiteur = totalVisiteur + vaisseau.nbPassager;
        if (vaisseauAccoster == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("un vaisseau de type " + vaisseauAccoster.type + " doit partir");
        }
        Vaisseau vaisseauPrecedent = vaisseauAccoster;
        vaisseauAccoster = vaisseau;
        return vaisseauPrecedent;
    }


}
