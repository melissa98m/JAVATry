public class Planete {
    String name;
    String matiere;
    long diameter;
    int totalVisiteur;
    Atmosphere atmosphere;
    Vaisseau vaisseauAccoster;
    static String forme= "Spherique";

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

    static String expension(double distance) {
        if (distance < 14) {
            return "Oh la la mais c'est super rapide !";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }

    }

}
